package main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyInterface {
	 public static void main(String[] args) {
	        JFrame frame = new JFrame("Mi Aplicación Swing");
	        frame.setSize(400, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        JPanel panel = new JPanel();
	        frame.add(panel);
	        
	        JLabel label = new JLabel("Simplemente una interfaz");
	        panel.add(label);
	        
	        JButton button = new JButton("Cerrar");
	        button.addActionListener(e -> System.exit(0));
	        panel.add(button);

	        frame.setVisible(true);
	    }

}
