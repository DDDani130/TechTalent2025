package UD06MétodosArrays;
import javax.swing.JOptionPane;
import java.util.Random;
public class Ejercicio11 {

	public static void main(String[] args) {
		String tamañoStr = JOptionPane.showInputDialog("Introduce el tamaño de los arrays: ");
        int tamaño = Integer.parseInt(tamañoStr);

        int[] array1 = new int[tamaño];
        int[] array2 = new int[tamaño];

        rellenarArrayConAleatorios(array1, 0, 9);
        array2 = array1.clone();
        rellenarArrayConAleatorios(array2, 0, 9);

        int[] arrayMultiplicado = multiplicarArrays(array1, array2);

        System.out.println("Array 1:");
        mostrarArray(array1);
        System.out.println("Array 2:");
        mostrarArray(array2);
        System.out.println("Array Multiplicado:");
        mostrarArray(arrayMultiplicado);
    }

    public static void rellenarArrayConAleatorios(int[] array, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }
    }

    public static int[] multiplicarArrays(int[] array1, int[] array2) {
        int[] resultado = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            resultado[i] = array1[i] * array2[i];
        }
        return resultado;
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Índice " + i + ": " + array[i]);
        }
	}
}
