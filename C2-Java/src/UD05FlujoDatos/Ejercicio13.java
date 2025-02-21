package UD05FlujoDatos;
import javax.swing.JOptionPane;
public class Ejercicio13 {

	public static void main(String[] args) {
		int operando1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer operando (entero):"));
        int operando2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo operando (entero):"));
        String operador = JOptionPane.showInputDialog("Introduce el operador (+, -, *, /, ^, %):");
        
        double resultado = 0;
        boolean operacionValida = true;
        switch (operador) {
            case "+":
                resultado = operando1 + operando2;
                break;
            case "-":
                resultado = operando1 - operando2;
                break;
            case "*":
                resultado = operando1 * operando2;
                break;
            case "/":
                if (operando2 != 0) {
                    resultado = (double) operando1 / operando2;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: No se puede dividir entre cero.");
                    operacionValida = false;
                }
                break;
            case "^":
                resultado = Math.pow(operando1, operando2);
                break;
            case "%":
                if (operando2 != 0) {
                    resultado = operando1 % operando2;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: No se puede calcular el módulo con divisor cero.");
                    operacionValida = false;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operador no válido.");
                operacionValida = false;
                break;
        }
        if (operacionValida) {
            JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
        }

	}

}
