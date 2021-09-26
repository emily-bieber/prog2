package aufgaben.aufgabe1;

import javax.swing.JOptionPane;

public class Vorbereitung 
{

	public static void main(String[] args) 
	{
		/*
		String message = "This is a message";
		JOptionPane.showConfirmDialog(null, message);
		JOptionPane.showInputDialog(message);
		JOptionPane.showMessageDialog(null, message);
		JOptionPane.showOptionDialog(null, message, "Title", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, 
				                     null, new String[] {"OK", "LATER", "CANCEL"}, "CANCEL");
		*/
		
		System.out.println(JOptionPane.showOptionDialog(null, "Wollen Sie weiter wuerfeln?", "Weiter wuerfeln?", JOptionPane.YES_NO_OPTION, 
				                     JOptionPane.QUESTION_MESSAGE, null, null, null));
		
	}

}
