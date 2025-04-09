package UD09HerenciaJava.Ej1;

import java.util.Scanner;

public class Television extends Electrodomestico{

	protected double resolucion;
	protected boolean sintonizadorTDT;

	private static final double RESOLUCION_DEFECTO = 20;
	private static final boolean SINTONIZADOR_DEFECTO = false;

	public double getResolucion() {
		return resolucion;
	}

	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public Television() {
		this.precioBase = PRECIOBASE_DEFECTO;
		this.color = COLOR_DEFECTO;
		this.consumoEnergetico = CONSUMOENERGETICO_DEFECTO;
		this.peso = PESO_DEFECTO;
		this.resolucion = RESOLUCION_DEFECTO;
		this.sintonizadorTDT = SINTONIZADOR_DEFECTO;
	}

	public Television(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLOR_DEFECTO;
		this.consumoEnergetico = CONSUMOENERGETICO_DEFECTO;
		this.peso = peso;
		this.resolucion = RESOLUCION_DEFECTO;
		this.sintonizadorTDT = SINTONIZADOR_DEFECTO;
	}

	public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion,
			boolean sintonizadorTDT) {
		this.resolucion = comprobarResolucion();
		this.sintonizadorTDT = comprobarSintonizador();
		this.color = comprobarColorT();
		this.consumoEnergetico = comprobarConsumoEnergeticoT();
		this.peso = comprobarPesoT();
		this.precioBase = precioFinalT();

	}
	private double comprobarPesoT() {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Ingrese un peso entre 5 y 100: ");
	    peso = scanner.nextDouble();
	    scanner.close();
	    return this.peso;
	}
	private String comprobarColorT() {
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
	private char comprobarConsumoEnergeticoT() {
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
	private double comprobarResolucion() {
		double resolucion;
		Scanner scanner = new Scanner(System.in);
		while (true) {
	        System.out.print("Ingrese una carga igual o superior a 20: ");
	        resolucion = scanner.nextInt();
	        if (resolucion >= 20) {
	            this.resolucion = resolucion;
	            break;
	        } else {
	            System.out.println("Carga no válida. Intente nuevamente.");
	        }
	    }
		scanner.close();
	    return this.resolucion;
	}

	private boolean comprobarSintonizador() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("¿Tiene sintonizador TDT? (si/no): ");
		String sintonizadorScanner = scanner.nextLine().trim().toLowerCase();
		Boolean sintonizadorTDT;
		if (sintonizadorScanner.equals("si")) {
			sintonizadorTDT = true;
		} else {
			sintonizadorTDT = false;
		}
		scanner.close();
		return sintonizadorTDT;
	}
	private double precioFinalT() {
		double precio = 0;
		char consumoEnergetico = comprobarConsumoEnergeticoT();
		double peso = comprobarPesoT();
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
		if (sintonizadorTDT== true) {
			precio += 50;
		}
		
		if (resolucion > 40) {
			precio = precio *1.3;
		}
		return precio;
	}
}
