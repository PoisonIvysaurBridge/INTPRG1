import java.util.Scanner;

public class ShirtDiscount{

	public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);
	   
	   String name = sc.next(); // whitespace stopping condition
	   
	   System.out.print("Enter price: ");
	   double price = sc.nextDouble();
	   
	   System.out.print("Enter size: " );
	   sc.nextLine();
	   String size = sc.nextLine(); // newline
	   
	   double disc = 0;
	   
	   if (size.equals("XL") && price > 500)
	   {
		   disc = 100;
	   }
	   else if (size.equals("L") && price > 600){
		   disc = 50;
	   }
	   else{
		   disc = 0;
	   }
	   
	   System.out.println(name + "'s Shirt Price: " + (price-disc));
	   
	}

}