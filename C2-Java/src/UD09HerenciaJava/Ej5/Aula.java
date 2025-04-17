package UD09HerenciaJava.Ej5;

import java.util.Random;

public class Aula {
	
	public Profesores seleccionarProfesor(Profesores[] profes) {
		Random random = new Random();
	    Profesores profesorSeleccionado = profes[random.nextInt(profes.length)];
		return profesorSeleccionado;
	    	    
	}
	public int asistenciaEstudiantes(Estudiantes[] estudiantes) {
		if (estudiantes == null || estudiantes.length == 0) return 0;

	    int contadorAsistentes = 0;
	    for (Estudiantes estudiante : estudiantes) {
	        if (estudiante.polimorfismoE()) {
	            contadorAsistentes++;
	        }
	    }
	    return contadorAsistentes;
	}
	public void listaAlumnos(Estudiantes[] estudiantes) {

		    System.out.println("Estudiantes aprobados:");
		    for (Estudiantes estudiante : estudiantes) {
		        if (estudiante.polimorfismoE() && estudiante.getCalificacion() >= 5) {
		            System.out.println(estudiante);
		        }
		   }
	}
	
	public void clase () {
		Profesores profesorSeleccionado = seleccionarProfesor(null);
		profesorSeleccionado.polimorfismoP();
		if (profesorSeleccionado == null || !profesorSeleccionado.polimorfismoP()) {
			System.out.println("El profesor no asistirá, se suspende la clase.");
		} else {
			System.out.println("El profesor asistira a clase");
			Estudiantes[] estudiantes = new Estudiantes[10];
			int contadorAsistentes = asistenciaEstudiantes(estudiantes);
			if (contadorAsistentes < estudiantes.length / 2) {
				System.out.println("No hay suficientes alumnos, se suspende la clase.");
	        } else {
	            System.out.println("La clase se llevará a cabo.");
	            listaAlumnos(estudiantes);
	        }
		}
	}
}



