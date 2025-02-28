package UD06MétodosArrays;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Random;
public class Ejercicio12 {

	public static void main(String[] args) {
		String tamañoStr = JOptionPane.showInputDialog("Introduce el tamaño del array: ");
        int tamaño = Integer.parseInt(tamañoStr);

        int[] numeros = new int[tamaño];
        rellenarArrayConAleatorios(numeros, 1, 300);

        String digitoStr;
        int digito;
        do {
            digitoStr = JOptionPane.showInputDialog("Introduce el dígito final (0-9): ");
            digito = Integer.parseInt(digitoStr);
        } while (digito < 0 || digito > 9);

        int[] numerosFiltrados = filtrarPorDigitoFinal(numeros, digito);

        System.out.println("Array original:");
        mostrarArray(numeros);
        System.out.println("Números que terminan en " + digito + ":");
        mostrarArray(numerosFiltrados);
    }

    public static void rellenarArrayConAleatorios(int[] array, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }
    }

    public static int[] filtrarPorDigitoFinal(int[] array, int digito) {
        ArrayList<Integer> listaFiltrada = new ArrayList<>();
        for (int num : array) {
            if (num % 10 == digito) {
                listaFiltrada.add(num);
            }
        }
        int[] resultado = new int[listaFiltrada.size()];
        for (int i = 0; i < listaFiltrada.size(); i++) {
            resultado[i] = listaFiltrada.get(i);
        }
        return resultado;
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Índice " + i + ": " + array[i]);
        }
	}

}
