package UD09HerenciaJava.Ej6;

import javax.swing.JOptionPane;

public class Ejercicio06 {

	public static void main(String[] args) {
		String[] peliOpcion =  {"1.Super Mario Bros. La película", "2.Capitán América: Un nuevo mundo", "3.Misión: Imposible 8"} ;
		int eleccion = JOptionPane.showOptionDialog(null, "Selecciona la pelicula que quieres ver:", "Selecciona una Opcion", 
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, peliOpcion, peliOpcion[0]);

		switch (eleccion) {
		case 0 : 
			JOptionPane.showMessageDialog(null, "Has seleccionado: " + "1.Super Mario Bros. La película");
			break;
		case 1 :
			JOptionPane.showMessageDialog(null, "Has seleccionado: " + "2.Capitán América: Un nuevo mundo");
			break;
		case 2 : 
			JOptionPane.showMessageDialog(null, "Has seleccionado: " + "3.Misión: Imposible 8");
			break;
			default: 
				JOptionPane.showMessageDialog(null, "Nos has seleccionado una pelicula");
				break;
		}
		
		comprarEntrada(eleccion, eleccion);
		
	}
	
	public static void comprarEntrada(int edadMinima, double precioEntrada) {
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad:"));

        if (edad < edadMinima) {
            JOptionPane.showMessageDialog(null, "No puedes comprar la entrada. Edad mínima: " + edadMinima);
        } else {
            JOptionPane.showMessageDialog(null, "El precio de la entrada es: " + precioEntrada + "€");
            double dineroPersona = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de dinero que tienes:"));

            if (dineroPersona < precioEntrada) {
                JOptionPane.showMessageDialog(null, "Dinero insuficiente. Necesitas al menos: " + precioEntrada + "€");
            } else {
                double cambio = dineroPersona - precioEntrada;
                JOptionPane.showMessageDialog(null, "Compra realizada con éxito. Tu cambio es: " + cambio + "€");
            }
        }
    }
	
}

