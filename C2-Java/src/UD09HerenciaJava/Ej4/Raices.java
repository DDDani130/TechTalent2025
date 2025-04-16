package UD09HerenciaJava.Ej4;
public class Raices {
	protected double a;
	protected double b;
	protected double c;
	
	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	public double getDiscriminante() {
		return Math.pow(getB(),2) - 4 * getA() * getC();
	}

	public boolean tieneRaices() {
		if (getDiscriminante() > 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean tieneRaiz() {
		if (getDiscriminante() == 0) {
			return true;
		} else {
			return false;
		}
	}
	public void calcular() {
        if (tieneRaices()) {
            System.out.println("La ecuación tiene dos soluciones:");
            obtenerRaices();
        } else if (tieneRaiz()) {
            System.out.println("La ecuación tiene una única solución:");
            obtenerRaiz();
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }
	public void obtenerRaices() {
		System.out.println("Solución 1: " + (-getB() + Math.sqrt(getDiscriminante())) / (2 * getA()));
        System.out.println("Solución 2: " + (-getB() - Math.sqrt(getDiscriminante())) / (2 * getA()));
	}

	public void obtenerRaiz() {
		System.out.println("Solución: " + -getB() / (2 * getA()));
	}
}
