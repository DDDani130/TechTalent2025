package UD06MétodosArrays;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la extension del array: ");
        int tamañoArray = scanner.nextInt();
        int tamaño2 = 0;
        int array1 [] = new int[tamañoArray];
        
        array1 = randomArray(array1);      
        System.out.println("Los valores del Array1 son: ");
        printArray(array1);
        
        int ultimoDigito;
        do {
            System.out.print("Introduce el final de los números (0-9): ");
            ultimoDigito = scanner.nextInt();
            if (ultimoDigito < 0 || ultimoDigito > 9) {
                System.out.println("El número introducido no es válido.");
            }
        } while (ultimoDigito < 0 || ultimoDigito > 9);
        
        int[] array2 = creacionArray2(array1, ultimoDigito);
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

	    int[] array2 = new int[tamaño2]; //creamos un array con el tamaño adquirido antes
	    int posicion = 0;
	    for (int i : array) { //bucle en el que asignamos a cada hueco un valor seleccionado
	        if (i % 10 == ultimoDigito) {
	            array2[posicion++] = i;
	        }
	    }
	    if ( tamaño2 > 0) {
	        System.out.println("Los valores del Array2 son: ");
	        printArray(array2);
	        }
	        else {
	        	System.out.print("No hay valores para el Array2");
	        }
	    return array2;
	}
	
	public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
