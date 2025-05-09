CREATE DATABASE IF NOT EXISTS ccompraventas;
USE ccompraventas;
CREATE TABLE IF NOT EXISTS compras_ventas (
    N_pedido INT AUTO_INCREMENT PRIMARY KEY,
    DNI_cliente VARCHAR(20) NOT NULL,
    FOREIGN KEY (DNI_cliente) REFERENCES clientes(DNI_cliente),
    DNI_proveedor VARCHAR(20) NOT NULL,
    FOREIGN KEY (DNI_proveedor) REFERENCES proveedores(DNI_proveedor),
    N_factura_ventas INT NOT NULL,
    FOREIGN KEY (N_factura_ventas) REFERENCES facturas_ventas(N_factura),
    N_factura_compras INT NOT NULL,
    FOREIGN KEY (N_factura_compras) REFERENCES facturas_compras(N_factura),

);