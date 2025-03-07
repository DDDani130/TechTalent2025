package UD06MétodosArrays;
import java.util.Scanner;
import java.util.Random;
public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la extension del array1: ");
        int rangoArray1 = scanner.nextInt();
		
        int array1 [] = new int[rangoArray1];
        int array2 [] = new int[rangoArray1];
        int array3 [] = new int[rangoArray1];
        
        array1 =randomArray1(array1);
//        System.out.println("Los valores del Array1 son: ");
//        for (int num : array1) {
//            System.out.println(num);
//        }
        
        
        
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        array2 = randomArray2(array2);
//        System.out.println("Los valores del Array2 son: ");
//        for (int num : array2) {
//            System.out.println(num);
//        }
        
        array3 = array3Mult(array1, array2);
//        System.out.println("Los valores del Array3 son: ");
//        for (int num : array3) {
//            System.out.println(num);
//        }
        System.out.println("Los valores del Array1 son: ");
        printArray(array1);
        System.out.println("Los valores del Array2 son: ");
        printArray(array2);
        System.out.println("Los valores del Array3 son: ");
        printArray(array3);
        
        scanner.close();
	}
	public static int[] randomArray1(int[] array) {
        Random random = new Random();
        //rangoArray1 equivalente a array.length
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
	}
	
	public static int[] randomArray2(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
        	int multiplicador = random.nextInt(10);
            array[i] = array[i] * multiplicador;
        }
        return array;
    }
	public static int[] array3Mult(int[] array1, int[] array2) {
	    int[] resultArray = new int[array1.length];
	    for (int i = 0; i < array1.length; i++) {
	        resultArray[i] = array1[i] * array2[i];
	    }
	    return resultArray;
	}
	public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
