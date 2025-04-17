package UD09HerenciaJava.Ej5;

import java.util.Random;

public class Estudiantes {
	
	protected String nombre;
	protected int edad;
	protected char sexo;
	protected int calificacion;
	
	public Estudiantes(String nombre, int edad, char sexo, int calificacion) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.calificacion = calificacion;
	}

	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	
	public boolean polimorfismoE() {
	    Random random = new Random();
	    return random.nextBoolean();
	}

}
