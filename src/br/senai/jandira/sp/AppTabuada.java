package br.senai.jandira.sp;
import br.senai.jandira.sp.gui.FrameTabuada;

import br.senai.jandira.sp.model.Tabuada;

public class AppTabuada {

	public static void main(String[] args) {
		
		FrameTabuada tela = new FrameTabuada();
		tela.titulo = "Tabuada 1.0";
		tela.altura = 600;
		tela.largura = 500;
		tela.criarTela(); 
		
	    
	Tabuada tabuada2 = new Tabuada ();
	System.out.println("TabuadaDo2");
	tabuada2.multiplicando = 2;
	tabuada2.minMultiplicador = 4;
	tabuada2.maxMultiplicador = 11;
	
	System.out.println(tabuada2.getTabuada());
	System.out.println(tabuada2.getResultado());
	
		
		
		
	}

}
