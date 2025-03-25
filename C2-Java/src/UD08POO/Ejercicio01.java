package UD08POO;

public class Ejercicio01 {

	public static void main(String[] args) {
	        class Persona {
	            protected String nombre;
	            protected int edad;
	            private String DNI;
	            protected char sexo;
	            protected double peso;
	            protected double altura;

	            private static final char SEXO_DEFECTO = 'H';

	            public Persona() {
	                this.nombre = "";
	                this.edad = 0;
	                this.DNI = "";
	                this.sexo = SEXO_DEFECTO;
	                this.peso = 0.0;
	                this.altura = 0.0;
	            }

	            public Persona(String nombre, int edad, char sexo) {
	                this.nombre = nombre;
	                this.edad = edad;
	                this.DNI = "";
	                this.sexo = sexo;
	                this.peso = 0.0;
	                this.altura = 0.0;
	            }

	            public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
	                this.nombre = nombre;
	                this.edad = edad;
	                this.DNI = DNI;
	                this.sexo = sexo;
	                this.peso = peso;
	                this.altura = altura;
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

	            public String getDNI() {
	                return DNI;
	            }

	            public void setDNI(String DNI) {
	                this.DNI = DNI;
	            }

	            public char getSexo() {
	                return sexo;
	                }
	            public void setSexo(char sexo) {
	                this.sexo = sexo;
	            }

	            public double getPeso() {
	                return peso;
	            }

	            public void setPeso(double peso) {
	                this.peso = peso;
	            }

	            public double getAltura() {
	                return altura;
	            }

	            public void setAltura(double altura) {
	                this.altura = altura;
	            }
	        }
	    }
	}
		    
