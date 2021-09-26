package aufgaben.aufgabe3;

public class Testklasse {

    public static void main(String[] args) {
        Solitaire s = new Solitaire();
        s.print();
        while(s.moveFirstPossible())
        {
            s.print();
        }
        System.out.println();
        s.print();
    }

}