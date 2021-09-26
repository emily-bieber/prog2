package aufgaben.aufgabe10;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Arc2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Aufgabe10 extends JFrame
{
	public Aufgabe10()
	{
		super("PI berechnen");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(500, 500);
		
		this.add(new Canvas(), BorderLayout.CENTER);
	}
	
	private class Canvas extends JPanel
	{
		@Override
		protected void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D)g;
			
			Shape rectangle = new Rectangle(200, 200);
			//Shape arc = new Arc2D.Double(0.0, 0.0, 200.0, 200.0, 180.0, -90.0, Arc2D.PIE);
			
			g2.draw(rectangle);
			//g2.draw(arc);
		}
	}
	

	public static void main(String[] args) 
	{
		new Aufgabe10();
	}

}
