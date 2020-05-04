package com.codejie.pms.service;

import com.codejie.pms.entity.*;
import com.codejie.pms.entity.dto.NameValueDto;

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

    void kpAdd2(AddPoint addPoint)throws Exception;

    Department selectDepartment(Department department);




    /**
     * Description 开发部kpi列表1
     */
    List<Kpi> selectKpiList4(Kpi kpi, int pageNum, int pageSize);
    List<Kpi> selectKpiList4();

    void kpAdd4(AddPointDepartment addPointDepartment)throws Exception;

    /**
     * Description 开发部kpi列表2
     */
    List<Kpi> selectKpiList5(Kpi kpi, int pageNum, int pageSize);
    List<Kpi> selectKpiList5();

    void kpAdd5(AddPointDepartment addPointDepartment)throws Exception;

    /**
     * Description 运营部kpi列表1
     */
    List<Kpi> selectKpiList6(Kpi kpi, int pageNum, int pageSize);
    List<Kpi> selectKpiList6();

    void kpAdd6(AddPointDepartment addPointDepartment)throws Exception;

    /**
     * Description 运营部kpi列表2
     */
    List<Kpi> selectKpiList7(Kpi kpi, int pageNum, int pageSize);
    List<Kpi> selectKpiList7();

    void kpAdd7(AddPointDepartment addPointDepartment)throws Exception;

    /**
     * Description 人事部kpi列表1
     */
    List<Kpi> selectKpiList8(Kpi kpi, int pageNum, int pageSize);
    List<Kpi> selectKpiList8();

    void kpAdd8(AddPointDepartment addPointDepartment)throws Exception;

    /**
     * Description 人事部kpi列表2
     */
    List<Kpi> selectKpiList9(Kpi kpi, int pageNum, int pageSize);
    List<Kpi> selectKpiList9();

    void kpAdd9(AddPointDepartment addPointDepartment)throws Exception;
    /**
     * Description 市场部kpi列表1
     */
    List<Kpi> selectKpiList10(Kpi kpi, int pageNum, int pageSize);
    List<Kpi> selectKpiList10();

    void kpAdd10(AddPointDepartment addPointDepartment)throws Exception;
    /**
     * Description 市场部kpi列表2
     */
    List<Kpi> selectKpiList11(Kpi kpi, int pageNum, int pageSize);
    List<Kpi> selectKpiList11();

    void kpAdd11(AddPointDepartment addPointDepartment)throws Exception;
    /**
     * Description 财务部kpi列表1
     */
    List<Kpi> selectKpiList12(Kpi kpi, int pageNum, int pageSize);
    List<Kpi> selectKpiList12();

    void kpAdd12(AddPointDepartment addPointDepartment)throws Exception;
    /**
     * Description 财务部kpi列表2
     */
    List<Kpi> selectKpiList13(Kpi kpi, int pageNum, int pageSize);
    List<Kpi> selectKpiList13();

    void kpAdd13(AddPointDepartment addPointDepartment)throws Exception;
}
