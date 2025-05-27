package UD19SwingAWT;

import javax.swing.*;

public class Ej01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Saludador");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Escribe un nombre para saludar");
        label.setBounds(100, 20, 250, 30);
        frame.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(100, 60, 200, 25);
        frame.add(textField);

        JButton button = new JButton("¡Saludar!");
        button.setBounds(150, 100, 100, 30);
        frame.add(button);

        button.addActionListener(e -> {
            String nombre = textField.getText();
            JOptionPane.showMessageDialog(frame, "¡Hola " + nombre + "!");
        });

        frame.setVisible(true);
    }
}
