package br.senai.jandira.sp.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

import br.senai.jandira.sp.AppTabuada;

public class Tabuada {

	// atributos

	public int multiplicando;
	public int minMultiplicador;
	public int maxMultiplicador;
	public ArrayList<String> tabuada = new ArrayList<String> ();
	
	// métodos 

	public int getTabuada() {
		return multiplicando * minMultiplicador;

	}

	public ArrayList<String> getResultado ()  {
		while (minMultiplicador <= maxMultiplicador) {
			tabuada.add(multiplicando + "x" + minMultiplicador + "=" + getTabuada());
			minMultiplicador++;
		}

		return tabuada;

	

	
		
	}

	
		
	}
		

	
	 
	

