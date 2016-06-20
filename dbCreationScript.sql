#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------

CREATE DATABASE `databaseProjet` ;

USE `databaseProjet` ;
DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `elementMap`(IN `NumberMap` INT)
    NO SQL
SELECT elementmap.IDelement, elementmap.x, elementmap.y, element.url
FROM elementmap JOIN element ON elementmap.IDelement=element.IDelement
WHERE elementmap.IDmap = NumberMap 
ORDER BY elementmap.y, elementmap.x ASC$$

DELIMITER ;

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `allMap`()
    NO SQL
SELECT map.IDmap
FROM map$$

DELIMITER ;
#------------------------------------------------------------
# Table: element
#------------------------------------------------------------

CREATE TABLE element(
        IDelement   int (11) Auto_increment  NOT NULL ,
        url         Varchar (255) ,
        elementName Varchar (255) ,
        PRIMARY KEY (IDelement )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: map
#------------------------------------------------------------

CREATE TABLE map(
        IDmap   int (11) Auto_increment  NOT NULL ,
        mapName Varchar (255) ,
        width   Int ,
        height  Int ,
        PRIMARY KEY (IDmap )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: elementMap
#------------------------------------------------------------

CREATE TABLE elementMap(
        ID        int (11) Auto_increment  ,
        x         Int ,
        y         Int ,
        IDelement Int NOT NULL ,
        IDmap     Int NOT NULL ,
        PRIMARY KEY (ID )
)ENGINE=InnoDB;

ALTER TABLE elementMap ADD CONSTRAINT FK_elementMap_IDelement FOREIGN KEY (IDelement) REFERENCES element(IDelement);
ALTER TABLE elementMap ADD CONSTRAINT FK_elementMap_IDmap FOREIGN KEY (IDmap) REFERENCES map(IDmap);
