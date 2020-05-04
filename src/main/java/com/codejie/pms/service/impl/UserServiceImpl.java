package com.codejie.pms.service.impl;

import com.codejie.pms.entity.Kpi;
import com.codejie.pms.entity.Permission;
import com.codejie.pms.entity.User;
import com.codejie.pms.mapper.UserMapper;
import com.codejie.pms.service.UserService;
import com.github.pagehelper.PageHelper;
import com.codejie.pms.entity.Advice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper.userLogin(user);
    }

    @Override
    public List<Permission> getPerList(Long permissionDegree, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.getPerList(permissionDegree);
    }

    @Override
    public List<Advice> getAdviceList(Advice advice, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.getAdviceList(advice);
    }

    @Override
    public void orderAdvice(Advice advice) {
        userMapper.orderAdvice(advice);
    }

    @Override
    public void reviewAdvice(Advice advice) {
        userMapper.reviewAdvice(advice);
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public void save(User user) {
        userMapper.save(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public void deleteUser(User user) {
        userMapper.deleteUser(user);
    }

    @Override
    public User selectUser(User user) {
        return userMapper.selectUser(user);
    }

    @Override
    public void updateUserBySelf(User user) {
        userMapper.updateUserBySelf(user);
    }

    @Override
    public List<User> selectUserList(User user,int pageNum,int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.selectUserList(user);
    }

    @Override
    public List<User> selectUserList() {
        return userMapper.selectUserList1();
    }

    @Override
    public List<Kpi> selectKpiList(Kpi kpi, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.selectKpiList();
    }

    @Override
    public List<Kpi> selectKpiList() {
        return userMapper.selectKpiList();
    }

    @Override
    public List<Kpi> selectKpiList1(Kpi kpi, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.selectKpiList1();
    }

    @Override
    public List<Kpi> selectKpiList1() {
        return userMapper.selectKpiList1();
    }

    @Override
    public void addKpi(Kpi kpi) {
        userMapper.addKpi(kpi);

    }
    @Override
    public void saveKpi(Kpi kpi) {
        userMapper.saveKpi(kpi);
    }
}
