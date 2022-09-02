package br.senai.jandira.sp.model;

import java.util.ArrayList;

import br.senai.jandira.sp.AppTabuada;

public class Tabuada {

	// Declaração de variáveis

	public int multiplicando;
	public int minMultiplicador;
	public int maxMultiplicador;
	public ArrayList<String> conta = new ArrayList<String>();

	public int getTabuada() {
		return multiplicando * minMultiplicador;

	}

	public ArrayList<String> getResultados() {
		while (minMultiplicador > maxMultiplicador) {
			conta.add(multiplicando + "x" + minMultiplicador + "=" + getTabuada());
			minMultiplicador++;
		}

		return conta;

	}
}
