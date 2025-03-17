package UD07ArraylistHashtable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		ArrayList<Producto> productos = new ArrayList<>();

        productos.add(new Producto("Manzana", 1.20));
        productos.add(new Producto("Pan", 0.90));
        productos.add(new Producto("Leche", 1.50));
        productos.add(new Producto("Huevos", 2.30));
        productos.add(new Producto("Queso", 3.40));
        productos.add(new Producto("Yogur", 0.80));
        productos.add(new Producto("Café", 4.50));
        productos.add(new Producto("Azúcar", 1.10));
        productos.add(new Producto("Arroz", 1.00));
        productos.add(new Producto("Pasta", 1.20));
        productos.add(new Producto("Tomate", 2.00));
        productos.add(new Producto("Aceite", 5.00));
        productos.add(new Producto("Sal", 0.50));
        productos.add(new Producto("Pollo", 6.00));
        productos.add(new Producto("Pescado", 7.50));

        for (Producto producto : productos) {
            System.out.println(producto);
        }

        ArrayList<ProductoCarrito> carrito = hacerCompra(productos);
        calcularPrecioTotal(carrito);
    }

    public static ArrayList<ProductoCarrito> hacerCompra(ArrayList<Producto> productos) {
        ArrayList<ProductoCarrito> carrito = new ArrayList<>();
        String productoNombre;
        do {
            productoNombre = JOptionPane.showInputDialog
            		("Introduce el nombre del producto (o 'Pagar' para terminar):");
            if (!productoNombre.equalsIgnoreCase("Pagar")) {
                String cantidadStr = JOptionPane.showInputDialog
                		("Introduce la cantidad de " + productoNombre + ":");
                int cantidad = Integer.parseInt(cantidadStr);
                Producto producto = buscarProducto(productos, productoNombre);
                if (producto != null) {
                    carrito.add(new ProductoCarrito(producto, cantidad));
                } else {
                    JOptionPane.showMessageDialog(null, "Producto no encontrado.");
                }
            }
        } while (!productoNombre.equalsIgnoreCase("Pagar"));

        System.out.println("Carrito de compra:");
        for (ProductoCarrito item : carrito) {
            System.out.println(item);
        }
        return carrito;
    }

    public static Producto buscarProducto
    (ArrayList<Producto> productos, String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public static void calcularPrecioTotal(ArrayList<ProductoCarrito> carrito) {
        double totalBruto = 0;
        for (ProductoCarrito item : carrito) {
            totalBruto += item.getProducto().getPrecio() * item.getCantidad();
        }

        String ivaStr = JOptionPane.showInputDialog
        		("¿Quiere pagar 21% de IVA o 4% de IVA?");
        double iva = Double.parseDouble(ivaStr) / 100;
        double totalConIva = totalBruto * (1 + iva);

        System.out.println("Precio total bruto: " + totalBruto + " euros");
        System.out.println("IVA aplicado: " + (iva * 100) + "%");
        System.out.println("Precio total con IVA: " + totalConIva + " euros");

        String cantidadPagadaStr = JOptionPane.showInputDialog
        		("Introduce la cantidad de dinero que va a pagar:");
        double cantidadPagada = Double.parseDouble(cantidadPagadaStr);
        double cambio = cantidadPagada - totalConIva;

        System.out.println("Cantidad pagada: " + cantidadPagada + " euros");
        System.out.println("Cambio a devolver: " + cambio + " euros");
        System.out.println("Número de artículos comprados: " + obtenerNumeroArticulos(carrito));
    }

    public static int obtenerNumeroArticulos(ArrayList<ProductoCarrito> carrito) {
        int totalArticulos = 0;
        for (ProductoCarrito item : carrito) {
            totalArticulos += item.getCantidad();
        }
        return totalArticulos;
    }
}

class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + ": " + precio + " euros";
    }
}

class ProductoCarrito {
    private Producto producto;
    private int cantidad;

    public ProductoCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    public String toString() {
        return producto.getNombre() + " - Cantidad: " + cantidad + " - Precio: " + (producto.getPrecio() * cantidad) + " euros";
    }
}

