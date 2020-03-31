package com.codejie.pms.service;

import com.codejie.pms.entity.*;

import java.util.List;

public interface HrService {

    String haveId(String id);

    void kpAdd(AddPoint addPoint)throws Exception;

    void kpDel(DeletePoint deletePoint)throws Exception;

    void kpReward(Reward reward)throws Exception;

    void kpPunish(Punish punish)throws Exception;

    List<UserExcellentKpi> userExcellentKpi();

    void addExcellentKpiTj(UserExcellentKpi userExcellentKpi);

    List<UserExcellentKpi> userExcellentKpiTj();

    void addExcellentKpi(UserExcellentKpi userExcellentKpi);

    void delExcellentKpiTj(UserExcellentKpi userExcellentKpi);

    List<DeletePoint> allDel(DeletePoint dp, int pageNum, int pageSize);

    DeletePoint getDel(DeletePoint deletePoint);

    void upDel(DeletePoint deletePoint);
    void delThis(DeletePoint deletePoint);

    List<AddPoint> allAdd(AddPoint ap, int pageNum, int pageSize);

    AddPoint getAdd(AddPoint addPoint);

    void upAdd(AddPoint addPoint);
    void delThis2(AddPoint addPoint);


    List<WeakCheck> allCheck();

}
