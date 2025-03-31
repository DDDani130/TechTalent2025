package UD08POO;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		class Electrodomestico{
			
			protected double precioBase;
			protected String color;
			protected char consumoEnergetico;
			protected double peso;
			
			private static final String COLOR_DEFECTO = "blanco";
			private static final char CONSUMOENERGETICO_DEFECTO = 'F';
			private static final double PRECIOBASE_DEFECTO = 100;
			private static final double PESO_DEFECTO = 5;
			
			
			public double getPrecioBase() {
                return precioBase;
            }
			public void setPrecioBase(double precioBase) {

                this.precioBase = precioBase;
            }
         
			public String getColor() {
				return color;
			}
			public void setColor(String color) {

				this.color = color;
			}
      
			public char getConsumoEnergetico() {
				return consumoEnergetico;
			}
			public void setConsumoEnergetico(char consumoEnergetico) {

				this.consumoEnergetico = consumoEnergetico;
			}
			public double getPeso() {
                return peso;
            }
			public void setPeso(double peso) {

                this.peso = peso;
            }
			
			
			public Electrodomestico() {
				this.precioBase = PRECIOBASE_DEFECTO;
				this.color = COLOR_DEFECTO;
				this.consumoEnergetico = CONSUMOENERGETICO_DEFECTO;
				this.peso = PESO_DEFECTO;
			}
			
			public Electrodomestico(double precioBase, double peso) {
				this.precioBase = precioBase;
				this.color = COLOR_DEFECTO;
				this.consumoEnergetico = CONSUMOENERGETICO_DEFECTO;
				this.peso = peso;
			}
			
			public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
				this.precioBase = precioBase;
				this.color = comprobarColor();
				this.consumoEnergetico = comprobarConsumoEnergetico();
				this.peso = peso;
			}
			
		}

	}
	
	public static String comprobarColor() {
        Scanner scanner = new Scanner(System.in);
        String color;
        while (true) {
            System.out.print("Ingrese un color (blanco, negro, rojo, gris): ");
            color = scanner.nextLine().trim().toLowerCase();
            switch (color) {
                case "blanco":
                case "negro":
                case "rojo":
                case "gris":
                    return color;
                default:
                    System.out.println("Color no disponible. Intente nuevamente.");
            }
        }
    }
	
	public static char comprobarConsumoEnergetico() {
        Scanner scanner = new Scanner(System.in);
        char consumo;
        while (true) {
            System.out.print("Ingrese el consumo energético (A o F): ");
            consumo = scanner.nextLine().trim().toUpperCase().charAt(0);
            switch (consumo) {
                case 'A':
                case 'F':
                    return consumo;
                default:
                    System.out.println("Consumo energético no disponible. Intente nuevamente.");
            }
        }
    }
}

