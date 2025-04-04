package UD09HerenciaJava.Ej6;

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
