package UD06MétodosArrays;
import java.util.Random;

import javax.swing.JOptionPane;
public class Ejercicio02 {

	public static void main(String[] args) {
		String cantidadNum = JOptionPane.showInputDialog
				("Escribe una cantidad de números: ) ").toLowerCase();
		int cantidad = Integer.parseInt(cantidadNum);
        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            int numeroAleatorio = random.nextInt();
            System.out.println(numeroAleatorio);
            }
        }
        public static int generarNumeroAleatorio(int limiteInferior, int limiteSuperior) {
            Random random = new Random();
            return random.nextInt((limiteSuperior - limiteInferior) + 1) + limiteInferior;
	}
}
