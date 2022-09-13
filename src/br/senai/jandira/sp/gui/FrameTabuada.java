package br.senai.jandira.sp.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import br.senai.jandira.sp.model.Tabuada;

public class FrameTabuada {
	// DefaultListModel model = new DefaultListModel();

	public String titulo;
	public int largura;
	public int altura;

	// Cores e borda

	Color amareloClaro = new Color(255, 255, 224);
	Color verdeFloresta = new Color(34, 139, 34);
	Color amareloEscuro = new Color(255, 215, 0);
	Color azulNovo = new Color(0, 0, 255);
	LineBorder personalizada = new LineBorder(Color.blue, 2);
	LineBorder personalizada2 = new LineBorder(Color.blue, 1);

	// Criação da tela

	public void criarTela() {

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
		// tela.setBounds(altura, altura, 600, 660);

		// Criação Container

		Container painel = tela.getContentPane();

		// Criação imagem
		
        URL url = getClass().getResource("/br/senai/jandira/sp/imagens/menino.PNG");
		ImageIcon logo = new ImageIcon(url);
		JLabel labelImagem = new JLabel(logo);
		labelImagem.setIcon(logo);
		labelImagem.setBounds(0, 5, 100, 100);

		// Criação dos componentes da tela

		JLabel labelTitulo = new JLabel();
		labelTitulo.setText("Tabuada");
		JLabel labelH1 = new JLabel();
		labelH1.setText("Tabuada 1.0");
		labelH1.setBounds(85, -73, 200, 200);
		labelH1.setForeground(Color.red);
		labelH1.setEnabled(true);
		labelH1.setFont(new Font("Arial Black", Font.PLAIN, 25));

		JLabel labelH2 = new JLabel();
		labelH2.setText("Com a tabuada 1.0 os seus problemas acabaram. Calcule" + "");
		labelH2.setBounds(85, 50, 590, 20);
		labelH2.setFont(new Font("Arial", Font.PLAIN, 15));
		labelH2.setForeground(Color.LIGHT_GRAY);
		labelH2.setEnabled(true);

		JLabel labelH3 = new JLabel();
		labelH3.setText("a tabuada que desejar em segundos!" + "");
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

		JTextField textMultiplicando = new JTextField();
		textMultiplicando.setBounds(270, 130, 200, 26);
		textMultiplicando.setBorder(personalizada);
		textMultiplicando.setForeground(azulNovo);
		textMultiplicando.setFont(new Font("Arial", Font.BOLD, 20));
		textMultiplicando.setHorizontalAlignment(JTextField.RIGHT);

		JLabel labelp2 = new JLabel();
		labelp2.setText("Mínimo Multiplicador:");
		labelp2.setBounds(8, 100, 250, 200);
		labelp2.setFont(new Font("Arial", Font.PLAIN, 26));
		labelp2.setForeground(Color.BLACK);
		labelp2.setEnabled(true);

		JTextField textMinimoMultiplicador = new JTextField();
		textMinimoMultiplicador.setBounds(270, 190, 200, 26);
		textMinimoMultiplicador.setBorder(personalizada);
		textMinimoMultiplicador.setForeground(azulNovo);
		textMinimoMultiplicador.setFont(new Font("Arial", Font.BOLD, 20));
		textMinimoMultiplicador.setHorizontalAlignment(JTextField.RIGHT);

		JLabel labelp3 = new JLabel();
		labelp3.setText("Máximo Multiplicador:");
		labelp3.setBounds(8, 160, 250, 200);
		labelp3.setFont(new Font("Arial", Font.PLAIN, 26));
		labelp3.setForeground(Color.BLACK);
		labelp3.setEnabled(true);

		JTextField textMaximoMultiplicador = new JTextField();
		textMaximoMultiplicador.setBounds(270, 250, 200, 26);
		textMaximoMultiplicador.setBorder(personalizada);
		textMaximoMultiplicador.setForeground(azulNovo);
		textMaximoMultiplicador.setFont(new Font("Arial", Font.BOLD, 20));
		textMaximoMultiplicador.setHorizontalAlignment(JTextField.RIGHT);

		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setFont(new Font("Arial Black", Font.BOLD, 20));
		buttonCalcular.setBounds(8, 300, 255, 50);
		buttonCalcular.setContentAreaFilled(false);
		buttonCalcular.setOpaque(true);
		buttonCalcular.setBackground(verdeFloresta);
		buttonCalcular.setForeground(Color.white);
		buttonCalcular.setBorder(personalizada);

		JButton buttonApagar = new JButton();
		buttonApagar.setText("Apagar");
		buttonApagar.setFont(new Font("Arial Black", Font.BOLD, 20));
		buttonApagar.setBounds(270, 300, 200, 50);
		buttonApagar.setContentAreaFilled(false);
		buttonApagar.setOpaque(true);
		buttonApagar.setBackground(amareloEscuro);
		buttonApagar.setForeground(Color.white);
		buttonApagar.setBorder(personalizada);

		JLabel labelp5 = new JLabel();
		labelp5.setText("Resultado:");
		labelp5.setBounds(8, 290, 200, 200);
		labelp5.setFont(new Font("Arial", Font.BOLD, 26));
		labelp5.setForeground(Color.BLACK);
		labelp5.setEnabled(true);

		JList jList = new JList();
		jList.setBackground(amareloClaro);
		jList.setBorder(personalizada2);
		jList.setFont(new Font("Arial", Font.BOLD, 23));
		jList.setForeground(verdeFloresta);

		JScrollPane jScrollPane = new JScrollPane();
		jScrollPane.setViewportView(jList);
		jScrollPane.setBounds(8, 420, 490, 218);

		// Adicionando no painel

		painel.add(labelH1);
		painel.add(labelH2);
		painel.add(labelH3);
		painel.add(labelp1);
		painel.add(labelp2);
		painel.add(labelp3);
		painel.add(textMultiplicando);
		painel.add(textMinimoMultiplicador);
		painel.add(textMaximoMultiplicador);
		painel.add(buttonCalcular);
		painel.add(buttonApagar);
		painel.add(labelp5);
		painel.add(jScrollPane);
		painel.add(labelImagem);
		

		// Deixando Visiveis

		painel.setVisible(true);
		tela.setVisible(true);
		labelTitulo.setVisible(true);
		labelH1.setVisible(true);
		labelImagem.setVisible(true);

		// criando lista

		buttonCalcular.addActionListener(new ActionListener() {

			@Override

			public void actionPerformed(ActionEvent e) {

				if (textMultiplicando.getText().equals("")) {
					JOptionPane.showMessageDialog(jScrollPane, "Insira multiplicando!", "Erro.",
							JOptionPane.ERROR_MESSAGE);
					textMultiplicando.requestFocus();
				} else if (textMinimoMultiplicador.getText().equals("")) {
					JOptionPane.showMessageDialog(jScrollPane, "Insira mínimo multiplicador!", "Erro.",
							JOptionPane.ERROR_MESSAGE);
					textMinimoMultiplicador.requestFocus();
				} else if (textMaximoMultiplicador.getText().equals("")) {
					JOptionPane.showMessageDialog(jScrollPane, "Insira máximo multiplicador!", "Erro.",
							JOptionPane.ERROR_MESSAGE);
					textMaximoMultiplicador.requestFocus();
				} else if (textMultiplicando.getText().matches("[A-Za-z-]+")) {
					JOptionPane.showMessageDialog(jScrollPane, "O multiplicando deve ser um número inteiro!", "Erro.",
							JOptionPane.ERROR_MESSAGE);
				} else if (textMinimoMultiplicador.getText().matches("[A-Za-z-]+")) {
					JOptionPane.showMessageDialog(jScrollPane, "O mínimo multiplicando deve ser um número inteiro", "Erro.",
							JOptionPane.ERROR_MESSAGE);
				} else if (textMaximoMultiplicador.getText().matches("[A-Za-z-]+")) {
					JOptionPane.showMessageDialog(jScrollPane, "O máximo multiplicando deve ser um número inteiro!", "Erro.",
							JOptionPane.ERROR_MESSAGE);
				} else if (Integer.parseInt(textMinimoMultiplicador.getText()) <= Integer
						.parseInt(textMaximoMultiplicador.getText())) {
					// TODO Auto-generated method stub

					Tabuada tabuada3 = new Tabuada();
					tabuada3.multiplicando = Integer.parseInt(textMultiplicando.getText());
					tabuada3.minMultiplicador = Integer.parseInt(textMinimoMultiplicador.getText());
					tabuada3.maxMultiplicador = Integer.parseInt(textMaximoMultiplicador.getText());

					DefaultListModel<String> listj = new DefaultListModel<String>();
					for (String funcionar : tabuada3.getResultado()) {
						listj.addElement(funcionar);
					}
					jList.setModel(listj);
					jScrollPane.getViewport().add(jList);

				} else {

					JOptionPane.showMessageDialog(jScrollPane,
							"Um mínimo multiplicando não pode ser maior do que um máximo multiplicando", "Erro.",
							JOptionPane.ERROR_MESSAGE);
				}

				System.out.println("Saiu!!");
				
			}
		});

		buttonApagar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DefaultListModel<String> listj = new DefaultListModel<String>();
				{

				}
				jList.setModel(listj);
				((DefaultListModel) (jList.getModel())).clear();
				textMultiplicando.setText("");
				textMinimoMultiplicador.setText("");
				textMaximoMultiplicador.setText("");

			}
		});

	}

}
