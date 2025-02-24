package UD05FlujoDatos;
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 for (int numero = 1; numero <= 100; numero++) {
	            if (numero % 2 == 0 && numero % 3 == 0) {
	                System.out.println(numero);
	            }
	        }
		 scanner.close();
	}

}
