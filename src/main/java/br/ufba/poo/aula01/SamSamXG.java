package br.ufba.poo.aula01;

// FORNECEDOR
public class SamSamXG {
	boolean ligada = true;
	private int volume = 10;
	int canal = 1;
	
	void aumentaVolume() {
		if (volume < 100) {
			volume++;
		}
	}
	
	void diminuiVolume() {
		if (volume > 0) {
			volume--;
		}
	}
	
	int obtemVolume() {
		return volume;
	}
}
