package aufgaben.aufgabe1;

import java.util.Random;
import javax.swing.JOptionPane;

public class Spieler 
{
	// Objektvariablen
	public String name;
	public int anzPkt;
	
	// Konstruktor
	public Spieler(String name)
	{
		this.name = name;
		anzPkt = 0;
	}
	
	// Objektmethoden
	public int getPoints()
	{
		return this.anzPkt;
	}
	
	public static Spieler[] spielerErmitteln()
	{
		String input = JOptionPane.showInputDialog("Wie viele Spieler spielen?");
		int anzSpieler = 0;
		boolean inputOk = false;
		while (!inputOk)
		{
			try 
			{
				anzSpieler = Integer.valueOf(input);
				inputOk = true;
			} 
			catch (NumberFormatException e) 
			{
				input = JOptionPane.showInputDialog("Bitte Zahl eingeben! Wie viele Spieler spielen?");
			}
		}
		
		Spieler[] spieler = new Spieler[anzSpieler];
		for (int i = 0; i < spieler.length; i++)
		{
			String name = JOptionPane.showInputDialog("Spieler " + (i+1) + ", bitte Namen eingeben");
			spieler[i] = new Spieler(name);
		}
		
		// Ausgabe
		for (int i = 0; i < spieler.length; i++)
		{
			System.out.println("Name : " + spieler[i].name + "    Punkte : " + spieler[i].anzPkt);
		}
		return spieler;
	}
	
	public void wuerfeln()
	{
		JOptionPane.showMessageDialog(null,	"Spieler " + this.name + ", Sie sind dran!");
		
		int points = 0;
		Random r = new Random();
		int wurf = 0;
		int input = 0;
		
		while (wurf != 6 && input == 0)
		{
			wurf = r.nextInt(6)+1;
			if (wurf != 6)
			{
				JOptionPane.showConfirmDialog(null, "Sie haben eine " + wurf + " geworfen!", null, JOptionPane.OK_OPTION);
				points += wurf;
			}
			else
			{
				JOptionPane.showConfirmDialog(null, "Sie haben eine 6 geworfen, dieser Zug ist damit vorbei!", null, JOptionPane.OK_OPTION);
			}
			input = JOptionPane.showOptionDialog(null, "Spieler " + this.name + ", wollen Sie erneut wuerfeln?", "Erneut wuerfeln?", 
					                             JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
			if (input == 1)
			{
				this.anzPkt += points;
				JOptionPane.showConfirmDialog(null, "Ihr Zug ist vorbei!", null, JOptionPane.OK_OPTION);	
			}
		}
	}
}
