package br.ufba.poo.aula02.pessoa;

public class Pessoa {
	double altura;
	double peso;
	boolean ehAdulto = true;

	double imc() {
		return peso / (altura * altura);
	}
}
