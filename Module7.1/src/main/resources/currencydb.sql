DROP DATABASE if exists converterdb;
CREATE DATABASE converterdb;
USE converterdb;

CREATE TABLE IF NOT EXISTS currencies(
     id INT NOT NULL AUTO_INCREMENT,
     abbr VARCHAR(3) NOT NULL,
     name VARCHAR(50) NOT NULL,
     rate DECIMAL(10, 4) NOT NULL,
     PRIMARY KEY (id)
);

insert into currencies(abbr, name, rate) values('USD', 'United States Dollar', 1.0);
insert into currencies(abbr, name, rate) values('EUR', 'Euro', 1.0922);
insert into currencies(abbr, name, rate) values('GBP', 'British Pound', 1.2859);
insert into currencies(abbr, name, rate) values('JPY', 'Japanese Yen', 0.0068);
insert into currencies(abbr, name, rate) values('RUB', 'Russian Ruble', 0.0110);
insert into currencies(abbr, name, rate) values('AUD', 'Australian Dollar', 0.6627);
insert into currencies(abbr, name, rate) values('CAD', 'Canadian Dollar', 0.7418);
insert into currencies(abbr, name, rate) values('CHF', 'Swiss Franc', 1.1394);

DROP USER 'appuser'@'localhost';
FLUSH PRIVILEGES;
CREATE USER 'appuser'@'localhost' IDENTIFIED BY 'password';
GRANT SELECT ON converterdb.currencies TO 'appuser'@'localhost';