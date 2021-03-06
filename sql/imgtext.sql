/*
Navicat MySQL Data Transfer
Source Server         : localhost
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : imgtext
Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001
Date: 2017-10-10 09:32:09
*/
SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for img_text_base_info
-- ----------------------------
DROP TABLE IF EXISTS `img_text_base_info`;
CREATE TABLE `img_text_base_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `type` int(11) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `schoolId` int(11) unsigned DEFAULT NULL,
  `content` text,
  `isCanReceipt` bit(1) DEFAULT NULL,
  `isCanComment` bit(1) DEFAULT NULL,
  `praiseNum` int(11) unsigned DEFAULT NULL,
  `commentNum` int(11) unsigned DEFAULT NULL,
  `createUserId` bigint(20) NOT NULL,
  `createTime` datetime NOT NULL,
  `lastUpdateTime` datetime NOT NULL,
  `isDel` bit(1) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `uniq_time` (`createTime`,`isDel`,`type`,`lastUpdateTime`,`schoolId`,`createUserId`) USING BTREE,
  KEY `index_createTime` (`createTime`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=42215 DEFAULT CHARSET=utf8;
-- ----------------------------
-- Records of img_text_base_info
-- ----------------------------
-- ----------------------------
-- Table structure for img_text_base_label_info
-- ----------------------------
DROP TABLE IF EXISTS `img_text_base_label_info`;
CREATE TABLE `img_text_base_label_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `imgTextId` bigint(20) NOT NULL,
  `labelId` bigint(20) NOT NULL,
  `createUserId` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
-- ----------------------------
-- Records of img_text_base_label_info
-- ----------------------------
-- ----------------------------
-- Table structure for img_text_class_info
-- ----------------------------
DROP TABLE IF EXISTS `img_text_class_info`;
CREATE TABLE `img_text_class_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `classId` bigint(20) NOT NULL,
  `imgTextId` bigint(20) NOT NULL,
  `isDel` bit(1) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `uniq_classId` (`classId`,`isDel`,`imgTextId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=35179 DEFAULT CHARSET=utf8;
-- ----------------------------
-- Records of img_text_class_info
-- ----------------------------
-- ----------------------------
-- Table structure for img_text_comment_info
-- ----------------------------
DROP TABLE IF EXISTS `img_text_comment_info`;
CREATE TABLE `img_text_comment_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `imgTextId` bigint(20) NOT NULL,
  `content` text,
  `createUserId` bigint(20) NOT NULL,
  `createTime` datetime NOT NULL,
  `isDel` bit(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
-- ----------------------------
-- Records of img_text_comment_info
-- ----------------------------
-- ----------------------------
-- Table structure for img_text_file_info
-- ----------------------------
DROP TABLE IF EXISTS `img_text_file_info`;
CREATE TABLE `img_text_file_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `imgTextId` bigint(20) NOT NULL,
  `fileId` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
