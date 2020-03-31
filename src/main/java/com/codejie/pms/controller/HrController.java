package com.codejie.pms.controller;

import com.codejie.pms.entity.*;
import com.codejie.pms.service.HrService;
import com.codejie.pms.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description user
 */
@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/hr")
public class HrController {

    @Resource
    private HrService hrService;

    @Resource
    private UserService userService;

    /**
     * Description 打开所有员工页面
     */
    @RequestMapping("/all_user")
    public ModelAndView week() {
        ModelAndView mv = new ModelAndView("/hr/all_user");
        return mv;
    }

    /**
     * Description 所有员工信息
     */
    @RequestMapping("/getUserList")
    @ResponseBody
    public PageInfo<User> getDeletePoint(String userId, @RequestParam(defaultValue = "1") int pageNum,
                                         @RequestParam(defaultValue = "10") int pageSize) {
        User user = new User();
        user.setUserId(userId);
        List<User> list = userService.selectUserList(user, pageNum, pageSize);
        return new PageInfo<>(list);
    }

    /**
     * Description 打开员工详情页面
     */
    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public ModelAndView getUser(String userId) {
        ModelAndView mv = new ModelAndView("/hr/user_msg");
        User user = new User();
        user.setUserId(userId);
        User user1 = userService.selectUser(user);
        mv.addObject("user",user1);
        return mv;
    }

    /**
     * Description 获取员工详情
     */
    @RequestMapping(value = "/getUserMsg")
    @ResponseBody
    public User getUserMsg(String userId) {
        User user = new User();
        user.setUserId(userId);
        User user1 = userService.selectUser(user);
        return user1;
    }

    /**
     * Description 打开添加员工页面
     */
    @RequestMapping(value = "/addUser")
    public ModelAndView addUser() {
        ModelAndView mv = new ModelAndView("/hr/add_user");
        return mv;
    }

    /**
     * Description 添加
     */
    @RequestMapping(value = "/haveId")
    @ResponseBody
    public String haveId(String userId, String userName,
                         String phone, String departmentId,
                         String email, String hometown,
                         String gender, String permissionDegree) {
        User user = new User();
        user.setUserId(userId);
        user.setUserName(userName);
        user.setEmail(email);
        user.setPhone(phone);
        user.setDepartmentId(departmentId);
        user.setHometown(hometown);
        user.setGender(gender);
        user.setPermissionDegree(Long.parseLong(permissionDegree));
        String haveId = hrService.haveId(userId);
        if ("true".equals(haveId)) {
            return "false";
        } else {
            userService.addUser(user);
        }
        return "true";
    }

    /**
     * 打开录入考评页面
     */
    @RequestMapping(value = "/addUserKp", method = RequestMethod.GET)
    public ModelAndView addUserKp(String userId) {
        ModelAndView mv = new ModelAndView("/hr/add_kp");
        User user = new User();
        user.setUserId(userId);
        User user1 = userService.selectUser(user);
        mv.addObject("user",user1);
        mv.addObject("checkList",hrService.allCheck());
        return mv;
    }

    /**
     * 录入员工加分
     */
    @RequestMapping(value = "/kpAdd")
    @ResponseBody
    public ModelAndView kpAdd(AddPoint addPoint) {

        try{
            hrService.kpAdd(addPoint);
        }catch (Exception e){
            System.out.println(e);
        }
        ModelAndView mv = new ModelAndView("/hr/add_kp");
        User user = new User();
        user.setUserId(addPoint.getUserId());
        User user1 = userService.selectUser(user);
        mv.addObject("user",user1);
        return mv;
    }

    /**
     * 录入减分
     */
    @RequestMapping(value = "/kpDel")
    @ResponseBody
    public ModelAndView kpDel(DeletePoint deletePoint) {
        try{
            hrService.kpDel(deletePoint);
        }catch (Exception e){
            System.out.println(e);
        }
        ModelAndView mv = new ModelAndView("/hr/add_kp");
        User user = new User();
        user.setUserId(deletePoint.getUserId());
        User user1 = userService.selectUser(user);
        mv.addObject("user",user1);
        return mv;
    }

    /**
     * 录入惩罚
     */
    @RequestMapping(value = "/kpPunish")
    @ResponseBody
    public ModelAndView kpPunish(Punish punish) {
        try{
            hrService.kpPunish(punish);
        }catch (Exception e){
            System.out.println(e);
        }
        ModelAndView mv = new ModelAndView("/hr/add_kp");
        User user = new User();
        user.setUserId(punish.getUserId());
        User user1 = userService.selectUser(user);
        mv.addObject("user",user1);
        return mv;
    }

    /**
     * 录入奖励
     */
    @RequestMapping(value = "/kpReward")
    @ResponseBody
    public ModelAndView kpReward(Reward reward) {
        try{
            hrService.kpReward(reward);
        }catch (Exception e){
            System.out.println(e);
        }
        ModelAndView mv = new ModelAndView("/hr/add_kp");
        User user = new User();
        user.setUserId(reward.getUserId());
        User user1 = userService.selectUser(user);
        mv.addObject("user",user1);
        return mv;
    }

    /**
     * 打开提交优秀加分页面
     */
    @RequestMapping(value = "/addExcellentKpi", method = RequestMethod.GET)
    public ModelAndView addExcellentKpi(String userId) {
        ModelAndView mv = new ModelAndView("/hr/add_excellentKpi");
        User user = new User();
        user.setUserId(userId);
        User user1 = userService.selectUser(user);
        mv.addObject("user",user1);
        return mv;
    }

