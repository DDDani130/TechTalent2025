package UD05FlujoDatos;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
		
		System.out.println("-- Bienvenido a JAVA --");
		System.out.println("Introduce tu nombre:");
		String nombre = escaner.nextLine();
		escaner.close();
		
		System.out.println("Bienvenido " + nombre.toUpperCase());
		
	}

}
