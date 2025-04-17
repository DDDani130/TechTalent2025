package UD09HerenciaJava.Ej5;

import java.util.Random;

public class Aula {
	
	public void seleccionarProfesor(Profesores[] profes) {
	    Random random = new Random();
	    int index = random.nextInt(profes.length);
	    Profesores profesorSeleccionado = profes[index];
	    	    
	}
	public void asistenciaEstudiantes(Estudiantes[] estudiantes) {
	    for (Estudiantes estudiante : estudiantes) {

	        boolean asistira = estudiante.polimorfismoE();
	    }
	}
	
	public void clase () {
		seleccionarProfesor(null);
		if (polimorfismoP() == false) {
			System.out.println("El profesor no asistirá, se suspende la clase.");
		} else {
			System.out.println("El profesor asistira a clase");
		}
	}
}



