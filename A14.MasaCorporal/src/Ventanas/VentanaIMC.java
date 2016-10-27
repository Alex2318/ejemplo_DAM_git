package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaIMC extends JFrame{

	private JPanel contentPane;
	private JTextField PesoJText;
	private JTextField EstaturaJText;
	private JTextField IMCJText;
	private String TextPeso;
	private String TextEstatura;
	private String TextIMC;
	private float peso;
	private float estatura;
	private float imc;



	/**
	 * Create the frame.
	 */
	public VentanaIMC() {
		setTitle("Calculadora IMC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 234, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPeso = new JLabel("Masa (kg)");
		lblPeso.setBounds(10, 11, 74, 14);
		contentPane.add(lblPeso);
		
		PesoJText = new JTextField();
		PesoJText.setBounds(10, 47, 198, 20);
		contentPane.add(PesoJText);
		PesoJText.setColumns(10);
		
		JLabel lblEstatura = new JLabel("Estatura (m)");
		lblEstatura.setBounds(10, 88, 117, 14);
		contentPane.add(lblEstatura);
		
		EstaturaJText = new JTextField();
		EstaturaJText.setBounds(10, 123, 198, 20);
		contentPane.add(EstaturaJText);
		EstaturaJText.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular IMC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Convertimos peso (String) en un float
				TextPeso=PesoJText.getText();
				peso=Float.valueOf(TextPeso);
				//Convertimos estatura (String) enn un float
				TextEstatura=EstaturaJText.getText();
				estatura=Float.valueOf(TextEstatura);
				//Calcualar el IMC
				imc=peso/(estatura*estatura);
				//Convertir el float imc en String y sacarlo por pantalla  setText
				TextIMC=String.valueOf(imc);
				IMCJText.setText(TextIMC);
				
				
				
			}
		});
		btnNewButton.setBounds(10, 166, 198, 23);
		contentPane.add(btnNewButton);
		
		IMCJText = new JTextField();
		IMCJText.setBounds(10, 217, 198, 20);
		contentPane.add(IMCJText);
		IMCJText.setColumns(10);
	}
}
