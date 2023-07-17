CREATE DATABASE  IF NOT EXISTS `password_vault`;
USE `password_vault`;

--
-- Table structure for table `site`
--

DROP TABLE IF EXISTS `site`;

CREATE TABLE `site` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `url` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `site` VALUES 
	(1,'Github','www.github.com','praveen@gmail.com', 'praveen@123'),
	(1,'facebook','www.github.com','praveen@gmail.com', 'praveen@123'),
    	(1,'udemy','www.github.com','praveen@gmail.com', 'praveen@123');

