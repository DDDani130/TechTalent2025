--Crear tabla de Proveedores (idem en campos que clientes)

CREATE DATABASE IF NOT EXISTS ccompraventas;
USE ccompraventas;
CREATE TABLE IF NOT EXISTS proveedores (
    DNI_proveedor INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    correo VARCHAR(100) NOT NULL UNIQUE,
    telefono VARCHAR(15)
);

-- Insertar 10 Proveedores para esta tabla

INSERT INTO proveedores (nombre, correo, telefono) VALUES
('Proveedor A', 'jsdjs@dshds,com', '123456789'),
('Proveedor B', 'dsd@dsds.com', '987654321');

-- ELimino un proveedor
DELETE FROM proveedores WHERE `proveedores`.`DNI_proveedor` = 2