package controlador;

import modelo.modelo;
import modelo.modeloDAO;

import java.util.List;

public class controlador {
	private modeloDAO clienteDAO;
    private List<modelo> listaClientes;

	public controlador() {
	    this.clienteDAO = new modeloDAO();
	    listaClientes = clienteDAO.obtenerClientes();
	}

	public void agregarCliente(modelo cliente) {
		clienteDAO.agregarCliente(cliente);
	}

	public List<modelo> obtenerClientes() {
		return clienteDAO.obtenerClientes();
	}
	public modelo obtenerClientePorId(int id) {
	    if (listaClientes.isEmpty()) {
	        System.out.println("La lista de clientes está vacía.");
	        return null;
	    }
	    for (modelo cliente : listaClientes) {
	        System.out.println("Comparando ID: " + cliente.getId() + " con " + id);
	        if (cliente.getId() == id) {
	            return cliente;
	        }
	    }
	    System.out.println("No se encontró un cliente con la ID especificada.");
	    return null;
	}
	public void actualizarCliente(modelo cliente) {
		modeloDAO.actualizarCliente(cliente);
	}

	public void eliminarCliente(int id) {
		modeloDAO.eliminarCliente(id);
	}
}
