package com.codejie.pms.mapper;

import com.codejie.pms.entity.Advice;
import com.codejie.pms.entity.Kpi;
import com.codejie.pms.entity.Permission;
import com.codejie.pms.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Description
 */
@Mapper
public interface UserMapper {

    /**
     * Description 登录
     * @param user 用户
     * @return User
     */
    User userLogin(User user);

    /**
     * Description 权限列表
     */
    List<Permission> getPerList(Long permissionDegree);

    /**
     * Description 建议列表
     */
    List<Advice> getAdviceList(Advice advice);

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
     * Description 添加kpi
     */
    void addKpi(Kpi kpi);

    void saveKpi(Kpi kpi);

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
    List<User> selectUserList(User user);
    List<User> selectUserList1();

    /**
     * Description 所有kpi列表
     */
    List<Kpi> selectKpiList();
    /**
     * Description 员工kpi列表
     */
    List<Kpi> selectKpiList1();

}
