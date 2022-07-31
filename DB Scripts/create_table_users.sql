CREATE TABLE `inventorysystem`.`usertbl` (
  `userPhone` VARCHAR(20) NOT NULL,
  `userName` VARCHAR(45) NULL,
  `userPassword` VARCHAR(45) NULL,
  PRIMARY KEY (`userPhone`),
  UNIQUE INDEX `userPhone_UNIQUE` (`userPhone` ASC) VISIBLE);