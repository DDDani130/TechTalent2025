package UD09HerenciaJava.Ej6;

import java.util.Random;

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
        protected Random randomPelicula() {
            Random random = new Random();
            String[] peli = mostrarPelicula();
            boolean peliAsignada = true;
            while (peli.length) {
                random.nextInt(peli.length);
                if (peliAsignada) {

                }
            }
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
	public void mostrarDatosPeli() {
		System.out.println("Pelicula: " + nombrePeli);
		System.out.println("Director: " + director);
		System.out.println("Duracion: " + duracion + " minutos");
		System.out.println("Edad minima: " + edadMinima + " años");
		System.out.println("Precio: €" + precioEntrada);
	}
}
