package br.ufba.poo.aula02.retangulo;

/** 
 * Esta classe representa um retângulo, que é
 * uma forma geométrica bidimensional, que
 * possui largura e altura, bem como 
 * métodos para calcular área e volume.
 */
public class Retangulo {
	double altura = 1;
	double largura = 1;
	
	/**
	 * Calcula o perímetro, ou seja, a soma dos lados.
	 * @return o perímetro
	 */
	public double calculaPerimetro() {
		return 2 * altura + 2 * largura;
	}
	
	/**
	 * @return a área
	 */
	public double calculaArea() {
		return altura * largura;
	}

	/**
	 * Calcula o volume de um prisma retangular tendo
	 * como <b>base</b> este retângulo. 
	 * @param h altura do prisma
	 * @return o volume do prisma
	 */
	public double calculaVolume(double h) {
		return calculaArea() * h;
	}
}
