package UD09HerenciaJava.Ej3;

public class Libro {
	protected String ISBN;
	protected String titulo;
	protected String autor;
	protected int numPaginas;
	
	public Libro(String ISBN, String titulo, String autor, int numPaginas) {
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}
	
	public String getISBN() {
        return ISBN;
    }

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	@Override
	public String toString() {
		return "El libro " + titulo + " con " + ISBN + " creado por " + autor + " tiene " + numPaginas + ".";
	}

}
