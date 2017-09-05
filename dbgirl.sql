/*
Navicat MySQL Data Transfer

Source Server         : dbgirl
Source Server Version : 50715
Source Host           : localhost:3306
Source Database       : dbgirl

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2017-08-31 10:12:44
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
INSERT INTO `girl_entity` VALUES ('38', '25', 'E', '23');
INSERT INTO `girl_entity` VALUES ('39', '25', 'E', '23');
INSERT INTO `girl_entity` VALUES ('40', '21', 'E', '23');
INSERT INTO `girl_entity` VALUES ('41', '21', 'E', '23');
INSERT INTO `girl_entity` VALUES ('42', '21', 'E', '23');
INSERT INTO `girl_entity` VALUES ('43', '21', 'E', '23');
INSERT INTO `girl_entity` VALUES ('44', '21', 'E', '23');
INSERT INTO `girl_entity` VALUES ('45', '21', 'E', '25');
INSERT INTO `girl_entity` VALUES ('46', '27', 'E', '25');

-- ----------------------------
-- Table structure for `test_employee`
-- ----------------------------
DROP TABLE IF EXISTS `test_employee`;
CREATE TABLE `test_employee` (
  `id` int(11) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `name` tinytext
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_employee
-- ----------------------------
INSERT INTO `test_employee` VALUES ('1', '100', 'test0');
INSERT INTO `test_employee` VALUES ('2', '99', 'test1');
INSERT INTO `test_employee` VALUES ('3', '98', 'test2');
INSERT INTO `test_employee` VALUES ('4', '97', 'test3');
INSERT INTO `test_employee` VALUES ('5', '96', 'test4');
INSERT INTO `test_employee` VALUES ('6', '95', 'test5');
INSERT INTO `test_employee` VALUES ('7', '94', 'test6');
INSERT INTO `test_employee` VALUES ('8', '93', 'test7');
INSERT INTO `test_employee` VALUES ('9', '92', 'test8');
INSERT INTO `test_employee` VALUES ('10', '91', 'test9');
INSERT INTO `test_employee` VALUES ('11', '90', 'test10');
INSERT INTO `test_employee` VALUES ('12', '89', 'test11');
INSERT INTO `test_employee` VALUES ('13', '88', 'test12');
INSERT INTO `test_employee` VALUES ('14', '87', 'test13');
INSERT INTO `test_employee` VALUES ('15', '86', 'test14');
INSERT INTO `test_employee` VALUES ('16', '85', 'test15');
INSERT INTO `test_employee` VALUES ('17', '84', 'test16');
INSERT INTO `test_employee` VALUES ('18', '83', 'test17');
INSERT INTO `test_employee` VALUES ('19', '82', 'test18');
INSERT INTO `test_employee` VALUES ('20', '81', 'test19');
INSERT INTO `test_employee` VALUES ('21', '80', 'test20');
INSERT INTO `test_employee` VALUES ('22', '79', 'test21');
INSERT INTO `test_employee` VALUES ('23', '78', 'test22');
INSERT INTO `test_employee` VALUES ('24', '77', 'test23');
INSERT INTO `test_employee` VALUES ('25', '76', 'test24');
INSERT INTO `test_employee` VALUES ('26', '75', 'test25');
INSERT INTO `test_employee` VALUES ('27', '74', 'test26');
INSERT INTO `test_employee` VALUES ('28', '73', 'test27');
INSERT INTO `test_employee` VALUES ('29', '72', 'test28');
INSERT INTO `test_employee` VALUES ('30', '71', 'test29');
INSERT INTO `test_employee` VALUES ('31', '70', 'test30');
INSERT INTO `test_employee` VALUES ('32', '69', 'test31');
INSERT INTO `test_employee` VALUES ('33', '68', 'test32');
INSERT INTO `test_employee` VALUES ('34', '67', 'test33');
INSERT INTO `test_employee` VALUES ('35', '66', 'test34');
INSERT INTO `test_employee` VALUES ('36', '65', 'test35');
INSERT INTO `test_employee` VALUES ('37', '64', 'test36');
INSERT INTO `test_employee` VALUES ('38', '63', 'test37');
INSERT INTO `test_employee` VALUES ('39', '62', 'test38');
INSERT INTO `test_employee` VALUES ('40', '61', 'test39');
INSERT INTO `test_employee` VALUES ('41', '60', 'test40');
INSERT INTO `test_employee` VALUES ('42', '59', 'test41');
INSERT INTO `test_employee` VALUES ('43', '58', 'test42');
INSERT INTO `test_employee` VALUES ('44', '57', 'test43');
INSERT INTO `test_employee` VALUES ('45', '56', 'test44');
INSERT INTO `test_employee` VALUES ('46', '55', 'test45');
INSERT INTO `test_employee` VALUES ('47', '54', 'test46');
INSERT INTO `test_employee` VALUES ('48', '53', 'test47');
INSERT INTO `test_employee` VALUES ('49', '52', 'test48');
INSERT INTO `test_employee` VALUES ('50', '51', 'test49');
INSERT INTO `test_employee` VALUES ('51', '50', 'test50');
INSERT INTO `test_employee` VALUES ('52', '49', 'test51');
INSERT INTO `test_employee` VALUES ('53', '48', 'test52');
INSERT INTO `test_employee` VALUES ('54', '47', 'test53');
INSERT INTO `test_employee` VALUES ('55', '46', 'test54');
INSERT INTO `test_employee` VALUES ('56', '45', 'test55');
INSERT INTO `test_employee` VALUES ('57', '44', 'test56');
INSERT INTO `test_employee` VALUES ('58', '43', 'test57');
INSERT INTO `test_employee` VALUES ('59', '42', 'test58');
INSERT INTO `test_employee` VALUES ('60', '41', 'test59');
INSERT INTO `test_employee` VALUES ('61', '40', 'test60');
INSERT INTO `test_employee` VALUES ('62', '39', 'test61');
INSERT INTO `test_employee` VALUES ('63', '38', 'test62');
INSERT INTO `test_employee` VALUES ('64', '37', 'test63');
INSERT INTO `test_employee` VALUES ('65', '36', 'test64');
INSERT INTO `test_employee` VALUES ('66', '35', 'test65');
INSERT INTO `test_employee` VALUES ('67', '34', 'test66');
INSERT INTO `test_employee` VALUES ('68', '33', 'test67');
INSERT INTO `test_employee` VALUES ('69', '32', 'test68');
INSERT INTO `test_employee` VALUES ('70', '31', 'test69');
INSERT INTO `test_employee` VALUES ('71', '30', 'test70');
INSERT INTO `test_employee` VALUES ('72', '29', 'test71');
INSERT INTO `test_employee` VALUES ('73', '28', 'test72');
INSERT INTO `test_employee` VALUES ('74', '27', 'test73');
INSERT INTO `test_employee` VALUES ('75', '26', 'test74');
INSERT INTO `test_employee` VALUES ('76', '25', 'test75');
INSERT INTO `test_employee` VALUES ('77', '24', 'test76');
INSERT INTO `test_employee` VALUES ('78', '23', 'test77');
INSERT INTO `test_employee` VALUES ('79', '22', 'test78');
INSERT INTO `test_employee` VALUES ('80', '21', 'test79');
INSERT INTO `test_employee` VALUES ('81', '20', 'test80');
INSERT INTO `test_employee` VALUES ('82', '19', 'test81');
INSERT INTO `test_employee` VALUES ('83', '18', 'test82');
INSERT INTO `test_employee` VALUES ('84', '17', 'test83');
INSERT INTO `test_employee` VALUES ('85', '16', 'test84');
INSERT INTO `test_employee` VALUES ('86', '15', 'test85');
INSERT INTO `test_employee` VALUES ('87', '14', 'test86');
INSERT INTO `test_employee` VALUES ('88', '13', 'test87');
INSERT INTO `test_employee` VALUES ('89', '12', 'test88');
INSERT INTO `test_employee` VALUES ('90', '11', 'test89');
INSERT INTO `test_employee` VALUES ('91', '10', 'test90');
INSERT INTO `test_employee` VALUES ('92', '9', 'test91');
INSERT INTO `test_employee` VALUES ('93', '8', 'test92');
INSERT INTO `test_employee` VALUES ('94', '7', 'test93');
INSERT INTO `test_employee` VALUES ('95', '6', 'test94');
INSERT INTO `test_employee` VALUES ('96', '5', 'test95');
INSERT INTO `test_employee` VALUES ('97', '4', 'test96');
INSERT INTO `test_employee` VALUES ('98', '3', 'test97');
INSERT INTO `test_employee` VALUES ('99', '2', 'test98');
INSERT INTO `test_employee` VALUES ('100', '1', 'test99');

-- ----------------------------
-- Table structure for `t_app_test`
-- ----------------------------
DROP TABLE IF EXISTS `t_app_test`;
CREATE TABLE `t_app_test` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `version` varchar(20) DEFAULT NULL,
  `app_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_app_test
-- ----------------------------
INSERT INTO `t_app_test` VALUES ('1', 'xx', '1', '1');
INSERT INTO `t_app_test` VALUES ('2', 'zz', '2', '2');
INSERT INTO `t_app_test` VALUES ('3', 'ss', '3', '3');
