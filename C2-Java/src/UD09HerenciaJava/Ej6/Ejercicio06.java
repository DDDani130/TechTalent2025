package UD09HerenciaJava.Ej6;

import java.util.ArrayList;


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

