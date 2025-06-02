package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class modeloDAO {

	public void agregarCliente(modelo cliente) {
		String sql = "INSERT INTO cliente (id, nombre, apellido, direccion, dni, fecha) VALUES (?, ?, ?, ?, ?, ?)";
		try (Connection conn = conexion.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, cliente.getId());
			stmt.setString(2, cliente.getNombre());
			stmt.setString(3, cliente.getApellido());
			stmt.setString(4, cliente.getDireccion());
			stmt.setString(5, cliente.getDni());
			stmt.setString(6, cliente.getFecha());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<modelo> obtenerClientes() {
		List<modelo> clientes = new ArrayList<>();
		String sql = "SELECT * FROM cliente";

		try (Connection conn = conexion.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			while (rs.next()) {
				modelo cliente = new modelo(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido"),
						rs.getString("direccion"), rs.getString("dni"), rs.getString("fecha"));
				clientes.add(cliente);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return clientes;
	}

	public static void actualizarCliente(modelo cliente) {
		String sql = "UPDATE cliente SET nombre = ?, apellido = ?, direccion = ?, dni = ?, fecha = ? WHERE id = ?";
		try (Connection conn = conexion.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, cliente.getNombre());
			stmt.setString(2, cliente.getApellido());
			stmt.setString(3, cliente.getDireccion());
			stmt.setString(4, cliente.getDni());
			stmt.setString(5, cliente.getFecha());
			stmt.setInt(6, cliente.getId());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void eliminarCliente(int id) {
		String sql = "DELETE FROM cliente WHERE id = ?";
		try (Connection conn = conexion.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, id);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
