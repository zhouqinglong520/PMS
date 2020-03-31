package com.codejie.pms.mapper;

import com.codejie.pms.entity.*;
import java.util.List;

/**
 * 员工mapper
 */
public interface HrMapper {

    List<User> getStuMsg(User user);

    String haveId(String id);

    void kpAdd(AddPoint addPoint);

    void kpDel(DeletePoint deletePoint);

    void kpReward(Reward reward);

    void kpPunish(Punish punish);

    void addPoint(AddPoint addPoint);
    void delPoint(DeletePoint deletePoint);

    void addExcellentKpiTj(UserExcellentKpi userExcellentKpi);

    void addExcellentKpi(UserExcellentKpi userExcellentKpi);

    void delExcellentKpiTj(UserExcellentKpi userExcellentKpi);

    List<UserExcellentKpi> userExcellentKpi();
    List<UserExcellentKpi> userExcellentKpiTj();

    List<DeletePoint> allDel(DeletePoint dp);
    DeletePoint getDel(DeletePoint deletePoint);

    void upDel(DeletePoint deletePoint);
    void delThis(DeletePoint deletePoint);

    List<AddPoint> allAdd(AddPoint ap);
    AddPoint getAdd(AddPoint addPoint);

    void upAdd(AddPoint addPoint);
    void delThis2(AddPoint addPoint);

    List<WeakCheck> allCheck();


}
