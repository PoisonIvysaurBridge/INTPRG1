import java.util.Scanner;

public class SortNumbers2{

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
		
		highest = Math.max(num1,num2);
		middle = Math.min(num2, num1);
		
		lowest = Math.min(middle, num3);
		middle = Math.max(middle, num3);
		
		temp = Math.min(highest, middle);
		highest = Math.max(highest,middle);
		middle = temp;
		
		System.out.println("Highest: " + highest);
		System.out.println("Middle: " + middle);
		System.out.println("Lowest: " + lowest);
	}

}