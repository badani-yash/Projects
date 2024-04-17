CREATE TABLE `address_dim` (
  `Address_Sk` int NOT NULL,
  `Street_name` varchar(100) DEFAULT NULL,
  `Di_Creation_Date` date DEFAULT NULL,
  `Job_ID` varchar(10) DEFAULT NULL,
  `Longitude` decimal(65,6) DEFAULT NULL,
  `Latitude` decimal(65,6) DEFAULT NULL,
  `City` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Address_Sk`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci


CREATE TABLE `contributing_factor_dim` (
  `Factor_Sk` int NOT NULL,
  `Factor_durable_key` int DEFAULT NULL,
  `Contributing_factor_code` varchar(100) DEFAULT NULL,
  `Start_Date` date DEFAULT NULL,
  `End_Date` date DEFAULT NULL,
  `Active_flag` tinyint DEFAULT NULL,
  `DI_Creation_Date` date NOT NULL,
  `Job_ID` varchar(100) DEFAULT NULL,
  `Contributing_factor` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`Factor_Sk`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

CREATE TABLE `crash_fact` (
  `Crash_Sk` int NOT NULL,
  `Number_of_vehicles_involved` int DEFAULT NULL,
  `Job_ID` varchar(100) DEFAULT NULL,
  `Injuries_without_death` int DEFAULT NULL,
  `Pedestrians_fl` int DEFAULT NULL,
  `Fatality_count` int DEFAULT NULL,
  `Road_user_Fatality_count` int DEFAULT NULL,
  `Motorist_involvement_count` int DEFAULT NULL,
  `Pedestrians_fatality_count` int DEFAULT NULL,
  `DI_CreationDate` date DEFAULT NULL,
  `Date_SK` int NOT NULL,
  `Address_Sk` int NOT NULL,
  `TIme_Sk` int NOT NULL,
  `Crash_Dk` int NOT NULL,
  PRIMARY KEY (`Crash_Sk`),
  KEY `Refdate_dim11` (`Date_SK`),
  KEY `RefAddress_dim21` (`Address_Sk`),
  KEY `RefTime_dim71` (`TIme_Sk`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci


CREATE TABLE `date_dim` (
  `Date_SK` int NOT NULL,
  `Date` date DEFAULT NULL,
  `Day` int DEFAULT NULL,
  `Month` int DEFAULT NULL,
  `Year` int DEFAULT NULL,
  `Day_of_the_week` int DEFAULT NULL,
  `Weekend` int DEFAULT NULL,
  `DI_Creation_date` date DEFAULT NULL,
  `Job_ID` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Date_SK`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci


CREATE TABLE `factor_fact` (
  `Factor_bridge_sk` char(10) NOT NULL,
  `Factor_Sk` int NOT NULL,
  `Crash_Sk` int NOT NULL,
  `DI_Creation_Date` date DEFAULT NULL,
  `Job_ID` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Factor_bridge_sk`),
  KEY `RefCrash_Fact31` (`Crash_Sk`),
  KEY `RefContributing_factor_dim41` (`Factor_Sk`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci


CREATE TABLE `time_dim` (
  `TIme_Sk` int NOT NULL,
  `TIme` time DEFAULT NULL,
  `Hour_of_the_day` int DEFAULT NULL,
  `AM_PM` char(100) DEFAULT NULL,
  `Period` char(100) DEFAULT NULL,
  `Job_ID` char(100) DEFAULT NULL,
  `DI_Creation_Date` date DEFAULT NULL,
  PRIMARY KEY (`TIme_Sk`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci


CREATE TABLE `vehicle_type_dim` (
  `Vehicle_type_Sk` char(10) NOT NULL,
  `DI_Creation_date` date DEFAULT NULL,
  `Job_ID` varchar(10) DEFAULT NULL,
  `Vehicle_type` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Vehicle_type_Sk`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci



CREATE TABLE `vehicle_type_fact` (
  `Vehicle_type_bridge_sk` int NOT NULL,
  `Crash_Sk` int DEFAULT NULL,
  `Vehicle_type_Sk` int DEFAULT NULL,
  `Job_ID` varchar(100) DEFAULT NULL,
  `Di_Creation_Date` date DEFAULT NULL,
  PRIMARY KEY (`Vehicle_type_bridge_sk`),
  KEY `RefCrash_Fact51` (`Crash_Sk`),
  KEY `RefVehicle_type_dim61` (`Vehicle_type_Sk`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci