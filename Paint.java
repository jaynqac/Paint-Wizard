import java.util.*;

public class Paint
{
	public String name;
	public int litre;
	public float cost;
	public int coverage;

	public Paint (String n, int l, float c, int cv)
	{
		name = n;
		litre = l;
		cost = c;
		coverage = cv;
	}

	public String toString()
	{
		return "i";
	}

	public void CheapoMaxPaint()
	{
		String name = "Cheapo Max";
		int volume = 20;
		double cost = 19.99;
		int coverage = volume * 10;

		String toString;
		toString = "A " + volume + " litre tub of " + name + " paint, costing £" + cost + " will cover " + coverage + " square metres.";
		System.out.println(toString);
	}

	public static void AverageJoesPaint()
	{
		String name = "Average Joes";
		int volume = 15;
		double cost = 17.99;
		int coverage = volume * 11;

		String toString; 
		toString = "A " + volume + " litre tub of " + name + " paint, costing £" + cost + " will cover " + coverage + " square metres.";
		System.out.println(toString);
	}

	public static void DuluxourousPaintsPaint()
	{
		String name = "Duluxourous Paints";
		int volume = 10;
		double cost = 25.00;
		int coverage = volume * 20;

		String toString;
		toString = "A " + volume + " litre tub of " + name + " paint, costing £" + cost + " will cover " + coverage + " square metres.";
		System.out.println(toString);
	}
}