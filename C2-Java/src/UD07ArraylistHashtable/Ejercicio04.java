package UD07ArraylistHashtable;

import java.util.HashMap;

public class Ejercicio04 {

	public static void main(String[] args) {
		HashMap<String, Integer> cantidadProductos = new HashMap<>();
		HashMap<String, Double> precioProductos = new HashMap<>();

		// Cantidades de productos
		cantidadProductos.put("Manzana", 20);
		cantidadProductos.put("Pan", 15);
		cantidadProductos.put("Leche", 30);
		cantidadProductos.put("Queso", 25);
		cantidadProductos.put("Carne", 10);

		// Precios de productos
		precioProductos.put("Manzana", 1.2);
		precioProductos.put("Pan", 1.0);
		precioProductos.put("Leche", 1.5);
		precioProductos.put("Queso", 3.4);
		precioProductos.put("Carne", 5.6);
		
		mostrarTienda(cantidadProductos, precioProductos);

	}
	
	public static void mostrarTienda(HashMap<String, Integer> cantidadProductos, HashMap<String, Double> precioProductos) {
        int i = 0;
        String[] productos = cantidadProductos.keySet().toArray(new String[0]);

        for (i = 0; i < productos.length; i++) {
            String producto = productos[i];
            int cantidad = cantidadProductos.get(producto);
            double precio = precioProductos.get(producto);
            System.out.println(producto + " || " + precio + "€ || " + cantidad + " unidades");
        }
        
        
    }
}
