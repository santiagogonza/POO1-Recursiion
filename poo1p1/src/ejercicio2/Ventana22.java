package ejercicio2;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Ventana22 extends JFrame implements ActionListener {
	
	// Declaracion atributos
		private JLabel etiqueta;
		private JButton btnEnviar;
		private JPanel panel;
		private JTextField valX;
		private JTextField valY;
		
		// Contructores
		
		//  Constructor  Vacío
		public Ventana22() {
			panel = new JPanel();
			panel.setBounds(10, 10, 380, 380);
			panel.setBackground(Color.green);
			panel.setLayout(null);
			
			add(panel);
			
			
			etiqueta = new JLabel("Suma de 2 Números");
			etiqueta.setBounds(20, 20, 200, 30);
			panel.add(etiqueta);
			
			etiqueta = new JLabel("X: ");
			etiqueta.setBounds(20, 50, 200, 20);
			panel.add(etiqueta);
			
			valX= new JTextField();
			valX.setBounds(40, 50, 200, 20);
			panel.add(valX);
			
			
			etiqueta = new JLabel("Y: ");
			etiqueta.setBounds(20, 100, 200, 20);
			panel.add(etiqueta);
			
			valY= new JTextField();
			valY.setBounds(40, 100, 200, 20);
			panel.add(valY);
			
			btnEnviar = new JButton("Enviar");
			btnEnviar.setBounds(50, 300, 300, 40);
			btnEnviar.addActionListener(this);
			panel.add(btnEnviar);
			
			setResizable(false);
			setLocationRelativeTo(null);
			setLayout(null);
			
			setSize(400,400);
			
			setVisible(true);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//centrarEnPantalla(); //
			
			
			
		}
		
		// Método para centrar la ventana en la pantalla
	    private void centrarEnPantalla() {
	    	
	        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
	        int height = pantalla.height;
	        int width = pantalla.width;
	        setLocation((width - getSize().width) / 2, (height - getSize().height) / 2);
	        setLocationRelativeTo(null);
	    }
		// Métodos
		
		public static void main(String[] args) {
			new Ventana1();
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
		
			if(e.getSource() == btnEnviar) {
				System.out.println("Clik del Botón");
				
				etiqueta = new JLabel("RESULTADO");
				etiqueta.setBounds(20, 200, 120, 20);
				
				int x = Integer.parseInt(valX.getText());
				int y = Integer.parseInt(valY.getText());
				
				System.out.println("Resultado: " + (x+y));
				JOptionPane.showMessageDialog(null, "Resultado: " + (x+y), "Titulo",JOptionPane.INFORMATION_MESSAGE);
			}
		}

}
