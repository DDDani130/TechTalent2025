package UD09HerenciaJava.Ej3;

public class Ejercicio03 {

	public static void main(String[] args) {

		Libro libro1 = new Libro("978-3-16-148410-0", "El Quijote", "Miguel de Cervantes", 500);
		Libro libro2 = new Libro("978-1-234-56789-7", "Cien años de soledad", "Gabriel García Márquez", 400);
	
		Libro[] libros = {libro1, libro2};
		
		 mostrarLibros(libros);
		 compararLibros(libro1, libro2);
	}

	 public static void mostrarLibros(Libro[] libros) {
	        for (Libro libro : libros) {
	            System.out.println(libro.toString());
	        }
	}
	 public static void compararLibros(Libro libro1, Libro libro2) {
		    if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
		        System.out.println("El libro con más páginas es:");
		        System.out.println(libro1.toString());
		    } else if (libro1.getNumPaginas() < libro2.getNumPaginas()) {
		        System.out.println("El libro con más páginas es:");
		        System.out.println(libro2.toString());
		    }
		}
}
