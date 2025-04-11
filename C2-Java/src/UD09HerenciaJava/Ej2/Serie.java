package UD09HerenciaJava.Ej2;

public class Serie {
	
	protected String titulo;
	protected int temporadas;
	protected boolean entregado;
	protected String genero;
	protected String creador;
	
	protected static final int TEMPORADAS_DEFECTO = 3;
	protected static final boolean ENTREGADO_DEFECTO = false;
	
	public Serie() {
		this.titulo = "";
		this.temporadas = TEMPORADAS_DEFECTO;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = "";
		this.creador = "";
	}
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.temporadas = TEMPORADAS_DEFECTO;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = "";
		this.creador = creador;
	}
	public Serie(String titulo, int temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", temporadas=" + temporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}

}
