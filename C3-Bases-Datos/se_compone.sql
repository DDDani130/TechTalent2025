CREATE DATABASE IF NOT EXISTS ccompraventas;
USE ccompraventas;
CREATE TABLE IF NOT EXISTS se_compone (
    cantidad INT NOT NULL,
    N_pedido INT NOT NULL,
    FOREIGN KEY (N_pedido) REFERENCES compras_ventas(N_pedido),
    N_serie INT NOT NULL,
    FOREIGN KEY (N_serie) REFERENCES productos(N_serie)
);