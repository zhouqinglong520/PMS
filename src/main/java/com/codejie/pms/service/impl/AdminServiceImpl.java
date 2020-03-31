package com.codejie.pms.service.impl;

import com.codejie.pms.entity.Department;
import com.codejie.pms.entity.dto.NameValueDto;
import com.codejie.pms.mapper.AdminMapper;
import com.codejie.pms.mapper.EmployeeMapper;
import com.codejie.pms.entity.WeakCheck;
import com.codejie.pms.entity.dto.DepartmentDelDto;
import com.codejie.pms.service.AdminService;
import com.codejie.pms.util.DateUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;
    @Resource
    private EmployeeMapper employeeMapper;

    @Override
    public Map<String, List> initSelect() {
        Map<String, List> list = new HashMap<>(3);
        list.put("quarter", adminMapper.initSelect1());
        list.put("weekNum", adminMapper.initSelect2());
        list.put("qdList", adminMapper.allDepartment());
        return list;
    }

    @Override
    public List<WeakCheck> getWeek2() {
        return adminMapper.getWeek2();
    }

    @Override
    public Map<String, List> getWeekData(String quarter, String weekNum, String departmentId) {

        Department department = new Department();
        List<DepartmentDelDto> dataList = adminMapper.getDepartmentCheckDel(quarter, weekNum);
        List<Department> departmentList = employeeMapper.getDepartmentList(department);
        List<DepartmentDelDto> dtoList = new ArrayList<>();
        departmentList.forEach(e -> {
            DepartmentDelDto dto = new DepartmentDelDto();
            dto.setDepartmentName(e.getDepartmentName());
            dto.setDepartmentId(e.getDepartmentId());
            dto.setCountDepartment(0);
            for (DepartmentDelDto t : dataList) {
                if (e.getDepartmentId().equals(t.getDepartmentId())) {
                    dto.setCountDepartment(t.getCountDepartment());
                    //break;
                }
            }
            dtoList.add(dto);
        });
        Map<String, List> maps = new HashMap<>();
        maps.put("checkList", departmentList);
        maps.put("dataList", dtoList);
        return maps;
    }

    @Override
    public Map<String, List> getWeekData2(String quarter, String weekNum) {

        List<String> weekList = adminMapper.weekList(quarter, weekNum);
        List<DepartmentDelDto> dataList = adminMapper.getWeekData2(quarter, weekNum);
        List<DepartmentDelDto> dtoList = new ArrayList<>();
        weekList.forEach(e -> {
            DepartmentDelDto dto = new DepartmentDelDto();
            java.sql.Date sqlDate = new java.sql.Date(DateUtil.stringToDate(e, "yyyy-MM-dd").getTime());
            dto.setDepartmentAddPointTime(sqlDate);
            dto.setCountDepartment(0);
            for (DepartmentDelDto t : dataList) {
                if (e.equals(DateUtil.dateToString(t.getDepartmentAddPointTime(), "yyyy-MM-dd"))) {
                    dto.setCountDepartment(t.getCountDepartment());
                    break;
                }
            }
            dtoList.add(dto);
        });
        Map<String, List> maps = new HashMap<>();
        maps.put("checkList", weekList);
        maps.put("dataList", dtoList);
        return maps;
    }

    @Override
    public List<NameValueDto> getWeekData3(String quarter, String weekNum, String departmentId) {
        List<DepartmentDelDto> dataList = adminMapper.getWeekData(quarter, weekNum, departmentId);
        List<WeakCheck> checkList = adminMapper.getWeek2();
        List<NameValueDto> dtoList = new ArrayList<>();
        checkList.forEach(e -> {
            for (DepartmentDelDto t : dataList) {
                NameValueDto dto = new NameValueDto();
                if (e.getCheckId() == t.getCheckId()) {
                    dto.setName(e.getCheckName());
                    dto.setValue(t.getCountDepartment().toString());
                    dtoList.add(dto);
                    break;
                }
            }
        });
        return dtoList;
    }

    @Override
    public List<NameValueDto> getWeekData4(String quarter, String weekNum) {
        List<String> weekList = adminMapper.weekList(quarter, weekNum);
        List<DepartmentDelDto> dataList = adminMapper.getWeekData2(quarter, weekNum);

        List<NameValueDto> dtoList = new ArrayList<>();
        weekList.forEach(e -> {
            for (DepartmentDelDto t : dataList) {
                NameValueDto dto = new NameValueDto();
                if (e.equals(DateUtil.dateToString(t.getDepartmentAddPointTime(), "yyyy-MM-dd"))) {
                    dto.setName(e);
                    dto.setValue(t.getCountDepartment().toString());
                    dtoList.add(dto);
                    break;
                }
            }
        });
        return dtoList;
    }

    @Override
    public String stuCount() {
        return adminMapper.stuCount();
    }

    @Override
    public void upDepartment() {
        Department t = new Department();
        List<Department> departmentList = employeeMapper.getDepartmentList(t);
        departmentList.forEach(e -> adminMapper.upDepartment(e));
    }

}
