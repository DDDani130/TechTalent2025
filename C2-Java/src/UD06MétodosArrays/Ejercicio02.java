package UD06MétodosArrays;

import java.util.Random;
import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Cuantos números aleatorios quieres generar
		String cantidadNum = JOptionPane.showInputDialog
				("Escribe una cantidad de números:  ").toLowerCase();
		int cantidad = Integer.parseInt(cantidadNum);
		//Aqui vamos a pedir los limites inferior y superior con el método pedirLimites()
		int[] limites = pedirLimites();
        int limiteInferior = limites[0];
        int limiteSuperior = limites[1];
        //El usuario ya te ha dado la cantidad de números y los limites inferior y superior
        generarNumerosAleatorios(cantidad, limiteInferior, limiteSuperior);
    }

    public static int[] pedirLimites() {
        String limiteInferiorStr = JOptionPane.showInputDialog
        		("Escribe el límite inferior: ");
        int limiteInferior = Integer.parseInt(limiteInferiorStr);

        String limiteSuperiorStr = JOptionPane.showInputDialog
        		("Escribe el límite superior: ");
        int limiteSuperior = Integer.parseInt(limiteSuperiorStr);

        return new int[]{limiteInferior, limiteSuperior};
    }

    public static void generarNumerosAleatorios(int cantidad, 
    		                                    int limiteInferior, int limiteSuperior) {
        Random random = new Random(); //Creamos un objeto Random entre 0 y el 1
        for (int i = 0; i < cantidad; i++) {
            int numeroAleatorio = random
            		.nextInt((limiteSuperior - limiteInferior) + 1) + limiteInferior;
            System.out.println(numeroAleatorio);
        }
	}
}
