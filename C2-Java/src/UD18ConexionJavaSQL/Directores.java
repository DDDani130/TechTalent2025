package UD18ConexionJavaSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Directores {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/los_directores";
        String user = "root";
        String password = "";

        String sql = "INSERT INTO directores (DNI, nom_apels, DNI_jefe, despacho) VALUES (?, ?, ?, ?)";

        Object[][] directores = {
            {"12345678", "Juan Pérez", null, 1},
            {"23456789", "Ana López", "12345678", 2},
            {"34567890", "Carlos García", "12345678", 3},
            {"45678901", "María Fernández", "23456789", 4},
            {"56789012", "Luis Martínez", "23456789", 5},
            {"67890123", "Elena Gómez", "34567890", 6},
            {"78901234", "Pedro Sánchez", "34567890", 7},
            {"89012345", "Lucía Torres", "45678901", 8},
            {"90123456", "Jorge Ruiz", "45678901", 9},
            {"01234567", "Marta Díaz", "56789012", 10}
        };

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            for (Object[] director : directores) {
                stmt.setString(1, (String) director[0]);
                stmt.setString(2, (String) director[1]);
                
                if (director[2] == null) {
                    stmt.setNull(3, java.sql.Types.VARCHAR);
                } else {
                    stmt.setString(3, (String) director[2]);
                }

                stmt.setInt(4, (int) director[3]);
                stmt.executeUpdate();
            }

            System.out.println("Directores insertados correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
