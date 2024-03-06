DROP DATABASE if exists converterdb;
CREATE DATABASE converterdb;
USE converterdb;

CREATE TABLE currencies(
   id INT NOT NULL AUTO_INCREMENT,
   abbr VARCHAR(3) NOT NULL,
   name VARCHAR(50) NOT NULL,
   rate DECIMAL(10, 4) NOT NULL,
   PRIMARY KEY (id)
);

DROP USER IF EXISTS 'currencyuser';
CREATE USER 'currencyuser'@'localhost' IDENTIFIED BY 'password';

