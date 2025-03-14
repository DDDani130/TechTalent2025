package UD06MétodosArrays;
import javax.swing.JOptionPane;

public class Ejercicio08 {

	public static void main(String[] args) {
		int[] array = new int[10];
        rellenarValores(array);
        mostrarValores(array);
    }

    public static void rellenarValores(int[] array) {
        for (int i = 0; i < array.length; i++) {
            String numeroStr = JOptionPane.showInputDialog("Introduce un número para la posición " + i + ": ");
            array[i] = Integer.parseInt(numeroStr);
        }
    }

    public static void mostrarValores(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Índice " + i + ": " + array[i]);
        }
	}
}
