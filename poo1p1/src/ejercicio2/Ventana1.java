package ejercicio2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Ventana1 extends  JFrame implements ActionListener{
	
	//Declaración de atributos
	private JLabel etiqueta;
	private JButton btnEnviar;
	private JPanel panel;
	private JTextField valX;
	private JTextField valY;
	
	//Constructores 
	
	// constructor vacio
	
	public Ventana1() {
	
		panel = new JPanel();
		panel.setBounds(10, 10, 380, 380);
		
		panel.setBackground(Color. CYAN);
		panel.setLayout(null);
		add(panel);
		
		//super hereda de una clase object
		//super();
		etiqueta = new JLabel("Mi primer programa...");
		etiqueta.setBounds(20, 20, 200, 30);
		panel.add(etiqueta);
		
		etiqueta = new JLabel("X: ");
		etiqueta.setBounds(20, 50, 200, 20);
		panel.add(etiqueta);
		
		
		valX = new JTextField();
		valX.setBounds(40, 100, 200, 20);
		panel.add(valX);
		
		
		etiqueta = new JLabel("Y: ");
		etiqueta.setBounds(20, 100, 200, 20);
		panel.add(etiqueta);
		
		
		valY = new JTextField();
		valY.setBounds(40, 50, 200, 20);
		panel.add(valY);
		
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(50,300, 300, 40);
		btnEnviar.addActionListener(this);
		add(btnEnviar);
		
		
		
		
		setResizable(false);
		setLayout(null);
		setSize(400,400);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	public static void main(String[] args) {
		new Ventana1();
	}
	//Métodos 
	@Override
	public void actionPerformed(ActionEvent e) {
		// aqui se recive los eventos del mause o del teclado
		if(e.getSource()== btnEnviar){
			System.out.print("click del boton\n");
		
			
			
			
			int x = Integer.parseInt(valX.getText());
			int y = Integer.parseInt(valY.getText());
			
			System.out.print("Resultado: "+(x+y));
			JOptionPane.showMessageDialog(null, "resultado: "+(x+y), "titulo", JOptionPane.INFORMATION_MESSAGE);
			
			
			etiqueta = new JLabel("resultado: " +(x+y));
			etiqueta.setBounds(20, 200, 120, 20);
			etiqueta.add(etiqueta);
			
		}
	}
}
