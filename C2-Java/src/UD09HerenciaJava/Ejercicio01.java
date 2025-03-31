package UD09HerenciaJava;

import java.util.Scanner;

public class Ejercicio01 {

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
				this.color = comprobarColor();
				this.consumoEnergetico = comprobarConsumoEnergetico();
				this.peso = comprobarPeso();
				this.precioBase = precioFinal();
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
                default:
                    color = "blanco";                   
            }
            return color;
        }
    }
	
	public static char comprobarConsumoEnergetico() {
        Scanner scanner = new Scanner(System.in);
        char consumo;
        while (true) {
            System.out.print("Ingrese el consumo energético entre A y F: ");
            consumo = scanner.nextLine().trim().toUpperCase().charAt(0);
            switch (consumo) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':                   
                default:
                    consumo ='F';
            }
            return consumo;
        }
    }
	
	public static double comprobarPeso() {
	    Scanner scanner = new Scanner(System.in);
	    double peso;
	    System.out.print("Ingrese un peso entre 0 y 100: ");
	    peso = scanner.nextDouble();
	    return peso;
	}
	
	public static double precioFinal() {
		double precio = 0;
		char consumoEnergetico = comprobarConsumoEnergetico();
		double peso = comprobarPeso();
		switch(consumoEnergetico) {
		case 'A':
			precio += 100;
			break;
		case 'B':
            precio += 80;
            break;
        case 'C':
            precio += 60;
            break;
        case 'D':
            precio += 50;
            break;
        case 'E':
            precio += 30;
            break;
        case 'F':
            precio += 10;
            break;	
		}
		
		if (peso >= 0 && peso < 20) {
            precio += 10;
		} else if (peso >= 20 && peso < 50) {
			precio += 50;
		} else if (peso >= 50 && peso < 80) {
			precio += 80;
		} else if (peso >= 80) {
			precio += 100;
		}
		return precio;
	}
}
