package UD06MétodosArrays;
import javax.swing.JOptionPane;

public class Ejercicio07 {

	public static void main(String[] args) {
		String cantidadEurosStr = JOptionPane.showInputDialog("Introduce la cantidad de euros: ");
        double cantidadEuros = Double.parseDouble(cantidadEurosStr);

        String moneda = JOptionPane.showInputDialog("Introduce la moneda a la que quieres convertir (dolares, yenes, libras): ").toLowerCase();

        convertirMoneda(cantidadEuros, moneda);
    }

    public static void convertirMoneda(double cantidadEuros, String moneda) {
        double resultado = 0;
        String nombreMoneda = "";

        switch (moneda) {
            case "dolares":
                resultado = cantidadEuros * 1.28611;
                nombreMoneda = "dólares";
                break;
            case "yenes":
                resultado = cantidadEuros * 129.852;
                nombreMoneda = "yenes";
                break;
            case "libras":
                resultado = cantidadEuros * 0.86;
                nombreMoneda = "libras";
                break;
            default:
                System.out.println("Moneda no reconocida.");
                return;
        }

        System.out.println(cantidadEuros + " euros son " + resultado + " " + nombreMoneda + ".");
	}

}
