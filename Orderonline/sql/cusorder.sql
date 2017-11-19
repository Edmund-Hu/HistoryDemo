/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : orderonline

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2017-03-02 17:13:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `cusorder`
-- ----------------------------
DROP TABLE IF EXISTS `cusorder`;
CREATE TABLE `cusorder` (
  `orderid` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) NOT NULL,
  `goodinfo` varchar(100) DEFAULT NULL,
  `time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `status` varchar(5) DEFAULT '未支付',
  `totalmoney` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`orderid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cusorder
-- ----------------------------
INSERT INTO `cusorder` VALUES ('4', '1', '[{picaddress:\'img/4.jpg\',name:\'蒜蓉扇贝\',price:\'￥32.0\',num:1,totalprice:\'￥32.0\',goodId:2,totalcount:12}]', '2017-03-02 10:25:03', '完成', '32.00');
INSERT INTO `cusorder` VALUES ('5', '1', '[{picaddress:\'img/2.jpg\',name:\'宫廷鳝鱼\',price:\'￥43.0\',num:1,totalprice:\'￥43.0\',goodId:3,totalcount:15}]', '2017-03-02 10:23:11', '未支付', '43.00');
INSERT INTO `cusorder` VALUES ('6', '1', '[{picaddress:\'img/3.jpg\',name:\'蒜薹肉丝\',price:\'￥23.0\',num:1,totalprice:\'￥23.0\',goodId:4,totalcount:43}]', '2017-03-02 11:41:52', '完成', '23.00');
INSERT INTO `cusorder` VALUES ('7', '1', '[{picaddress:\'img/4.jpg\',name:\'蒜蓉扇贝\',price:\'￥32.0\',num:6,totalprice:\'￥192.0\',goodId:2,totalcount:6}]', '2017-03-02 11:41:47', '完成', '192.00');
