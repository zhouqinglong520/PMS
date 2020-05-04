/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : pms

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2020-05-04 20:47:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for add_point
-- ----------------------------
DROP TABLE IF EXISTS `add_point`;
CREATE TABLE `add_point` (
  `addId` int(6) NOT NULL AUTO_INCREMENT,
  `userId` varchar(10) DEFAULT NULL COMMENT '加分人Id',
  `userName` varchar(255) DEFAULT NULL COMMENT '加分人名称',
  `addPoint` int(4) DEFAULT NULL COMMENT '加分分数',
  `addDesc` varchar(255) NOT NULL COMMENT '加分描述',
  `addTime` date DEFAULT NULL COMMENT '加分时间',
  PRIMARY KEY (`addId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=154 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of add_point
-- ----------------------------
INSERT INTO `add_point` VALUES ('147', '2', 'HR', '1', '乐意', '2020-04-03');
INSERT INTO `add_point` VALUES ('149', '2', 'HR', '6', '表单考核加分', '2020-04-01');
INSERT INTO `add_point` VALUES ('150', '10000', '陈杰', '6', '乐意', '2020-04-07');
INSERT INTO `add_point` VALUES ('153', '10000', '陈杰', '90', '乐意', '2020-09-09');

-- ----------------------------
-- Table structure for add_point_department
-- ----------------------------
DROP TABLE IF EXISTS `add_point_department`;
CREATE TABLE `add_point_department` (
  `addId` int(6) NOT NULL AUTO_INCREMENT,
  `departmentId` varchar(10) DEFAULT NULL COMMENT '加分部门Id',
  `departmentName` varchar(255) DEFAULT NULL COMMENT '加分人名称',
  `addPoint` int(4) DEFAULT NULL COMMENT '加分分数',
  `addDesc` varchar(255) NOT NULL COMMENT '加分描述',
  `addTime` date DEFAULT NULL COMMENT '加分时间',
  `quarter` varchar(255) DEFAULT '' COMMENT '季度',
  `checkId` int(11) DEFAULT NULL,
  `weekNum` int(11) DEFAULT NULL,
  PRIMARY KEY (`addId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=298 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of add_point_department
-- ----------------------------
INSERT INTO `add_point_department` VALUES ('282', 'gdufe01', '开发部', '88', '考核加分', '2020-04-01', '2020第2季度', '2', null);
INSERT INTO `add_point_department` VALUES ('283', 'gdufe02', '运营部', '85', '考核加分', '2020-04-03', '2020第2季度', '2', null);
INSERT INTO `add_point_department` VALUES ('284', 'gdufe03', '人事部', '70', '考核加分', '2020-04-04', '2020第2季度', '2', null);
INSERT INTO `add_point_department` VALUES ('285', 'gdufe04', '市场部', '60', '考核加分', '2020-04-05', '2020第2季度', '2', null);
INSERT INTO `add_point_department` VALUES ('286', 'gdufe05', '财务部', '77', '考核加分', '2020-04-06', '2020第2季度', '2', null);
INSERT INTO `add_point_department` VALUES ('287', 'gdufe01', '开发部', '69', '考核加分', '2020-02-06', '2020第1季度', '1', null);
INSERT INTO `add_point_department` VALUES ('288', 'gdufe02', '运营部', '88', '考核加分', '2020-02-07', '2020第1季度', '1', null);
INSERT INTO `add_point_department` VALUES ('289', 'gdufe03', '人事部', '96', '考核加分', '2020-02-08', '2020第1季度', '1', null);
INSERT INTO `add_point_department` VALUES ('290', 'gdufe04', '市场部', '72', '考核加分', '2020-02-09', '2020第1季度', '1', null);
INSERT INTO `add_point_department` VALUES ('291', 'gdufe05', '财务部', '88', '考核加分', '2020-02-10', '2020第1季度', '1', null);
INSERT INTO `add_point_department` VALUES ('292', 'gdufe01', '开发部', '80', '考核加分', '2020-06-06', '2020第3季度', '3', null);
INSERT INTO `add_point_department` VALUES ('293', 'gdufe01', '开发部', '10', '考核加分', '2020-04-17', '2020第2季度', '1', null);
INSERT INTO `add_point_department` VALUES ('294', 'gdufe01', '开发部', '8', '考核加分', '2020-04-06', '2020第2季度', '1', null);
INSERT INTO `add_point_department` VALUES ('295', 'gdufe02', '运营部', '4', '考核加分', '2020-04-07', '2020第2季度', '1', null);
INSERT INTO `add_point_department` VALUES ('296', 'gdufe02', '运营部', '7', '考核加分', '2020-04-06', '2020第2季度', '1', null);
INSERT INTO `add_point_department` VALUES ('297', 'gdufe02', '运营部', '6', '考核加分', '2020-04-18', '2020第2季度', '1', null);

-- ----------------------------
-- Table structure for delete_point
-- ----------------------------
DROP TABLE IF EXISTS `delete_point`;
CREATE TABLE `delete_point` (
  `deleteId` int(6) NOT NULL AUTO_INCREMENT,
  `userId` varchar(10) DEFAULT NULL COMMENT '被扣分人Id',
  `userName` varchar(255) DEFAULT NULL COMMENT '被扣分人名称',
  `deletePoint` int(4) DEFAULT NULL COMMENT '扣除分数',
  `deleteDesc` varchar(255) NOT NULL COMMENT '扣分描述',
  `deleteTime` date DEFAULT NULL COMMENT '扣分时间',
  PRIMARY KEY (`deleteId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of delete_point
-- ----------------------------
INSERT INTO `delete_point` VALUES ('49', '10001', '陈杰', '11', '扣分扣分', '2020-04-04');
INSERT INTO `delete_point` VALUES ('50', '10000', '陈杰', '11', '扣分', '2020-03-28');

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `qdId` int(6) NOT NULL AUTO_INCREMENT,
  `departmentId` varchar(255) DEFAULT NULL COMMENT '部门编码',
  `departmentName` varchar(255) DEFAULT NULL COMMENT '部门名称',
  `departmentKpi` int(255) DEFAULT NULL COMMENT '部门考评分数',
  `departmentNum` int(5) DEFAULT NULL COMMENT '部门人数',
  PRIMARY KEY (`qdId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', 'gdufe01', '开发部', '255', '11');
INSERT INTO `department` VALUES ('2', 'gdufe02', '运营部', '190', '11');
INSERT INTO `department` VALUES ('3', 'gdufe03', '人事部', '166', '11');
INSERT INTO `department` VALUES ('4', 'gdufe04', '市场部', '132', '15');
INSERT INTO `department` VALUES ('5', 'gdufe05', '财务部', '165', '14');

-- ----------------------------
-- Table structure for departmentkpi
-- ----------------------------
DROP TABLE IF EXISTS `departmentkpi`;
CREATE TABLE `departmentkpi` (
  `qdId` int(6) DEFAULT NULL COMMENT '部门Id',
  `departmentId` varchar(255) DEFAULT NULL COMMENT '部门编码',
  `departmentAddPoint` int(255) DEFAULT NULL COMMENT '部门加分分数',
  `departmentAddPointTime` date DEFAULT NULL COMMENT '部门加分时间',
  `quarter` varchar(255) DEFAULT NULL COMMENT '季度：如2018第2季度',
  `checkId` int(6) DEFAULT NULL COMMENT '扣分项目Id',
  `weekNum` int(2) DEFAULT NULL COMMENT '周数'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of departmentkpi
-- ----------------------------
INSERT INTO `departmentkpi` VALUES ('2', 'gdufe02', '2', '2020-03-28', '2020第1季度', '6', null);
INSERT INTO `departmentkpi` VALUES ('2', 'gdufe02', '6', '2020-03-28', '2020第1季度', '5', null);
INSERT INTO `departmentkpi` VALUES ('2', 'gdufe02', '5', '2019-02-22', '2019第1季度', '5', null);
INSERT INTO `departmentkpi` VALUES ('3', 'gdufe03', '2', '2019-12-22', '2019第4季度', '2', null);
INSERT INTO `departmentkpi` VALUES ('1', 'gdufe01', '6', '2020-06-28', '2020第2季度', '6', null);
INSERT INTO `departmentkpi` VALUES ('4', 'gdufe04', '1', '2020-03-29', '2020第1季度', '6', null);
INSERT INTO `departmentkpi` VALUES ('6', 'gdufe06', '6', '2020-10-30', '2020第3季度', '5', null);
INSERT INTO `departmentkpi` VALUES ('5', 'gdufe05', '6', '2020-03-28', '2020第2季度', '3', null);
INSERT INTO `departmentkpi` VALUES ('4', 'gdufe04', '5', '2019-02-22', '2019第3季度', '3', null);
INSERT INTO `departmentkpi` VALUES ('2', 'gdufe02', '3', '2019-12-22', '2019第2季度', '3', null);
INSERT INTO `departmentkpi` VALUES ('2', 'gdufe02', '2', '2020-06-28', '2020第2季度', '3', null);
INSERT INTO `departmentkpi` VALUES ('3', 'gdufe03', '5', '2020-03-29', '2020第1季度', '6', null);
INSERT INTO `departmentkpi` VALUES ('1', 'gdufe01', '6', '2020-10-30', '2020第3季度', '3', null);
INSERT INTO `departmentkpi` VALUES ('4', 'gdufe04', '5', '2020-03-28', '2020第3季度', '6', null);
INSERT INTO `departmentkpi` VALUES ('6', 'gdufe06', '4', '2019-02-22', '2019第1季度', '2', null);
INSERT INTO `departmentkpi` VALUES ('5', 'gdufe05', '6', '2019-12-22', '2019第4季度', '1', null);
INSERT INTO `departmentkpi` VALUES ('4', 'gdufe04', '4', '2020-06-28', '2020第2季度', '6', null);
INSERT INTO `departmentkpi` VALUES ('2', 'gdufe02', '1', '2020-03-28', '2020第2季度', '3', null);
INSERT INTO `departmentkpi` VALUES ('5', 'gdufe05', '5', '2020-06-28', '2020第2季度', '4', null);
INSERT INTO `departmentkpi` VALUES ('4', 'gdufe04', '1', '2020-03-28', '2020第2季度', '3', null);
INSERT INTO `departmentkpi` VALUES ('2', 'gdufe02', '2', '2019-02-22', '2019第1季度', '4', null);
INSERT INTO `departmentkpi` VALUES ('2', 'gdufe02', '4', '2019-12-22', '2019第4季度', '4', null);
INSERT INTO `departmentkpi` VALUES ('3', 'gdufe03', '5', '2020-06-28', '2020第2季度', '2', null);
INSERT INTO `departmentkpi` VALUES ('1', 'gdufe01', '1', '2020-03-29', '2020第1季度', '4', null);
INSERT INTO `departmentkpi` VALUES ('4', 'gdufe04', '3', '2020-10-30', '2020第3季度', '3', null);
INSERT INTO `departmentkpi` VALUES ('2', 'gdufe02', '6', '2020-03-28', '2020第1季度', '5', null);
INSERT INTO `departmentkpi` VALUES ('2', 'gdufe02', '5', '2019-02-22', '2019第1季度', '5', null);
INSERT INTO `departmentkpi` VALUES ('3', 'gdufe03', '2', '2019-12-22', '2019第4季度', '2', null);
INSERT INTO `departmentkpi` VALUES ('1', 'gdufe01', '6', '2020-06-28', '2020第2季度', '6', null);
INSERT INTO `departmentkpi` VALUES ('4', 'gdufe04', '1', '2020-03-29', '2020第1季度', '6', null);
INSERT INTO `departmentkpi` VALUES ('6', 'gdufe06', '6', '2020-10-30', '2020第3季度', '5', null);
INSERT INTO `departmentkpi` VALUES ('5', 'gdufe05', '6', '2020-03-28', '2020第2季度', '3', null);
INSERT INTO `departmentkpi` VALUES ('4', 'gdufe04', '5', '2019-02-22', '2019第3季度', '3', null);
INSERT INTO `departmentkpi` VALUES ('2', 'gdufe02', '3', '2019-12-22', '2019第2季度', '3', null);
INSERT INTO `departmentkpi` VALUES ('2', 'gdufe02', '2', '2020-06-28', '2020第2季度', '3', null);
INSERT INTO `departmentkpi` VALUES ('3', 'gdufe03', '5', '2020-03-29', '2020第1季度', '6', null);
INSERT INTO `departmentkpi` VALUES ('1', 'gdufe01', '6', '2020-10-30', '2020第3季度', '3', null);
INSERT INTO `departmentkpi` VALUES ('4', 'gdufe04', '5', '2020-03-28', '2020第3季度', '6', null);
INSERT INTO `departmentkpi` VALUES ('6', 'gdufe06', '4', '2019-02-22', '2019第1季度', '2', null);
INSERT INTO `departmentkpi` VALUES ('5', 'gdufe05', '6', '2019-12-22', '2019第4季度', '1', null);
INSERT INTO `departmentkpi` VALUES ('4', 'gdufe04', '4', '2020-06-28', '2020第2季度', '6', null);
INSERT INTO `departmentkpi` VALUES ('2', 'gdufe02', '1', '2020-03-28', '2020第2季度', '3', null);
INSERT INTO `departmentkpi` VALUES ('2', 'gdufe02', '3', '2019-02-22', '2019第3季度', '6', null);
INSERT INTO `departmentkpi` VALUES ('3', 'gdufe03', '2', '2019-12-22', '2019第2季度', '1', null);
INSERT INTO `departmentkpi` VALUES ('1', 'gdufe01', '1', '2020-06-28', '2020第2季度', '1', null);
INSERT INTO `departmentkpi` VALUES ('4', 'gdufe04', '6', '2020-03-29', '2020第1季度', '3', null);
INSERT INTO `departmentkpi` VALUES ('6', 'gdufe06', '3', '2020-10-30', '2020第3季度', '3', null);
INSERT INTO `departmentkpi` VALUES ('5', 'gdufe05', '2', '2020-03-28', '2020第2季度', '3', null);
INSERT INTO `departmentkpi` VALUES ('4', 'gdufe04', '2', '2019-02-22', '2019第1季度', '6', null);
INSERT INTO `departmentkpi` VALUES ('2', 'gdufe02', '4', '2019-12-22', '2019第4季度', '4', null);
INSERT INTO `departmentkpi` VALUES ('2', 'gdufe02', '6', '2020-06-28', '2020第2季度', '2', null);
INSERT INTO `departmentkpi` VALUES ('3', 'gdufe03', '1', '2020-03-29', '2020第1季度', '5', null);
INSERT INTO `departmentkpi` VALUES ('1', 'gdufe01', '2', '2020-03-28', '2020第4季度', '2', null);
INSERT INTO `departmentkpi` VALUES ('4', 'gdufe04', '3', '2019-02-22', '2019第3季度', '6', null);
INSERT INTO `departmentkpi` VALUES ('6', 'gdufe06', '6', '2019-12-22', '2019第2季度', '4', null);
INSERT INTO `departmentkpi` VALUES ('5', 'gdufe05', '5', '2020-06-28', '2020第2季度', '4', null);
INSERT INTO `departmentkpi` VALUES ('4', 'gdufe04', '1', '2020-03-28', '2020第2季度', '3', null);
INSERT INTO `departmentkpi` VALUES ('2', 'gdufe02', '2', '2019-02-22', '2019第1季度', '4', null);
INSERT INTO `departmentkpi` VALUES ('2', 'gdufe02', '4', '2019-12-22', '2019第4季度', '4', null);
INSERT INTO `departmentkpi` VALUES ('3', 'gdufe03', '5', '2020-06-28', '2020第2季度', '2', null);
INSERT INTO `departmentkpi` VALUES ('1', 'gdufe01', '1', '2020-03-29', '2020第1季度', '4', null);
INSERT INTO `departmentkpi` VALUES ('4', 'gdufe04', '3', '2020-10-30', '2020第3季度', '3', null);
INSERT INTO `departmentkpi` VALUES ('2', 'gdufe02', '6', '2020-03-28', '2020第1季度', '5', null);
INSERT INTO `departmentkpi` VALUES ('2', 'gdufe02', '5', '2019-02-22', '2019第1季度', '5', null);
INSERT INTO `departmentkpi` VALUES ('3', 'gdufe03', '2', '2019-12-22', '2019第4季度', '2', null);
INSERT INTO `departmentkpi` VALUES ('1', 'gdufe01', '6', '2020-06-28', '2020第2季度', '6', null);
INSERT INTO `departmentkpi` VALUES ('4', 'gdufe04', '1', '2020-03-29', '2020第1季度', '6', null);
INSERT INTO `departmentkpi` VALUES ('6', 'gdufe06', '6', '2020-10-30', '2020第3季度', '5', null);
INSERT INTO `departmentkpi` VALUES ('5', 'gdufe05', '6', '2020-03-28', '2020第2季度', '3', null);
INSERT INTO `departmentkpi` VALUES ('4', 'gdufe04', '5', '2019-02-22', '2019第3季度', '3', null);
INSERT INTO `departmentkpi` VALUES ('2', 'gdufe02', '3', '2019-12-22', '2019第2季度', '3', null);
INSERT INTO `departmentkpi` VALUES ('2', 'gdufe02', '2', '2020-06-28', '2020第2季度', '3', null);
INSERT INTO `departmentkpi` VALUES ('3', 'gdufe03', '5', '2020-03-29', '2020第1季度', '6', null);
INSERT INTO `departmentkpi` VALUES ('1', 'gdufe01', '6', '2020-10-30', '2020第3季度', '3', null);
INSERT INTO `departmentkpi` VALUES ('4', 'gdufe04', '5', '2020-03-28', '2020第3季度', '6', null);
INSERT INTO `departmentkpi` VALUES ('6', 'gdufe06', '4', '2019-02-22', '2019第1季度', '2', null);
INSERT INTO `departmentkpi` VALUES ('5', 'gdufe05', '6', '2019-12-22', '2019第4季度', '1', null);
INSERT INTO `departmentkpi` VALUES ('4', 'gdufe04', '4', '2020-06-28', '2020第2季度', '6', null);
INSERT INTO `departmentkpi` VALUES ('2', 'gdufe02', '1', '2020-03-28', '2020第2季度', '3', null);
INSERT INTO `departmentkpi` VALUES ('2', 'gdufe02', '3', '2019-02-22', '2019第3季度', '6', null);
INSERT INTO `departmentkpi` VALUES ('3', 'gdufe03', '2', '2019-12-22', '2019第2季度', '1', null);
INSERT INTO `departmentkpi` VALUES ('1', 'gdufe01', '1', '2020-06-28', '2020第2季度', '1', null);
INSERT INTO `departmentkpi` VALUES ('4', 'gdufe04', '6', '2020-03-29', '2020第1季度', '3', null);
INSERT INTO `departmentkpi` VALUES ('6', 'gdufe06', '3', '2020-10-30', '2020第3季度', '3', null);
INSERT INTO `departmentkpi` VALUES ('5', 'gdufe05', '2', '2020-03-28', '2020第2季度', '3', null);
INSERT INTO `departmentkpi` VALUES ('4', 'gdufe04', '2', '2019-02-22', '2019第1季度', '6', null);
INSERT INTO `departmentkpi` VALUES ('2', 'gdufe02', '4', '2019-12-22', '2019第4季度', '4', null);
INSERT INTO `departmentkpi` VALUES ('2', 'gdufe02', '6', '2020-06-28', '2020第2季度', '2', null);
INSERT INTO `departmentkpi` VALUES ('3', 'gdufe03', '1', '2020-03-29', '2020第1季度', '5', null);
INSERT INTO `departmentkpi` VALUES ('1', 'gdufe01', '2', '2020-03-28', '2020第4季度', '2', null);
INSERT INTO `departmentkpi` VALUES ('4', 'gdufe04', '3', '2019-02-22', '2019第3季度', '6', null);
INSERT INTO `departmentkpi` VALUES ('6', 'gdufe06', '6', '2019-12-22', '2019第2季度', '4', null);
INSERT INTO `departmentkpi` VALUES ('5', 'gdufe05', '5', '2020-06-28', '2020第2季度', '4', null);
INSERT INTO `departmentkpi` VALUES ('4', 'gdufe04', '1', '2020-03-28', '2020第2季度', '3', null);
INSERT INTO `departmentkpi` VALUES ('2', 'gdufe02', '2', '2019-02-22', '2019第1季度', '4', null);
INSERT INTO `departmentkpi` VALUES ('2', 'gdufe02', '4', '2019-12-22', '2019第4季度', '4', null);
INSERT INTO `departmentkpi` VALUES ('3', 'gdufe03', '5', '2020-06-28', '2020第2季度', '2', null);
INSERT INTO `departmentkpi` VALUES ('1', 'gdufe01', '1', '2020-03-29', '2020第1季度', '4', null);
INSERT INTO `departmentkpi` VALUES ('4', 'gdufe04', '3', '2020-10-30', '2020第3季度', '3', null);

-- ----------------------------
-- Table structure for kpi
-- ----------------------------
DROP TABLE IF EXISTS `kpi`;
CREATE TABLE `kpi` (
  `kpiId` int(11) NOT NULL AUTO_INCREMENT COMMENT '指标Id',
  `kpiName` varchar(255) DEFAULT NULL COMMENT '指标名',
  `kpiDescription` varchar(255) DEFAULT NULL COMMENT '描述',
  `kpiGrading` varchar(255) DEFAULT NULL,
  `kpiWeight` double(255,0) DEFAULT NULL COMMENT 'kpi权值',
  `kpiDepartment` varchar(255) DEFAULT NULL COMMENT '所属部门',
  `kpiProperty` varchar(255) DEFAULT NULL COMMENT '11表示开发部1，12表示开发部2',
  PRIMARY KEY (`kpiId`)
) ENGINE=InnoDB AUTO_INCREMENT=258 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of kpi
-- ----------------------------
INSERT INTO `kpi` VALUES ('1', '规范性\n', '文档规范，撰写按照规范编写', '根据标准符合程度给分1-8分', '8', 'gdufe01', '11');
INSERT INTO `kpi` VALUES ('2', '条理性\n', '文档条理是否清晰，读懂文档内容', '根据标准符合程度给分1-8分', '8', 'gdufe01', '11');
INSERT INTO `kpi` VALUES ('3', '结构性', '文档结构是否合理清晰，内容编排是否合理\n', '根据标准符合程度给分1-8分', '8', 'gdufe01', '11');
INSERT INTO `kpi` VALUES ('4', '完整性', '文档内容完整，相关模块描述清晰合理', '根据标准符合程度给分1-8分', '8', 'gdufe01', '11');
INSERT INTO `kpi` VALUES ('5', '指导性\n', '文档具备指导价值，能指导完成相关的代码或者指导完成某项任务', '根据标准符合程度给分1-8分', '8', 'gdufe01', '11');
INSERT INTO `kpi` VALUES ('6', '稳定性', '代码运行稳定，能持续运行24小时以上，没有引起程序崩溃的几率', '根据标准符合程度给分1-8分', '8', 'gdufe01', '11');
INSERT INTO `kpi` VALUES ('7', '可靠性', '代码运行稳定，客户反映良好', '根据标准符合程度给分1-8分', '8', 'gdufe01', '11');
INSERT INTO `kpi` VALUES ('8', '规范性', '熟悉编码规范，严格按照编码规范编写', '根据标准符合程度给分1-8分', '8', 'gdufe01', '11');
INSERT INTO `kpi` VALUES ('9', '可维护性', '代码逻辑简单，结构清晰，具备可移植性，能在很多地方不同的项目中复用', '根据标准符合程度给分1-8分', '8', 'gdufe01', '11');
INSERT INTO `kpi` VALUES ('10', 'BUG数量', '能够满足基本业务需求，千行代码没有严重问题，一般问题少于3个（包含3个），提示性问题不多于10个', '根据标准符合程度给分1-8分', '8', 'gdufe01', '11');
INSERT INTO `kpi` VALUES ('11', '沟通能力', '比较清楚地陈述自己的观点，能注意到他人的反应，很少注意与不同意见进行交流。能够认真地听他人发言，但很少给予反馈\n', '根据标准符合程度给分1-8分', '8', 'gdufe01', '11');
INSERT INTO `kpi` VALUES ('12', '领导交办的其他事项', '对分配的任务能认真负责，对工作上的不足能加以分析，不推诿责任，不计较个人得失\n', '根据标准符合程度给分1-8分', '8', 'gdufe01', '11');
INSERT INTO `kpi` VALUES ('13', '创新精神', '能很好的将能力和知识更新与自身工作相结合，工作效率和工作水平有所提高', '根据标准符合程度给分1-8分', '8', 'gdufe01', '11');
INSERT INTO `kpi` VALUES ('14', '项目合理化建议', '积极参与项目讨论，提交的合理化建议考核周期有1条以上被采纳，且应用效果良好', '根据标准符合程度给分1-8分', '8', 'gdufe01', '11');
INSERT INTO `kpi` VALUES ('15', '工作主动及创造性', '不存在等候上级指令的状况，但工作主动性欠缺，行动不够迅速\n主动寻找工作任务，积极思考解决方案，行动迅速', '根据标准符合程度给分1-8分', '8', 'gdufe01', '12');
INSERT INTO `kpi` VALUES ('16', '团队合作', '善于与人合作，喜欢帮助别人，主动与人交流、沟通，与其合作，感觉愉快\n', '根据标准符合程度给分1-8分', '8', 'gdufe01', '12');
INSERT INTO `kpi` VALUES ('17', '责任感', '对分配的任务能认真负责，对工作上的不足能加以分析，不推诿责任，不计较个人得失\n对工作上的不足，能经常分析，认真总结，积极改进', '根据标准符合程度给分1-8分', '8', 'gdufe01', '12');
INSERT INTO `kpi` VALUES ('18', '遵守纪律与制度', '①全勤8分，无违规8分；违反公司规定一次减2分；\n②损害公司形象，不论轻重直接扣5分\n③对部门造成不利影响 不论轻重直接扣5分', '根据标准符合程度给分1-8分', '8', 'gdufe01', '12');
INSERT INTO `kpi` VALUES ('19', '各功能模块的开发/修改/升级实施进度', '按时完成各项任务', '根据标准符合程度给分1-8分', '8', 'gdufe01', '12');
INSERT INTO `kpi` VALUES ('20', '模块开发质量', '开发的模块影响程序运行速度，有无其它不可预见性问题', '根据标准符合程度给分1-8分', '8', 'gdufe01', '12');
INSERT INTO `kpi` VALUES ('21', '程序运行稳定性', '程序稳定正常运行的情况', '根据标准符合程度给分1-8分', '8', 'gdufe01', '12');
INSERT INTO `kpi` VALUES ('22', '程序运行问题处理', '及时处理程序运行问题', '根据标准符合程度给分1-8分', '8', 'gdufe01', '12');
INSERT INTO `kpi` VALUES ('23', 'Bug处理及时性', '程序运行中出现的遗漏及时修正', '根据标准符合程度给分1-8分', '8', 'gdufe01', '12');
INSERT INTO `kpi` VALUES ('24', '程序编写合格采纳率', '解决因程序问题未通过审核', '根据标准符合程度给分1-8分', '8', 'gdufe01', '12');
INSERT INTO `kpi` VALUES ('25', '领导安排的临时事项', '按时保质保量完成每项工作', '根据标准符合程度给分1-8分', '8', 'gdufe01', '12');
INSERT INTO `kpi` VALUES ('26', '计划完成情况', '计划是否按时完成，计划执行效果', '根据标准符合程度给分1-8分', '8', 'gdufe01', '12');
INSERT INTO `kpi` VALUES ('27', '技术审核质量', '与设计院进行技术沟通的次数、技术修改的情况；施工图技术交底的成功率', '根据标准符合程度给分1-8分', '8', 'gdufe01', '12');
INSERT INTO `kpi` VALUES ('28', '技术审核的及时性', '技术审核实际完成时间与计划完成时间的偏差', '根据标准符合程度给分1-8分', '8', 'gdufe01', '12');
INSERT INTO `kpi` VALUES ('29', '技术审核工作量', '完成技术审核所花费的作业时间', '根据标准符合程度给分1-8分', '8', 'gdufe01', '12');
INSERT INTO `kpi` VALUES ('30', '技术标准的贯彻效果', '技术标准的发放次数；相关人员的培训次数；标准的贯标效果', '根据标准符合程度给分1-8分', '8', 'gdufe01', '12');
INSERT INTO `kpi` VALUES ('31', '商务合作', '第三方推广合作商签约完成率、投放费率、日常合作', '根据标准符合程度给分1-8分', '8', 'gdufe02', '21');
INSERT INTO `kpi` VALUES ('32', '媒介合作', '媒体签约完成率、合作费率、投放效果评估', '根据标准符合程度给分1-8分', '8', 'gdufe02', '21');
INSERT INTO `kpi` VALUES ('33', '新媒体运营', '微信功能优化、粉丝增长率、原创内容数量及阅读量', '根据标准符合程度给分1-8分', '8', 'gdufe02', '21');
INSERT INTO `kpi` VALUES ('34', '市场拓展及活动', '市场方案及执行情况、费用率表现，用户获取数量及成本（参考市场部门相关岗位绩效）', '根据标准符合程度给分1-8分', '8', 'gdufe02', '21');
INSERT INTO `kpi` VALUES ('35', '产品运营（平台）', 'APP、PC、H5端优化方案、交互逻辑的需求输出及呈现反馈', '根据标准符合程度给分1-8分', '8', 'gdufe02', '21');
INSERT INTO `kpi` VALUES ('36', '产品运营（资产）', '产品包装进度及相关资料准备跟进（参考产品运营相关岗位绩效）', '根据标准符合程度给分1-8分', '8', 'gdufe02', '21');
INSERT INTO `kpi` VALUES ('37', '客服工作', '客服制度及流程牵引，客服部门工作效率及整体表现（参考客服部门绩效）', '根据标准符合程度给分1-8分', '8', 'gdufe02', '21');
INSERT INTO `kpi` VALUES ('38', '团队管理', '部门协调、任务分配、工作进度把控、结果输出、绩效管理\n', '根据标准符合程度给分1-8分', '8', 'gdufe02', '21');
INSERT INTO `kpi` VALUES ('39', '主营业务收入', '考核期内企业主营业务收入达到100万元，完成百分比100%', '根据标准符合程度给分1-8分', '8', 'gdufe02', '21');
INSERT INTO `kpi` VALUES ('40', '企业指令和规章制度执行率', '企业指令和规章制度执行率100%', '根据标准符合程度给分1-8分', '8', 'gdufe02', '21');
INSERT INTO `kpi` VALUES ('41', '运营部工作流程改善目标完成率', '考核期内信息部工作流程改善目标完成率达到100%', '根据标准符合程度给分1-8分', '8', 'gdufe02', '21');
INSERT INTO `kpi` VALUES ('42', '运营部工作计划完成率', '考核期内运营部工作计划完成率达100%', '根据标准符合程度给分1-8分', '8', 'gdufe02', '21');
INSERT INTO `kpi` VALUES ('43', '信息录入的准确率、及时率', '考核期内信息录入的准确率、及时率达100%', '根据标准符合程度给分1-8分', '8', 'gdufe02', '21');
INSERT INTO `kpi` VALUES ('44', '数据分析报表的准确性、及时率', '考核期数据分析报表的准确性、及时率内达到100%', '根据标准符合程度给分1-8分', '8', 'gdufe02', '21');
INSERT INTO `kpi` VALUES ('45', '需求发现和问题反馈的及时率', '考核期需求发现和问题反馈的及时率内达到100%', '根据标准符合程度给分1-8分', '8', 'gdufe02', '21');
INSERT INTO `kpi` VALUES ('46', '活动规划与組织执行按计划完成率', '考核期内活动规划与組织执行按计划完成率达到100%', '根据标准符合程度给分1-8分', '8', 'gdufe02', '21');
INSERT INTO `kpi` VALUES ('47', '内部员工满意率', '考核期内内部员工满意率达到100%', '根据标准符合程度给分1-8分', '8', 'gdufe02', '21');
INSERT INTO `kpi` VALUES ('48', '外部相关单位满意度', '考核期内无投诉', '根据标准符合程度给分1-8分', '8', 'gdufe02', '21');
INSERT INTO `kpi` VALUES ('49', '培训计划完成率', '考核期内培训计划完成率达到100%', '根据标准符合程度给分1-8分', '8', 'gdufe02', '21');
INSERT INTO `kpi` VALUES ('50', '培训考核达标率', '培训考核达标率100%', '根据标准符合程度给分1-8分', '8', 'gdufe02', '21');
INSERT INTO `kpi` VALUES ('51', '运营计划的制定、实施、执行结果总结', '', '根据标准符合程度给分1-8分', '8', 'gdufe02', '21');
INSERT INTO `kpi` VALUES ('52', '运营工作中参与纠正和查处', '按时完成当月计划', '根据标准符合程度给分1-8分', '8', 'gdufe02', '21');
INSERT INTO `kpi` VALUES ('53', '运营工作的总结、整理、汇报及资料归档', '不徇私情、秉公办理、处置得力', '根据标准符合程度给分1-8分', '8', 'gdufe02', '21');
INSERT INTO `kpi` VALUES ('54', '工作质量', '工作质量非常好', '根据标准符合程度给分1-8分', '8', 'gdufe02', '21');
INSERT INTO `kpi` VALUES ('55', '工作效率', '承担工作提前完成且无差错', '根据标准符合程度给分1-8分', '8', 'gdufe02', '21');
INSERT INTO `kpi` VALUES ('56', '专业知识', '专业知识熟练扎实，经验丰富且运用娴熟', '根据标准符合程度给分1-8分', '8', 'gdufe02', '22');
INSERT INTO `kpi` VALUES ('57', '主动性', '主动性较强，无需上级安排和监督，能高质量高效率地完成本职工作', '根据标准符合程度给分1-8分', '8', 'gdufe02', '22');
INSERT INTO `kpi` VALUES ('58', '协助性', '与关联部门协作关系较好，对方提出问题能及时答复并迅速协商解决', '根据标准符合程度给分1-8分', '8', 'gdufe02', '22');
INSERT INTO `kpi` VALUES ('59', '纪律性', '能够严格遵守公司及部门工作规定与标准，有非常强的自觉性和纪律性', '根据标准符合程度给分1-8分', '8', 'gdufe02', '22');
INSERT INTO `kpi` VALUES ('60', '政策性与原则性', '紧紧抓住行业脉搏，遵守行业规范，严格按照原则办事，不徇私不舞弊', '根据标准符合程度给分1-8分', '8', 'gdufe02', '22');
INSERT INTO `kpi` VALUES ('61', '管理责任与敬业奉献', '热爱事业，责任感强，勇于承担因管理疏漏应负的责任，以身作则，做好表率作用', '根据标准符合程度给分1-8分', '8', 'gdufe02', '22');
INSERT INTO `kpi` VALUES ('62', '发展与创新', '目标定位准确，措施得力，创造性地开展工作、善于发现问题、解决问题，实施效果良好，提高很大', '根据标准符合程度给分1-8分', '8', 'gdufe02', '22');
INSERT INTO `kpi` VALUES ('63', '团队管理', '下属绩效成绩', '根据标准符合程度给分1-8分', '8', 'gdufe02', '22');
INSERT INTO `kpi` VALUES ('64', '业务支持率', '当月所支持的业务比例', '根据标准符合程度给分1-8分', '8', 'gdufe02', '22');
INSERT INTO `kpi` VALUES ('65', '工作“苦劳”加权项', '对于付出的工作辛苦予以肯定', '根据标准符合程度给分1-8分', '8', 'gdufe02', '22');
INSERT INTO `kpi` VALUES ('66', '重大贡献', '对本部门的业务及工作提出极为有效的建议，为部门取得相应的效益', '根据标准符合程度给分1-8分', '8', 'gdufe02', '22');
INSERT INTO `kpi` VALUES ('70', '人事工作标准1', '办理员工入、离职手续，建立并完善员工人事档案', '变动及时办理，记录。', '5', 'gdufe03', '31');
INSERT INTO `kpi` VALUES ('71', '人事工作标准2', '及时办理公司员工社保五金并进行统计汇编管理', '正常缴纳', '5', 'gdufe03', '31');
INSERT INTO `kpi` VALUES ('72', '人事工作标准3', '员工考勤登记、员工外出管理，并每月进行统计上报', '无差错', '5', 'gdufe03', '31');
INSERT INTO `kpi` VALUES ('73', '人事工作标准4', '督导、配合业务部门组织员工进行培训，确保公司战略目标的实现。', '培训课件资料、培训登记表、培训考核资料齐全，无缺漏。', '5', 'gdufe03', '31');
INSERT INTO `kpi` VALUES ('74', '人事工作标准5', '办理员工入、离职手续，建立并完善员工人事档案', '变动及时办理，记录。', '5', 'gdufe03', '31');
INSERT INTO `kpi` VALUES ('75', '人事工作标准6', '及时办理公司员工社保五金并进行统计汇编管理', '正常缴纳', '5', 'gdufe03', '31');
INSERT INTO `kpi` VALUES ('76', '人事工作标准7', '员工考勤登记、员工外出管理，并每月进行统计上报', '无差错', '5', 'gdufe03', '31');
INSERT INTO `kpi` VALUES ('77', '人事工作标准8', '督导、配合业务部门组织员工进行培训，确保公司战略目标的实现。', '培训课件资料、培训登记表、培训考核资料齐全，无缺漏。', '5', 'gdufe03', '31');
INSERT INTO `kpi` VALUES ('78', '人事工作标准9', '办理员工入、离职手续，建立并完善员工人事档案', '变动及时办理，记录。', '5', 'gdufe03', '31');
INSERT INTO `kpi` VALUES ('79', '人事工作标准10', '及时办理公司员工社保五金并进行统计汇编管理', '正常缴纳', '5', 'gdufe03', '31');
INSERT INTO `kpi` VALUES ('80', '人事工作标准11', '员工考勤登记、员工外出管理，并每月进行统计上报', '无差错', '5', 'gdufe03', '31');
INSERT INTO `kpi` VALUES ('81', '人事工作标准12', '督导、配合业务部门组织员工进行培训，确保公司战略目标的实现。', '培训课件资料、培训登记表、培训考核资料齐全，无缺漏。', '5', 'gdufe03', '31');
INSERT INTO `kpi` VALUES ('82', '行政管理制度', '制定及完善公司管理制度及流程，颁布公司各类行政文件。', '管理制度齐全，日常工作文件齐全、内容完整、无缺漏,有据可依', '5', 'gdufe03', '31');
INSERT INTO `kpi` VALUES ('83', '招聘计划完成率', '根据公司年度经营战略，制定公司年度人力规划，并进行人员的招聘，确保公司战略目标的实现。', '根据年初制定的计划要求', '5', 'gdufe03', '31');
INSERT INTO `kpi` VALUES ('84', '绩效制度', '制定及完善公司各级职位说明书、员工绩效考核方案及员工绩效管理制度。', '管理制度齐全，日常工作文件齐全、内容完整、无缺漏,有据可依', '5', 'gdufe03', '31');
INSERT INTO `kpi` VALUES ('85', '考核管理', '公司绩效考核结果管理、根据考核结果进行人事关系\\薪资调整。', '考核文件归档齐全，无缺漏。绩效调整无失误。', '5', 'gdufe03', '32');
INSERT INTO `kpi` VALUES ('86', '岗位管理', '对公司人力状况及各职务进行定期分析。', '各岗位述职工作按时完成，分析报告定时提交。', '5', 'gdufe03', '32');
INSERT INTO `kpi` VALUES ('87', '人力成本控制', '根据公司年度经营战略，制定并执行薪资、福利、社会保险政策，确保公司战略目标的实现', '依照公司经营战略要求', '5', 'gdufe03', '32');
INSERT INTO `kpi` VALUES ('88', '培训计划完成率', '根据公司年度经营战略，制定并执行培训计划，督导其它部门培训的实施，确保公司战略目标的实现', '培训课件资料、培训登记表、培训考核资料齐全，无缺漏。', '5', 'gdufe03', '32');
INSERT INTO `kpi` VALUES ('89', '企划宣传成本控制', '根据公司年度经营战略，进行媒体、网络、展会等对外宣传及推广工作', '依照公司经营战略要求', '5', 'gdufe03', '32');
INSERT INTO `kpi` VALUES ('90', '劳资纠纷及对外法律咨询', '解决公司各种人事劳资纠纷及对外法律咨询', '准确有效， 无明显遗漏及失误', '5', 'gdufe03', '32');
INSERT INTO `kpi` VALUES ('91', '会务活动管理', '督导、组织公司会议及活动的实施', '事前准备充分， 无明显遗漏及失误', '5', 'gdufe03', '32');
INSERT INTO `kpi` VALUES ('92', '工作督办', '督导公司各项制度及工作任务的落实和执行', '按要求检查和奖惩', '5', 'gdufe03', '32');
INSERT INTO `kpi` VALUES ('93', '部门管理', '指导、检查、控制本部门各项工作的实施，确保部门工作正常开展。', '部门工作正常开展，无异常。', '5', 'gdufe03', '32');
INSERT INTO `kpi` VALUES ('94', '下属工作完成情况', '组织部门员工进行绩效考核、领导下属有效地完成职能工作,', '各项工作能够按要求完成。部属工作均考核合格。', '5', 'gdufe03', '32');
INSERT INTO `kpi` VALUES ('95', '合同管理', '审核部门对外签订的经济合同', '严格审核部门的各种经济合同文本', '5', 'gdufe03', '32');
INSERT INTO `kpi` VALUES ('96', '任务交办', '完成上级安排的其他临时性工作。', '保质保量、按时完成公司办公例会研究决定事项、公司领导指派的任务', '5', 'gdufe03', '32');
INSERT INTO `kpi` VALUES ('97', '组织纪律', '严格遵守企业各项管理制度。', '遵守公司及部门相关制度、规定。', '5', 'gdufe03', '32');
INSERT INTO `kpi` VALUES ('98', '保密纪律', '遵守企业保密制度', '遵守公司保密制度。', '5', 'gdufe03', '32');
INSERT INTO `kpi` VALUES ('99', '异常投诉', '加强部门之间的沟通，与协调，确保各项工作的顺利进行，保证公司正常运转', '部门或本人异常工作投诉核实属实', '5', 'gdufe03', '32');
INSERT INTO `kpi` VALUES ('100', '阶段性工作计划完成', '按照周报、月报高质高效按时的完成本岗位的工作。', '根据标准是符合给0-5分', '5', 'gdufe04', '41');
INSERT INTO `kpi` VALUES ('101', '常规促销活动方案设计', '每月25日前提出下月活动大纲及基本的框架方案', '根据标准是符合给0-5分', '5', 'gdufe04', '41');
INSERT INTO `kpi` VALUES ('102', '开业方案、店庆方案设计', '系统下文两内日完成活动方案及布置方案（方案需确定）', '根据标准是符合给0-5分', '5', 'gdufe04', '41');
INSERT INTO `kpi` VALUES ('103', '会员管理与考核', '每月底整理当月会员办卡数量、销售占比、有效率等数据指标，并对结果进行考核、奖惩。', '根据标准是符合给0-5分', '5', 'gdufe04', '41');
INSERT INTO `kpi` VALUES ('104', '广告物料制作', '制作活动、品推所需物料，从设计日起2个工作日内投入使用。（方案需确定）', '根据标准是符合给0-5分', '5', 'gdufe04', '41');
INSERT INTO `kpi` VALUES ('105', '媒体信息发布', '在微信平台、短信平台、公司网站上进行活动、品牌信息发布', '根据标准是符合给0-5分', '5', 'gdufe04', '41');
INSERT INTO `kpi` VALUES ('106', '公司品牌推广', '每月推出一次品牌形象的活动或品推软文', '根据标准是符合给0-5分', '5', 'gdufe04', '41');
INSERT INTO `kpi` VALUES ('107', '广告宣传费结算\n', '每月23日对广告费用进行审核、并制作相关报销明细', '根据标准是符合给0-5分', '5', 'gdufe04', '41');
INSERT INTO `kpi` VALUES ('108', '部门员工培训\n1、专业培训\n2、常规培训\n', '每月进行一次部门平面设计、文案写作、商务策划、办公礼仪的培训。', '根据标准是符合给0-5分', '5', 'gdufe04', '41');
INSERT INTO `kpi` VALUES ('109', '市场占有率', '公司产品销售量/市场同类产品销售量*100%', '根据标准是符合给0-5分', '5', 'gdufe04', '41');
INSERT INTO `kpi` VALUES ('110', '广告投放有效率', '销售收入增长率/广告费用增长率*100%', '根据标准是符合给0-5分', '5', 'gdufe04', '41');
INSERT INTO `kpi` VALUES ('111', '销售额增长率', '（当期销售额-上期销售额）÷上期销售额*100%', '根据标准是符合给0-5分', '5', 'gdufe04', '41');
INSERT INTO `kpi` VALUES ('112', '市场推广费用控制率', '实际费用/市场推广预算费用*100%', '根据标准是符合给0-5分', '5', 'gdufe04', '42');
INSERT INTO `kpi` VALUES ('113', '媒体正面曝光次数', '公司各种活动中，相关媒体对我司进行的正面报导次数。收集正面宣传曝光的次数', '根据标准是符合给0-5分', '5', 'gdufe04', '42');
INSERT INTO `kpi` VALUES ('114', '主推产品销售额占比', '（市场部期初确定的主推产品销售额÷总销售额）*100%', '根据标准是符合给0-5分', '5', 'gdufe04', '42');
INSERT INTO `kpi` VALUES ('115', '新产品销售额占比', '（市场部期初确定的新产品的销售额÷总销售额）*100%', '根据标准是符合给0-5分', '5', 'gdufe04', '42');
INSERT INTO `kpi` VALUES ('116', '各策划方案的成功率', '新品以及其他宣传推广策划方案的影响力和效果。（考核期内成功实施方案数÷提交策划方案数）*100%', '根据标准是符合给0-5分', '5', 'gdufe04', '42');
INSERT INTO `kpi` VALUES ('117', '推广活动销售增长率', '一定时期内，推广活动直接促进销售营业额的增长。考核期内（活动后销售额÷活动前当月销售额-1）*100%', '根据标准是符合给0-5分', '5', 'gdufe04', '42');
INSERT INTO `kpi` VALUES ('118', '品牌认知度', '通过市场调查数据得知', '根据标准是符合给0-5分', '5', 'gdufe04', '42');
INSERT INTO `kpi` VALUES ('119', '产品认知度', '通过市场调查数据得知', '根据标准是符合给0-5分', '5', 'gdufe04', '42');
INSERT INTO `kpi` VALUES ('120', '销售目标完成率', '新增销售金额', '根据标准是符合给0-5分', '5', 'gdufe04', '42');
INSERT INTO `kpi` VALUES ('121', '销售目标完成率', '新增用户量', '根据标准是符合给0-5分', '5', 'gdufe04', '42');
INSERT INTO `kpi` VALUES ('122', '销售目标完成率', '原割接用户转化', '根据标准是符合给0-5分', '5', 'gdufe04', '42');
INSERT INTO `kpi` VALUES ('123', '工作计划完成率', '工作计划完成率', '根据标准是符合给0-5分', '5', 'gdufe04', '42');
INSERT INTO `kpi` VALUES ('124', '商务流程完成及时率', '商务流程完成及时率', '根据标准是符合给0-5分', '5', 'gdufe04', '42');
INSERT INTO `kpi` VALUES ('125', '用户平均成本', '用户平均成本', '根据标准是符合给0-5分', '5', 'gdufe04', '42');
INSERT INTO `kpi` VALUES ('126', '新市场开拓', '新市场开拓', '根据标准是符合给0-5分', '5', 'gdufe04', '42');
INSERT INTO `kpi` VALUES ('130', '账务处理', '根据经济业务性质正确使用会计科目', '每错误使用会计科目包括二级科目1个，扣0.5分', '5', 'gdufe05', '51');
INSERT INTO `kpi` VALUES ('131', '账账相符', '总账与明细账及相关明细账之间账账必须相符', '发现一处不符扣0.5分', '5', 'gdufe05', '51');
INSERT INTO `kpi` VALUES ('132', '账证核对', '会计科目数据与原始凭证的数据必须相符', '每个会计科目数据与原始凭证的数据不符1个，扣1分', '5', 'gdufe05', '51');
INSERT INTO `kpi` VALUES ('133', '账实相符', '指存货、资金、应收应付、资产要账实相符', '发现一处不符或没有反馈记录跟踪的扣0.5分', '5', 'gdufe05', '51');
INSERT INTO `kpi` VALUES ('134', '账表相符', '财务报告与记账凭证的数据必须相符', '不相符的每处扣0.5分', '5', 'gdufe05', '51');
INSERT INTO `kpi` VALUES ('135', '账务手续', '原始单据的财务审核审批手续必须齐全', '发现一张单据财务审核审批手续不齐全或私自调整账务的扣0.5分', '5', 'gdufe05', '51');
INSERT INTO `kpi` VALUES ('136', '报表报送', '在规定的日期内向报表使用者报送', '每月报表报送不及时的扣0.5分', '5', 'gdufe05', '51');
INSERT INTO `kpi` VALUES ('137', '表表核对', '各表之间、表内之间的勾稽数据必须相吻合', '每月报表有勾稽关系的数据不相吻合的，每发现一处，扣0.5分', '5', 'gdufe05', '51');
INSERT INTO `kpi` VALUES ('138', '分析透彻', '能够对数据形成因素或数据变化的因果关系全面分析透彻', '每月报表数据的形成因素或变化因果关系分析不全面不透彻，扣减0.5分', '5', 'gdufe05', '51');
INSERT INTO `kpi` VALUES ('139', '资金预算和调拨', '积极配合资金调拨和统筹管理', '资金库存超标没有及时上交的，扣0.5分', '5', 'gdufe05', '51');
INSERT INTO `kpi` VALUES ('140', '印章规范', '印章分离管理和正确使用', '印章没有分离管理或没有按流程使用的每次扣0.5分', '5', 'gdufe05', '51');
INSERT INTO `kpi` VALUES ('141', '报表编制', '收集或整理银行对账单（存折复印件），并与月初编制银行存款（现金）余额调节表上报主办会计审核确认', '未能在规定的期间内编制或编制不准确的，扣0.5分；未编制取消得分', '5', 'gdufe05', '51');
INSERT INTO `kpi` VALUES ('142', '资金盘点', '每月至少三次不定期盘点资金，确保账实无误', '盘点没有达三次或每月没有银行对账单或没有调节表的，每次扣0.5分', '5', 'gdufe05', '51');
INSERT INTO `kpi` VALUES ('143', '存货盘点', '按照规定定期或不定期盘点仓库存货', '没有物资盘点记录，扣1分', '5', 'gdufe05', '51');
INSERT INTO `kpi` VALUES ('144', '存货确认', '会计与仓库每月进行进出存货确认', '每月一个项进出没有确认的扣0.5分', '5', 'gdufe05', '51');
INSERT INTO `kpi` VALUES ('145', '费用审核', '把好财务审核关，确保财务手续齐全', '每财务手续不齐全或不反馈一笔，扣0.5分', '5', 'gdufe05', '52');
INSERT INTO `kpi` VALUES ('146', '报表报送', '在规定的日期内向报表使用者报送', '每月报表报送不及时，扣0.5分', '5', 'gdufe05', '52');
INSERT INTO `kpi` VALUES ('147', '分析透彻', '能够对影响成本变化因素全面透彻分析', '每月对影响成本因素分析不全面不透彻，扣减0.5分', '5', 'gdufe05', '52');
INSERT INTO `kpi` VALUES ('148', '存货盘点', '每月跟踪门店耗品使用情况', '没有门店院库盘点记录，扣减1分', '5', 'gdufe05', '52');
INSERT INTO `kpi` VALUES ('149', '核算规范', '成本核算规范完整，数据准确', '未能真实核算成本的每一项扣0.5分', '5', 'gdufe05', '52');
INSERT INTO `kpi` VALUES ('150', '资产建账', '资产要建辅助明细账，确保账账相符、账实相符', '没有建资产辅助账或不完整的，每次扣0.5分', '5', 'gdufe05', '52');
INSERT INTO `kpi` VALUES ('151', '跟踪管理', '每月与行政部对账确认和跟踪盘点', '每月没有与行政部对账确认，每次扣0.5分', '5', 'gdufe05', '52');
INSERT INTO `kpi` VALUES ('152', '往来确认', '在规定的期限内通过有关人员知会、跟踪往来单位对账，同时要确保往来验收回单规范、齐全', '每月有一项没有按照规定跟踪或反馈与其他单位、部门进行往来确认的，或有跟踪或反馈单往来余额与实际相关金额不符的，扣减0.5分', '5', 'gdufe05', '52');
INSERT INTO `kpi` VALUES ('153', '问题分析', '对存在的应收账款问题能够有效地作出分析和预测报告', '每存在一个客户的应收账款有问题单没有分析、预测报告的，扣0.5分', '5', 'gdufe05', '52');
INSERT INTO `kpi` VALUES ('154', '收入确认', '遵循收入确认原则', '收入账务没有遵循配比原则和权责发生制原则入账的，扣1分', '5', 'gdufe05', '52');
INSERT INTO `kpi` VALUES ('155', '档案管理', '会计账簿、报表、凭证、票据、验收回单、移交资料、财税证件等会计资料必须归档规范齐全', '每月会计资料不规范或不齐全，扣减1分', '5', 'gdufe05', '52');
INSERT INTO `kpi` VALUES ('156', '文件传达', '执行财务总部转发的文件，并及时传达、执行', '日常工作中不按财务总部的要求随意执行文件或收到文件不及时转达执行的每次扣1分', '5', 'gdufe05', '52');
INSERT INTO `kpi` VALUES ('157', '票据凭证管理', '收款收据、入库单、出库单、发货单等票据印刷、发放、收回管理', '票据没有同意登记发放管理每次扣0.5分，未能确保票据供应每次扣1分', '5', 'gdufe05', '52');
INSERT INTO `kpi` VALUES ('158', '制度推动', '想相关领导和部门推动和执行', '各项规章制度发布前后没有像相关领导或部门推动、反馈、沟通的，扣0.5分', '5', 'gdufe05', '52');
INSERT INTO `kpi` VALUES ('159', '执行力度', '对制度执行情况进行管理、跟踪', '每错误执行制度或没有执行之制度一次（一项），扣1分', '5', 'gdufe05', '52');
INSERT INTO `kpi` VALUES ('200', '敬业度', '工作中积极性,是否主动承担工作任务和职责，是否乐意接纳额外的工作任务和必要的加班安排；对重大项目积极参与程度表现出来的热情；', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('201', '责任感', '是否具有大局观念、能否正确认识岗位的价值和意义', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('202', '坚韧性', '能够在非常艰苦或者不利的情况下，克服各种困难，坚持完成工作任务。', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('203', '纪律性', '遵守公司/部门规章制度，服从安排。', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('204', '专业业务能力与水平', '对于本岗位专业技术、知识、工具等的学习和运用程度；解决业务疑难、或新产品异常/技术疑难、攻关能力；工作品质的稳定性、一致性等体现出同类质专业能力水平', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('205', '学习与成长', '能结合工作需要，主动学习提升工作技能，推动岗位进步和个人职业成长。', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('206', '创新能力', '积极创新工作思路、方法，改善不足，提升岗位绩效。', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('207', '参与建设', '在日常工作提出合理化建议/技术（管理）创新/重点项目或任务/其他突出贡献', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('208', '个人素质-01', '1、品德修养、礼貌礼仪、个人仪容仪表', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('209', '个人素质-02', '2、有团队合作意识，能以集体利益为重', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('210', '个人素质-03', '3、沟通能力和亲和力', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('211', '个人素质-04', '4、学习、总结能力', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('212', '个人素质-05', '5、主动发现问题、解决问题的态度和能力', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('213', '个人素质-06', '6、责任心', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('214', '个人素质-07', '7、灵活性', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('215', '个人素质-08', '8、创造性以及潜力', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('216', '个人素质-09', '9、良好组织能力和协调管理能力', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('217', '个人素质-10', '10、遵守法律法规以及公司规章制度', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('218', '个人素质-11', '11、职业操守', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('219', '工作态度-01', '1、出勤状况', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('220', '工作态度-02', '2、对待工作责任心', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('221', '工作态度-03', '3、对待工作热情度', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('222', '工作态度-04', '4、能主动完成工作任务', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('223', '工作态度-05', '5、能寻求更好的方法来完成工作', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('224', '工作态度-06', '6、积极主动地配合其他岗位的工作，与同事及协作部门保持良好的协作关系', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('225', '工作态度-07', '7、遵守工作规范', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('226', '专业知识-01', '1、专业业务知识', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('227', '专业知识-02', '2、相关专业知识', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('228', '专业知识-03', '3、外语知识', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('229', '专业知识-04', '4、计算机应用知识', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('230', '专业知识-05', '5、参加各种专业知识培训，不断学习专业知识和技能', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('231', '工作能力-01', '1、能保质保量完成工作任务', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('232', '工作能力-02', '2、能正确理解上级安排的工作，在执行过程中能主动调动各方资源以达成目标', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('233', '工作能力-03', '3、能准确地表达出自己的看法，在工作中善于沟通并保持良好的人际关系', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('234', '工作能力-04', '4、对承担的工作熟练掌握，有成功完成的经验', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('235', '工作能力-05', '5、工作认真、细致，考虑问题深入', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('236', '工作能力-06', '6、对问题认识全面，有系统性', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('237', '工作能力-07', '7、在承担工作上有发展潜力', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('238', '专业知识', '掌握从事本职岗位的专业知识（基础知识、业务知识、关联知识）。', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('239', '专业技能', '掌握从事本职岗位的专业技能。', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('240', '分析判断与应变能力', '能对复杂的问题进行正确判断，处理工作事务机敏灵活，并在自己职权范围内能迅速而准确地对多种备选行动方案进行评价，并作出最终决定。', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('241', '问题解决能力', '根据现场的突发事件，能够从多方面进行分析，找出故障原因，从而解决问题。', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('242', '执行能力', '对上级的命令、下达的计划、布置的工作能及时贯彻执行，并及时复命。', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('243', '创新能力', '在处理工作事务时，运用新思维、新方法提高工作效率和效益。', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('244', '表达及沟通能力', '能清楚、完整地向对方充分说明及表达自己的想法而使其理解，并能聆听及尊重对方的意见。', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('245', '协调及人力关系能力', '作为组织的一员，能够自觉地与组织内其他成员保持良好合作关系，热情协助他人的工作，积极参加公司及部门内部的各种活动，维护良好的同事关系。', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('246', '目标达成度', '工作目标达成情况。', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('247', '工作量', '如期完成工作任务量。', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('248', '工作质量', '工作效率高且完成质量高。', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('249', '道德品质', '诚实正直、以身作则、克己奉公、乐于助人。', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('250', '忠诚度', '对企业忠诚的程度及爱护企业的行为。', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('251', '责任感', '充分理解自己的责任和义务，不回避责任，在期限之内完成上级交付的工作，主动地以主人翁的态度去完成工作。', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('252', '进取心', '学习努力，时刻向上，不断提高和完善自己。', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('253', '纪律性', '理解和遵守公司的各项规章制度、服从上级的指示和命令，出勤率高。', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('254', '自信心', '对工作目标以及自己的决定充满信心。', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('255', '工作热情', '工作积极主动，经常愿意挑战艰难性工作。', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('256', '吃苦耐劳', '在工作中不怕苦、不怕累。', '根据标准符合程度给分0-5分', '5', '员工', '1');
INSERT INTO `kpi` VALUES ('257', '合作精神', '在本部门内和关联部门间与同事相互配合及协作的态度。', '根据标准符合程度给分0-5分', '5', '员工', '1');

-- ----------------------------
-- Table structure for punish
-- ----------------------------
DROP TABLE IF EXISTS `punish`;
CREATE TABLE `punish` (
  `punishId` int(6) NOT NULL AUTO_INCREMENT,
  `userId` varchar(10) DEFAULT NULL COMMENT '被惩罚人Id',
  `userName` varchar(255) DEFAULT NULL COMMENT '被惩罚人名称',
  `punishReason` varchar(255) DEFAULT NULL COMMENT '惩罚原因',
  `punishComplete` int(1) DEFAULT NULL COMMENT '惩罚是否完成 1：完成 2：未完成',
  `punishDesc` varchar(255) DEFAULT NULL COMMENT '惩罚描述',
  `punishTime` datetime DEFAULT NULL COMMENT '惩罚时间',
  PRIMARY KEY (`punishId`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of punish
-- ----------------------------

-- ----------------------------
-- Table structure for reward
-- ----------------------------
DROP TABLE IF EXISTS `reward`;
CREATE TABLE `reward` (
  `rewardId` int(6) NOT NULL AUTO_INCREMENT,
  `userId` varchar(10) DEFAULT NULL,
  `userName` varchar(255) DEFAULT NULL,
  `rewardReason` varchar(255) DEFAULT NULL COMMENT '奖励原因',
  `rewardDesc` varchar(255) DEFAULT NULL COMMENT '奖励描述',
  `rewardTime` datetime DEFAULT NULL COMMENT '奖励时间',
  PRIMARY KEY (`rewardId`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of reward
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` varchar(10) NOT NULL,
  `userName` varchar(255) DEFAULT NULL,
  `pwd` varchar(255) NOT NULL,
  `permissionDegree` int(1) DEFAULT NULL COMMENT '权限级别',
  `departmentId` varchar(255) DEFAULT NULL COMMENT '部门编码',
  `kpiSum` double(255,0) DEFAULT NULL COMMENT '考评分数',
  `phone` varchar(255) DEFAULT NULL COMMENT '手机号码',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `hometown` varchar(255) DEFAULT NULL COMMENT '籍贯',
  `gender` varchar(255) DEFAULT NULL COMMENT '性别',
  PRIMARY KEY (`userId`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '管理员', '1', '1', '', null, null, null, null, null);
INSERT INTO `user` VALUES ('10000', '陈杰', '123456', '3', 'gdufe01', '148', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10001', '陈杰', '123456', '3', 'gdufe02', '105', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10002', '陈杰', '123456', '3', 'gdufe03', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10003', '陈杰', '123456', '3', 'gdufe04', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10004', '陈杰', '123456', '3', 'gdufe05', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10005', '陈杰', '123456', '3', 'gdufe06', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10006', '陈杰', '123456', '3', 'gdufe01', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10007', '陈杰', '123456', '3', 'gdufe02', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10008', '陈杰', '123456', '3', 'gdufe03', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10009', '陈杰', '123456', '3', 'gdufe04', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10010', '陈杰', '123456', '3', 'gdufe05', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10011', '陈杰', '123456', '3', 'gdufe06', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10012', '陈杰', '123456', '3', 'gdufe01', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10013', '陈杰', '123456', '3', 'gdufe02', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10014', '陈杰', '123456', '3', 'gdufe03', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10015', '陈杰', '123456', '3', 'gdufe04', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10016', '陈杰', '123456', '3', 'gdufe05', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10017', '陈杰', '123456', '3', 'gdufe06', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10018', '陈杰', '123456', '3', 'gdufe01', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10019', '陈杰', '123456', '3', 'gdufe02', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10020', '陈杰', '123456', '3', 'gdufe03', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10021', '陈杰', '123456', '3', 'gdufe04', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10022', '陈杰', '123456', '3', 'gdufe05', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10023', '陈杰', '123456', '3', 'gdufe06', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10024', '陈杰', '123456', '3', 'gdufe01', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10025', '陈杰', '123456', '3', 'gdufe02', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10026', '陈杰', '123456', '3', 'gdufe03', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10027', '陈杰', '123456', '3', 'gdufe04', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10028', '陈杰', '123456', '3', 'gdufe05', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10029', '陈杰', '123456', '3', 'gdufe06', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10030', '陈杰', '123456', '3', 'gdufe01', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10031', '陈杰', '123456', '3', 'gdufe02', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10032', '陈杰', '123456', '3', 'gdufe03', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10033', '陈杰', '123456', '3', 'gdufe04', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10034', '陈杰', '123456', '3', 'gdufe05', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10035', '陈杰', '123456', '3', 'gdufe06', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10036', '陈杰', '123456', '3', 'gdufe01', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10037', '陈杰', '123456', '3', 'gdufe02', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10038', '陈杰', '123456', '3', 'gdufe03', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10039', '陈杰', '123456', '3', 'gdufe04', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10040', '陈杰', '123456', '3', 'gdufe05', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10041', '陈杰', '123456', '3', 'gdufe06', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10042', '陈杰', '123456', '3', 'gdufe01', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10043', '陈杰', '123456', '3', 'gdufe02', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10044', '陈杰', '123456', '3', 'gdufe03', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10045', '陈杰', '123456', '3', 'gdufe04', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10046', '陈杰', '123456', '3', 'gdufe05', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10047', '陈杰', '123456', '3', 'gdufe06', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10048', '陈杰', '123456', '3', 'gdufe04', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10049', '陈杰', '123456', '3', 'gdufe05', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10050', '陈杰', '123456', '3', 'gdufe06', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10051', '陈杰', '123456', '3', 'gdufe01', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10052', '陈杰', '123456', '3', 'gdufe02', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10053', '陈杰', '123456', '3', 'gdufe03', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10054', '陈杰', '123456', '3', 'gdufe04', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10055', '陈杰', '123456', '3', 'gdufe05', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10056', '陈杰', '123456', '3', 'gdufe06', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10057', '陈杰', '123456', '3', 'gdufe04', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10058', '陈杰', '123456', '3', 'gdufe05', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10059', '陈杰', '123456', '3', 'gdufe06', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10060', '陈杰', '123456', '3', 'gdufe01', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10061', '陈杰', '123456', '3', 'gdufe02', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10062', '陈杰', '123456', '3', 'gdufe03', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10063', '陈杰', '123456', '3', 'gdufe04', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10064', '陈杰', '123456', '3', 'gdufe05', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10065', '陈杰', '123456', '3', 'gdufe06', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10066', '陈杰', '123456', '3', 'gdufe04', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10067', '陈杰', '123456', '3', 'gdufe05', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10068', '陈杰', '123456', '3', 'gdufe06', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('10069', '陈杰', '123456', '3', 'gdufe01', '100', '13425632474', '253248079@qq.com', '翁源', '男');
INSERT INTO `user` VALUES ('10070', '陈杰', '123456', '3', 'gdufe02', '100', '13425632474', '253248079@qq.com', '沙坪', '男');
INSERT INTO `user` VALUES ('11000', '小明', '123456', '3', 'gdufe01', '100', '13425632474', '253248079@qq.com', '韶关', '男');
INSERT INTO `user` VALUES ('11001', '小明', '123456', '3', 'gdufe01', '100', '13425632474', '253248079@qq.com', '韶关', '男');
INSERT INTO `user` VALUES ('11002', '小明', '123456', '3', 'gdufe01', '100', '13425632474', '253248079@qq.com', '韶关', '男');
INSERT INTO `user` VALUES ('11003', '小明', '123456', '3', 'gdufe01', '100', '13425632474', '253248079@qq.com', '韶关', '男');
INSERT INTO `user` VALUES ('11004', '小明', '123456', '3', 'gdufe01', '100', '13425632474', '253248079@qq.com', '韶关', '男');
INSERT INTO `user` VALUES ('11005', '小明', '123456', '3', 'gdufe01', '100', '13425632474', '253248079@qq.com', '韶关', '男');
INSERT INTO `user` VALUES ('11006', '小明', '123456', '3', 'gdufe01', '100', '13425632474', '253248079@qq.com', '韶关', '男');
INSERT INTO `user` VALUES ('11007', '小明', '123456', '3', 'gdufe01', '100', '13425632474', '253248079@qq.com', '韶关', '男');
INSERT INTO `user` VALUES ('11008', '小明', '123456', '3', 'gdufe01', '100', '13425632474', '253248079@qq.com', '韶关', '男');
INSERT INTO `user` VALUES ('11009', '小明', '123456', '3', 'gdufe01', '100', '13425632474', '253248079@qq.com', '韶关', '男');
INSERT INTO `user` VALUES ('2', 'HR', '2', '2', 'gdufe03', '100', '13425632474', 'cccc@qq.com', '韶关', '女');

-- ----------------------------
-- Table structure for user_kpi
-- ----------------------------
DROP TABLE IF EXISTS `user_kpi`;
CREATE TABLE `user_kpi` (
  `kpiId` int(6) NOT NULL AUTO_INCREMENT,
  `kpiMs` varchar(1000) DEFAULT NULL COMMENT '违纪描述',
  `userName` varchar(255) DEFAULT NULL COMMENT '违纪人名称',
  `userId` varchar(10) DEFAULT NULL COMMENT '违纪人Id',
  `kpiPoint` int(4) DEFAULT NULL COMMENT '违纪扣除分数',
  `kpiTime` date DEFAULT NULL COMMENT '违纪时间',
  `kpiResult` varchar(1000) DEFAULT NULL COMMENT '违纪处理结果',
  `kpiDegree` int(1) DEFAULT NULL COMMENT '违纪等级1-5',
  `kpiDegreeMs` varchar(255) DEFAULT NULL COMMENT '违纪等级说明',
  PRIMARY KEY (`kpiId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of user_kpi
-- ----------------------------
INSERT INTO `user_kpi` VALUES ('42', '手动阀手动阀', 'HR', '2', '88', '2020-03-28', '阿三大', '1', '为公司挽回重大损失');
INSERT INTO `user_kpi` VALUES ('43', '是的', '陈杰', '10000', '88', '2020-04-04', '奖励奖励', '1', '为公司挽回重大损失');
INSERT INTO `user_kpi` VALUES ('44', '在公司多年兢兢业业', 'HR', '2', '88', '2020-03-27', '奖品以及绩效增加', '3', '年度十佳员工');
INSERT INTO `user_kpi` VALUES ('45', '一个好员工得加绩效', 'HR', '2', '33', '2020-04-04', '作为个人奖励', '3', '年度十佳员工');
INSERT INTO `user_kpi` VALUES ('46', '撒', '陈杰', '10000', '88', '2020-04-04', '阿大撒', '3', '年度十佳员工');
INSERT INTO `user_kpi` VALUES ('47', 'ssss', '陈杰', '10001', '5', '2020-04-04', 'sssss', '3', '年度十佳员工');

-- ----------------------------
-- Table structure for user_kpi_submit
-- ----------------------------
DROP TABLE IF EXISTS `user_kpi_submit`;
CREATE TABLE `user_kpi_submit` (
  `kpiId` int(6) NOT NULL AUTO_INCREMENT,
  `kpiMs` varchar(1000) DEFAULT NULL COMMENT '违纪描述',
  `userName` varchar(255) DEFAULT NULL COMMENT '违纪人名称',
  `userId` varchar(10) DEFAULT NULL COMMENT '违纪人Id',
  `kpiPoint` int(4) DEFAULT NULL COMMENT '违纪扣除分数',
  `kpiTime` datetime DEFAULT NULL COMMENT '违纪时间',
  `kpiResult` varchar(1000) DEFAULT NULL COMMENT '违纪处理结果',
  `kpiDegree` int(1) DEFAULT NULL COMMENT '违纪等级1-5',
  `kpiDegreeMs` varchar(255) DEFAULT NULL COMMENT '违纪等级说明',
  PRIMARY KEY (`kpiId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of user_kpi_submit
-- ----------------------------

-- ----------------------------
-- Table structure for weak_check
-- ----------------------------
DROP TABLE IF EXISTS `weak_check`;
CREATE TABLE `weak_check` (
  `checkId` int(6) NOT NULL AUTO_INCREMENT,
  `checkName` varchar(255) DEFAULT NULL COMMENT '检查名称',
  `checkDesc` varchar(255) DEFAULT NULL COMMENT '检查描述',
  `checkPoint` int(255) DEFAULT NULL COMMENT '检查分数',
  `isNow` int(1) DEFAULT NULL COMMENT '1本周，2上周',
  PRIMARY KEY (`checkId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of weak_check
-- ----------------------------
INSERT INTO `weak_check` VALUES ('1', '第一次评估', '这是第一次', '10', '2');
INSERT INTO `weak_check` VALUES ('2', '第二次评估', '这是第二次', '10', '2');
INSERT INTO `weak_check` VALUES ('3', '第三次评估', '这是第三次', '10', '2');
INSERT INTO `weak_check` VALUES ('4', '第四次评估', '这是第四次', '10', '2');
INSERT INTO `weak_check` VALUES ('5', '第五次评估', '这是第五次', '10', '2');
INSERT INTO `weak_check` VALUES ('6', '第六次评估', '这是第六次', '10', '2');
