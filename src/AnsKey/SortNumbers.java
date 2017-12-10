import java.util.Scanner;

public class SortNumbers{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		double num1, num2, num3;
		System.out.println("Enter 3 numbers: ");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		num3 = sc.nextDouble();
		
		double temp = 0;
		double highest = num1, middle = num2, lowest = num3;
		
		if (middle > highest)
		{
			temp = highest;
			highest = middle;
			middle = temp;
		}
		
		if (lowest > middle)
		{
			temp = middle;
			middle = lowest;
			lowest = temp;
		}
		
		if (middle > highest)
		{
			temp = highest;
			highest = middle;
			middle = temp;
		}
		
		System.out.println("Highest: " + highest);
		System.out.println("Middle: " + middle);
		System.out.println("Lowest: " + lowest);
	}

}