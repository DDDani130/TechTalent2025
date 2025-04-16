package UD09HerenciaJava.Ej4;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		double[] valores = asignarValores();
		Raices raices = new Raices(valores[0], valores[1], valores[2]);
		raices.calcular();
	}
	public static double[] asignarValores() {
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Introduce el valor de a: ");
	    double a = scanner.nextDouble();

	    System.out.print("Introduce el valor de b: ");
	    double b = scanner.nextDouble();

	    System.out.print("Introduce el valor de c: ");
	    double c = scanner.nextDouble();	
	    return new double[]{a, b, c};
	}
}
