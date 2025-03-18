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

        mostrarProductos(productos);
        
        ArrayList<ProductoCarrito> carrito = llenarCarrito(productos);
        
        double precioCompra = Pago(carrito);
        
        cambioPago(precioCompra, carrito);
    }

    public static void mostrarProductos(ArrayList<Producto> productos) {
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i));
        }
    }

    public static ArrayList<ProductoCarrito> llenarCarrito(ArrayList<Producto> productos) {
        ArrayList<ProductoCarrito> carrito = new ArrayList<>();
        String productoNombre;
        do {
            productoNombre = JOptionPane.showInputDialog("Introduce un producto o 'Pagar':");
            if (!productoNombre.equalsIgnoreCase("Pagar")) {
                String cantidadStr = JOptionPane.showInputDialog("Introduce la cantidad de " + productoNombre + ":");
                int cantidad = Integer.parseInt(cantidadStr);
                Producto producto = buscarProducto(productos, productoNombre);
                if (producto != null) {
                    carrito.add(new ProductoCarrito(producto, cantidad));
                } else {
                    JOptionPane.showMessageDialog(null, "Producto no encontrado.");
                }
            }
        } while (!productoNombre.equalsIgnoreCase("Pagar"));
        return carrito;
    }

    public static Producto buscarProducto(ArrayList<Producto> productos, String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public static double Pago(ArrayList<ProductoCarrito> carrito) {
        String ivaStr = JOptionPane.showInputDialog("Introduce el IVA (21 o 4):");
        int iva = Integer.parseInt(ivaStr);
        double precioTotal = 0.0;

        for (ProductoCarrito productoCarrito : carrito) {
            precioTotal += productoCarrito.getProducto().getPrecio() * productoCarrito.getCantidad();
        }

        double precioCompra = 0.0;
        switch (iva) {
            case 21:
                precioCompra = precioTotal * 1.21;
                break;
            case 4:
                precioCompra = precioTotal * 1.04;
                break;
            default:
                JOptionPane.showMessageDialog(null, "IVA no válido. Se aplicará el 21%. ");
                precioCompra = precioTotal * 1.21;
                break;
        }

        System.out.println("IVA aplicado: " + iva + "%");
        System.out.println("Precio total bruto: " + precioTotal + "€");
        System.out.println("Precio total con IVA: " + precioCompra + "€");
        JOptionPane.showMessageDialog(null, "El precio total de la compra con IVA es: " + precioCompra + "€");
        return precioCompra;
    }

    public static void cambioPago(double precioCompra, ArrayList<ProductoCarrito> carrito) {
        double dineroCliente = 0.0;
        do {
            String dineroClienteStr = JOptionPane.showInputDialog("El precio de la compra es: " + precioCompra + "€. Cuanto quiere pagar:");
            dineroCliente = Double.parseDouble(dineroClienteStr);
            if (dineroCliente < precioCompra) {
                JOptionPane.showMessageDialog(null, "La cantidad es insuficiente. Introduce una cantidad mayor o igual a " + precioCompra + "€.");
            }
        } while (dineroCliente < precioCompra);

        double cambio = dineroCliente - precioCompra;
        int numeroArticulos = carrito.stream().mapToInt(ProductoCarrito::getCantidad).sum();

        System.out.println("Número de artículos comprados: " + numeroArticulos);
        System.out.println("Cantidad pagada: " + dineroCliente + "€");
        System.out.println("Cambio a devolver: " + cambio + "€");
        JOptionPane.showMessageDialog(null, "El cambio es: " + cambio + "€");
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

    public String toString() {
        return nombre + ": " + precio + "€";
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
        return producto.getNombre() + " - Cantidad: " + cantidad + " - Precio: " + (producto.getPrecio() * cantidad) + "€";
    }
}
	

