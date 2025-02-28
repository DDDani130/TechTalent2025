package UD06MétodosArrays;
import javax.swing.JOptionPane;
import java.util.Random;
public class Ejercicio10 {

	public static void main(String[] args) {
		String tamañoStr = JOptionPane.showInputDialog("Introduce el tamaño del array: ");
        int tamaño = Integer.parseInt(tamañoStr);

        int[] numeros = new int[tamaño];
        rellenarArrayConPrimos(numeros, 2, 100); // Example range: 2 to 100
        mostrarArray(numeros);
        int mayorPrimo = encontrarMayorPrimo(numeros);
        System.out.println("El mayor número primo en el array es: " + mayorPrimo);
    }

    public static void rellenarArrayConPrimos(int[] array, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int num;
            do {
                num = random.nextInt((max - min) + 1) + min;
            } while (!esPrimo(num));
            array[i] = num;
        }
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Índice " + i + ": " + array[i]);
        }
    }

    public static int encontrarMayorPrimo(int[] array) {
        int mayor = array[0];
        for (int num : array) {
            if (num > mayor) {
                mayor = num;
            }
        }
        return mayor;
	}

}
