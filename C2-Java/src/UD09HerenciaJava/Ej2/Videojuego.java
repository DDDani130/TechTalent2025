package UD09HerenciaJava.Ej2;

public class Videojuego implements Entregable {
	
	protected String titulo;
	protected int horasEstimadas;
	protected boolean entregado;
	protected String genero;
	protected String compañia;
	
	protected static final int HORAS_ESTIMADAS_DEFECTO = 10;
	protected static final boolean ENTREGADO_DEFECTO = false;
	
	public Videojuego() {
		this.titulo = "";
		this.horasEstimadas = HORAS_ESTIMADAS_DEFECTO;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = "";
		this.compañia = "";
	}
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = "";
		this.compañia = "";
	}
	public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = genero;
		this.compañia = compañia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	
	@Override
	public String toString() {
		return "Título: " + titulo + ", horas estimadas: " + horasEstimadas + ", entregado: " + entregado
				+ ", género: " + genero + ", compañía: " + compañia + ".";
	}
	@Override
	public boolean entregar() {
		entregado = true;
		return true;
	}
	@Override
	public boolean devolver() {
		entregado = false;
		return false;
	}
	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return entregado;
	}
	@Override
	public void compareTo(Object a) {
		// TODO Auto-generated method stub
		
	}

}
