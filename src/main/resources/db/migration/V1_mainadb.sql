CREATE TABLE `customer` (
    `id` INT PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(100) NOT NULL,
    `address` VARCHAR(255) NOT NULL,
    `phone_number` VARCHAR(20) NOT NULL
) ENGINE=InnoDB;