-- ----------------------------
-- Records of img_text_file_info
-- ----------------------------
-- ----------------------------
-- Table structure for img_text_label_info
-- ----------------------------
DROP TABLE IF EXISTS `img_text_label_info`;
CREATE TABLE `img_text_label_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `createUserId` bigint(20) NOT NULL,
  `isDel` bit(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;
-- ----------------------------
-- Records of img_text_label_info
-- ----------------------------
-- ----------------------------
-- Table structure for img_text_praise_info
-- ----------------------------
DROP TABLE IF EXISTS `img_text_praise_info`;
CREATE TABLE `img_text_praise_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `imgTextId` bigint(20) NOT NULL,
  `createUserId` bigint(20) NOT NULL,
  `createTime` datetime NOT NULL,
  `isDel` bit(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
-- ----------------------------
-- Records of img_text_praise_info
-- ----------------------------
-- ----------------------------
-- Table structure for img_text_receipt_info
-- ----------------------------
DROP TABLE IF EXISTS `img_text_receipt_info`;
CREATE TABLE `img_text_receipt_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `imgTextId` bigint(20) NOT NULL,
  `classId` bigint(20) NOT NULL,
  `createUserId` bigint(20) NOT NULL,
  `createTime` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
-- ----------------------------
-- Records of img_text_receipt_info
-- ----------------------------
-- ----------------------------
-- Table structure for img_text_top_info
-- ----------------------------
DROP TABLE IF EXISTS `img_text_top_info`;
CREATE TABLE `img_text_top_info` (
  `imgTextId` bigint(20) NOT NULL,
  `createTime` datetime NOT NULL,
  PRIMARY KEY (`imgTextId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- Records of img_text_top_info
-- ----------------------------
-- ----------------------------
-- Table structure for img_text_type
-- ----------------------------
DROP TABLE IF EXISTS `img_text_type`;
CREATE TABLE `img_text_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
-- ----------------------------
-- Records of img_text_type
-- ----------------------------
-- ----------------------------
-- Table structure for img_text_user_info
-- ----------------------------
DROP TABLE IF EXISTS `img_text_user_info`;
CREATE TABLE `img_text_user_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userId` bigint(20) NOT NULL,
  `imgTextId` bigint(20) NOT NULL,
  `isDel` bit(1) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `uniq_user` (`userId`,`isDel`,`imgTextId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7028 DEFAULT CHARSET=utf8;
-- ----------------------------
-- Records of img_text_user_info
-- ----------------------------
-- ----------------------------
-- View structure for view_img_text_base_info
-- ----------------------------
DROP VIEW IF EXISTS `view_img_text_base_info`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER  VIEW `view_img_text_base_info` AS select `imgtext`.`img_text_base_info`.`id` AS `id`,`imgtext`.`img_text_base_info`.`schoolId` AS `schoolId`,`imgtext`.`img_text_base_info`.`type` AS `type`,`imgtext`.`img_text_type`.`name` AS `typeName`,`imgtext`.`img_text_base_info`.`title` AS `title`,`imgtext`.`img_text_base_info`.`content` AS `content`,`imgtext`.`img_text_base_info`.`createUserId` AS `createUserId`,`imgtext`.`img_text_base_info`.`createTime` AS `createTime`,`imgtext`.`img_text_base_info`.`lastUpdateTime` AS `lastUpdateTime`,`imgtext`.`img_text_base_info`.`praiseNum` AS `praiseNum`,`imgtext`.`img_text_base_info`.`commentNum` AS `commentNum`,`imgtext`.`img_text_base_info`.`isDel` AS `isDel`,`master`.`user_base_info`.`userName` AS `createUserName`,`master`.`user_base_info`.`realName` AS `createUserRealName`,`view_upload_file_info`.`url` AS `createUserHeadUrl`,`imgtext`.`img_text_base_info`.`isCanComment` AS `isCanComment`,`imgtext`.`img_text_base_info`.`isCanReceipt` AS `isCanReceipt` from ((`imgtext`.`img_text_base_info` left join `imgtext`.`img_text_type` on((`imgtext`.`img_text_base_info`.`type` = `imgtext`.`img_text_type`.`id`))) left join (`master`.`user_base_info` left join `file`.`view_upload_file_info` on((`master`.`user_base_info`.`headPicId` = `view_upload_file_info`.`id`))) on((`imgtext`.`img_text_base_info`.`createUserId` = `master`.`user_base_info`.`userId`))) ;
-- ----------------------------
-- View structure for view_img_text_comment_info
-- ----------------------------
DROP VIEW IF EXISTS `view_img_text_comment_info`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER  VIEW `view_img_text_comment_info` AS select `imgtext`.`img_text_comment_info`.`id` AS `id`,`imgtext`.`img_text_comment_info`.`imgTextId` AS `imgTextId`,`imgtext`.`img_text_comment_info`.`content` AS `content`,`imgtext`.`img_text_comment_info`.`createUserId` AS `createUserId`,`imgtext`.`img_text_comment_info`.`createTime` AS `createTime`,`imgtext`.`img_text_comment_info`.`isDel` AS `isDel`,`master`.`user_base_info`.`userName` AS `createUserName`,`master`.`user_base_info`.`realName` AS `createUserRealName`,`view_upload_file_info`.`url` AS `createUserHeadUrl` from ((`imgtext`.`img_text_comment_info` join `master`.`user_base_info` on((`imgtext`.`img_text_comment_info`.`createUserId` = `master`.`user_base_info`.`userId`))) left join `file`.`view_upload_file_info` on((`master`.`user_base_info`.`headPicId` = `view_upload_file_info`.`id`))) ;
-- ----------------------------
-- View structure for view_img_text_file_info
-- ----------------------------
DROP VIEW IF EXISTS `view_img_text_file_info`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER  VIEW `view_img_text_file_info` AS select `imgtext`.`img_text_file_info`.`id` AS `id`,`imgtext`.`img_text_file_info`.`imgTextId` AS `imgTextId`,`imgtext`.`img_text_file_info`.`fileId` AS `fileId`,`view_upload_file_info`.`name` AS `fileName`,`view_upload_file_info`.`url` AS `fileUrl`,`view_upload_file_info`.`playTime` AS `playTime` from (`imgtext`.`img_text_file_info` join `file`.`view_upload_file_info`) where (`imgtext`.`img_text_file_info`.`fileId` = `view_upload_file_info`.`id`) ;
-- ----------------------------
-- View structure for view_img_text_praise_info
-- ----------------------------
DROP VIEW IF EXISTS `view_img_text_praise_info`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER  VIEW `view_img_text_praise_info` AS select `imgtext`.`img_text_praise_info`.`id` AS `id`,`imgtext`.`img_text_praise_info`.`imgTextId` AS `imgTextId`,`imgtext`.`img_text_praise_info`.`createUserId` AS `createUserId`,`imgtext`.`img_text_praise_info`.`createTime` AS `createTime`,`imgtext`.`img_text_praise_info`.`isDel` AS `isDel`,`master`.`user_base_info`.`userName` AS `createUserName`,`master`.`user_base_info`.`realName` AS `createUserRealName`,`view_upload_file_info`.`url` AS `createUserHeadUrl` from ((`imgtext`.`img_text_praise_info` join `master`.`user_base_info` on((`imgtext`.`img_text_praise_info`.`createUserId` = `master`.`user_base_info`.`userId`))) left join `file`.`view_upload_file_info` on((`master`.`user_base_info`.`headPicId` = `view_upload_file_info`.`id`))) ;
-- ----------------------------
-- View structure for view_img_text_read_user_info
-- ----------------------------
DROP VIEW IF EXISTS `view_img_text_read_user_info`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER  VIEW `view_img_text_read_user_info` AS (
	SELECT
		`imgText`.`classId` AS `classId`,
		`imgText`.`imgTextId` AS `imgTextId`,
		`student`.`userId` AS `studentId`
	FROM
		(
			`imgtext`.`img_text_class_info` `imgText`
			JOIN `master`.`user_student_info` `student` ON (
				(
					`imgText`.`classId` = `student`.`classNo`
				)
			)
		)
)
UNION
	(
		SELECT
			`classInfo`.`classNo` AS `classId`,
			`imgText`.`id` AS `imgTextId`,
			`student`.`userId` AS `studentId`
		FROM
			(
				(
					`imgtext`.`img_text_base_info` `imgText`
					JOIN `master`.`class_base_info` `classInfo` ON (
						(
							(
								`imgText`.`schoolId` = `classInfo`.`schoolId`
							)
							AND (`imgText`.`type` = 4)
						)
					)
				)
				JOIN `master`.`user_student_info` `student` ON (
					(
						`classInfo`.`classNo` = `student`.classNo
					)
				)
			)
	) ;