/*
 Navicat Premium Data Transfer

 Source Server         : MySql
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : customer

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 05/07/2021 17:00:44
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for customer_form
-- ----------------------------
DROP TABLE IF EXISTS `customer_form`;
CREATE TABLE `customer_form`  (
  `customer_form_info_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `customer_form_element_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  INDEX `cfiId`(`customer_form_info_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of customer_form
-- ----------------------------
INSERT INTO `customer_form` VALUES ('1', '1');
INSERT INTO `customer_form` VALUES ('1', '2');

-- ----------------------------
-- Table structure for customer_form_element
-- ----------------------------
DROP TABLE IF EXISTS `customer_form_element`;
CREATE TABLE `customer_form_element`  (
  `id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `columnType` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '组件类型',
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '组件标题',
  `log` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '默认为1 ,可扩展',
  `req` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否必填标识',
  `value` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '值',
  `items` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '组件类型 多/单选择器时,必填属性',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of customer_form_element
-- ----------------------------
INSERT INTO `customer_form_element` VALUES ('1', 'inputText', '姓名', '1', '1', NULL, NULL);
INSERT INTO `customer_form_element` VALUES ('2', 'inputText', '电话', '1', '1', NULL, NULL);

-- ----------------------------
-- Table structure for customer_form_info
-- ----------------------------
DROP TABLE IF EXISTS `customer_form_info`;
CREATE TABLE `customer_form_info`  (
  `id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `formName` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `formDescribe` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of customer_form_info
-- ----------------------------
INSERT INTO `customer_form_info` VALUES ('1', '测试', '测试秒送', '0');

SET FOREIGN_KEY_CHECKS = 1;
