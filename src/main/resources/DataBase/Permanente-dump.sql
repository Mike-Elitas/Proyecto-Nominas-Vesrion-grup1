-- MySQL dump 10.13  Distrib 8.0.25, for Linux (x86_64)
--
-- Host: localhost    Database: permanente
-- ------------------------------------------------------
-- Server version	8.0.25-0ubuntu0.20.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `antiguedad`
--

DROP TABLE IF EXISTS `antiguedad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `antiguedad` (
  `id` int NOT NULL,
  `id_convenio` int NOT NULL,
  `liquido` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `antiguedad`
--

LOCK TABLES `antiguedad` WRITE;
/*!40000 ALTER TABLE `antiguedad` DISABLE KEYS */;
INSERT INTO `antiguedad` VALUES (1,1,10),(2,1,20),(3,1,30),(4,1,40),(5,1,50),(6,1,60),(7,2,11),(8,2,21),(9,2,31),(10,2,41),(11,2,51),(12,2,61),(13,3,12),(14,3,22),(15,3,32),(16,3,42),(17,3,52),(18,3,62);
/*!40000 ALTER TABLE `antiguedad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `convenio`
--

DROP TABLE IF EXISTS `convenio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `convenio` (
  `id` int NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `convenio`
--

LOCK TABLES `convenio` WRITE;
/*!40000 ALTER TABLE `convenio` DISABLE KEYS */;
INSERT INTO `convenio` VALUES (1,'Hosteleria'),(2,'Industria'),(3,'Informatica');
/*!40000 ALTER TABLE `convenio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salario_base`
--

DROP TABLE IF EXISTS `salario_base`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salario_base` (
  `id` int NOT NULL,
  `id_convenio` int NOT NULL,
  `salario` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salario_base`
--

LOCK TABLES `salario_base` WRITE;
/*!40000 ALTER TABLE `salario_base` DISABLE KEYS */;
INSERT INTO `salario_base` VALUES (1,1,1000),(2,1,2000),(3,1,3000),(4,1,4000),(5,1,5000),(6,1,6000),(7,2,1100),(8,2,2100),(9,2,3100),(10,2,4100),(11,2,5100),(12,2,6200),(13,3,1200),(14,3,2200),(15,3,3200),(16,3,4200),(17,3,5200),(18,3,6200);
/*!40000 ALTER TABLE `salario_base` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trabajador`
--

DROP TABLE IF EXISTS `trabajador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trabajador` (
  `dni` varchar(255) NOT NULL,
  `antiguedad` int NOT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `categoria` int NOT NULL,
  `extras` int NOT NULL,
  `fecha_nacimiento` datetime(6) DEFAULT NULL,
  `irpf` float NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `sexo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trabajador`
--

LOCK TABLES `trabajador` WRITE;
/*!40000 ALTER TABLE `trabajador` DISABLE KEYS */;
INSERT INTO `trabajador` VALUES ('43231815A',1,'Martin',1,50,'1999-01-04 00:00:00.000000',15,'Ismael','H'),('43241915L',2,'Sequera',1,30,'1999-01-04 00:00:00.000000',50,'Marta','M'),('43271865V',4,'Molinos',3,55,'1996-12-30 00:00:00.000000',10,'Jaun','H'),('43431855S',6,'Velazquez',1,0,'2000-01-03 00:00:00.000000',25,'Maria','M'),('43531817B',2,'Cañellas',5,55,'2000-01-03 00:00:00.000000',20,'Miki','H'),('43533815C',3,'sanchez',4,100,'2001-01-01 00:00:00.000000',2,'Ivan','H'),('44231715G',1,'Gonzalez',6,20,'2000-01-03 00:00:00.000000',8,'Carlos','H'),('47231315D',5,'Alcaraz',2,15,'1997-12-29 00:00:00.000000',18,'Marian','M');
/*!40000 ALTER TABLE `trabajador` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-13 17:39:08
