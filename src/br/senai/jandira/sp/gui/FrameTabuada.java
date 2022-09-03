package br.senai.jandira.sp.gui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.JLabel;

public class FrameTabuada {
	
	public String titulo;
	public int largura;
	public int altura; 
	
	// Criação da tela 
	
	public void criarTela (){
	
	JFrame tela = new JFrame();
	
	BufferedImage image = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
    tela.setIconImage(image);
	tela.setTitle(titulo);
    tela.setSize(largura, altura);
    tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	tela.setLayout(null);
	tela.getContentPane();
	
	
	// Criação Container 
	
	Container painel = tela.getContentPane();	
	
	// Criação dos componentes da tela
	
	JLabel labelTitulo = new JLabel();
	labelTitulo.setText("Tabuada");
	BufferedImage icon = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
	
	
	
   // Deixando Visiveis 
	
	painel.setVisible(true);
	tela.setVisible(true);
	labelTitulo.setVisible(true);
	
	
	
	
	
	
	
	}
}
