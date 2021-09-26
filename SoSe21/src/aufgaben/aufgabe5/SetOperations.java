package aufgaben.aufgabe5;

import java.util.*;

public class SetOperations 
{
	Set<Integer> numbers1;
	Set<Integer> numbers2;
	Set<Integer> both;
	final static int UPPER_BOUND = 100;
	
	public SetOperations()
	{
		this.numbers1 = new TreeSet<>();
		this.numbers2 = new TreeSet<>();
		this.both = new TreeSet<>();
	}
	
	public void fill()
	{
		Random r = new Random();
		
		/*
		int nextIntNr = 0;
		Integer nextIntegerNr = Integer.valueOf(nextIntNr);
		for (int i = 0; i < UPPER_BOUND; i++)
		{
			nextIntNr = r.nextInt(UPPER_BOUND);
			nextIntegerNr = Integer.valueOf(nextIntNr);
			this.numbers1.add(nextIntegerNr);
		}
		
		for (int i = 0; i < UPPER_BOUND; i++)
		{
			nextIntNr = r.nextInt(UPPER_BOUND);
			nextIntegerNr = Integer.valueOf(nextIntNr);
			this.numbers2.add(nextIntegerNr);
		}
		*/
		
		for (int i = 0; i < UPPER_BOUND; i++)
		{
			this.numbers1.add(Integer.valueOf(r.nextInt(UPPER_BOUND)));
			this.numbers2.add(Integer.valueOf(r.nextInt(UPPER_BOUND)));
		}
	}
	
	public void fillBothUnion()
	{
		System.out.println();
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("         A                           B                         A \u222a B  ");
		System.out.println("---------------------------------------------------------------------------");
		this.both.addAll(numbers1);
		this.both.addAll(numbers2);
	}
	
	public void fillBothIntersection()
	{
		System.out.println();
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("         A                           B                         A \u2229 B  ");
		System.out.println("---------------------------------------------------------------------------");
		this.both.clear();
		this.both.addAll(numbers1);
		this.both.retainAll(numbers2);
	}
	
	public void fillBothDifference()
	{
		System.out.println();
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("         A                           B                         A - B  ");
		System.out.println("---------------------------------------------------------------------------");
		this.both.clear();
		this.both.addAll(numbers1);
		this.both.removeAll(numbers2);
	}
	
	public void print()
	{
		int counter1 = 0;
		int counter2 = 0;
		int counterBoth = 0;
		
		for (int row = 0; row < 10; row++)
		{
			for (int col = 0; col < 10; col++)
			{
				if (this.numbers1.contains(Integer.valueOf(counter1)))
				{
					System.out.print('\u25cf' + " ");
				}
				else
				{
					System.out.print('\u2009' + " ");
				}
				counter1++;
			}
			
			printSpaces(8);
			
			for (int col = 0; col < 10; col++)
			{
				if (this.numbers2.contains(Integer.valueOf(counter2)))
				{
					System.out.print('\u25cf' + " ");
				}
				else
				{
					System.out.print('\u2009' + " ");
				}
				counter2++;
			}
			
			printSpaces(8);
			
			for (int col = 0; col < 10; col++)
			{
				if (this.both.contains(Integer.valueOf(counterBoth)))
				{
					System.out.print('\u25cf' + " ");
				}
				else
				{
					System.out.print('\u2009' + " ");
				}
				counterBoth++;
			}
			System.out.println();
		}
	}
	
	private void printSpaces(int number)
	{
		for (int i = 0; i < number; i++)
		{
			System.out.print(" ");
		}	
	}

}
