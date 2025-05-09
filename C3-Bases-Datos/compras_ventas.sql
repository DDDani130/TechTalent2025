CREATE DATABASE IF NOT EXISTS ccompraventas;
USE ccompraventas;
CREATE TABLE IF NOT EXISTS compras_ventas (
    N_pedido INT AUTO_INCREMENT PRIMARY KEY,
    DNI VARCHAR(20) NOT NULL,
    FOREIGN KEY (DNI) REFERENCES clientes, proveedores(DNI_cliente, DNI_proveedor),
    N_factura INT NOT NULL,
    FOREIGN KEY (N_factura) REFERENCES facturas_ventas, facturas_compras(N_factura, N_factura),
    importe DECIMAL(10, 2) NOT NULL
);