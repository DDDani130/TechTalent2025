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
		precioTotal(electrodomesticos);
	}
	
	public static void rellenarArray(Electrodomestico[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomType = random.nextInt(5);
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
	        System.out.println("Posicion " + i + ":");
	        if (array[i] != null) {
	            if (array[i] instanceof Lavadora) {
	                Lavadora lavadora = (Lavadora) array[i];
	                System.out.println("Lavadora: " + lavadora.precioFinalL());
	            } else if (array[i] instanceof Television) {
	                Television television = (Television) array[i];
	                System.out.println("Television: " + television.precioFinalT());
	            } else if (array[i] instanceof Electrodomestico) {
	                System.out.println("Electrodomestico: " + array[i].precioFinalE());
	            }
	        }
	    }
	}
	
	public static void precioTotal(Electrodomestico[] array) {
	    double precioTotal = 0;

	    for (Electrodomestico electrodomestico : array) {
	        if (electrodomestico != null) {
	            if (electrodomestico instanceof Lavadora) {
	                Lavadora lavadora = (Lavadora) electrodomestico;
	                precioTotal += lavadora.precioFinalL();
	            } else if (electrodomestico instanceof Television) {
	                Television television = (Television) electrodomestico;
	                precioTotal += television.precioFinalT();
	            } else {
	                precioTotal += electrodomestico.precioFinalE();
	            }
	        }
	    }

	    System.out.println("El precio de todos los electrodomesticos: " + precioTotal);
	}
}
