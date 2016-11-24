import java.util.*;
import java.util.Scanner;


public class Task6
{
	
	public static void main(String[] args)
	{
		//declare variables
		int[] heightWall = new int[10];
		int[] widthWall = new int [10];
		int[] plane = new int [10]; 

		Scanner sc = new Scanner(System.in);
		int counter = 0;
		int numOfWalls;
		int totalSurfaceArea = 0;

		Wall myWall = new Wall(0, 0);
		Paint myPaint = new Paint("n", 0, 0, 0);

		System.out.print(String.format("\033[H\033[2J"));
		System.out.println(" ***** START *****");
		System.out.println();

		// request user input to obtain number of walls and the measurements of each wall
		System.out.println("How many walls do you have?");
		numOfWalls = sc.nextInt();

		System.out.println();
		System.out.println("Specify your wall metrics in order (width / height)");
		for (int i =0; i < numOfWalls; i++)
		{
			int counter2 = 1;
			System.out.println("Wall " + counter2);
			System.out.println("Width: ");
			widthWall[i] = sc.nextInt();
			System.out.println("Height: ");
			heightWall[i] = sc.nextInt();
			counter2++; 
			System.out.println();
		}

		// calculate surface area of each wall
		for (int i=0; i < numOfWalls; i++){

			plane[i] = myWall.calculateTotalArea(widthWall[i], heightWall[i]);
			counter++;

			System.out.println("Surface area of wall " + counter + " is " + plane[i] + " square metres.");
		}	

		// calculate total surface area
		for (int i = 0; i < plane.length; i++)
		{
			totalSurfaceArea = totalSurfaceArea + plane[i];
		}

		System.out.println("Total surface area is " + totalSurfaceArea + " square metres");
		System.out.println();



		myPaint.CheapoMaxPaint();
		myPaint.AverageJoesPaint();
		myPaint.DuluxourousPaintsPaint();

		myWall.calculateCostToPaint(totalSurfaceArea);

		System.out.println();
		System.out.println(" ***** END *****");

		// calculate cost for total surface area for each type of paint

	}


}