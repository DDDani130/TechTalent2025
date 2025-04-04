package UD09HerenciaJava.Ej6;

import java.util.ArrayList;

import UD07ArraylistHashtable.Producto;

class Cine {
	
	protected String nombrePeli;
	protected double precioEntrada;
	
	public Cine(String nombrePeli, double precioEntrada) {
		this.nombrePeli = nombrePeli;
		this.precioEntrada = 12.99;
	}
	
	public String getNombrePeli() {
		return nombrePeli;
	}
	public void setNombrePeli(String nombrePeli) {
		this.nombrePeli = nombrePeli;
	}
	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

}
public class Ejercicio06 {

	public static void main(String[] args) {
		Cine peli = new Peliculas();
		Cine espect = new Espectador();
		ArrayList<Pelicula> peliculas = new ArrayList<>();
		peliculas.add(new Pelicula("Super Mario Bros. La película", 7, 92, "Aaron Horvath"));
		peliculas.add(new Pelicula("Capitán América: Un nuevo mundo", 12, 118, "Julius Onah"));
		peliculas.add(new Pelicula("Misión: Imposible 8", 12, 163, "Christopher McQuarrie"));
		peliculas.add(new Pelicula("Jurassic World: El renacer", 13, 106, "Gareth Edwards"));
		peliculas.add(new Pelicula("Kraven the Hunter", 18, 126, "J.C. Chandor"));
		peliculas.add(new Pelicula("Lilo & Stitch (2025)", 7, 108, "Dean Fleischer-Camp"));
	}

}
	class Espectador extends Cine {
	
	protected String nombrePersona;
	protected int edad;
	protected double dineroPersona;
	
	public Espectador(String nombrePersona, int edad, double dineroPersona) {
        super(null, 0);
        this.nombrePersona = nombrePersona;
        this.edad = edad;
        this.dineroPersona = dineroPersona;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getDineroPersona() {
		return dineroPersona;
	}

}
	class Peliculas extends Cine {
	
	protected int duracion;
	protected int edadMinima;
	protected String director;
	
	public Peliculas(String nombrePeli, double precioEntrada, int duracion, int edadMinima, String director) {
        super(nombrePeli, precioEntrada);
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;		
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getEdadMinima() {
		return edadMinima;
	}
	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}

}
