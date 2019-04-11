-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: tax_sqa
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `company_info`
--

DROP TABLE IF EXISTS `company_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `company_info` (
  `ma_cong_ty` int(11) NOT NULL AUTO_INCREMENT,
  `ten_cong_ty` varchar(100) NOT NULL,
  `dia_chi` varchar(45) NOT NULL,
  PRIMARY KEY (`ma_cong_ty`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company_info`
--

LOCK TABLES `company_info` WRITE;
/*!40000 ALTER TABLE `company_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `company_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tax_config`
--

DROP TABLE IF EXISTS `tax_config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tax_config` (
  `ma_cau_hinh` int(11) NOT NULL AUTO_INCREMENT,
  `ban_than` int(11) NOT NULL,
  `nguoi_phu_thuoc` int(11) NOT NULL,
  `bao_hiem` int(11) NOT NULL,
  PRIMARY KEY (`ma_cau_hinh`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tax_config`
--

LOCK TABLES `tax_config` WRITE;
/*!40000 ALTER TABLE `tax_config` DISABLE KEYS */;
/*!40000 ALTER TABLE `tax_config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_tax`
--

DROP TABLE IF EXISTS `user_tax`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user_tax` (
  `cmt` varchar(15) NOT NULL,
  `ho_ten` varchar(50) NOT NULL,
  `ma_cong_ty` int(11) NOT NULL,
  `chuc_vu` varchar(20) NOT NULL,
  `mst` varchar(45) NOT NULL,
  `luong` float NOT NULL,
  `tien_an` varchar(45) NOT NULL,
  `so_nguoi_phu_thuoc` int(11) NOT NULL,
  `giam_tru_gia_canh` int(11) NOT NULL,
  `thu_nhap_chiu_thue` int(11) NOT NULL,
  `thue_phai_nop` int(11) NOT NULL,
  `ma_cau_hinh_thue` int(11) NOT NULL,
  PRIMARY KEY (`cmt`),
  UNIQUE KEY `cmt_UNIQUE` (`cmt`),
  KEY `fk_company_info_idx` (`ma_cong_ty`),
  KEY `fk_tax_config_idx` (`ma_cau_hinh_thue`),
  CONSTRAINT `fk_company_info` FOREIGN KEY (`ma_cong_ty`) REFERENCES `company_info` (`ma_cong_ty`),
  CONSTRAINT `fk_tax_config` FOREIGN KEY (`ma_cau_hinh_thue`) REFERENCES `tax_config` (`ma_cau_hinh`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_tax`
--

LOCK TABLES `user_tax` WRITE;
/*!40000 ALTER TABLE `user_tax` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_tax` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-11 23:02:20
