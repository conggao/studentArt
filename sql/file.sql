/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : file

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2017-10-10 09:32:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dir_info
-- ----------------------------
DROP TABLE IF EXISTS `dir_info`;
CREATE TABLE `dir_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parentId` bigint(20) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `createUserId` bigint(20) NOT NULL,
  `createTime` datetime NOT NULL,
  `schoolId` int(11) NOT NULL,
  `isDel` bit(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of dir_info
-- ----------------------------

-- ----------------------------
-- Table structure for file_server_info
-- ----------------------------
DROP TABLE IF EXISTS `file_server_info`;
CREATE TABLE `file_server_info` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `serverUrl` varchar(255) NOT NULL,
  `time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of file_server_info
-- ----------------------------
INSERT INTO `file_server_info` VALUES ('1', '127.0.0.1:8080', '2017-10-09 10:54:34');

-- ----------------------------
-- Table structure for file_type
-- ----------------------------
DROP TABLE IF EXISTS `file_type`;
CREATE TABLE `file_type` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4054 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of file_type
-- ----------------------------
INSERT INTO `file_type` VALUES ('1', '文档');
INSERT INTO `file_type` VALUES ('2', '图片');
INSERT INTO `file_type` VALUES ('3', '音频');
INSERT INTO `file_type` VALUES ('4', '视频');
INSERT INTO `file_type` VALUES ('4053', '其他');

-- ----------------------------
-- Table structure for upload_file_info
-- ----------------------------
DROP TABLE IF EXISTS `upload_file_info`;
CREATE TABLE `upload_file_info` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  `serverId` int(10) unsigned DEFAULT NULL,
  `path` text NOT NULL,
  `size` bigint(20) unsigned NOT NULL,
  `ext` varchar(255) DEFAULT NULL,
  `userId` bigint(20) unsigned DEFAULT NULL,
  `playTime` int(11) DEFAULT NULL,
  `time` datetime NOT NULL,
  `isdel` bit(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`id`),
  KEY `upload_file_info_userId` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=136192 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of upload_file_info
-- ----------------------------

-- ----------------------------
-- Table structure for user_res_info
-- ----------------------------
DROP TABLE IF EXISTS `user_res_info`;
CREATE TABLE `user_res_info` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `fileId` bigint(20) NOT NULL,
  `classId` bigint(20) unsigned DEFAULT '0',
  `courseId` int(10) unsigned DEFAULT NULL,
  `title` text NOT NULL COMMENT '标题',
  `content` longtext COMMENT '内容',
  `isPublic` bit(1) NOT NULL DEFAULT b'0',
  `dirId` bigint(20) NOT NULL,
  `createUserId` bigint(20) unsigned NOT NULL,
  `createTime` datetime NOT NULL COMMENT '创建时间',
  `updateTime` datetime NOT NULL,
  `isDel` bit(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='文章信息';

-- ----------------------------
-- Records of user_res_info
-- ----------------------------

-- ----------------------------
-- View structure for view_upload_file_info
-- ----------------------------
DROP VIEW IF EXISTS `view_upload_file_info`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER  VIEW `view_upload_file_info` AS SELECT
	f.id AS id,
	f.`name` AS NAME,
	f.size AS size,
	f.ext AS ext,
	CONCAT(s.serverUrl, f.path) AS url,
f.playTime as playTime
FROM
	file.file_server_info s
JOIN file.upload_file_info f
WHERE
	s.id = f.serverId ;

-- ----------------------------
-- View structure for view_user_dir_info
-- ----------------------------
DROP VIEW IF EXISTS `view_user_dir_info`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost`  VIEW `view_user_dir_info` AS SELECT
	d.id AS id,
	d.parentId AS parentId,
	d.`name` as `name`,
	d.schoolId AS schoolId,
	d.createTime AS createTime,
	d.isDel AS isDel,
	u.userName AS createUserName,
	u.userId AS createUserId
FROM
	file.dir_info d
JOIN `master`.user_base_info u ON d.createUserId = u.userId ;

-- ----------------------------
-- View structure for view_user_res_info
-- ----------------------------
DROP VIEW IF EXISTS `view_user_res_info`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER  VIEW `view_user_res_info` AS SELECT
	file.user_res_info.id AS id,
	file.user_res_info.dirId AS dirId,
	file.user_res_info.courseId AS courseId,
	file.user_res_info.title AS title,
	`file`.`user_res_info`.classId AS classId,
	file.user_res_info.content AS content,
	file.user_res_info.fileId AS fileId,
	file.upload_file_info.`name` AS fileName,
	CONCAT(
		file_server_info.serverUrl,
		file.upload_file_info.path
	) AS fileUrl,
	file.upload_file_info.size AS fileSize,
	file.upload_file_info.ext AS fileExt,
	file.user_res_info.isPublic AS isPublic,
	file.user_res_info.isDel AS isDel,
	`master`.user_base_info.realName AS createUserName,
	file.user_res_info.createTime AS createTime,
	file.user_res_info.updateTime AS updateTime,
	file.file_server_info.serverUrl,
file.upload_file_info.userId as createUserId
FROM
	(
		(
			file.user_res_info
			JOIN file.upload_file_info
		)
		JOIN `master`.user_base_info
	),
	file.file_server_info
WHERE
	(
		file.user_res_info.fileId = file.upload_file_info.id
	)
AND (
	file.user_res_info.createUserId = `master`.user_base_info.userId
)
AND file.file_server_info.id = file.upload_file_info.serverId ;
