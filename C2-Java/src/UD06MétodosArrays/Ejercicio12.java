package UD06MétodosArrays;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la extension del array: ");
        int tamañoArray = scanner.nextInt();
        System.out.print("Introduce el final de los números: ");
        int ultimoDigito = scanner.nextInt();
        
        int array1 [] = new int[tamañoArray];
        
        array1 = randomArray(array1);
        System.out.println("Los valores del Array1 son: ");
        printArray(array1);
        scanner.close();
	}
	public static int[] randomArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(300);
        }
        return array;
	}
	public static int[] creacionArray2(int[] array, int ultimoDigito) {
	    int tamaño2 = 0;
	    for (int i : array) { //creamos un numero para almacenar info, y con :array indicamos que se va a interactuar con el array
	        if (i % 10 == ultimoDigito) {// %10= ultimo digito
	        	tamaño2++;
	        }
	    }

	    int[] array2 = new int[tamaño2];
	    int posicion = 0;
	    for (int i : array) {
	        if (i % 10 == ultimoDigito) {
	            array2[posicion++] = i;
	        }
	    }

	    return array2;
	}
	
	public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
