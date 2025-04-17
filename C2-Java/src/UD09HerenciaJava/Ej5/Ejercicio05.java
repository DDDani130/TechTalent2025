package UD09HerenciaJava.Ej5;

public class Ejercicio05 {

	public static void main(String[] args) {
		Estudiantes[] estudiantes = new Estudiantes[10];
		estudiantes[0] = new Estudiantes("Juan", 20, 'M', 7);
		estudiantes[1] = new Estudiantes("Maria", 22, 'F', 8);
		estudiantes[2] = new Estudiantes("Pedro", 21, 'M', 9);
		estudiantes[3] = new Estudiantes("Ana", 23, 'F', 6);
		estudiantes[4] = new Estudiantes("Luis", 19, 'M', 5);
		estudiantes[5] = new Estudiantes("Laura", 24, 'F', 10);
		estudiantes[6] = new Estudiantes("Carlos", 25, 'M', 4);
		estudiantes[7] = new Estudiantes("Sofia", 26, 'F', 3);
		estudiantes[8] = new Estudiantes("Javier", 27, 'M', 4);
		estudiantes[9] = new Estudiantes("Elena", 28, 'F', 3);
		
		Profesores[] profes = new Profesores[3];
		profes[0] = new Profesores("Antonio", 40, 'M', "matematicas");
		profes[1] = new Profesores("Lucia", 35, 'F', "filosofia");
		profes[2] = new Profesores("Miguel", 45, 'M', "fisica");

	}
}
