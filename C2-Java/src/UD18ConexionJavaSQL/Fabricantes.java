package UD18ConexionJavaSQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Fabricantes {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/tienda_informatica";
        String user = "root";
        String password = "";

        String sql = "INSERT INTO fabricantes (codigo, nombre) VALUES (?, ?)";

        Object[][] fabricantes = {
            {1, "Asus"},
            {2, "HP"},
            {3, "Lenovo"},
            {4, "Dell"},
            {5, "MSI"},
            {6, "Acer"},
            {7, "Apple"},
            {8, "Gigabyte"},
            {9, "Samsung"},
            {10, "Logitech"}
        };

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            for (Object[] fabricante : fabricantes) {
                stmt.setInt(1, (int) fabricante[0]);
                stmt.setString(2, (String) fabricante[1]);
                stmt.executeUpdate();
            }

            System.out.println("Fabricantes insertados correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

