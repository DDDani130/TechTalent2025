package UD06MétodosArrays;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;
public class Ejercicio01 {

	public static void main(String[] args) {
        String forma = JOptionPane.showInputDialog("Escribe una de la siguiente "
        		+ "figuras (circulo, cuadrado o trinagulo) "
        		+ "para que calcule su área: ").toLowerCase();
        System.out.println(forma);
		switch (forma) {
		case "circulo":
			double radio = Double.parseDouble(JOptionPane.showInputDialog(
					"Introduce el radio: "));
			double area = areaCirculo(radio);
			JOptionPane.showInternalMessageDialog(null, 
					"El area del circulo es " + area);
			break;
		case "cuadrado":
			double ladoC = Double.parseDouble(JOptionPane.showInputDialog(
					"Introduce el lado: "));
			double areaC = areaCuadrado(ladoC);
			JOptionPane.showInternalMessageDialog(null, 
					"El area del cuadrado es " + areaC);
			break;
		case "triangulo":
			double base = Double.parseDouble(JOptionPane.showInputDialog(
					"Introduce la base: "));
			double ladoT = Double.parseDouble(JOptionPane.showInputDialog(
					"Introduce el lado: "));
			double areaT = areaTriangulo(base, ladoT);
			JOptionPane.showInternalMessageDialog(null, 
					"El area del triangulo es " + areaT);
			break;
		default:
			System.out.println("Error.");
			break;
		}
		
	}

	public static double areaCirculo(double radio) {
		double area = Math.PI * Math.pow(radio, 2);
	    BigDecimal bd = new BigDecimal(area).setScale(2, RoundingMode.HALF_UP);
	    return bd.doubleValue();	}
	public static double areaCuadrado(double ladoC) {
		double areaC =  (ladoC * ladoC);
		BigDecimal bd = new BigDecimal(areaC).setScale(2, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
	public static double areaTriangulo(double base, double ladoT) {
		double areaT = (base * ladoT / 2);
		BigDecimal bd = new BigDecimal(areaT).setScale(2, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
	
}
