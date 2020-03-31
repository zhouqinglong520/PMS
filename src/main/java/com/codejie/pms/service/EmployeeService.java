package com.codejie.pms.service;

import com.codejie.pms.entity.*;
import java.util.List;

public interface EmployeeService {

    /**
     * Description 个人加分信息
     */
    List<AddPoint> getAddPoint(AddPoint addPoint, int pageNum, int pageSize);

    /**
     * Description 个人加分信息
     */
    List<DeletePoint> getDeletePoint(DeletePoint deletePoint, int pageNum, int pageSize);

    /**
     * Description 个人惩罚信息
     */
    List<Punish> getPunishList(Punish punish, int pageNum, int pageSize);

    /**
     * Description 个人奖励信息
     */
    List<Reward> getRewardList(Reward reward, int pageNum, int pageSize);

    /**
     * Description 我的部门信息
     */
    Department getUserDepartment(String userId);

    /**
     * Description 所有部门信息
     */
    List<Department> getDepartmentList(Department department, int pageNum, int pageSize);

}
