import java.util.Scanner;

public class SalaryCompute{

	public static void main(String[] args)
	{
		/*
		2. Ask the user for the hours worked for the week and the hourly rate. The basic
salary is computed as:
hours worked * hourly rate

Bonuses are given:

No. of hours > 45 Bonus of 100 pesos
No. of hours > 40 and <= 45 Bonus of 50 pesos
No. of hours > 35 and <=40 Bonus of 25 pesos

Display the basic salary, bonus, and total salary (basic salary + bonus) for the week.
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter hours worked: ");
		double hours = sc.nextDouble();
		System.out.print("Enter hourly rate: ");
		double hourlyrate = sc.nextDouble();
		double basicsalary = hours * hourlyrate;
		double bonus = 0;
		if (hours > 45)
			bonus += 100;
		else if (hours > 40 && hours <= 45)
			bonus += 50;
		else if (hours > 35 && hours <= 40)
			bonus += 25;
		
		double totalsalary = basicsalary + bonus;
		
		System.out.println("Basic Salary: " + basicsalary);
		System.out.println("Bonus: " + bonus);
		System.out.println("Total Salary: " + totalsalary);
		
	}

}