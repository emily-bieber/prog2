package aufgaben.aufgabe3;

/*
 * diese Klasse repraesentiert eine Folge 
 * von Zuegen (Move), die in einem Array
 * moves gespeichert sind
 */
public class Moves {
    private Move[] moves;

    /*
     * der Konstruktor erstellt ein leeres moves-Array
     * (d.h. noch keine Zuege (Moves) gespeichert)
     */
    public Moves()
    {
        this.moves = new Move[0];
    }

    /*
     * der Konstruktor erstellt ein moves-Array mit einem
     * Move - dem erste Zug (firstMove) 
     */
    public Moves(Move firstMove)
    {
        this.moves = new Move[1];
        this.moves[0] = firstMove;
    }

    /*
     * Anzahl der bisher gespeicherten Zuege
     */
    public int getLength()
    {
        return this.moves.length;
    }

    /*
     * fuegt einen Zug (nextMove) zum moves-Array hinzu
     * dazu muss das moves-Array um 1 laenger sein als zuvor
     * es wird eine Kopie aller Zuege erstellt und dann
     * der nextMove hinzugefuegt
     */
    public void addMove(Move nextMove)
    {
        Move[] newMoves = new Move[this.moves.length + 1];
        for (int index = 0; index < this.moves.length; index++) 
        {
            newMoves[index] = this.moves[index];
        }
        newMoves[newMoves.length - 1] = new Move(nextMove.getFrom(), nextMove.getTo());
        this.moves = newMoves;
    }

    /*
     * gibt den Move zurueck, der im moves-Array unter dem Index index
     * gespeichert ist;
     * kann sein, dass index kein korrekter Index im moves-Array ist, 
     * dann wird eine IllegalArgumentException geworfen
     */
    public Move getMoveAtIndex(int index) throws IllegalArgumentException
    {
        try 
        {
            return this.moves[index];
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            throw new IllegalArgumentException("kein gueltiger Index!");
        }
    }

    /*
     * Ausgabe aller im moves-Array gespeicherten Zuege
     * wird nur zum Debuggen benoetigt
     */
    public void printMoves()
    {
        System.out.printf("%n---%n");
        for (int index = 0; index < this.moves.length; index++) 
        {
            Move move = this.moves[index];
            Point from = move.getFrom();
            Point to = move.getTo();
            System.out.println(from.toString() + " --> " + to.toString());
        }
        System.out.printf("%n---%n%n");
    }
}