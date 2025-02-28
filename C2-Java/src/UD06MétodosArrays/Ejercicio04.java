package UD06MétodosArrays;
import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) {
		 String numeroStr = JOptionPane.showInputDialog("Introduce un número: ");
	        int numero = Integer.parseInt(numeroStr);

	        long factorial = calcularFactorial(numero);
	        System.out.println("El factorial de " + numero + " es " + factorial);
	    }

	    public static long calcularFactorial(int numero) {
	        long resultado = 1;
	        for (int i = 1; i <= numero; i++) {
	            resultado *= i;
	        }
	        return resultado;

	}

}
