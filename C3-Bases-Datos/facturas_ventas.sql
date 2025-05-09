
CREATE DATABASE IF NOT EXISTS ccompraventas;
USE ccompraventas;
CREATE TABLE IF NOT EXISTS facturas_ventas (
    N_factura INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE NOT NULL,
    DNI_cliente VARCHAR(20) NOT NULL,
    FOREIGN KEY (DNI_cliente) REFERENCES clientes(DNI_cliente)
);