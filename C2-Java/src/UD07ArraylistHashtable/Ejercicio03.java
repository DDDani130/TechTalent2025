package UD07ArraylistHashtable;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio03 {

	public static void main(String[] args) {
		ArrayList<ProductosTienda> tienda = new ArrayList<>();

        tienda.add(new ProductosTienda("Manzana", 50, 1.20));
        tienda.add(new ProductosTienda("Pan", 30, 0.90));
        tienda.add(new ProductosTienda("Leche", 20, 1.50));
        tienda.add(new ProductosTienda("Huevos", 40, 2.30));
        tienda.add(new ProductosTienda("Queso", 15, 3.40));
        tienda.add(new ProductosTienda("Yogur", 25, 0.80));
        tienda.add(new ProductosTienda("Café", 10, 4.50));
        tienda.add(new ProductosTienda("Azúcar", 35, 1.10));
        tienda.add(new ProductosTienda("Arroz", 45, 1.00));
        tienda.add(new ProductosTienda("Pasta", 50, 1.20));

        for (ProductosTienda producto : tienda) {
            System.out.println(producto);
        }
        
        añadirProducto(tienda);

        for (ProductosTienda producto : tienda) {
            System.out.println(producto);
        }
    }
	
	public static void añadirProducto(ArrayList<ProductosTienda> tienda) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del nuevo producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce la cantidad del nuevo producto: ");
        int cantidad = scanner.nextInt();
        System.out.print("Introduce el precio del nuevo producto: ");
        double precio = scanner.nextDouble();

        tienda.add(new ProductosTienda(nombre, cantidad, precio));
        
        scanner.close();
    }
}

class ProductosTienda {
    private String nombre;
    private int cantidad;
    private double precio;

    public ProductosTienda(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public String toString() {
        return nombre + " - Cantidad: " + cantidad + " - Precio: " + precio + "€";
    }
}
