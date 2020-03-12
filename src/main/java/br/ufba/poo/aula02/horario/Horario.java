package br.ufba.poo.aula02.horario;

public class Horario {
	int horas;
	int minutos;
	
	void avancaUmMinuto() {
		minutos++;
		if (minutos == 60) {
			minutos = 0;
			horas++;
			if (horas == 24) {
				horas = 0;
			}
		}
	}
	
	void imprime() {
		if (minutos >= 10) {
			System.out.println(horas + ":" + minutos);
		} else {
			System.out.println(horas + ":0" + minutos);
		}
	}
}
