package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class T5 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					T5 window = new T5();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public T5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setMaximumSize(new Dimension(893, 654));
		frame.setResizable(false);
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		Panel panel_1 = new Panel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(238, 232, 170));
		panel_1.setBounds(50, 27, 897, 620);
		panel.add(panel_1);
		
		JLabel lblInserirNovaReceita = new JLabel("Adicionar Nova Receita");
		lblInserirNovaReceita.setHorizontalAlignment(SwingConstants.LEFT);
		lblInserirNovaReceita.setFont(new Font("Ubuntu", Font.PLAIN, 25));
		lblInserirNovaReceita.setBounds(12, 12, 272, 33);
		panel_1.add(lblInserirNovaReceita);
		
		textField = new JTextField();
		textField.setFont(new Font("Ubuntu", Font.PLAIN, 28));
		textField.setColumns(10);
		textField.setBounds(22, 90, 330, 37);
		panel_1.add(textField);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.LEFT);
		lblNome.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		lblNome.setBounds(22, 57, 81, 33);
		panel_1.add(lblNome);
		
		JLabel lblDescrio = new JLabel("Descrição");
		lblDescrio.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescrio.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		lblDescrio.setBounds(22, 139, 182, 33);
		panel_1.add(lblDescrio);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(22, 169, 330, 60);
		panel_1.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(22, 271, 330, 52);
		panel_1.add(textArea_1);
		
		JLabel lblIngredientes = new JLabel("Ingredientes");
		lblIngredientes.setHorizontalAlignment(SwingConstants.LEFT);
		lblIngredientes.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		lblIngredientes.setBounds(22, 241, 182, 33);
		panel_1.add(lblIngredientes);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(22, 365, 330, 52);
		panel_1.add(textArea_2);
		
		JLabel lblModoDePreparo = new JLabel("Modo de Preparo");
		lblModoDePreparo.setHorizontalAlignment(SwingConstants.LEFT);
		lblModoDePreparo.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		lblModoDePreparo.setBounds(22, 335, 182, 33);
		panel_1.add(lblModoDePreparo);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(22, 459, 330, 52);
		panel_1.add(textArea_3);
		
		JLabel lblObservaes = new JLabel("Observações");
		lblObservaes.setHorizontalAlignment(SwingConstants.LEFT);
		lblObservaes.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		lblObservaes.setBounds(22, 429, 182, 33);
		panel_1.add(lblObservaes);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Ubuntu", Font.PLAIN, 28));
		textField_1.setColumns(10);
		textField_1.setBounds(499, 274, 330, 37);
		panel_1.add(textField_1);
		
		JLabel lblTempoDePreparo = new JLabel("Tempo de Preparo");
		lblTempoDePreparo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTempoDePreparo.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		lblTempoDePreparo.setBounds(499, 241, 187, 33);
		panel_1.add(lblTempoDePreparo);
		
		JLabel lblAvaliao = new JLabel("Avaliação");
		lblAvaliao.setHorizontalAlignment(SwingConstants.LEFT);
		lblAvaliao.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		lblAvaliao.setBounds(499, 447, 123, 33);
		panel_1.add(lblAvaliao);
		
		JRadioButton rdbtnBom = new JRadioButton("0");
		rdbtnBom.setBackground(new Color(224, 255, 255));
		rdbtnBom.setBounds(497, 488, 44, 23);
		panel_1.add(rdbtnBom);
		
		JRadioButton radioButton = new JRadioButton("1");
		radioButton.setBackground(new Color(224, 255, 255));
		radioButton.setBounds(545, 488, 44, 23);
		panel_1.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("2");
		radioButton_1.setBackground(new Color(224, 255, 255));
		radioButton_1.setBounds(593, 488, 44, 23);
		panel_1.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("3");
		radioButton_2.setBackground(new Color(224, 255, 255));
		radioButton_2.setBounds(642, 488, 44, 23);
		panel_1.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("4");
		radioButton_3.setBackground(new Color(224, 255, 255));
		radioButton_3.setBounds(690, 488, 44, 23);
		panel_1.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("5");
		radioButton_4.setBackground(new Color(224, 255, 255));
		radioButton_4.setBounds(738, 488, 44, 23);
		panel_1.add(radioButton_4);
		
		JLabel lblTeorCalrico = new JLabel("Teor Calórico");
		lblTeorCalrico.setHorizontalAlignment(SwingConstants.LEFT);
		lblTeorCalrico.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		lblTeorCalrico.setBounds(499, 335, 187, 33);
		panel_1.add(lblTeorCalrico);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Ubuntu", Font.PLAIN, 28));
		textField_2.setColumns(10);
		textField_2.setBounds(499, 368, 330, 37);
		panel_1.add(textField_2);
		
		JLabel lblImage = new JLabel("Imagem");
		lblImage.setBounds(547, 91, 70, 15);
		panel_1.add(lblImage);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Ubuntu", Font.PLAIN, 18));
		btnSalvar.setBackground(new Color(204, 255, 255));
		btnSalvar.setBounds(718, 561, 111, 33);
		panel_1.add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Ubuntu", Font.PLAIN, 18));
		btnCancelar.setBackground(new Color(255, 153, 51));
		btnCancelar.setBounds(563, 561, 123, 33);
		panel_1.add(btnCancelar);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 1045, 749);
		label.setIcon(new ImageIcon("/home/yann/Downloads/anise-aroma-art-277253.jpg"));
		panel.add(label);
	}
}
