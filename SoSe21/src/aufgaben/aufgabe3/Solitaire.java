package aufgaben.aufgabe3;

public class Solitaire 
{
    private Moves game;
    private State[][] field;

    public Solitaire()
    {
        this.game = new Moves();
        this.field = new State[7][7];
        for(int row = 0; row < this.field.length; row++)
        {
            for(int col = 0; col < this.field[row].length; col++)
            {
                if((row < 2 || row > 4) && (col < 2 || col > 4))
                {
                    this.field[row][col] = State.NOT;
                }
                else
                {
                    this.field[row][col] = State.USED;
                }
            }
        }
        this.field[3][3] = State.FREE;
    }

    /*
     * Geben Sie das Spielfeld aus! Am Anfang sollte auf der
     * Konsole so ein Bild erscheinen:
     *     o o o     
     *     o o o     
     * o o o o o o o 
     * o o o   o o o 
     * o o o o o o o 
     *     o o o     
     *     o o o 
     * 
     */
    public void print()
    {
    	for (int row = 0; row < this.field.length; row++)
    	{
    		for (int col = 0; col < this.field[row].length; col++)
    		{
    			if (this.field[row][col] == State.USED)
    			{
    				System.out.print("o ");
    			}
    			else if (this.field[row][col] == State.FREE)
    			{
    				System.out.print(". ");
    			}
    			else
    			{
    				System.out.print("  ");
    			}
    		}
    		System.out.println();
    	}
    }

    /*
     * diese Methode gibt ein true zurueck, wenn von der
     * uebergebenen Position (row,col) ein Zug moeglich ist
     * d.h. 
     * 1. auf der angegebenen Position muss ein Stein sein
     * 2. zwei Steine weiter (oben, unten, rechts oder links)
     *      darf kein Stein sein
     * 3. dazwischen muss ein Stein sein
     */
    public boolean possibleFrom(int row, int col)
    {
    	if (row >= 0 && row < 7 && col >= 0 && col < 7 && this.field[row][col] == State.USED)
    	{
    		if (row > 1 && this.field[row-2][col] == State.FREE && this.field[row-1][col] == State.USED ||		// oben
    			col < 5 && this.field[row][col+2] == State.FREE && this.field[row][col+1] == State.USED ||		// rechts
    			row < 5 && this.field[row+2][col] == State.FREE && this.field[row+1][col] == State.USED ||		// unten
    			col > 1 && this.field[row][col-2] == State.FREE && this.field[row][col-1] == State.USED)		// links
    		{
    			return true;
    		}
    	}
        return false;
    }

    /*
     * diese Methode gibt alle Positionen (Point) zurueck,
     * AUF die von (fromRow,fromCol) aus gesprungen werden
     * kann
     */
    public Point[] possibleTo(int fromRow, int fromCol)
    {
        if(!possibleFrom(fromRow, fromCol)) return new Point[0];
         
        int nrOfPossibilities = 0;
        if (fromRow > 1 && this.field[fromRow-2][fromCol] == State.FREE && this.field[fromRow-1][fromCol] == State.USED) nrOfPossibilities++;
        if (fromCol < 5 && this.field[fromRow][fromCol+2] == State.FREE && this.field[fromRow][fromCol+1] == State.USED) nrOfPossibilities++;
    	if (fromRow < 5 && this.field[fromRow+2][fromCol] == State.FREE && this.field[fromRow+1][fromCol] == State.USED) nrOfPossibilities++;	
    	if (fromCol > 1 && this.field[fromRow][fromCol-2] == State.FREE && this.field[fromRow][fromCol-1] == State.USED) nrOfPossibilities++;

    	Point[] tos = new Point[nrOfPossibilities];
    	int index = 0;
        if (fromRow > 1 && this.field[fromRow-2][fromCol] == State.FREE && this.field[fromRow-1][fromCol] == State.USED) tos[index++] = new Point(fromRow-2, fromCol);
        if (fromCol < 5 && this.field[fromRow][fromCol+2] == State.FREE && this.field[fromRow][fromCol+1] == State.USED) tos[index++] = new Point(fromRow, fromCol+2);
      	if (fromRow < 5 && this.field[fromRow+2][fromCol] == State.FREE && this.field[fromRow+1][fromCol] == State.USED) tos[index++] = new Point(fromRow+2, fromCol);
      	if (fromCol > 1 && this.field[fromRow][fromCol-2] == State.FREE && this.field[fromRow][fromCol-1] == State.USED) tos[index++] = new Point(fromRow, fromCol-2);
      	
      	return tos;
    }

