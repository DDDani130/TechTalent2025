package UD09HerenciaJava.Ej2;

public class Ejercicio02 {

	public static void main(String[] args) {
		Serie[] series = new Serie[5];
        series[0] = new Serie("Breaking Bad", 5, "Drama", "Vince Gilligan");
        series[1] = new Serie("Stranger Things", 4, "Sci-Fi", "Duffer Brothers");
        series[2] = new Serie("The Office", 9, "Comedy", "Greg Daniels");
        series[3] = new Serie("Game of Thrones", 8, "Fantasy", "David Benioff & D.B. Weiss");
        series[4] = new Serie("The Crown", 5, "Historical Drama", "Peter Morgan");

        Videojuego[] videojuegos = new Videojuego[5];
        videojuegos[0] = new Videojuego("The Legend of Zelda", 50, "Adventure", "Nintendo");
        videojuegos[1] = new Videojuego("Minecraft", 100, "Sandbox", "Mojang");
        videojuegos[2] = new Videojuego("The Witcher 3", 200, "RPG", "CD Projekt Red");
        videojuegos[3] = new Videojuego("Fortnite", 0, "Battle Royale", "Epic Games");
        videojuegos[4] = new Videojuego("God of War", 30, "Action", "Santa Monica Studio");
	
        series[1].entregar();
        series[3].entregar();
        videojuegos[0].entregar();
        videojuegos[4].entregar();
        
        contarSeries(series);
        contarVideojuegos(videojuegos);
        compararSeries(series);
        compararVideojuegos(videojuegos);
	}
	public static void contarSeries(Serie[] series) {
        int count = 0;
        for (Serie serie : series) {
            if (serie.isEntregado()) {
                count++;
                serie.devolver();
            }
        }
        System.out.println("Series entregadas: " + count);
    }
	public static void contarVideojuegos(Videojuego[] videojuegos) {
        int count = 0;
        for (Videojuego videojuego : videojuegos) {
            if (videojuego.isEntregado()) {
                count++;
                videojuego.devolver();
            }
        }
        System.out.println("Videojuegos entregados: " + count);
    }
	public static void compararSeries(Serie[] series) {
        Serie maxTemporadasSerie = series[0];

        for (Serie serie : series) {
            if (serie.getTemporadas() > maxTemporadasSerie.getTemporadas()) {
                maxTemporadasSerie = serie;
            }
        }
        System.out.println("Serie con más temporadas:");
        System.out.println(maxTemporadasSerie);
    }
	public static void compararVideojuegos(Videojuego[] videojuegos) {
		Videojuego maxHorasVideojuego = videojuegos[0];

        for (Videojuego videojuego : videojuegos) {
            if (videojuego.getHorasEstimadas() > maxHorasVideojuego.getHorasEstimadas()) {
            	maxHorasVideojuego = videojuego;
            }
        }
        System.out.println("Videojuego con más horas:");
        System.out.println(maxHorasVideojuego);
    }
}
