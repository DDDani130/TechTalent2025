package UD05FlujoDatos;
import java.util.Scanner;
public class Ejercicio04 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Introduce el radio del círculo: ");
	     String input = scanner.nextLine();
	     double radio = Double.parseDouble(input);
	     double area = Math.PI * Math.pow(radio, 2);
	     System.out.println("El área del círculo es: " + area);
	     scanner.close();
	}

}
