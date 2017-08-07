/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50715
Source Host           : localhost:3306
Source Database       : dbgirl

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2017-08-07 17:47:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `girl_entity`
-- ----------------------------
DROP TABLE IF EXISTS `girl_entity`;
CREATE TABLE `girl_entity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `age` int(11) DEFAULT NULL,
  `cup_size` varchar(255) NOT NULL,
  `money` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of girl_entity
-- ----------------------------
INSERT INTO `girl_entity` VALUES ('1', '18', 'E', '22');
INSERT INTO `girl_entity` VALUES ('2', '18', 'E', '22');
INSERT INTO `girl_entity` VALUES ('3', '18', 'E', '22');
INSERT INTO `girl_entity` VALUES ('4', '18', 'E', '22');
INSERT INTO `girl_entity` VALUES ('5', '18', 'E', '22');
INSERT INTO `girl_entity` VALUES ('6', '18', 'E', '22');
INSERT INTO `girl_entity` VALUES ('7', '18', 'E', '22');
INSERT INTO `girl_entity` VALUES ('8', '18', 'E', '22');
INSERT INTO `girl_entity` VALUES ('9', '18', 'E', '22');
INSERT INTO `girl_entity` VALUES ('10', '22', 'E', '22');
INSERT INTO `girl_entity` VALUES ('11', '18', 'D', '2');
INSERT INTO `girl_entity` VALUES ('12', '18', 'D', '2');
INSERT INTO `girl_entity` VALUES ('13', '22', 'D', '2');
INSERT INTO `girl_entity` VALUES ('14', '22', 'D', '2');
INSERT INTO `girl_entity` VALUES ('15', '22', 'D', '2');
INSERT INTO `girl_entity` VALUES ('16', '22', 'D', '2');
INSERT INTO `girl_entity` VALUES ('17', '22', 'D', '2');
INSERT INTO `girl_entity` VALUES ('18', '22', 'D', '2');
INSERT INTO `girl_entity` VALUES ('19', '22', 'D', '2');
INSERT INTO `girl_entity` VALUES ('20', '22', 'D', '2');
INSERT INTO `girl_entity` VALUES ('21', '22', 'D', '2');
INSERT INTO `girl_entity` VALUES ('22', '22', 'D', '2');
INSERT INTO `girl_entity` VALUES ('23', '22', 'D', '2');
INSERT INTO `girl_entity` VALUES ('24', '22', 'D', '2');
INSERT INTO `girl_entity` VALUES ('25', '22', 'D', '2');
INSERT INTO `girl_entity` VALUES ('26', '22', 'D', '2');
INSERT INTO `girl_entity` VALUES ('27', '22', 'D', '2');
INSERT INTO `girl_entity` VALUES ('28', '22', 'D', '2');
INSERT INTO `girl_entity` VALUES ('29', '22', 'D', '2');
INSERT INTO `girl_entity` VALUES ('30', '22', 'D', '2');
INSERT INTO `girl_entity` VALUES ('31', '22', 'D', '2');
INSERT INTO `girl_entity` VALUES ('32', '22', 'D', '2');
INSERT INTO `girl_entity` VALUES ('33', '22', 'D', '2');
INSERT INTO `girl_entity` VALUES ('34', '22', 'D', '2');
INSERT INTO `girl_entity` VALUES ('35', '22', 'D', '2');
INSERT INTO `girl_entity` VALUES ('36', '25', 'E', '23');
INSERT INTO `girl_entity` VALUES ('37', '25', 'E', '23');
INSERT INTO `girl_entity` VALUES ('38', '25', 'E', '23');
INSERT INTO `girl_entity` VALUES ('39', '25', 'E', '23');
INSERT INTO `girl_entity` VALUES ('40', '21', 'E', '23');
INSERT INTO `girl_entity` VALUES ('41', '21', 'E', '23');
INSERT INTO `girl_entity` VALUES ('42', '21', 'E', '23');
INSERT INTO `girl_entity` VALUES ('43', '21', 'E', '23');
INSERT INTO `girl_entity` VALUES ('44', '21', 'E', '23');
INSERT INTO `girl_entity` VALUES ('45', '21', 'E', '25');
INSERT INTO `girl_entity` VALUES ('46', '27', 'E', '25');
