package aufgaben.aufgabe1;

import java.util.Random;
import javax.swing.JOptionPane;

public class Aufgabe1 
{
	public static void main(String[] args) 
	{
		Spieler[] spieler = Spieler.spielerErmitteln();
		
		spieler[0].wuerfeln();
	}

}
