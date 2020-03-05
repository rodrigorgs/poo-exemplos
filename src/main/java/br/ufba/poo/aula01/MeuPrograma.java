package br.ufba.poo.aula01;

// CLIENTE
public class MeuPrograma {

	public static void main(String[] args) {
		SamSamXG tvDaSala = new SamSamXG();
		tvDaSala.aumentaVolume();
		tvDaSala.aumentaVolume();
		tvDaSala.aumentaVolume();
		tvDaSala.aumentaVolume();
		
		SamSamXG tvDoQuarto = new SamSamXG();
		tvDoQuarto.diminuiVolume();
		tvDoQuarto.diminuiVolume();
		
		System.out.println(tvDaSala.obtemVolume());
		System.out.println(tvDoQuarto.obtemVolume());
	}

}
