package UD06MétodosArrays;
import javax.swing.JOptionPane;
import java.util.Random;
public class Ejercicio09 {

	public static void main(String[] args) {
		String tamañoStr = JOptionPane.showInputDialog("Introduce el tamaño del array: ");
        int tamaño = Integer.parseInt(tamañoStr);

        int[] array = new int[tamaño];
        rellenarArray(array);
        mostrarArrayYSuma(array);
    }

    public static void rellenarArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(9);
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
