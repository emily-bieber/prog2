package aufgaben.aufgabe8;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Taschenrechner extends JFrame
{
	public Taschenrechner()
	{
		super();
		this.setTitle("Taschenrechner");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(250, 350);
		this.setLocation(800, 100);
		
		JPanel content = initContent();
		this.setContentPane(content);
	}
	
	public JPanel initContent()
	{
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		
		Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
		
		JPanel ausgabe = new JPanel();
		ausgabe.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		JTextField field = new JTextField(20);
		field.setPreferredSize(new Dimension(70, 30));
		field.setBorder(border);
		ausgabe.add(field);
		
		JPanel tasten = new JPanel();
		tasten.setLayout(new GridLayout(6, 3, 20, 10));
		
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton button0 = new JButton("0");
		JButton buttonBracketL = new JButton("(");
		JButton buttonBracketR = new JButton(")");
		JButton buttonTimes = new JButton("*");
		JButton buttonDivided = new JButton("/");
		JButton buttonPlus = new JButton("+");
		JButton buttonMinus = new JButton("-");
		JButton buttonDot = new JButton(".");
		JButton buttonEquals = new JButton("=");
		
		button1.setBackground(Color.WHITE);
		button2.setBackground(Color.WHITE);
		button3.setBackground(Color.WHITE);
		button4.setBackground(Color.WHITE);
		button5.setBackground(Color.WHITE);
		button6.setBackground(Color.WHITE);
		button7.setBackground(Color.WHITE);
		button8.setBackground(Color.WHITE);
		button9.setBackground(Color.WHITE);
		button0.setBackground(Color.WHITE);
		buttonBracketR.setBackground(Color.WHITE);
		buttonBracketL.setBackground(Color.WHITE);
		buttonTimes.setBackground(Color.WHITE);
		buttonDivided.setBackground(Color.WHITE);
		buttonPlus.setBackground(Color.WHITE);
		buttonMinus.setBackground(Color.WHITE);
		buttonDot.setBackground(Color.WHITE);
		buttonEquals.setBackground(Color.WHITE);
		

		tasten.add(button1);
		tasten.add(button2);
		tasten.add(button3);
		tasten.add(button4);
		tasten.add(button5);
		tasten.add(button6);
		tasten.add(button7);
		tasten.add(button8);
		tasten.add(button9);
		tasten.add(buttonBracketL);
		tasten.add(button0);
		tasten.add(buttonBracketR);
		tasten.add(buttonTimes);
		tasten.add(buttonDivided);
		tasten.add(buttonPlus);
		tasten.add(buttonMinus);
		tasten.add(buttonDot);
		tasten.add(buttonEquals);
		
		JPanel links = new JPanel();
		JPanel rechts = new JPanel();
		JPanel unten = new JPanel();
		
		mainPanel.add(ausgabe, BorderLayout.NORTH);
		mainPanel.add(tasten, BorderLayout.CENTER);
		mainPanel.add(links, BorderLayout.WEST);
		mainPanel.add(rechts, BorderLayout.EAST);
		mainPanel.add(unten, BorderLayout.SOUTH);
		
		return mainPanel;
	}

	public static void main(String[] args) 
	{
		new Taschenrechner();

	}

}
