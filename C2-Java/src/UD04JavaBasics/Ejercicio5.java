package UD04JavaBasics;

public class Ejercicio5 {

	public static void main(String[] args) {
		int A=4;
		int B=9;
		int B1=B;
		int C=130;
		int D=29;
		
//		Asignar valores de referencia entre variables
		
		B = C;
		System.out.println("Valor de B:" + B);
		C = A;
		System.out.println("Valor de C:" + C);
		A = D;
		System.out.println("Valor de A:" + A);
		D = B1;
		System.out.println("Valor de D:" + D);
			
	}

}
