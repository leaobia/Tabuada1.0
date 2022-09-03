package br.senai.jandira.sp.gui;
import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JLabel;

public class FrameTabuada {
	
	public String titulo;
	public int largura;
	public int altura; 
	
	// Criação da tela 
	
	public void criarTela (){
	
	JFrame tela = new JFrame();
	tela.setTitle(titulo);
    tela.setSize(largura, altura);
	tela.setLayout(null);
	tela.getContentPane();
	
	// Criação Container 
	
	Container painel = tela.getContentPane();	
	
	// Criação dos componentes da tela 
	
	JLabel labelTitulo = new JLabel();
	labelTitulo.setText("Tabuada");
	
	
	
   // Deixando Visiveis 
	
	painel.setVisible(true);
	tela.setVisible(true);
	labelTitulo.setVisible(true);
	
	}
}
