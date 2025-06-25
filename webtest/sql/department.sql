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

 Date: 25/06/2025 09:15:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '部门编号',
  `name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '部门名称',
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负责人',
  `num` int(0) NULL DEFAULT NULL COMMENT '部门人数',
  `register_time` datetime(0) NULL DEFAULT NULL COMMENT '注册时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 30501 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '部门表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES (1, '研发一部', '张宁', 8, '2023-05-30 10:10:10');
INSERT INTO `department` VALUES (2, '研发二部', '李刚', 9, '2023-05-30 10:10:10');
INSERT INTO `department` VALUES (3, '研发三部', '李蔑', 10, '2023-05-30 10:10:10');
INSERT INTO `department` VALUES (4, '测试一部', '晓菲', 10, '2023-05-30 10:10:10');
INSERT INTO `department` VALUES (5, '测试二部', '小明', 10, '2023-05-30 10:10:10');
INSERT INTO `department` VALUES (30501, '财务部', '陈明', 0, '2023-07-01 09:52:28');

SET FOREIGN_KEY_CHECKS = 1;
