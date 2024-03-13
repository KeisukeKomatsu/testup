CREATE TABLE `torihiki` (
	`torihiki_id` INT(10) NOT NULL,
	`user_id` INT(8) NOT NULL,
	`torihiki_type` VARCHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci,
	`amount` DECIMAL(15),
	`torihiki_date` DATETIME,
	PRIMARY KEY (`torihiki_id`)
) ENGINE=InnoDB;