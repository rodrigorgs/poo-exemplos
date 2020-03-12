package br.ufba.poo.aula02.horario;

public class ProgramaHorario {

	public static void main(String[] args) {
		Horario h1 = new Horario();
		h1.horas = 23;
		h1.minutos = 59;
		h1.imprime();
		h1.avancaUmMinuto();
		h1.imprime();

		Horario h2 = new Horario();
		h2.horas = 20;
		h2.minutos = 5;
		h2.imprime();
	}

}
