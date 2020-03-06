package br.ufba.poo.aula02.retangulo;

public class Retangulo {
	// atributos
	double altura = 1;
	double largura = 1;
	
	// métodos
	double calculaPerimetro() {
		return 2 * altura + 2 * largura;
	}
	
	double calculaArea() {
		return altura * largura;
	}
	
	double calculaVolume(double h) {
		return calculaArea() * h;
	}
}
