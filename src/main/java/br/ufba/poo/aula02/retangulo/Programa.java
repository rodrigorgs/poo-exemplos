package br.ufba.poo.aula02.retangulo;

public class Programa {

	public static void main(String[] args) {
		Retangulo r1 = new Retangulo();
		Retangulo r2 = new Retangulo();
		
		r1.altura = 3;
		r1.largura = 5;
		
		r2.altura = 6;
		r2.largura = 1;
		
		System.out.println(r1.calculaPerimetro());
		System.out.println(r2.calculaPerimetro());
		
		System.out.println(r2.calculaVolume(12));

	}

}
