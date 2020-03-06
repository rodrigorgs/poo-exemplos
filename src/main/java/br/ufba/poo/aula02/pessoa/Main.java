package br.ufba.poo.aula02.pessoa;

public class Main {

	public static void main(String[] args) {
		Pessoa fulano = new Pessoa();
		fulano.altura = 1.70;
		fulano.peso = 68.3;
		
		Pessoa sicrano = new Pessoa();
		fulano.altura = 1.60;
		fulano.peso = 72.5;
		
		double imc1 = fulano.imc();
		double imc2 = sicrano.imc();
	}
}