    /* 
     * diese Methode erzeugt ein Moves-Objekt
     * in dieses Moves-Objekt werden mithilfe der
     * Objektmethode addMove() (aus Moves) alle
     * moeglichen Zuege hinzugefuegt
     * (moeglich im aktuellen Zustand von field[][])
     */
    public Moves possibleMoves()
    {
        Moves possibleMoves = new Moves();
        for (int row = 0; row < this.field.length; row++)
        {
        	for (int col = 0; col < this.field[row].length; col++)
        	{
        		if (possibleFrom(row, col))
        		{
        			Point[] possibleTos = this.possibleTo(row,col);
        			Point from = new Point(row, col);
        			for (int index = 0; index < possibleTos.length; index++)
        			{
        				possibleMoves.addMove(new Move(from, possibleTos[index]));
        			}
        		}	
        	}
        }

        // next line for debugging
        possibleMoves.printMoves();
        return possibleMoves;
    }

    /*
     * gibt ein true zurueck, wenn im aktuellen Zustand 
     * von field[][] ueberhaupt noch ein Zug moeglich ist
     * sonst false
     */
    public boolean movePossible()
    {
    	for (int row = 0; row < this.field.length; row++)
    	{
    		for (int col = 0; col < this.field[row].length; col++)
    		{
    			if (possibleFrom(row, col))
    			{
    				return true;
    			}
    		}
    	}

        return false;
    }

    /*
     * ruft die Methode move(Move move) auf,
     * wenn ein Zug moeglich ist (dann true zurueck)
     * sonst false
     */
    public boolean moveFirstPossible()
    {
        if(!movePossible()) return false;
        /*
         *  hier einen moeglichen Zug ausfuehren
         *  den ersten, den Sie finden (siehe
         *  possibleMoves() )
         */
        Moves possibleMoves = this.possibleMoves();   
        try
        {
        	Move move = possibleMoves.getMoveAtIndex(0);
        	this.move(move);
        	return true;
        }
        catch (IllegalArgumentException e)
        {
        	System.out.println("Zug nicht moeglich! Index : 0");
        	return false;
        }
    }

    /*
     * hier wird der Zug Move move ausgefuehrt
     * nach dem Zug ist 
     * 1. die from-Position leer
     * 2. die to-Position mit einem Stein besetzt
     * 3. dazwischen leer (Stein wird "entfernt")
     * falls Zug nicht moeglich, wird eine 
     * IllegalArgumentException geworfen 
     */
    public void move(Move move) throws IllegalArgumentException
    {
    	Point from = move.getFrom();
    	int fromRow = from.getRow();
    	int fromCol = from.getCol();
    	
    	Point to = move.getTo();
    	int toRow = to.getRow();
    	int toCol = to.getCol();
    	
    	int middleRow = (fromRow + toRow) / 2;
    	int middleCol = (fromCol + toCol) / 2;
    	
    	try 
    	{
			this.field[fromRow][fromCol] = State.FREE;
			this.field[toRow][toCol] = State.USED;
			this.field[middleRow][middleCol] = State.FREE;
		} 
    	catch (ArrayIndexOutOfBoundsException e) 
    	{
    		throw new IllegalArgumentException("Zug nicht moeglich! (" + fromRow + ", " + fromCol + ") --> ( " + toRow + ", " + toCol + ") ");
		}
    }

}