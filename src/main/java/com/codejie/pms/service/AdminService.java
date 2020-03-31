package com.codejie.pms.service;

import com.codejie.pms.entity.dto.NameValueDto;
import com.codejie.pms.entity.WeakCheck;

import java.util.List;
import java.util.Map;

public interface AdminService {

    Map<String, List> initSelect();

    List<WeakCheck> getWeek2();

    Map<String, List> getWeekData(String quarter, String weekNum, String departmentId);

    Map<String, List> getWeekData2(String quarter, String weekNum);

    List<NameValueDto> getWeekData3(String quarter, String weekNum, String departmentId);

    List<NameValueDto> getWeekData4(String quarter, String weekNum);

    String stuCount();
    void upDepartment();

}
