package UD06MétodosArrays;
import javax.swing.JOptionPane;
import java.util.Random;
public class Ejercicio10 {

	public static void main(String[] args) {
		String tamañoStr = JOptionPane.showInputDialog("Introduce el tamaño del array: ");
        int tamaño = Integer.parseInt(tamañoStr);

        int[] array = new int[tamaño];
        rellenarArrayConPrimos(array);
        mostrarArray(array);
        int mayorPrimo = encontrarMayorPrimo(array);
        System.out.println("El mayor número primo en el array es: " + mayorPrimo);
    }

    public static void rellenarArrayConPrimos(int[] array) {
    	String numMin = JOptionPane.showInputDialog("Introduce el tamaño min: ");
        int min = Integer.parseInt(numMin);
        String numMax = JOptionPane.showInputDialog("Introduce el tamaño max: ");
        int max = Integer.parseInt(numMax);
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int num;
            do {
                num = random.nextInt(min, max);
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
