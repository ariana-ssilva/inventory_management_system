CREATE TABLE `producttbl` (
  `prodId` int NOT NULL,
  `prodName` varchar(45) NOT NULL,
  `prodQty` int NOT NULL,
  `prodDesc` varchar(45) DEFAULT NULL,
  `prodCategory` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`prodId`)
) 