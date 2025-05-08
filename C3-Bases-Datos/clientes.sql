--Crear tabla de clientes
CREATE DATABASE IF NOT EXISTS ccompraventas;
USE ccompraventas;
CREATE TABLE IF NOT EXISTS clientes (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    correo VARCHAR(100) NOT NULL UNIQUE,
    telefono VARCHAR(15)
);