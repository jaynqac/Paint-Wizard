import java.util.*;

public class Wall 
{
	public int wallHeight;
	public int wallWidth;
	public int totalArea;

	public Wall(int startWallHeight, int startWallWidth)
	{
		wallHeight = startWallHeight;
		wallWidth = startWallHeight;
	}

	public int calculateTotalArea(int wallH, int wallW)
	{
		int totalArea;

		totalArea = wallH * wallW;

		return totalArea;
	}

	public void calculateCostToPaint(int surfaceArea)
	{
		int sArea = surfaceArea;
		int cmVolume = 20;
		int cmArea = 10;
		double cmCost = 19.99;
		int ajVolume = 15;
		int ajArea = 11;
		double ajCost = 17.99;
		int dpVolume = 10;
		int dpArea = 20;
		double dpCost = 25.00;
		System.out.println();

		// calculate using CheapoMax
		int cmPaint = cmVolume * cmArea;
		double numOfTinsCM = (int)Math.ceil(sArea / cmPaint);
		cmCost = cmCost * numOfTinsCM;
		String toString;
		toString = "To cover the given walls, it would require " + numOfTinsCM + " tins of Cheapo Max paint, costing you £" + cmCost;
		System.out.println(toString);
		System.out.println();

		// calculate using Average Joes
		int ajPaint = ajVolume * ajArea;
		double numOfTinsAJ = (int)Math.ceil(sArea / ajPaint);
		ajCost = ajCost * numOfTinsAJ;
		toString = "To cover the given walls, it would require " + numOfTinsAJ + " tins of Average Joes paint, costing you £" + ajCost;
		System.out.println(toString);
		System.out.println();

		// calculate using Duluxourous Paints
		int dpPaint = dpVolume * dpArea;
		double numOfTinsDP = (int)Math.ceil(sArea / dpPaint);
		dpCost = dpCost * numOfTinsDP;
		toString = "To cover the given walls, it would require " + numOfTinsDP + " tins of Duluxourous Paints paint, costing you £" + dpCost;
		System.out.println(toString);
		System.out.println();
	}

}