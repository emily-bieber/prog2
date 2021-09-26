package aufgaben.aufgabe3;

/* 
 * diese Klasse repraesentiert einen Zug 
 * Variablen sind Point from 
 * und Point to 
 * es wird nicht geprueft, ob der Zug ueberhaupt 
 * moeglich ist 
 */ 

public class Move 
{ 
	private Point from; 
	private Point to;

	/*
	 * ein Zug von dem from-Point (fromRow,fromCol)
	 * zum to-Point (toRow,toCol)
	 */
	public Move(int fromRow, int fromCol, int toRow, int toCol)
	{
		this.from = new Point(fromRow, fromCol);
		this.to = new Point(toRow, toCol);
	}

	/*
	 * in dem Konstruktor werden in this.from und this.to nicht einfach
	 * die Referenzen von from und to gespeichert, sondern davon Kopien
	 * erstellt, damit das Programm robuster gegen das Aendern von
	 * Referenzen ist
	 */
	public Move(Point from, Point to)
	{
		this.from = new Point(from.getRow(), from.getCol());
		this.to = new Point(to.getRow(), to.getCol());
	}

	/*
	 * der Getter fuer den Point from gibt keine Referenz auf
	 * den Point from zurueck, sondern eine Kopie (einen Klon)
	 * von from --> Referenzen koennen "verbogen" werden, aber
	 * die Kopien bleiben unveraendert
	 */
	public Point getFrom()
	{
		return new Point(this.from.getRow(), this.from.getCol());
	}

	/*
	 * der Getter fuer den Point to gibt keine Referenz auf
	 * den Point to zurueck, sondern eine Kopie (einen Klon)
	 * von to --> Referenzen koennen "verbogen" werden, aber
	 * die Kopien bleiben unveraendert
	 */
	public Point getTo()
	{
		return new Point(this.to.getRow(), this.to.getCol());
	}
}