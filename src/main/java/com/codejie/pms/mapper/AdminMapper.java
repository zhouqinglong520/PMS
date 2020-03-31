package com.codejie.pms.mapper;

import com.codejie.pms.entity.Department;
import com.codejie.pms.entity.WeakCheck;
import com.codejie.pms.entity.dto.DepartmentDelDto;

import java.util.List;

/**
 * 员工mapper
 */
public interface AdminMapper {

    List<String> initSelect1();

    List<String> initSelect2();

    List<Department> allDepartment();

    List<WeakCheck> getWeek2();

    List<String> weekList(String date1, String date2);

    List<DepartmentDelDto> getWeekData(String date1, String date2, String data3);

    List<DepartmentDelDto> getWeekData2(String date1, String date2);

    String stuCount();

    List<DepartmentDelDto> getDepartmentCheckDel(String data1,String data2);
    void upDepartment(Department department);

}
