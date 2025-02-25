package UD05FlujoDatos;
import java.util.Scanner;
public class Ejercicio06 {

	public static void main(String[] args) {
		final double IVA = 0.21;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el precio del producto: ");
        double precio = scanner.nextDouble();

        double precioFinal = precio + (precio * IVA);
        
        System.out.println("El precio final con IVA es: " 
        + precioFinal);
        
        scanner.close();

	}

}
