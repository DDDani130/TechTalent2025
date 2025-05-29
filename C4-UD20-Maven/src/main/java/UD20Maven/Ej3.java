package UD20Maven;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ej3 {
    private static int contador1 = 0;
    private static int contador2 = 0;

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ventanuca");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 150);
        ventana.setLocationRelativeTo(null); 
        ventana.setLayout(new BorderLayout());

     
        JLabel etiqueta = new JLabel("Boton 1: 0 veces   Boton 2: 0 veces", JLabel.CENTER);
        ventana.add(etiqueta, BorderLayout.NORTH);

       
        JPanel panelBotones = new JPanel();
        JButton boton1 = new JButton("Boton 1");
        JButton boton2 = new JButton("Boton 2");
        panelBotones.add(boton1);
        panelBotones.add(boton2);
        ventana.add(panelBotones, BorderLayout.CENTER);

        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contador1++;
                etiqueta.setText("Boton 1: " + contador1 + " veces   Boton 2: " + contador2 + " veces");
            }
        });

        boton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contador2++;
                etiqueta.setText("Boton 1: " + contador1 + " veces   Boton 2: " + contador2 + " veces");
            }
        });

        ventana.setVisible(true);
    }
}