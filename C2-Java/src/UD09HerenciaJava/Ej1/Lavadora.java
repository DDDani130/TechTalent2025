package UD09HerenciaJava.Ej1;

import java.util.Scanner;

public class Lavadora extends Electrodomestico{
	
	protected double carga;
	
	private static final double CARGA_DEFECTO = 5;

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {

		this.carga = carga;
	}
	
	public Lavadora() {
		this.precioBase = PRECIOBASE_DEFECTO;
		this.color = COLOR_DEFECTO;
		this.consumoEnergetico = CONSUMOENERGETICO_DEFECTO;
		this.peso = PESO_DEFECTO;
		this.carga = CARGA_DEFECTO;
	}

	public Lavadora(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLOR_DEFECTO;
		this.consumoEnergetico = CONSUMOENERGETICO_DEFECTO;
		this.peso = peso;
		this.carga = CARGA_DEFECTO;
	}
	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
		this.carga = comprobarCarga();
		this.color = comprobarColorL();
		this.consumoEnergetico = comprobarConsumoEnergeticoL();
		this.peso = comprobarPesoL();
		this.precioBase = precioFinalL();	
	}

double precioFinalL() {
	double precio = 0;
	char consumoEnergetico = comprobarConsumoEnergeticoL();
	double peso = comprobarPesoL();
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
	
	if (peso >= 80) {
		precio += 100;
	}else if (peso >= 50 && peso < 80) {
		precio += 80;
	} else if (peso >= 20 && peso < 50) {
		precio += 50;
	}  else if (peso >= 5 && peso < 20) {
        precio += 10;
	}
	if (carga > 30) {
		precio += 50;
	}
	return precio;
}

private double comprobarPesoL() {
	Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un peso entre 5 y 100: ");
    peso = scanner.nextDouble();
    scanner.close();
    return this.peso;
}

private char comprobarConsumoEnergeticoL() {
	Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.print("Ingrese el consumo energético entre A y F: ");
        consumoEnergetico = scanner.nextLine().trim().toUpperCase().charAt(0);
        switch (consumoEnergetico) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':                   
            default:
            	consumoEnergetico ='F';
        }
        scanner.close();
        return this.consumoEnergetico;
    }
}

private String comprobarColorL() {
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
            scanner.close();
            return this.color;
        }
	}
	private double comprobarCarga() {
		int carga;
		Scanner scanner = new Scanner(System.in);
		while (true) {
	        System.out.print("Ingrese una carga igual o superior a 5: ");
	        carga = scanner.nextInt();
	        if (carga >= 5) {
	            this.carga = carga;
	            break;
	        } else {
	            System.out.println("Carga no válida. Intente nuevamente.");
	        }
	    }
		scanner.close();
	    return this.carga;
	}
}
