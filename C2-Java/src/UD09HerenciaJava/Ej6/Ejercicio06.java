package UD09HerenciaJava.Ej6;


	class Cine {
	
	protected String nombrePeli;
	protected double precioEntrada;
	
	public Cine(String nombrePeli, double precioEntrada) {
		this.nombrePeli = nombrePeli;
		this.precioEntrada = precioEntrada;
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
		Cine peli = new Peliculas(null, 0, 0, 0, null);
		Cine espect = new Espectador(null, 0, 0);

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
