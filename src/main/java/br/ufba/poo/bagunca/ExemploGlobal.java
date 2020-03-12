package br.ufba.poo.bagunca;

public class ExemploGlobal {
	
	public static double hipotenusa(double a, double b) {
		double a2 = Math.pow(a,  2);
		double b2 = Math.pow(b,  2);
		return Math.sqrt(a2 + b2);
	}
	
	public static void main(String[] args) {
		System.out.println(hipotenusa(3, 4));
	}
}

