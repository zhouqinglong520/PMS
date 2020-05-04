package com.codejie.pms.controller;

import com.codejie.pms.entity.*;
import com.codejie.pms.entity.dto.NameValueDto;
import com.codejie.pms.service.AdminService;
import com.codejie.pms.service.HrService;
import com.codejie.pms.service.UserService;
import com.codejie.pms.util.ImportExcelUtil;
import com.github.pagehelper.PageInfo;
import com.codejie.pms.util.DateUtil;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/admin")
public class AdminController {

    @Resource
    private HrService hrService;
    @Resource
    private AdminService adminService;
    @Resource
    private UserService userService;

    /**
     * Description 打开所有员工页面
     */
    @RequestMapping("/all_user")
    public ModelAndView allUser() {
        ModelAndView mv = new ModelAndView("/admin/all_user");
        mv.addObject("isSuccess","3");
        return mv;
    }

    /**
     * Description 打开所有绩效指标页面
     */
    @RequestMapping("/all_kpi")
    public ModelAndView allKpi() {
        ModelAndView mv = new ModelAndView("/admin/all_kpi");
        mv.addObject("isSuccess","3");
        return mv;
    }
    /**
     * Description 打开所有绩效指标页面2
     */
    @RequestMapping("/add_kp2")
    public ModelAndView allKpi2(AddPoint addPoint2) {
        try{
            adminService.kpAdd2(addPoint2);
        }catch (Exception e){
            System.out.println(e);
        }

        ModelAndView mv = new ModelAndView("/admin/add_kp2");

        User user = new User();
        user.setUserId(addPoint2.getUserId());
        User user1 = userService.selectUser(user);
        mv.addObject("user",user1);

        mv.addObject("isSuccess","3");
        return mv;


    }



