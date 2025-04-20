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
        if (estudiantes == null || estudiantes.length == 0) {
            System.out.println("No hay estudiantes en la lista.");
            return;
        }

        int aprobadosHombres = 0;
        int aprobadasMujeres = 0;

        for (Estudiantes estudiante : estudiantes) {
            if (estudiante.polimorfismoE() && estudiante.getCalificacion() >= 5) {
                if (estudiante.getSexo() == 'M') {
                    aprobadosHombres++;
                } else if (estudiante.getSexo() == 'F') {
                    aprobadasMujeres++;
                }
            }
        }

        System.out.println("Número de alumnos aprobados: " + aprobadosHombres);
        System.out.println("Número de alumnas aprobadas: " + aprobadasMujeres);
    }

    public void habraClase(Profesores[] profes, Estudiantes[] estudiantes) {

        if (profes == null || profes.length == 0) {
            System.out.println("No hay profesores disponibles, se suspende la clase.");
            return;
        }

        Profesores profesorSeleccionado = seleccionarProfesor(profes);
        if (profesorSeleccionado == null || !profesorSeleccionado.polimorfismoP()) {
            System.out.println("El profesor no asistirá, se suspende la clase.");
        } else {
            System.out.println("El profesor asistirá a clase.");

            if (estudiantes == null || estudiantes.length == 0) {
                System.out.println("No hay estudiantes en la lista.");
                return;
            }

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
 



