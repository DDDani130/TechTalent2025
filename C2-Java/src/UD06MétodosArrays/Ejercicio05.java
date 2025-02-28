package UD06MétodosArrays;
import javax.swing.JOptionPane;

public class Ejercicio05 {

	public static void main(String[] args) {
		String numeroStr = JOptionPane.showInputDialog("Introduce un número decimal: ");
        int numero = Integer.parseInt(numeroStr);

        String binario = convertirDecimalABinario(numero);
        System.out.println("El número " + numero + " en binario es " + binario);
    }

    public static String convertirDecimalABinario(int numero) {
        if (numero == 0) {
            return "0";
        }

        StringBuilder binario = new StringBuilder();
        while (numero > 0) {
            int resto = numero % 2;
            binario.insert(0, resto);
            numero /= 2;
        }
        return binario.toString();
	}

}
