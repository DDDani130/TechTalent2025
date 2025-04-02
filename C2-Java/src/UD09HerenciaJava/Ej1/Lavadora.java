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
		this.color = comprobarColor();
		this.consumoEnergetico = comprobarConsumoEnergetico();
		this.peso = comprobarPeso();
		this.precioBase = precioFinal();
		this.carga = comprobarCarga();
	}

private double precioFinal() {
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

private double comprobarPeso() {
	Scanner scanner = new Scanner(System.in);
    double peso;
    System.out.print("Ingrese un peso entre 0 y 100: ");
    peso = scanner.nextDouble();
    scanner.close();
    return peso;
}

private char comprobarConsumoEnergetico() {
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
        scanner.close();
        return consumo;
    }
}

private String comprobarColor() {
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
            return color;
        }
	}
	private double comprobarCarga() {
		
		
		return carga;		
	}
}
