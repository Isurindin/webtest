/*
 Navicat Premium Data Transfer

 Source Server         : 本地连接
 Source Server Type    : MySQL
 Source Server Version : 80020
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80020
 File Encoding         : 65001

 Date: 25/06/2025 09:16:33
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_dict
-- ----------------------------
DROP TABLE IF EXISTS `sys_dict`;
CREATE TABLE `sys_dict`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '字典表主键',
  `dict_type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `dict_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '字典编码',
  `dict_name` char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '字典名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '系统字典表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_dict
-- ----------------------------
INSERT INTO `sys_dict` VALUES (7, 'job_type', '1', '员工');
INSERT INTO `sys_dict` VALUES (8, 'job_type', '2', '部门主管');
INSERT INTO `sys_dict` VALUES (14, 'job_type', '0', '管理员');
INSERT INTO `sys_dict` VALUES (15, 'user_manage', 'zhangsan', '张散');
INSERT INTO `sys_dict` VALUES (16, 'user_manage', 'wanggang', '王刚');
INSERT INTO `sys_dict` VALUES (17, 'user_manage', 'chenming', '陈明');
INSERT INTO `sys_dict` VALUES (19, 'work_state', '0', '已保存');
INSERT INTO `sys_dict` VALUES (20, 'work_state', '1', '申请中');
INSERT INTO `sys_dict` VALUES (21, 'work_state', '2', '已批准');
INSERT INTO `sys_dict` VALUES (22, 'work_state', '3', '已驳回');

SET FOREIGN_KEY_CHECKS = 1;
