/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : orderonline

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2017-03-02 17:12:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `good`
-- ----------------------------
DROP TABLE IF EXISTS `good`;
CREATE TABLE `good` (
  `goodId` int(11) NOT NULL AUTO_INCREMENT,
  `goodName` varchar(20) DEFAULT NULL,
  `goodPic` varchar(30) DEFAULT NULL,
  `goodPrice` float DEFAULT NULL,
  `discount` float DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `goodcount` int(11) DEFAULT NULL,
  `taste` varchar(20) DEFAULT NULL,
  `style` varchar(30) DEFAULT NULL,
  `saleTotal` int(11) DEFAULT NULL,
  `recipe` varchar(50) DEFAULT NULL,
  `pic1` varchar(30) DEFAULT NULL,
  `pic2` varchar(30) DEFAULT NULL,
  `pic3` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`goodId`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of good
-- ----------------------------
INSERT INTO `good` VALUES ('1', '糖醋排骨', '1', '23', '1', '1', '4', '偏甜', '川菜', '20', '精选猪排，上好红糖', '1', '1', '1');
INSERT INTO `good` VALUES ('2', '蒜蓉扇贝', '4', '32', '1', '1', '0', '清淡', '粤菜', '55', '精选扇贝，龙口粉丝', '4-(1)', '4-(2)', '4-(3)');
INSERT INTO `good` VALUES ('3', '宫廷鳝鱼', '2', '43', '1', '1', '15', '适中', '川菜', '45', '精选黄鳝，秘制酱料', '2', '2', '2');
INSERT INTO `good` VALUES ('4', '蒜薹肉丝', '3', '23', '1', '1', '42', '适中', '川菜', '68', '新鲜蒜薹，精品瘦肉', '3', '3', '3');
INSERT INTO `good` VALUES ('5', '水果沙拉', '5', '34', '1', '1', '23', '清淡', '西餐', '34', '各种新鲜水果，蔬菜，沙拉酱', '5', '5', '5');
INSERT INTO `good` VALUES ('6', '秘制肥肠', '6', '34', '1', '1', '23', '适中', '川菜', '34', '精选猪大肠，秘制卤料', '6', '6', '6');
INSERT INTO `good` VALUES ('7', '拔丝香蕉', '7', '23', '1', '1', '34', '偏甜', '粤菜', '31', '香蕉，蔗糖，芒果', '7', '7', '7');
INSERT INTO `good` VALUES ('8', '水煮肉片', '8', '33', '1', '1', '32', '辛辣', '川菜', '12', '精选猪肉，新鲜蔬菜', '8', '8', '8');
INSERT INTO `good` VALUES ('9', '宫保鸡丁', '12', '28', '1', '1', '23', '适中', '川菜', '38', '花生，鸡胸肉，莴笋', '12', '12', '12');
INSERT INTO `good` VALUES ('10', '红烧肉', '10', '36', '1', '1', '23', '适中', '川菜', '45', '精选五花肉', '10', '10', '10');