    /**
     * 打开优秀加分信息页面
     */
    @RequestMapping(value = "/allExcellentKpi")
    public ModelAndView allExcellentKpi() {
        ModelAndView mv = new ModelAndView("/hr/all_excellentKpi");
        List<UserExcellentKpi> list = hrService.userExcellentKpi();
        mv.addObject("list",list);
        return mv;
    }

    /**
     * 所有优秀加分
     * @return
     */
    @RequestMapping("/get_all_excellentKpi")
    @ResponseBody
    public List<UserExcellentKpi> getAllExcellentKpi(){
        return hrService.userExcellentKpi();
    }

    /**
     * 提交重大优秀加分
     */
    @RequestMapping("/add_excellentKpi")
    public ModelAndView addExcellentKpi(UserExcellentKpi userExcellentKpi){
        String kpiDegree = userExcellentKpi.getKpiDegree()+"";
        Map<String,String> excellentKpiMap = new HashMap<>(5);
        excellentKpiMap.put("1","为公司挽回重大损失");
        excellentKpiMap.put("2","为公司提供了个人资源");
        excellentKpiMap.put("3","年度十佳员工");
        excellentKpiMap.put("4","老员工加成");
        excellentKpiMap.put("5","受到社会嘉奖");
        userExcellentKpi.setKpiDegreeMs(excellentKpiMap.get(kpiDegree));
        hrService.addExcellentKpiTj(userExcellentKpi);
        ModelAndView mv = new ModelAndView("/hr/all_user");
        return mv;
    }

    /**
     * Description 打开近期扣绩效
     */
    @RequestMapping(value = "/all_del")
    public ModelAndView allDel() {
        ModelAndView mv = new ModelAndView("/hr/all_del");
        return mv;
    }
    /**
     * Description 打开近期加绩效
     */
    @RequestMapping(value = "/all_add")
    public ModelAndView allAdd() {
        ModelAndView mv = new ModelAndView("/hr/all_add");
        return mv;
    }

    /**
     * 扣分员工
     */
    @RequestMapping("/del_list")
    @ResponseBody
    public PageInfo<DeletePoint> delList(String deleteDesc,String userId, @RequestParam(defaultValue = "1") int pageNum,
                                         @RequestParam(defaultValue = "10") int pageSize) {
        DeletePoint dp = new DeletePoint();
        dp.setUserId(userId);
        dp.setDeleteDesc(deleteDesc);
        List<DeletePoint> list = hrService.allDel(dp, pageNum, pageSize);
        return new PageInfo<>(list);
    }
    /**
     * 加分员工
     */
    @RequestMapping("/add_list")
    @ResponseBody
    public PageInfo<AddPoint> addList(String addDesc,String userId, @RequestParam(defaultValue = "1") int pageNum,
                                         @RequestParam(defaultValue = "10") int pageSize) {
        AddPoint ap = new AddPoint();
        ap.setUserId(userId);
        ap.setAddDesc(addDesc);
        List<AddPoint> list = hrService.allAdd(ap, pageNum, pageSize);
        return new PageInfo<>(list);
    }

    /**
     * 编辑此次扣分
     */
    @RequestMapping("/del_del")
    @ResponseBody
    public ModelAndView delDel(String userName,String userId,String deleteId) {
        ModelAndView mv = new ModelAndView("/hr/update_del");
        DeletePoint deletePoint1 = new DeletePoint();
        deletePoint1.setDeleteId(Long.parseLong(deleteId));
        DeletePoint deletePoint = hrService.getDel(deletePoint1);
        mv.addObject("userId",userId);
        mv.addObject("deletePoint",deletePoint);
        mv.addObject("userName",userName);
        return mv;
    }
    /**
     * 编辑此次加分
     */
    @RequestMapping("/del_add")
    @ResponseBody
    public ModelAndView delAdd(String userName,String userId,String addId) {
        ModelAndView mv = new ModelAndView("/hr/update_add");
        AddPoint addPoint1 = new AddPoint();
        addPoint1.setAddId(Long.parseLong(addId));
        AddPoint addPoint = hrService.getAdd(addPoint1);
        mv.addObject("userId",userId);
        mv.addObject("addPoint",addPoint);
        mv.addObject("userName",userName);
        return mv;
    }
    /**
     * 录入扣分
     */
    @RequestMapping(value = "/upDel")
    @ResponseBody
    public ModelAndView upDel(DeletePoint deletePoint) {
        ModelAndView mv = new ModelAndView("/hr/all_del");
        hrService.upDel(deletePoint);
        return mv;
    }
    /**
     * 录入加分
     */
    @RequestMapping(value = "/upAdd")
    @ResponseBody
    public ModelAndView upAdd(AddPoint addPoint) {
        ModelAndView mv = new ModelAndView("/hr/all_add");
        hrService.upAdd(addPoint);
        return mv;
    }

    /**
     * 删除此次扣分
     */
    @RequestMapping(value = "/del_this")
    @ResponseBody
    public ModelAndView delThis(String deleteId) {
        ModelAndView mv = new ModelAndView("/hr/all_del");
        DeletePoint deletePoint1 = new DeletePoint();
        deletePoint1.setDeleteId(Long.parseLong(deleteId));
        DeletePoint deletePoint = hrService.getDel(deletePoint1);
        hrService.delThis(deletePoint);
        return mv;
    }

    /**
     * 删除此次加分
     */
    @RequestMapping(value = "/del_this2")
    @ResponseBody
    public ModelAndView delThis2(String addId) {
        ModelAndView mv = new ModelAndView("/hr/all_add");
        AddPoint addPoint1 = new AddPoint();
        addPoint1.setAddId(Long.parseLong(addId));
        AddPoint addPoint = hrService.getAdd(addPoint1);
        hrService.delThis2(addPoint);
        return mv;
    }






}