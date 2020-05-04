package com.codejie.pms.service;

import com.codejie.pms.entity.Advice;
import com.codejie.pms.entity.Kpi;
import com.codejie.pms.entity.Permission;
import com.codejie.pms.entity.User;

import java.util.List;

/**
 * Description 用户service层
 */
public interface UserService {

    /**
     * Description 登录
     *
     * @param user 用户输入数据
     * @return User
     */
    User login(User user);

    /**
     * Description 权限列表
     */
    List<Permission> getPerList(Long permissionDegree, int pageNum, int pageSize);

    /**
     * Description 建议列表
     */
    List<Advice> getAdviceList(Advice advice, int pageNum, int pageSize);

    /**
     * Description 提交建议
     */
    void orderAdvice(Advice advice);

    /**
     * Description 审阅建议
     */
    void reviewAdvice(Advice advice);

    /**
     * Description 添加用户
     */
    void addUser(User user);

    void save(User user);

    /**
     * Description 修改用户
     */
    void updateUser(User user);

    /**
     * Description 删除用户
     */
    void deleteUser(User user);

    /**
     * Description 查找用户byId
     *
     * @param user 用户输入数据
     * @return User
     */
    User selectUser(User user);

    /**
     * Description 修改用户
     */
    void updateUserBySelf(User user);

    /**
     * Description 用户列表

     */
    List<User> selectUserList(User user,int pageNum,int pageSize);
    List<User> selectUserList();

    /**
     * Description 所有kpi列表

     */
    List<Kpi> selectKpiList(Kpi kpi, int pageNum, int pageSize);
    List<Kpi> selectKpiList();
    /**
     * Description 员工kpi列表

     */
    List<Kpi> selectKpiList1(Kpi kpi, int pageNum, int pageSize);
    List<Kpi> selectKpiList1();



    /**
     * Description 添加kpi
     */
    void addKpi(Kpi kpi);

    void saveKpi(Kpi kpi);
}
