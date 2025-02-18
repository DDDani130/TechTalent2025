package UD05FlujoDatos;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) 
        {
        System.out.println("El número " + numero + 
        		" es divisible entre 2.");
        } 
        else
        {
        System.out.println("El número " + numero + 
        		" no es divisible entre 2.");
        }
        
        scanner.close();
	}

}
