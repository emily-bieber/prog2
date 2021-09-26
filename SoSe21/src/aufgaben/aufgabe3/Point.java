package aufgaben.aufgabe3;

/*
 * ein Point repreasentiert eine Position
 * im Spielfeld, bestehend aus der Nummer 
 * fuer die Zeile (row) und der Nummer
 * fuer die Spalte (col)
 */

public class Point 
{
    private int row;
    private int col;

    /*
     * Konstruktor zur Erzeugung einer 
     * Position bestehend aus row und col
     */
    public Point(int row, int col)
    {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

    @Override
    public String toString()
    {
        return "("+ this.row + "," + this.col + ")";
    }
}