DROP SCHEMA IF EXISTS reservation_mgm;

CREATE DATABASE reservation_mgm;

DROP SCHEMA IF EXISTS bg;

CREATE SCHEMA bg;

USE reservation_mgm;


CREATE TABLE hotels (
                        id VARCHAR(50) PRIMARY KEY,
                        name VARCHAR(255) NOT NULL,
                        number_suits INT,
                        address VARCHAR(255),
                        date_init DATE
);

CREATE TABLE suites (
                        id VARCHAR(50) PRIMARY KEY,
                        name VARCHAR(255) NOT NULL,
                        number INT,
                        status VARCHAR(255),
                        hotel VARCHAR(50), -- En este ejemplo, hotelId se almacena como una cadena de caracteres (VARCHAR)
                        price INT,
                        date_status DATE,
                        FOREIGN KEY (hotel) REFERENCES hotels(id)
);


INSERT INTO hotels (id, name, number_suits, address, date_init)
VALUES ('1', 'Hotel Ejemplo 1', 100, 'Calle Ejemplo 123, Ciudad Ejemplo', '2023-11-06');

INSERT INTO hotels (id, name, number_suits, address, date_init)
VALUES ('2', 'Hotel Ejemplo 2', 150, 'Otra Calle 456, Otra Ciudad', '2023-11-07');

INSERT INTO suites (id, name, number, status, hotel, price, date_status)
VALUES ('101', 'Suite de Lujo 1', 5, 'Disponible', '1', 200, '2023-11-06');

INSERT INTO suites (id, name, number, status,  hotel, price, date_status)
VALUES ('102', 'Suite Estándar 1', 10, 'Ocupada', '1', 150, '2023-11-05');

INSERT INTO suites (id, name, number, status,  hotel, price, date_status)
VALUES ('201', 'Suite de Lujo 2', 3, 'Disponible', '2', 220, '2023-11-07');

INSERT INTO suites (id, name, number, status,  hotel, price, date_status)
VALUES ('202', 'Suite Estándar 2', 8, 'Disponible', '2', 180, '2023-11-08');
