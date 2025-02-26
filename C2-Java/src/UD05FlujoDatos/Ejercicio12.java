package UD05FlujoDatos;
import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String contrasenaCorrecta = "Java";
        int intentosRestantes = 3;
        boolean accesoConcedido = false;
        
        do {
        	System.out.print("Introduce la contraseña: ");
            String contrasenaIngresada = scanner.nextLine();
            
            if (contrasenaIngresada.equals(contrasenaCorrecta)) {
              System.out.println("Enhorabuena, acceso concedido.");
              accesoConcedido = true;
          } else {
              intentosRestantes--;
              if (intentosRestantes > 0) {
                  System.out.println("Contraseña incorrecta. Te quedan " 
                                     + intentosRestantes + " intentos.");
              } else {
                  System.out.println("Has agotado tus intentos. Acceso denegado.");
              }
          }
            
        } while (intentosRestantes > 0 && accesoConcedido==false);
        
        scanner.close();
	}

}