    /**
     * Description 打开所有绩效指标页面3
     */
    @RequestMapping("/all_kpi3")
    public ModelAndView allKpi3() {
        ModelAndView mv = new ModelAndView("/admin/all_kpi3");
        mv.addObject("isSuccess","3");
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
     * Description 所有绩效指标信息
     */
    @RequestMapping("/getKpiList")
    @ResponseBody
    public PageInfo<Kpi> getKpiList(String kpiId, @RequestParam(defaultValue = "1") int pageNum,
                                    @RequestParam(defaultValue = "10") int pageSize) {
        Kpi kpi = new Kpi();
        kpi.setKpiId(kpiId);
        List<Kpi> list = userService.selectKpiList(kpi, pageNum, pageSize);
        return new PageInfo<>(list);
    }




    /**
     * Description 所有员工绩效指标信息
     */
    @RequestMapping("/getKpiList1")
    @ResponseBody
    public PageInfo<Kpi> getKpiList1(String kpiId, @RequestParam(defaultValue = "1") int pageNum,
                                    @RequestParam(defaultValue = "10") int pageSize) {
        Kpi kpi = new Kpi();
        kpi.setKpiId(kpiId);
        List<Kpi> list = userService.selectKpiList1(kpi, pageNum, pageSize);
        return new PageInfo<>(list);
    }







    /**
     * Description 开发部绩效指标页面1
     */
    @RequestMapping("/all_kpi4")
    public ModelAndView allKpi4(AddPointDepartment addPointDepartment) {

        try{
            adminService.kpAdd4(addPointDepartment);
        }catch (Exception e){
            System.out.println(e);
        }

        ModelAndView mv = new ModelAndView("/admin/all_kpi4");
        Department department = new Department();
        department.setDepartmentId(addPointDepartment.getDepartmentId());
        Department department1  = adminService.selectDepartment(department);
        mv.addObject("department",department1);

        mv.addObject("isSuccess","3");
        return mv;
    }
    /**
     * Description 开发部绩效指标页面2
     */
    @RequestMapping("/all_kpi5")
    public ModelAndView allKpi5(AddPointDepartment addPointDepartment) {
        try{
            adminService.kpAdd5(addPointDepartment);
        }catch (Exception e){
            System.out.println(e);
        }
        ModelAndView mv = new ModelAndView("/admin/all_kpi5");
        Department department = new Department();
        department.setDepartmentId(addPointDepartment.getDepartmentId());
        Department department1  = adminService.selectDepartment(department);
        mv.addObject("department",department1);
        mv.addObject("isSuccess","3");
        return mv;
    }
    /**
     * Description 运营部绩效指标页面1
     */
    @RequestMapping("/all_kpi6")
    public ModelAndView allKpi6(AddPointDepartment addPointDepartment) {
        try{
            adminService.kpAdd6(addPointDepartment);
        }catch (Exception e){
            System.out.println(e);
        }
        ModelAndView mv = new ModelAndView("/admin/all_kpi6");
        Department department = new Department();
        department.setDepartmentId(addPointDepartment.getDepartmentId());
        Department department1  = adminService.selectDepartment(department);
        mv.addObject("department",department1);
        mv.addObject("isSuccess","3");
        return mv;
    }
    /**
     * Description 运营部绩效指标页面2
     */
    @RequestMapping("/all_kpi7")
    public ModelAndView allKpi7(AddPointDepartment addPointDepartment) {
        try{
            adminService.kpAdd7(addPointDepartment);
        }catch (Exception e){
            System.out.println(e);
        }
        ModelAndView mv = new ModelAndView("/admin/all_kpi7");
        Department department = new Department();
        department.setDepartmentId(addPointDepartment.getDepartmentId());
        Department department1  = adminService.selectDepartment(department);
        mv.addObject("department",department1);
        mv.addObject("isSuccess","3");
        return mv;
    }
    /**
     * Description 人事部绩效指标页面1
     */
    @RequestMapping("/all_kpi8")
    public ModelAndView allKpi8(AddPointDepartment addPointDepartment) {
        try{
            adminService.kpAdd8(addPointDepartment);
        }catch (Exception e){
            System.out.println(e);
        }
        ModelAndView mv = new ModelAndView("/admin/all_kpi8");
        Department department = new Department();
        department.setDepartmentId(addPointDepartment.getDepartmentId());
        Department department1  = adminService.selectDepartment(department);
        mv.addObject("department",department1);
        mv.addObject("isSuccess","3");
        return mv;
    }
    /**
     * Description 人事部绩效指标页面2
     */
    @RequestMapping("/all_kpi9")
    public ModelAndView allKpi9(AddPointDepartment addPointDepartment) {
        try{
            adminService.kpAdd9(addPointDepartment);
        }catch (Exception e){
            System.out.println(e);
        }
        ModelAndView mv = new ModelAndView("/admin/all_kpi9");
        Department department = new Department();
        department.setDepartmentId(addPointDepartment.getDepartmentId());
        Department department1  = adminService.selectDepartment(department);
        mv.addObject("department",department1);
        mv.addObject("isSuccess","3");
        return mv;
    }
    /**
     * Description 市场部绩效指标页面1
     */
    @RequestMapping("/all_kpi10")
    public ModelAndView allKpi10(AddPointDepartment addPointDepartment) {
        try{
            adminService.kpAdd10(addPointDepartment);
        }catch (Exception e){
            System.out.println(e);
        }
        ModelAndView mv = new ModelAndView("/admin/all_kpi10");
        Department department = new Department();
        department.setDepartmentId(addPointDepartment.getDepartmentId());
        Department department1  = adminService.selectDepartment(department);
        mv.addObject("department",department1);
        mv.addObject("isSuccess","3");
        return mv;
    }
    /**
     * Description 市场部绩效指标页面2
     */
    @RequestMapping("/all_kpi11")
    public ModelAndView allKpi11(AddPointDepartment addPointDepartment) {
        try{
            adminService.kpAdd11(addPointDepartment);
        }catch (Exception e){
            System.out.println(e);
        }
        ModelAndView mv = new ModelAndView("/admin/all_kpi11");
        Department department = new Department();
        department.setDepartmentId(addPointDepartment.getDepartmentId());
        Department department1  = adminService.selectDepartment(department);
        mv.addObject("department",department1);
        mv.addObject("isSuccess","3");
        return mv;
    }
    /**
     * Description 财务部绩效指标页面1
     */
    @RequestMapping("/all_kpi12")
    public ModelAndView allKpi12(AddPointDepartment addPointDepartment) {
        try{
            adminService.kpAdd12(addPointDepartment);
        }catch (Exception e){
            System.out.println(e);
        }
        ModelAndView mv = new ModelAndView("/admin/all_kpi12");
        Department department = new Department();
        department.setDepartmentId(addPointDepartment.getDepartmentId());
        Department department1  = adminService.selectDepartment(department);
        mv.addObject("department",department1);
        mv.addObject("isSuccess","3");
        return mv;
    }
    /**
     * Description 财务部绩效指标页面2
     */
    @RequestMapping("/all_kpi13")
    public ModelAndView allKpi13(AddPointDepartment addPointDepartment) {
        try{
            adminService.kpAdd13(addPointDepartment);
        }catch (Exception e){
            System.out.println(e);
        }
        ModelAndView mv = new ModelAndView("/admin/all_kpi13");
        Department department = new Department();
        department.setDepartmentId(addPointDepartment.getDepartmentId());
        Department department1  = adminService.selectDepartment(department);
        mv.addObject("department",department1);
        mv.addObject("isSuccess","3");
        return mv;
    }

    /**
     * Description 所有开发部绩效指标信息1
     */
    @RequestMapping("/getKpiList4")
    @ResponseBody
    public PageInfo<Kpi> getKpiList4(String kpiId, @RequestParam(defaultValue = "1") int pageNum,
                                     @RequestParam(defaultValue = "10") int pageSize) {
        Kpi kpi = new Kpi();
        kpi.setKpiId(kpiId);
        List<Kpi> list = adminService.selectKpiList4(kpi, pageNum, pageSize);
        return new PageInfo<>(list);
    }
    /**
     * Description 所有开发部绩效指标信息2
     */
    @RequestMapping("/getKpiList5")
    @ResponseBody
    public PageInfo<Kpi> getKpiList5(String kpiId, @RequestParam(defaultValue = "1") int pageNum,
                                     @RequestParam(defaultValue = "10") int pageSize) {
        Kpi kpi = new Kpi();
        kpi.setKpiId(kpiId);
        List<Kpi> list = adminService.selectKpiList5(kpi, pageNum, pageSize);
        return new PageInfo<>(list);
    }
    /**
     * Description 所有运营部绩效指标信息1
     */
    @RequestMapping("/getKpiList6")
    @ResponseBody
    public PageInfo<Kpi> getKpiList6(String kpiId, @RequestParam(defaultValue = "1") int pageNum,
                                     @RequestParam(defaultValue = "10") int pageSize) {
        Kpi kpi = new Kpi();
        kpi.setKpiId(kpiId);
        List<Kpi> list = adminService.selectKpiList6(kpi, pageNum, pageSize);
        return new PageInfo<>(list);
    }
    /**
     * Description 所有运营部绩效指标信息2
     */
    @RequestMapping("/getKpiList7")
    @ResponseBody
    public PageInfo<Kpi> getKpiList7(String kpiId, @RequestParam(defaultValue = "1") int pageNum,
                                     @RequestParam(defaultValue = "10") int pageSize) {
        Kpi kpi = new Kpi();
        kpi.setKpiId(kpiId);
        List<Kpi> list = adminService.selectKpiList7(kpi, pageNum, pageSize);
        return new PageInfo<>(list);
    }
    /**
     * Description 所有人事部部绩效指标信息1
     */
    @RequestMapping("/getKpiList8")
    @ResponseBody
    public PageInfo<Kpi> getKpiList8(String kpiId, @RequestParam(defaultValue = "1") int pageNum,
                                     @RequestParam(defaultValue = "10") int pageSize) {
        Kpi kpi = new Kpi();
        kpi.setKpiId(kpiId);
        List<Kpi> list = adminService.selectKpiList8(kpi, pageNum, pageSize);
        return new PageInfo<>(list);
    }
    /**
     * Description 所有人事部部绩效指标信息2
     */
    @RequestMapping("/getKpiList9")
    @ResponseBody
    public PageInfo<Kpi> getKpiList9(String kpiId, @RequestParam(defaultValue = "1") int pageNum,
                                     @RequestParam(defaultValue = "10") int pageSize) {
        Kpi kpi = new Kpi();
        kpi.setKpiId(kpiId);
        List<Kpi> list = adminService.selectKpiList9(kpi, pageNum, pageSize);
        return new PageInfo<>(list);
    }
    /**
     * Description 所有市场部部绩效指标信息1
     */
    @RequestMapping("/getKpiList10")
    @ResponseBody
    public PageInfo<Kpi> getKpiList10(String kpiId, @RequestParam(defaultValue = "1") int pageNum,
                                     @RequestParam(defaultValue = "10") int pageSize) {
        Kpi kpi = new Kpi();
        kpi.setKpiId(kpiId);
        List<Kpi> list = adminService.selectKpiList10(kpi, pageNum, pageSize);
        return new PageInfo<>(list);
    }
    /**
     * Description 所有市场部部绩效指标信息2
     */
    @RequestMapping("/getKpiList11")
    @ResponseBody
    public PageInfo<Kpi> getKpiList11(String kpiId, @RequestParam(defaultValue = "1") int pageNum,
                                      @RequestParam(defaultValue = "10") int pageSize) {
        Kpi kpi = new Kpi();
        kpi.setKpiId(kpiId);
        List<Kpi> list = adminService.selectKpiList11(kpi, pageNum, pageSize);
        return new PageInfo<>(list);
    }
    /**
     * Description 所有财务部部绩效指标信息1
     */
    @RequestMapping("/getKpiList12")
    @ResponseBody
    public PageInfo<Kpi> getKpiList12(String kpiId, @RequestParam(defaultValue = "1") int pageNum,
                                      @RequestParam(defaultValue = "10") int pageSize) {
        Kpi kpi = new Kpi();
        kpi.setKpiId(kpiId);
        List<Kpi> list = adminService.selectKpiList12(kpi, pageNum, pageSize);
        return new PageInfo<>(list);
    }
    /**
     * Description 所有财务部部绩效指标信息2
     */
    @RequestMapping("/getKpiList13")
    @ResponseBody
    public PageInfo<Kpi> getKpiList13(String kpiId, @RequestParam(defaultValue = "1") int pageNum,
                                      @RequestParam(defaultValue = "10") int pageSize) {
        Kpi kpi = new Kpi();
        kpi.setKpiId(kpiId);
        List<Kpi> list = adminService.selectKpiList13(kpi, pageNum, pageSize);
        return new PageInfo<>(list);
    }



    /**
     * Description 打开员工详情页面
     */
    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public ModelAndView getUser(String userId) {
        ModelAndView mv = new ModelAndView("/admin/user_msg");
        User user = new User();
        user.setUserId(userId);
        User user1 = userService.selectUser(user);
        mv.addObject("user",user1);
        return mv;
    }

    /**
     * Description 打开周信息页面
     */
    @RequestMapping("/week")
    public ModelAndView week() {
        ModelAndView mv = new ModelAndView("/admin/week");
        return mv;
    }

    @RequestMapping("/initSelect")
    @ResponseBody
    public Map<String, List> initSelect() {
        return adminService.initSelect();
    }

    @RequestMapping("/getWeekCheck2")
    @ResponseBody
    public List<WeakCheck> getWeekCheck2() {
        return adminService.getWeek2();
    }

    @RequestMapping("/getWeekData")
    @ResponseBody
    public Map<String, List> getWeekData(String quarter, String weekNum, String departmentId) {
        return adminService.getWeekData(quarter, weekNum, departmentId);
    }

    @RequestMapping("/getWeekData2")
    @ResponseBody
    public Map<String, List> getWeekData2(String quarter, String weekNum) {
        return adminService.getWeekData2(quarter, weekNum);
    }

    /**
     * Description 加分占比
     */
    @RequestMapping("/getWeekData3")
    @ResponseBody
    public List<NameValueDto> getWeekData3(String quarter, String weekNum, String departmentId) {
        return adminService.getWeekData3(quarter, weekNum, departmentId);
    }
    /**
     * Description 加分占比
     */
    @RequestMapping("/getWeekData4")
    @ResponseBody
    public List<NameValueDto> getWeekData4(String quarter, String weekNum) {
        return adminService.getWeekData4(quarter, weekNum);
    }

    /**
     * Description 人数
     */
    @RequestMapping("/stuCount")
    @ResponseBody
    public List<String> stuCount() {
        String qrrkCount = adminService.stuCount();
        List<String> countList = new ArrayList<>();
        if (!StringUtils.isEmpty(qrrkCount)) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 5 - qrrkCount.length(); i++) {
                sb.append("0");
            }
            sb.append(qrrkCount);
            String qrrkStr = sb.toString();
            countList.add(qrrkStr.substring(4, 5));
            countList.add(qrrkStr.substring(3, 4));
            countList.add(qrrkStr.substring(2, 3));
            countList.add(qrrkStr.substring(1, 2));
            countList.add(qrrkStr.substring(0, 1));
        }
        return countList;
    }

    /**
     * Description 打开批量员工导入页面
     */
    @RequestMapping("/initUpload")
    public ModelAndView initUpload() {
        ModelAndView mv = new ModelAndView("/admin/upload");
        return mv;
    }

    /**
     * Description 打开批量指标导入页面
     */
    @RequestMapping("/initUpload2")
    public ModelAndView initUpload2() {
        ModelAndView mv = new ModelAndView("/admin/upload2");
        return mv;
    }


    /**
     * 导入员工excel文件
     * @param myFile
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/upload", method=RequestMethod.POST)
    public ModelAndView importFile(@RequestParam(value="file",required=false)MultipartFile myFile) throws IOException {
        ModelAndView mv = new ModelAndView("/admin/all_user");
        try {
            ImportExcelUtil util = new ImportExcelUtil();
            InputStream input;
            List<List<Object>> lists;
            if (myFile.isEmpty()) {
                System.out.println("导入文件为空");
            } else {
                String fileName = myFile.getOriginalFilename();
                input = myFile.getInputStream();
                lists = util.getBankListByExcel(input, fileName);
                input.close();
                //判断主键重复
                for (int i = 1; i < lists.size(); i++) {
                    List<Object> list = lists.get(i);
                    String haveId = hrService.haveId(util.getFormat(String.valueOf(list.get(0))));
                    if ("true".equals(haveId)) {
                        mv.addObject("isSuccess","2");
                        return mv;
                    }
                }
                //循环将excel中的数据存入库
                for (int i = 1; i < lists.size(); i++) {
                    List<Object> list = lists.get(i);
                    User users = new User();
                    users.setUserId(util.getFormat(String.valueOf(list.get(0))));
                    users.setUserName(util.getFormat(String.valueOf(list.get(1))));
                    users.setPwd(util.getFormat(String.valueOf(list.get(2))));
                    users.setPermissionDegree(Long.parseLong(util.getFormat(String.valueOf(list.get(3)))));
                    users.setDepartmentId(util.getFormat(String.valueOf(list.get(4))));
                    users.setKpiSum(Double.parseDouble(util.getFormat(String.valueOf(list.get(5)))));
                    users.setPhone(util.getFormat(String.valueOf(list.get(6))));
                    users.setEmail(util.getFormat(String.valueOf(list.get(7))));
                    users.setHometown(util.getFormat(String.valueOf(list.get(8))));
                    users.setGender(util.getFormat(String.valueOf(list.get(9))));

                    userService.save(users);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("导入出错");
        }
        mv.addObject("isSuccess","1");
        return mv;
    }

    /**
     * 导入指标excel文件
     * @param myFile
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/upload2", method=RequestMethod.POST)
    public ModelAndView importFile2(@RequestParam(value="file",required=false)MultipartFile myFile) throws IOException {
        ModelAndView mv = new ModelAndView("/admin/all_kpi");
        try {
            ImportExcelUtil util = new ImportExcelUtil();
            InputStream input;
            List<List<Object>> lists;
            if (myFile.isEmpty()) {
                System.out.println("导入文件为空");
            } else {
                String fileName = myFile.getOriginalFilename();
                input = myFile.getInputStream();
                lists = util.getBankListByExcel(input, fileName);
                input.close();
                //判断主键重复
                for (int i = 1; i < lists.size(); i++) {
                    List<Object> list = lists.get(i);
                    String haveId = hrService.haveId(util.getFormat(String.valueOf(list.get(0))));
                    if ("true".equals(haveId)) {
                        mv.addObject("isSuccess","2");
                        return mv;
                    }
                }
                //循环将excel中的数据存入库
                for (int i = 1; i < lists.size(); i++) {
                    List<Object> list = lists.get(i);
                    Kpi kpi = new Kpi();
                    kpi.setKpiId(util.getFormat(String.valueOf(list.get(0))));
                    kpi.setKpiName(util.getFormat(String.valueOf(list.get(1))));
                    kpi.setKpiDescription(util.getFormat(String.valueOf(list.get(2))));
                    kpi.setKpiGrading(util.getFormat(util.getFormat(String.valueOf(list.get(3)))));
                    kpi.setKpiWeight(Double.parseDouble(util.getFormat(String.valueOf(list.get(4)))));
                    kpi.setKpiDepartment(util.getFormat(String.valueOf(list.get(5))));
                    kpi.setKpiProperty(util.getFormat(String.valueOf(list.get(6))));
                    userService.saveKpi(kpi);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("导入出错");
        }
        mv.addObject("isSuccess","1");
        return mv;
    }


    /**
     * 导出excel
     */
    @RequestMapping(value = "/export")
    public void exportallDocumentaryExcel(HttpServletResponse response) throws IOException {
        try {
                List<User> userList = userService.selectUserList();
                // 在内存中创建一个Excel文件，通过输出流写到客户端提供下载
                // 内存中保留 10000 条数据，以免内存溢出，其余写入 硬盘
                SXSSFWorkbook workbook = new SXSSFWorkbook(10000);
                CellStyle style = workbook.createCellStyle();
                style.setAlignment(XSSFCellStyle.ALIGN_CENTER);//SXSSFWorkbook方式的居中
                // 创建一个sheet页
                SXSSFSheet sheet = (SXSSFSheet) workbook.createSheet("表格");
                // 分别设置Excel列的宽度

                for(int i=0;i<10;i++){
                    sheet.setColumnWidth(i, 4000);
                }
                // 创建标题
                SXSSFRow headRow = (SXSSFRow) sheet.createRow(0);
                headRow.createCell(0).setCellValue("工号");
                headRow.createCell(1).setCellValue("姓名");
                headRow.createCell(2).setCellValue("密码");
                headRow.createCell(3).setCellValue("权限");
                headRow.createCell(4).setCellValue("部门编码");
                headRow.createCell(5).setCellValue("绩效值");
                headRow.createCell(6).setCellValue("手机号码");
                headRow.createCell(7).setCellValue("邮箱");
                headRow.createCell(8).setCellValue("籍贯");
                headRow.createCell(9).setCellValue("性别");

                for (User user : userList) {
                    // 创建行
                    SXSSFRow dataRow = (SXSSFRow) sheet.createRow(sheet.getLastRowNum() + 1);

                    dataRow.createCell(0).setCellValue(user.getUserId());
                    dataRow.createCell(1).setCellValue(user.getUserName());
                    dataRow.createCell(2).setCellValue(user.getPwd());
                    dataRow.createCell(3).setCellValue(user.getPermissionDegree());
                    dataRow.createCell(4).setCellValue(user.getDepartmentId());
                    dataRow.createCell(5).setCellValue(user.getKpiSum());
                    dataRow.createCell(6).setCellValue(user.getPhone());
                    dataRow.createCell(7).setCellValue(user.getEmail());
                    dataRow.createCell(8).setCellValue(user.getHometown());
                    dataRow.createCell(9).setCellValue(user.getGender());
                }

                // 设置Excel文件名，并以中文进行编码
                String codedFileName = new String("员工列表".getBytes("gbk"), "iso-8859-1");
                response.setHeader("Content-Disposition", "attachment;filename="
                        + codedFileName + DateUtil.getCurrentTime2()
                        +".xlsx");
                // 响应类型,编码
                response.setContentType("application/octet-stream;charset=UTF-8");
                // 形成输出流
                OutputStream osOut = response.getOutputStream();
                // 将指定的字节写入此输出流
                workbook.write(osOut);
                // 刷新此输出流并强制将所有缓冲的输出字节被写出
                osOut.flush();
                // 关闭流
                osOut.close();
                /*
                 * dispose of temporary files backing this workbook on disk
                 * 处理在磁盘上备份此工作簿的临时文件 SXSSF分配临时文件，必须始终清除显式，通过调用dispose方法
                 */
                workbook.dispose();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println( "导出用户失败！失败信息："+e.getMessage());
        }
    }

    /**
     * 打开优秀加分提交信息页面
     */
    @RequestMapping(value = "/allExcellentKpiTj")
    public ModelAndView allExcellentKpi() {
        ModelAndView mv = new ModelAndView("/admin/all_excellentKpi_tj");
        List<UserExcellentKpi> list = hrService.userExcellentKpiTj();
        mv.addObject("list",list);
        return mv;
    }

    @RequestMapping(value = "/pass")
    public ModelAndView pass(UserExcellentKpi userExcellentKpi) {
        ModelAndView mv = new ModelAndView("/admin/all_excellentKpi_tj");
        String kpiDegree = userExcellentKpi.getKpiDegree()+"";
        Map<String,String> excellentKpiMap = new HashMap<>(5);
        excellentKpiMap.put("1","1");
        excellentKpiMap.put("2","2");
        excellentKpiMap.put("3","3");
        excellentKpiMap.put("4","4级");
        excellentKpiMap.put("5","5级");
        hrService.addExcellentKpi(userExcellentKpi);
        List<UserExcellentKpi> list = hrService.userExcellentKpiTj();
        mv.addObject("list",list);
        return mv;
    }

    @RequestMapping(value = "/cancel")
    public ModelAndView cancel(UserExcellentKpi userExcellentKpi) {
        ModelAndView mv = new ModelAndView("/admin/all_excellentKpi_tj");
        hrService.delExcellentKpiTj(userExcellentKpi);
        List<UserExcellentKpi> list = hrService.userExcellentKpiTj();
        mv.addObject("list",list);
        return mv;
    }

    @RequestMapping(value = "/upDepartment")
    public ModelAndView upDepartment(UserExcellentKpi userExcellentKpi) {
        ModelAndView mv = new ModelAndView("/admin/week");
        adminService.upDepartment();
        return mv;
    }



}
