package UD05FlujoDatos;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce el número de ventas: ");
        int numVentas = scanner.nextInt();
        
        double sumaTotal = 0;
        
        for (int i = 1; i <= numVentas; i++) {
            System.out.print("Introduce el valor de la venta " + i + ": ");
            double venta = scanner.nextDouble();
            sumaTotal += venta;
        }
        
        System.out.println("La suma total de las ventas es: " + sumaTotal);
        
        scanner.close();
	}

}
