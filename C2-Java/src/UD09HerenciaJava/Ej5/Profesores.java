package UD09HerenciaJava.Ej5;

import java.util.Random;

public class Profesores {

	protected String nombre;
	protected int edad;
	protected char sexo;
	protected String materia;
	
	public Profesores(String nombre, int edad, char sexo, String materia) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.materia = materia;
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

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public boolean polimorfismoP() {
	    Random random = new Random();
	    return random.nextInt(10) >= 2;
	}
}
