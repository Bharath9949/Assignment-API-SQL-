CREATE DATABASE  IF NOT EXISTS `customersdata` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `customersdata`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: customersdata
-- ------------------------------------------------------
-- Server version	5.5.38

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customers` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `interest_amount` bigint(20) NOT NULL,
  `mail_id` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  `principal_amount` bigint(20) NOT NULL,
  `total_amount` bigint(20) NOT NULL,
  `years` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES (1,0,'','','',0,0,0),(2,0,'gadddambharathkumar.g@gmail.com','Bharath Kumar','9949368367',1000,0,20),(3,0,'gadddambharathkumar.g@gmail.com','Bharath Kumar','9949368367',1000,0,20),(4,0,'','','',0,0,0),(5,0,'','','',10,0,2),(6,0,'','','',0,0,0),(7,0,'','','',10,0,2),(8,0,'','','',100,0,20),(9,0,'','','',0,0,0),(10,0,'ga','Bharath Kumar','9949368367',10,0,2),(11,10,'HKHD','gjhg','guG',100,110,2);
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `interest_rate`
--

DROP TABLE IF EXISTS `interest_rate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `interest_rate` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `from_amount` bigint(20) NOT NULL,
  `from_years` int(11) NOT NULL,
  `interest_rate` int(11) NOT NULL,
  `to_amount` bigint(20) NOT NULL,
  `to_years` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `interest_rate`
--

LOCK TABLES `interest_rate` WRITE;
/*!40000 ALTER TABLE `interest_rate` DISABLE KEYS */;
INSERT INTO `interest_rate` VALUES (1,1,1,5,50000,5),(2,1,6,6,50000,10),(3,50001,1,7,100000,5),(4,50001,6,8,100000,10);
/*!40000 ALTER TABLE `interest_rate` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-02 22:52:18
