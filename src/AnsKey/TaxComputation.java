
import java.util.Scanner;

public class TaxComputation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Taxable income: ");
        
        double income = sc.nextInt();
        double tax = 0;
        
        if (income <= 3000 && income > 0)
            tax = 250;
        else if (income > 3000 && income <= 5000)
            tax = 250 + (income - 3000) * 0.05;
        else if (income > 5000 && income <= 10000)
            tax = 250 + (2000*.05) + (income - 5000) * 0.09;
        else if (income > 10000)
            tax = 250 + (2000*.05) + (5000*.09) + (income - 10000) * 0.15;
        
        System.out.println("Income Tax: " + tax);
        
    }
    
}
