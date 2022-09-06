package br.senai.jandira.sp.gui;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

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
	tela.getContentPane().setBackground(Color.WHITE);
	tela.setSize(530, 700);
	//tela.setBounds(altura, altura, 600, 660);
	
	
	// Criação Container 
	
	Container painel = tela.getContentPane();	
	
	// Criação dos componentes da tela
	
	
	
	
	
	JLabel labelTitulo = new JLabel();
	labelTitulo.setText("Tabuada");
	BufferedImage icon = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
	JLabel labelH1 = new JLabel();
	labelH1.setText("Tabuada 1.0");
	labelH1.setBounds(85, -73, 200, 200);
	labelH1.setForeground(Color.red);
	labelH1.setEnabled(true);
	labelH1.setFont(new Font("Arial Black", Font.PLAIN, 25));
	
	
	
	
    JLabel labelH2 = new JLabel();
    labelH2.setText("Com a tabuada 1.0 os seus problemas acabaram. Calcule"
    		+ "");
    labelH2.setBounds(85, 50, 590, 20);
    labelH2.setFont(new Font("Arial", Font.PLAIN, 15));
    labelH2.setForeground(Color.LIGHT_GRAY);
    labelH2.setEnabled(true);
    
    
    JLabel labelH3 = new JLabel();
    labelH3.setText("a tabuada que desejar em segundos!"
    		+ "");
    labelH3.setBounds(85, 70, 590, 20);
    labelH3.setFont(new Font("Arial", Font.PLAIN, 15));
    labelH3.setForeground(Color.LIGHT_GRAY);
    labelH3.setEnabled(true);

    
    JLabel labelp1 = new JLabel();
    labelp1.setText("Multiplicando:");
	labelp1.setBounds(91, 40, 200, 200);
	labelp1.setFont(new Font("Arial", Font.PLAIN, 26));
    labelp1.setForeground(Color.BLACK);
    labelp1.setEnabled(true);
    
    JTextField textp1 = new JTextField();
    textp1.setBounds(270, 130, 200, 26);
    textp1.setBorder(new LineBorder(Color.BLUE));
    
    JLabel labelp2 = new JLabel();
    labelp2.setText("Mínimo Multiplicador:");
	labelp2.setBounds(8, 100, 250, 200);
	labelp2.setFont(new Font("Arial", Font.PLAIN, 26));
    labelp2.setForeground(Color.BLACK);
    labelp2.setEnabled(true);
    
    JTextField textp2 = new JTextField();
    textp2.setBounds(270, 190, 200, 26);
    textp2.setBorder(new LineBorder(Color.BLUE));
    
    JLabel labelp3 = new JLabel();
    labelp3.setText("Máximo Multiplicador:");
	labelp3.setBounds(8, 160, 250, 200);
	labelp3.setFont(new Font("Arial", Font.PLAIN, 26));
    labelp3.setForeground(Color.BLACK);
    labelp3.setEnabled(true);
    
    JTextField textp3 = new JTextField();
    textp3.setBounds(270, 250, 200, 26);
    textp3.setBorder(new LineBorder(Color.BLUE));
    

    
    JButton buttonCalcular = new JButton();
	buttonCalcular.setText("Calcular");
	buttonCalcular.setFont(new Font("Arial Black", Font.BOLD, 20));
	buttonCalcular.setBounds(8, 300, 255, 50);
	buttonCalcular.setContentAreaFilled(false);
	buttonCalcular.setOpaque(true);
	buttonCalcular.setBackground(Color.green);
	buttonCalcular.setForeground(Color.white);
	buttonCalcular.setBorder(new LineBorder(Color.BLUE));
	
	JButton buttonApagar = new JButton();
	buttonApagar.setText("Apagar");
	buttonApagar.setFont(new Font("Arial Black", Font.BOLD, 20));
	buttonApagar.setBounds(270, 300, 200, 50);
	buttonApagar.setContentAreaFilled(false);
	buttonApagar.setOpaque(true);
	buttonApagar.setBackground(Color.yellow);
	buttonApagar.setForeground(Color.white);
	buttonApagar.setBorder(new LineBorder(Color.BLUE));
	
	//Adicionando no painel 
	
	painel.add(labelH1);
	painel.add(labelH2);
	painel.add(labelH3);
	painel.add(labelp1);
	painel.add(labelp2);
	painel.add(labelp3);
	painel.add(textp1);
	painel.add(textp2);
	painel.add(textp3);
	painel.add(buttonCalcular);
	painel.add(buttonApagar);
	
	
   // Deixando Visiveis 
	
	painel.setVisible(true);
	tela.setVisible(true);
	labelTitulo.setVisible(true);
	labelH1.setVisible(true);
	
	
	
	
	
	
	
	
	
	}


	
}
