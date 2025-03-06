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
			double lado = Double.parseDouble(JOptionPane.showInputDialog(
					"Introduce el lado: "));
			double areaC = areaCuadrado(lado);
			JOptionPane.showInternalMessageDialog(null, 
					"El area del cuadrado es " + areaC);
			break;
		case "triangulo":
			double base = Double.parseDouble(JOptionPane.showInputDialog(
					"Introduce la base: "));
			double altura = Double.parseDouble(JOptionPane.showInputDialog(
					"Introduce la altura: "));
			double areaT = areaTriangulo(base, altura);
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
	public static double areaCuadrado(double lado) {
		double areaC =  (lado * lado);
		BigDecimal bd = new BigDecimal(areaC).setScale(2, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
	public static double areaTriangulo(double base, double altura) {
		double areaT = (base * altura / 2);
		BigDecimal bd = new BigDecimal(areaT).setScale(2, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
	
}
