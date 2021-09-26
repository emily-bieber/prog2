package aufgaben.aufgabe9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class Aufgabe9 extends JFrame
{
	public Aufgabe9()
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
		button1.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) 
					{
						field.setText(field.getText() + " 1 ");
					}
				});
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				field.setText(field.getText() + " 2 ");
			}
		});
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				field.setText(field.getText() + " 3 ");
			}
		});
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				field.setText(field.getText() + " 4 ");
			}
		});
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				field.setText(field.getText() + " 5 ");
			}
		});
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				field.setText(field.getText() + " 6 ");
			}
		});
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				field.setText(field.getText() + " 7 ");
			}
		});
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				field.setText(field.getText() + " 8 ");
			}
		});
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				field.setText(field.getText() + " 9 ");
			}
		});
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				field.setText(field.getText() + " 0 ");
			}
		});
		JButton buttonDelAll = new JButton("C");
		buttonDelAll.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				field.setText("");
			}
		});
		JButton buttonDel = new JButton("CE");
		buttonDel.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String input = field.getText();
				field.setText(input.substring(0, input.length()-1));
			}
		});
		JButton buttonTimes = new JButton("*");
		buttonTimes.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				field.setText(field.getText() + " * ");
			}
		});
		JButton buttonDivided = new JButton("/");
		buttonDivided.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				field.setText(field.getText() + " / ");
			}
		});
		JButton buttonPlus = new JButton("+");
		buttonPlus.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				field.setText(field.getText() + " + ");
			}
		});
		JButton buttonMinus = new JButton("-");
		buttonMinus.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				field.setText(field.getText() + " - ");
			}
		});
		JButton buttonDot = new JButton(".");
		buttonDot.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				field.setText(field.getText() + " . ");
			}
		});
		JButton buttonEquals = new JButton("=");
		buttonEquals.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String s = field.getText();
				Integer result = 0;
				for (int i = 0; i < s.length(); i++)
				{
					char c = s.charAt(i);
					if (c >= 0 && c < 9)	// Ziffern 0 bis 9
					{
						
					}
					else if (c == 43)		// +
					{
						
					}
					else if (c == 45)		// -
					{
						
					}
				}
			}
		});
		
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
		buttonDelAll.setBackground(Color.WHITE);
		buttonDel.setBackground(Color.WHITE);
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
		tasten.add(buttonDel);
		tasten.add(button0);
		tasten.add(buttonDelAll);
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
		new Aufgabe9();

	}

}