package br.ufba.poo.aula04;

public class Exercicios {

	public static int somatorio(int n) {
		if (n <= 0) {
			return -1;
		}

		int soma = 0;
		for (int i = 1; i <= n; i++) {
			soma += i;
		}

		return soma;
	}

	public static boolean ehPdf(String nome) {
		return nome.toLowerCase().endsWith(".pdf");
	}

	public static String mascaraSenha(String senha) {
		String mascara = "";
		
		for (int i = 0; i < senha.length(); i++) {
			mascara += "*";
		}
		
		return mascara;
	}
	
	public static void main(String[] args) {
		System.out.println(mascaraSenha(""));
		System.out.println(ehPdf("prova.pdf")); // true
		System.out.println(ehPdf("prova.pdf.html")); // false
		System.out.println(ehPdf("prova.PDF")); // true
	}

}
