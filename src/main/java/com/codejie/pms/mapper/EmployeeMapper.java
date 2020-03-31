package com.codejie.pms.mapper;

import com.codejie.pms.entity.*;
import java.util.List;

/**
 * 员工mapper
 */
public interface EmployeeMapper {

    /**
     * Description 个人加分信息
     */
    List<AddPoint> getAddPoint(AddPoint addPoint);

    /**
     * Description 个人加分信息
     */
    List<DeletePoint> getDeletePoint(DeletePoint deletePoint);

    /**
     * Description 个人惩罚信息
     */
    List<Punish> getPunishList(Punish punish);

    /**
     * Description 个人奖励信息
     */
    List<Reward> getRewardList(Reward reward);

    /**
     * Description 我的部门信息
     */
    Department getUserDepartment(String userId);

    /**
     * Description 所有部门信息
     */
    List<Department> getDepartmentList(Department department);

    /**
     * Description 优秀加分通报
     */
    List<UserExcellentKpi> getUserExcellentKpi(UserExcellentKpi userExcellentKpi);

}
