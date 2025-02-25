package UD05FlujoDatos;

public class EjemploCasting {

	public static void main(String[] args) {
		// Casting explícito de double a int
        double otroNumeroDouble = 10.5;
        int otroNumeroEntero = (int) otroNumeroDouble;
        System.out.println("Número double: " + otroNumeroDouble);
        System.out.println("Número entero (después de casting explícito): "
        					+ otroNumeroEntero);
        //Casting explícito de String a char
        String letraString = "A tesxto sduai saod sa";
        char letraChar = (char) letraString.charAt(0);
        System.out.println("String: " + letraChar);
        
        //Casting implícito de int a double
        int numeroEntero = 10;
        double numeroDouble = numeroEntero;
        System.out.println("Número decimal: " + numeroDouble);
        
        //Casting implícito de char a String
        char letraChar2 = 'A';
        String letraString2 = "" + letraChar2;
        System.out.println("String: " + letraString2);
	}

}
