package UD08POO;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio02 {

	public static void main(String[] args) {
		
		class Password {
			protected int longitud;
			protected String contraseña;
			
			private static final int longitud_Defecto = 8;
			
			
			public Password(String contraseña, int longitud) {
                this.contraseña = "";
                this.longitud = longitud_Defecto;               
            }
			
			public Password(int longitud, String contraseña) {
				this.longitud = pedirExtension();
                this.contraseña = contraseñaRandom(longitud);                               
            }
			
			 public int getLongitud() {
	                return longitud;
	            }
	         public void setLongitud(int longitud) {

	                this.longitud = longitud;
	            }
	         public String getContraseña() {
	                return contraseña;
	            }
	         public void setContraseña(String contraseña) {

	                this.contraseña = contraseña;
	        }
		}
	}
	
	public static int pedirExtension() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        return numero;
    }
	
	public static String contraseñaRandom(int numero) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numero; i++) {
            char randomChar = (char) (random.nextInt(94) + 33);
            sb.append(randomChar);
        }

        return sb.toString();
    }
}
