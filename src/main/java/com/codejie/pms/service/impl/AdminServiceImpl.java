package com.codejie.pms.service.impl;

import com.codejie.pms.entity.*;
import com.codejie.pms.entity.dto.NameValueDto;
import com.codejie.pms.mapper.AdminMapper;
import com.codejie.pms.mapper.EmployeeMapper;
import com.codejie.pms.entity.dto.DepartmentDelDto;
import com.codejie.pms.mapper.HrMapper;
import com.codejie.pms.service.AdminService;
import com.codejie.pms.util.DateUtil;
import com.github.pagehelper.PageHelper;
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
            dto.setAddTime(sqlDate);
            dto.setCountDepartment(0);
            for (DepartmentDelDto t : dataList) {
                if (e.equals(DateUtil.dateToString(t.getAddTime(), "yyyy-MM-dd"))) {
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
                if (e.equals(DateUtil.dateToString(t.getAddTime(), "yyyy-MM-dd"))) {
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

    @Override
    public void kpAdd2(AddPoint addPoint) throws Exception {
        adminMapper.addPoint2(addPoint);
        adminMapper.kpAdd2(addPoint);
    }

    @Override
    public Department selectDepartment(Department department) {
        return adminMapper.selectDepartment(department);
    }





    @Override
    public List<Kpi> selectKpiList4(Kpi kpi, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return adminMapper.selectKpiList4();
    }
    @Override
    public List<Kpi> selectKpiList4() {
        return adminMapper.selectKpiList4();
    }

    @Override
    public void kpAdd4(AddPointDepartment addPointDepartment) throws Exception {
        adminMapper.addPoint4(addPointDepartment);
        adminMapper.kpAdd4(addPointDepartment);
    }

    @Override
    public List<Kpi> selectKpiList5(Kpi kpi, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return adminMapper.selectKpiList5();
    }
    @Override
    public List<Kpi> selectKpiList5() {
        return adminMapper.selectKpiList5();
    }

    public void kpAdd5(AddPointDepartment addPointDepartment) throws Exception {
        adminMapper.addPoint5(addPointDepartment);
        adminMapper.kpAdd5(addPointDepartment);
    }

    @Override
    public List<Kpi> selectKpiList6(Kpi kpi, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return adminMapper.selectKpiList6();
    }
    @Override
    public List<Kpi> selectKpiList6() {
        return adminMapper.selectKpiList6();
    }

    public void kpAdd6(AddPointDepartment addPointDepartment) throws Exception {
        adminMapper.addPoint6(addPointDepartment);
        adminMapper.kpAdd6(addPointDepartment);
    }

    @Override
    public List<Kpi> selectKpiList7(Kpi kpi, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return adminMapper.selectKpiList7();
    }
    @Override
    public List<Kpi> selectKpiList7() {
        return adminMapper.selectKpiList7();
    }

    public void kpAdd7(AddPointDepartment addPointDepartment) throws Exception {
        adminMapper.addPoint7(addPointDepartment);
        adminMapper.kpAdd6(addPointDepartment);
    }

    @Override
    public List<Kpi> selectKpiList8(Kpi kpi, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return adminMapper.selectKpiList8();
    }
    @Override
    public List<Kpi> selectKpiList8() {
        return adminMapper.selectKpiList8();
    }

    public void kpAdd8(AddPointDepartment addPointDepartment) throws Exception {
        adminMapper.addPoint8(addPointDepartment);
        adminMapper.kpAdd8(addPointDepartment);
    }

    @Override
    public List<Kpi> selectKpiList9(Kpi kpi, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return adminMapper.selectKpiList9();
    }
    @Override
    public List<Kpi> selectKpiList9() {
        return adminMapper.selectKpiList9();
    }

    public void kpAdd9(AddPointDepartment addPointDepartment) throws Exception {
        adminMapper.addPoint9(addPointDepartment);
        adminMapper.kpAdd9(addPointDepartment);
    }

    @Override
    public List<Kpi> selectKpiList10(Kpi kpi, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return adminMapper.selectKpiList10();
    }
    @Override
    public List<Kpi> selectKpiList10() {
        return adminMapper.selectKpiList10();
    }

    public void kpAdd10(AddPointDepartment addPointDepartment) throws Exception {
        adminMapper.addPoint10(addPointDepartment);
        adminMapper.kpAdd10(addPointDepartment);
    }

    @Override
    public List<Kpi> selectKpiList11(Kpi kpi, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return adminMapper.selectKpiList11();
    }
    @Override
    public List<Kpi> selectKpiList11() {
        return adminMapper.selectKpiList11();
    }

    public void kpAdd11(AddPointDepartment addPointDepartment) throws Exception {
        adminMapper.addPoint11(addPointDepartment);
        adminMapper.kpAdd11(addPointDepartment);
    }

    @Override
    public List<Kpi> selectKpiList12(Kpi kpi, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return adminMapper.selectKpiList12();
    }
    @Override
    public List<Kpi> selectKpiList12() {
        return adminMapper.selectKpiList12();
    }

    public void kpAdd12(AddPointDepartment addPointDepartment) throws Exception {
        adminMapper.addPoint12(addPointDepartment);
        adminMapper.kpAdd12(addPointDepartment);
    }

    @Override
    public List<Kpi> selectKpiList13(Kpi kpi, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return adminMapper.selectKpiList13();
    }
    @Override
    public List<Kpi> selectKpiList13() {
        return adminMapper.selectKpiList13();
    }

    public void kpAdd13(AddPointDepartment addPointDepartment) throws Exception {
        adminMapper.addPoint13(addPointDepartment);
        adminMapper.kpAdd13(addPointDepartment);
    }
}
