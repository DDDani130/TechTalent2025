package UD07ArraylistHashtable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		int numListas = Integer.parseInt(JOptionPane.showInputDialog
									("Introduce el número de listas:"));
        ArrayList<String> listaNombres = asignarNombres(numListas);
        ArrayList<ArrayList<Double>> listas = new ArrayList<>();
        int primeraListaSize = 0;

        for (int i = 0; i < listaNombres.size(); i++) {
            String nombre = listaNombres.get(i);
            ArrayList<Double> lista;
            if (i == 0) {
                lista = pedirNumeros(nombre);
                primeraListaSize = lista.size();
            } else {
                lista = pedirNumeros(nombre, primeraListaSize);
            }
            listas.add(lista);
        }
        calcularYMostrarMedias(listaNombres, listas);
    }

    public static ArrayList<String> asignarNombres(int numListas) {
        ArrayList<String> listaNombres = new ArrayList<>();
        for (int i = 0; i < numListas; i++) {
            String nombre = JOptionPane.showInputDialog
            					("Introduce el nombre para la lista " + (i + 1) + ":");
            listaNombres.add(nombre);
        }
        return listaNombres;
    }

    public static ArrayList<Double> pedirNumeros(String nombreLista) {
        ArrayList<Double> numeros = new ArrayList<>();
        String input;
        do {
            input = JOptionPane.showInputDialog
            		("Introduce un número del 0 al 10 para la lista " + nombreLista + 
            									" (o Hacer media para terminar):");
            try {
                double numero = Double.parseDouble(input);
                if (numero >= 0 && numero <= 10) {
                    numeros.add(numero);
                } else {
                    JOptionPane.showMessageDialog
                    (null, "Por favor, introduce un número entre 0 y 10.");
                }
            } catch (NumberFormatException e) {
                if (!input.equalsIgnoreCase("Hacer media")) {
                    JOptionPane.showMessageDialog
                    (null, "Entrada no válida. Por favor, introduce un número o Hacer media.");
                }
            }
        } while (!input.equalsIgnoreCase("Hacer media"));
        return numeros;
    }

    public static ArrayList<Double> pedirNumeros(String nombreLista, int size) {
        ArrayList<Double> numeros = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String input = JOptionPane.showInputDialog
            		("Introduce un número del 0 al 10 para la lista " + nombreLista + ":");
            try {
                double numero = Double.parseDouble(input);
                if (numero >= 0 && numero <= 10) {
                    numeros.add(numero);
                } else {
                    JOptionPane.showMessageDialog
                    (null, "Por favor, introduce un número entre 0 y 10.");
                    i--;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog
                (null, "Entrada no válida. Por favor, introduce un número.");
                i--;
            }
        }
        return numeros;
    }

    public static void calcularYMostrarMedias
    (ArrayList<String> listaNombres, ArrayList<ArrayList<Double>> listas) {
        for (int i = 0; i < listas.size(); i++) {
            ArrayList<Double> lista = listas.get(i);
            double suma = 0;
            for (double numero : lista) {
                suma += numero;
            }
            double media = suma / lista.size();
            System.out.println("Lista " + listaNombres.get(i) + ": " + lista);
            System.out.println("La media de la lista " + listaNombres.get(i) + " es: " + media);
        }
    }
}

