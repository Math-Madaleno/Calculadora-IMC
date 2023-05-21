package com.controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.model.Calculadora;

public class Controler implements ActionListener{
	private JTextField inputAltura;
	private JTextField inputPeso;
	private JTextField resultImc;
	private double altura;
	private double peso;
	
	
	public Controler (JTextField inputAltura, JTextField inputPeso , JTextField resultImc) {
		this.inputAltura = inputAltura;
		this.inputPeso = inputPeso;
		this.resultImc = resultImc;
		
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String txtAltura = inputAltura.getText();
		String txtPeso = inputPeso.getText();
		if(verificarCampos(txtAltura , txtPeso)) {
			Calculadora calc = new Calculadora(this.altura , this.peso);
			String result = calc.calcularImc();
			this.resultImc.setText("" +result);
		}
		else {
			this.resultImc.setText("Valores Inválidos");
		}
	
	}
	private boolean verificarCampos(String txtAltura , String txtPeso) {
		boolean alturaVerificada = verificarAltura(txtAltura);
		System.out.println(alturaVerificada);
		boolean pesoVerificado = verificarPeso(txtPeso);
		
		return alturaVerificada == true && pesoVerificado == true;
		
	}
	private boolean verificarAltura(String txtAltura) {
		if(txtAltura.matches("[0-9]*") && txtAltura.length() >1 && txtAltura.length() <4) {
			
			this.altura = (Double.parseDouble(txtAltura)/100);
			return true;
		}
		else {
			JOptionPane.showMessageDialog(null, "Altura Deve ser Digitada em Centímetros com no Minimo 2 e no máximo 3 caracteres");
			return false;
		}

	}
	private boolean verificarPeso(String txtPeso) {
		
		if(txtPeso.matches("[0-9]*") && txtPeso.length() >1 && txtPeso.length() <4) {
			this.peso = Double.parseDouble(txtPeso);
			return true;
		}
		else {
			JOptionPane.showMessageDialog(null, "Peso Deve ser Digitado em Kg com no Minimo 2 e no máximo 3 caracteres");
			return false;
		}
	}


}
