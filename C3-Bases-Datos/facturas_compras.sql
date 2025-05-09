
CREATE DATABASE IF NOT EXISTS ccompraventas;
USE ccompraventas;
CREATE TABLE IF NOT EXISTS facturas_compras (
    N_factura INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE NOT NULL,
    DNI_proveedor VARCHAR(20) NOT NULL,
);