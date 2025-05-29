package UD20Maven;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ej8 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Calculadora cambio de monedas");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 150);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(new GridLayout(3, 1));

        JPanel panelCampos = new JPanel();
        JLabel etiquetaCantidad = new JLabel("Cantidad a convertir");
        JTextField campoCantidad = new JTextField(10);
        JLabel etiquetaResultado = new JLabel("Resultado");
        JTextField campoResultado = new JTextField(10);
        campoResultado.setEditable(false);
        panelCampos.add(etiquetaCantidad);
        panelCampos.add(campoCantidad);
        panelCampos.add(etiquetaResultado);
        panelCampos.add(campoResultado);

        JPanel panelBotones = new JPanel();
        JButton botonConvertir = new JButton("Ptas a Euros");
        JButton botonCambiar = new JButton("Cambiar");
        JButton botonBorrar = new JButton("Borrar");
        panelBotones.add(botonConvertir);
        panelBotones.add(botonCambiar);
        panelBotones.add(botonBorrar);

        ventana.add(panelCampos);
        ventana.add(panelBotones);

        ActionListener convertir = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double cantidad = Double.parseDouble(campoCantidad.getText());
                    double resultado = cantidad / 166.386; 
                    campoResultado.setText(String.format("%.2f", resultado));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(ventana, "Introduce un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        };

        botonConvertir.addActionListener(convertir);

        botonCambiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double cantidad = Double.parseDouble(campoCantidad.getText());
                    double resultado = cantidad * 166.386; 
                    campoResultado.setText(String.format("%.2f", resultado));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(ventana, "Introduce un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

     
        botonBorrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                campoCantidad.setText("");
                campoResultado.setText("");
            }
        });

        campoCantidad.addActionListener(convertir);

        ventana.setVisible(true);
    }
}