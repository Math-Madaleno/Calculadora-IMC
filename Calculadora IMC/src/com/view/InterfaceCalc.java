package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingConstants;

import com.controler.Controler;

import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class InterfaceCalc {

	private JFrame frameImc;
	private JTextField inputAltura;
	private JTextField inputPeso;
	private JTextField resultImc;
	
	/**
	 * @wbp.parser.entryPoint
	 */

	public void inicializar () {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceCalc window = new InterfaceCalc();
					window.create();
					window.frameImc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	private void create (){
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameImc = new JFrame();
		frameImc.setBounds(550, 150, 350, 470);
		frameImc.getContentPane().setBackground(new Color(204, 204, 51));
		frameImc.setTitle("Calculadora IMC");
		frameImc.setResizable(false);
		
		frameImc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameImc.getContentPane().setLayout(null);
		
		JLabel lblAltura = new JLabel("Altura :");
		lblAltura.setForeground(Color.BLACK);
		lblAltura.setHorizontalAlignment(SwingConstants.CENTER);
		lblAltura.setFont(new Font("Arial", Font.PLAIN, 25));
		lblAltura.setBounds(15, 80, 100, 50);
		frameImc.getContentPane().add(lblAltura);
		
		inputAltura = new JTextField();
		inputAltura.setForeground(Color.BLACK);
		inputAltura.setHorizontalAlignment(SwingConstants.CENTER);
		inputAltura.setFont(new Font("Arial", Font.PLAIN, 30));
		inputAltura.setBounds(120, 80, 200, 50);
		frameImc.getContentPane().add(inputAltura);
		inputAltura.setColumns(10);
		
		JLabel lblCalc = new JLabel("IMC");
		lblCalc.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalc.setForeground(Color.BLACK);
		lblCalc.setFont(new Font("Arial", Font.PLAIN, 40));
		lblCalc.setBounds(60, 15, 225, 50);
		frameImc.getContentPane().add(lblCalc);
		
		JLabel lblPeso = new JLabel("Peso :");
		lblPeso.setHorizontalAlignment(SwingConstants.CENTER);
		lblPeso.setForeground(Color.BLACK);
		lblPeso.setFont(new Font("Arial", Font.PLAIN, 25));
		lblPeso.setBounds(15, 170, 100, 50);
		frameImc.getContentPane().add(lblPeso);
		
		inputPeso = new JTextField();
		inputPeso.setHorizontalAlignment(SwingConstants.CENTER);
		inputPeso.setForeground(Color.BLACK);
		inputPeso.setFont(new Font("Arial", Font.PLAIN, 30));
		inputPeso.setColumns(10);
		inputPeso.setBounds(120, 170, 200, 50);
		frameImc.getContentPane().add(inputPeso);
		
		resultImc = new JTextField();
		resultImc.setEditable(false);
		resultImc.setHorizontalAlignment(SwingConstants.CENTER);
		resultImc.setForeground(Color.BLACK);
		resultImc.setFont(new Font("Arial", Font.PLAIN, 20));
		resultImc.setBounds(15, 350, 310, 50);
		frameImc.getContentPane().add(resultImc);
		resultImc.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBackground(new Color(0, 0, 0));
		btnCalcular.setForeground(new Color(204, 204, 51));
		btnCalcular.setFont(new Font("Arial", Font.PLAIN, 30));
		btnCalcular.setBounds(95, 260, 150, 60);
		
		btnCalcular.addMouseListener((MouseListener) new MouseListener () {
			public void mouseClicked(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {
				btnCalcular.setCursor(new Cursor(Cursor.HAND_CURSOR));
				btnCalcular.setBackground(new Color(204, 204, 51));
				btnCalcular.setForeground(Color.BLACK);
				btnCalcular.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnCalcular.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				btnCalcular.setBackground(Color.BLACK);
				btnCalcular.setForeground(new Color(204, 204, 51));
				
			}
			
		});
		btnCalcular.addActionListener(new Controler(inputAltura , inputPeso , resultImc));
		frameImc.getContentPane().add(btnCalcular);
		
		
		
	}
}
