--Crear tabla de clientes
CREATE DATABASE IF NOT EXISTS ccompraventas;
USE ccompraventas;
CREATE TABLE IF NOT EXISTS clientes (
    DNI_cliente VARCHAR(20) AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    correo VARCHAR(100) NOT NULL UNIQUE,
    telefono VARCHAR(15)
);

-- Inserto un valor para esta tabla clientes

INSERT INTO clientes (nombre, correo, telefono) VALUES
('Daniel', 'jsdjs@dshds,com', '123456789');
('Snaider', 'dsd@dsds.com', '987654321');
('Alba', 'ljhd@dsds.com', '987654321');

--Actualiza los dos nombre de clientes a "Cliente A" y "Cliente B"
UPDATE clientes SET nombre = 'Cliente A' WHERE DNI_cliente = 1;
UPDATE clientes SET nombre = 'Cliente B' WHERE DNI_cliente = 2;