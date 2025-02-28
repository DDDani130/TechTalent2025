package UD06MétodosArrays;
import javax.swing.JOptionPane;
public class Ejercicio03 {

	public static void main(String[] args) {
		String numeroStr = JOptionPane.showInputDialog("Introduce un número: ");
        int numero = Integer.parseInt(numeroStr);

        boolean esPrimo = esNumeroPrimo(numero);
        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
            }
        }
        public static boolean esNumeroPrimo(int numero) {
            if (numero <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
	}
}
