package com.codejie.pms.service.impl;

import com.codejie.pms.entity.*;
import com.github.pagehelper.PageHelper;
import com.codejie.pms.mapper.HrMapper;
import com.codejie.pms.service.HrService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HrServiceImpl implements HrService {

    @Resource
    private HrMapper hrMapper;

    @Override
    public String haveId(String id) {
        String userId = hrMapper.haveId(id);
        if (StringUtils.isEmpty(userId)) {
            return "false";
        }
        return "true";
    }

    @Override
    public void kpAdd(AddPoint addPoint) throws Exception {
        hrMapper.addPoint(addPoint);
        hrMapper.kpAdd(addPoint);
    }

    @Override
    public void kpDel(DeletePoint deletePoint) throws Exception {
        hrMapper.delPoint(deletePoint);
        hrMapper.kpDel(deletePoint);
    }

    @Override
    public void kpReward(Reward reward) throws Exception {
        hrMapper.kpReward(reward);
    }

    @Override
    public void kpPunish(Punish punish) throws Exception {
        hrMapper.kpPunish(punish);
    }

    @Override
    public List<UserExcellentKpi> userExcellentKpi() {
        return hrMapper.userExcellentKpi();
    }

    @Override
    public void addExcellentKpiTj(UserExcellentKpi userExcellentKpi) {
        hrMapper.addExcellentKpiTj(userExcellentKpi);
    }

    @Override
    public List<UserExcellentKpi> userExcellentKpiTj() {
        return hrMapper.userExcellentKpiTj();
    }

    @Override
    public void addExcellentKpi(UserExcellentKpi userExcellentKpi) {
        AddPoint addPoint = new AddPoint();
        addPoint.setUserId(userExcellentKpi.getUserId());
        addPoint.setUserName(userExcellentKpi.getUserName());
        addPoint.setAddPoint(userExcellentKpi.getKpiPoint());
        hrMapper.addPoint(addPoint);
        hrMapper.addExcellentKpi(userExcellentKpi);
        hrMapper.delExcellentKpiTj(userExcellentKpi);

      /*  DeletePoint deletePoint = new DeletePoint();
        deletePoint.setUserId(userExcellentKpi.getUserId());
        deletePoint.setUserName(userExcellentKpi.getUserName());
        deletePoint.setDeletePoint(userExcellentKpi.getKpiPoint());
        hrMapper.delPoint(deletePoint);
        hrMapper.addExcellentKpi(userExcellentKpi);
        hrMapper.delExcellentKpiTj(userExcellentKpi);*/
    }

    @Override
    public void delExcellentKpiTj(UserExcellentKpi userExcellentKpi) {
        hrMapper.delExcellentKpiTj(userExcellentKpi);
    }

    @Override
    public List<DeletePoint> allDel(DeletePoint dp, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return hrMapper.allDel(dp);
    }
    @Override
    public List<AddPoint> allAdd(AddPoint ap, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return hrMapper.allAdd(ap);

    }
    @Override
    public DeletePoint getDel(DeletePoint deletePoint) {
        return hrMapper.getDel(deletePoint);
    }
    @Override
    public AddPoint getAdd(AddPoint addPoint) {
        return hrMapper.getAdd(addPoint);

    }
    @Override
    public void upDel(DeletePoint deletePoint) {
        hrMapper.upDel(deletePoint);
    }
    @Override
    public void upAdd(AddPoint addPoint) {
        hrMapper.upAdd(addPoint);
    }
    @Override
    public void delThis(DeletePoint deletePoint) {
        AddPoint addPoint = new AddPoint();
        addPoint.setUserId(deletePoint.getUserId());
        addPoint.setAddPoint(deletePoint.getDeletePoint());
        hrMapper.addPoint(addPoint);
        hrMapper.delThis(deletePoint);
    }
    @Override
    public void delThis2(AddPoint addPoint) {
        DeletePoint deletePoint = new DeletePoint();
        deletePoint.setUserId(addPoint.getUserId());
        deletePoint.setDeletePoint(addPoint.getAddPoint());
        hrMapper.delPoint(deletePoint);
        hrMapper.delThis2(addPoint);
    }









    @Override
    public List<WeakCheck> allCheck() {
        return hrMapper.allCheck();
    }
}
