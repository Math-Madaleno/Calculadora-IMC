package com.model;

import java.text.DecimalFormat;

public class Calculadora {
	
	private double peso;
	private double altura;
	private double imc;
	private String laudo;
	
	public Calculadora (double altura , double peso) {
		this.altura = altura;
		this.peso = peso;
		
	}
	public String calcularImc() {
		this.imc = peso/(altura*altura);
		System.out.println("Imc : " + this.imc + " - " + this.altura + " - " + this.peso);
		if(imc < 16.9) {
			this.laudo = "Muito Abaixo do Peso";
		}
		else if (this.imc >= 17 && this.imc <= 18.4) {
			this.laudo = "Abaixo do Peso";
		}
		else if (this.imc >= 18.5 && this.imc <= 24.9) {
			this.laudo = "Peso normal";
		}
		else if (this.imc >= 25 && this.imc <= 29.9) {
			this.laudo = "Acima do Peso";
		}
		else if (this.imc >= 30 && this.imc <= 34.9) {
			this.laudo = "Obesidade Grau I";
		}
		else if (this.imc >= 35 && this.imc <= 40) {
			this.laudo = "Obesidade Grau II";
		}
		else if (this.imc > 40) {
			this.laudo = "Obesidade Grau III";
		}
		DecimalFormat format = new DecimalFormat("00.00");
		
		return format.format(this.imc) +  " - " +  this.laudo;
	}
	
	
	
}
