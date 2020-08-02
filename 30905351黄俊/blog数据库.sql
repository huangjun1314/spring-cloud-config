/*
SQLyog Ultimate v12.5.1 (64 bit)
MySQL - 5.7.24-log : Database - blog
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`blog` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `blog`;

/*Table structure for table `blog` */

DROP TABLE IF EXISTS `blog`;

CREATE TABLE `blog` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '微博id',
  `content` varchar(300) COLLATE utf8_unicode_ci NOT NULL COMMENT '内容',
  `publishtime` datetime NOT NULL COMMENT '发布时间',
  `userid` int(11) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `blog` */

insert  into `blog`(`id`,`content`,`publishtime`,`userid`) values 
(1,'斯柯达架飞机','2020-05-22 15:45:18',1),
(2,'为金融危机','2020-05-21 15:45:38',2),
(3,'企鹅窝若翁','2020-05-20 15:45:47',3),
(4,'规范化体验','2020-05-19 15:45:57',4);

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(64) COLLATE utf8_unicode_ci NOT NULL COMMENT '用户名',
  `password` varchar(64) COLLATE utf8_unicode_ci NOT NULL COMMENT '密码',
  `age` int(11) NOT NULL COMMENT '年龄',
  `sex` int(11) NOT NULL COMMENT '性别',
  `nickname` varchar(64) COLLATE utf8_unicode_ci NOT NULL COMMENT '昵称',
  `mobile` varchar(64) COLLATE utf8_unicode_ci NOT NULL COMMENT '手机',
  `address` varchar(64) COLLATE utf8_unicode_ci NOT NULL COMMENT '地址',
  `supper` int(11) NOT NULL COMMENT '管理员(1是，0否)',
  `picpath` varchar(300) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '头像路径',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `users` */

insert  into `users`(`id`,`username`,`password`,`age`,`sex`,`nickname`,`mobile`,`address`,`supper`,`picpath`) values 
(1,'test1','123',11,1,'test1','123456','北极',1,NULL),
(2,'test2','122',12,1,'test2','12345','南极',0,NULL),
(3,'test3','1233',13,1,'test3','12345','冬季',0,NULL),
(4,'test4','1234',14,0,'test4','12345','湖南',0,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
