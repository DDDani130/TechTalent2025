package UD05FlujoDatos;
import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Escribe un día de la semana en castellano: ");
        String dia = scanner.nextLine().toLowerCase();
        switch (dia) {
            case "lunes":
            case "martes":
            case "miércoles":            
            case "jueves":
            case "viernes":
                System.out.println("Es un día laboral.");
                break;
            case "sábado":            
            case "domingo":
                System.out.println("No es un día laboral.");
                break;
            case "miercoles":
				System.out.println("Es un día laboral. Te has dejado el acento.");
				break;
            case "sabado":
				System.out.println("No es un día laboral. Te has dejado el acento.");
            default:
                System.out.println("Error.");
                break;
        }
        
        scanner.close();
	}

}
