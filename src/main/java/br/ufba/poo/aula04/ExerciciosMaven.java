package br.ufba.poo.aula04;

import org.apache.commons.lang3.StringUtils;

public class ExerciciosMaven {

	public static String mascaraSenha(String senha) {
		return StringUtils.repeat('*', senha.length());
	}
	
	public static String corrigeEstado(String estado) {
		estado = estado.toUpperCase();
		String[] estados = {"ACRE", "ALAGOAS", "AMAPÁ", "AMAZONAS", "BAHIA", "CEARÁ", "DISTRITO FEDERAL", "ESPÍRITO SANTO", "GOIÁS", "MARANHÃO", "MATO GROSSO", "MATO GROSSO DO SUL", "MINAS GERAIS", "PARÁ", "PARAÍBA", "PARANÁ", "PERNAMBUCO", "PIAUÍ", "RIO DE JANEIRO", "RIO GRANDE DO NORTE", "RIO GRANDE DO SUL", "RONDÔNIA", "RORAIMA", "SANTA CATARINA", "SÃO PAULO", "SERGIPE", "TOCANTINS"};
		
		for (String s : estados) {
			if (StringUtils.getLevenshteinDistance(s, estado) <= 2) {
				return s;
			}
		}
		
		return "";
	}
	
	
	public static void main(String[] args) {
		System.out.println(corrigeEstado("baia"));
		System.out.println(corrigeEstado("piauy"));
	}
}
