package UD18ConexionJavaSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Articulos {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/tienda_informatica";
        String user = "root";
        String password = "";

        String sql = "INSERT INTO articulos (codigo, nombre, precio, fabricante) VALUES (?, ?, ?, ?)";

        Object[][] articulos = {
            {101, "Portátil ZenBook", 1200, 1},
            {102, "Monitor 27\"", 300, 9},
            {103, "Teclado Mecánico", 100, 10},
            {104, "Raton Gaming", 60, 10},
            {105, "Placa Base Z490", 250, 8},
            {106, "Disco SSD 1TB", 150, 9},
            {107, "Impresora Láser", 200, 2},
            {108, "All-in-One", 950, 4},
            {109, "MacBook Pro", 1800, 7},
            {110, "Torre Gaming", 1300, 5}
        };

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            for (Object[] articulo : articulos) {
                stmt.setInt(1, (int) articulo[0]);
                stmt.setString(2, (String) articulo[1]);
                stmt.setInt(3, (int) articulo[2]);
                stmt.setInt(4, (int) articulo[3]);
                stmt.executeUpdate();
            }

            System.out.println("Artículos insertados correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
