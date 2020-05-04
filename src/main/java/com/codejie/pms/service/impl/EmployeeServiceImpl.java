package com.codejie.pms.service.impl;

import com.codejie.pms.entity.*;
import com.codejie.pms.mapper.EmployeeMapper;
import com.codejie.pms.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    private EmployeeMapper employeeMapper;

    @Override
    public List<AddPoint> getAddPoint(AddPoint addPoint, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<AddPoint> list = employeeMapper.getAddPoint(addPoint);
        return list;
    }

    @Override
    public List<DeletePoint> getDeletePoint(DeletePoint deletePoint, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return employeeMapper.getDeletePoint(deletePoint);
    }

    @Override
    public List<Punish> getPunishList(Punish punish, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return employeeMapper.getPunishList(punish);
    }

    @Override
    public List<Reward> getRewardList(Reward reward, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return employeeMapper.getRewardList(reward);
    }

    @Override
    public Department getUserDepartment(String userId) {
        return employeeMapper.getUserDepartment(userId);
    }

    public List<Department> getDepartmentList(Department department, int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return employeeMapper.getDepartmentList(department);
    }
}
