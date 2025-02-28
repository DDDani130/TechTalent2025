package UD06MétodosArrays;
import javax.swing.JOptionPane;

public class Ejercicio06 {

	public static void main(String[] args) {
		String numeroStr = JOptionPane.showInputDialog("Introduce un número entero positivo: ");
        int numero = Integer.parseInt(numeroStr);

        if (numero <= 0) {
            System.out.println("El número debe ser un entero positivo.");
        } else {
            int numeroDeCifras = contarCifras(numero);
            System.out.println("El número " + numero + " tiene " + numeroDeCifras + " cifras.");
        }
    }

    public static int contarCifras(int numero) {
        return String.valueOf(numero).length();
	}

}
