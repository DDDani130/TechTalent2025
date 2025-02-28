package UD06MétodosArrays;
import javax.swing.JOptionPane;
import java.util.Random;
public class Ejercicio09 {

	public static void main(String[] args) {
		String tamañoStr = JOptionPane.showInputDialog("Introduce el tamaño del array: ");
        int tamaño = Integer.parseInt(tamañoStr);

        int[] numeros = new int[tamaño];
        rellenarArray(numeros, 0, 9);
        mostrarArrayYSuma(numeros);
    }

    public static void rellenarArray(int[] array, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }
    }

    public static void mostrarArrayYSuma(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Índice " + i + ": " + array[i]);
            suma += array[i];
        }
        System.out.println("La suma de todos los valores es: " + suma);
	}

}
