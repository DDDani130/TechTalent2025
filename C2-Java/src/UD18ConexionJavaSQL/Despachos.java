package UD18ConexionJavaSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Despachos {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/los_directores";
        String user = "root";
        String password = "";

        String sql = "INSERT INTO despachos (numero, capacidad) VALUES (?, ?)";

        int[][] despachos = {
            {1, 10},
            {2, 15},
            {3, 20},
            {4, 25},
            {5, 30},
            {6, 35},
            {7, 40},
            {8, 45},
            {9, 50},
            {10, 55}
        };

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            for (int[] despacho : despachos) {
                stmt.setInt(1, despacho[0]);
                stmt.setInt(2, despacho[1]);
                stmt.executeUpdate();
            }

            System.out.println("Despachos insertados correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
