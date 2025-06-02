
import javax.swing.SwingUtilities;

import visual.vista;

public class Ej2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            vista vista = new vista();
            vista.setVisible(true);
        });
    }
}
//CREATE TABLE cliente (
//id int(11) NOT NULL AUTO_INCREMENT,
//nombre varchar(250) DEFAULT NULL,
//apellido varchar(250) DEFAULT NULL,
//direccion varchar(250) DEFAULT NULL,
//dni int(11) DEFAULT NULL,
//fecha date DEFAULT NULL,
//PRIMARY KEY (id)
//);
