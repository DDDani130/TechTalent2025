package UD09HerenciaJava.Ej1;

import java.util.Random;

public class Ejercicio01 {

	public static void main(String[] args) {
		
//		Electrodomestico L = new Lavadora();
//		Electrodomestico T = new Television();
//		Electrodomestico E = new Electrodomestico();
		
		Electrodomestico[] electrodomesticos = new Electrodomestico[4];
		rellenarArray(electrodomesticos);
		mostrarPrecio(electrodomesticos);
	}
	
	public static void rellenarArray(Electrodomestico[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomType = random.nextInt(3);
            switch (randomType) {
                case 0:
                    array[i] = new Electrodomestico();
                    break;
                case 1:
                    array[i] = new Lavadora();
                    break;
                case 2:
                    array[i] = new Television();
                    break;
                case 3:
                    array[i] = new Electrodomestico(200, "blanca",'D', 8.5);
                    break;
                case 4:
                    array[i] = new Lavadora(15, "blanca", 'A', 10, 5);
                    break;
                case 5:
                    array[i] = new Television(30, "negra", 'B', 20, 40, true);
                    break;
            }
        }
    }
	
	public static void mostrarPrecio(Electrodomestico[] array) {
		for (int i = 0; i < array.length; i++) {
	        System.out.println("Position " + i + ":");
	        if (array[i] != null) {
	            if (array[i] instanceof Lavadora) {
	                Lavadora lavadora = (Lavadora) array[i];
	                System.out.println("Lavadora: " + lavadora.precioFinalL());
	                System.out.println(lavadora.toString());
	            } else if (array[i] instanceof Television) {
	                Television television = (Television) array[i];
	                System.out.println("Television: " + television.precioFinalT());
	                System.out.println(television.toString());
	            } else if (array[i] instanceof Electrodomestico) {
	                System.out.println("Electrodomestico: " + array[i].precioFinalE());
	                System.out.println(array[i].toString());
	            }
	        } else {
	            System.out.println("Empty position");
	        }
	        System.out.println("-------------------");
	    }
	}
}
