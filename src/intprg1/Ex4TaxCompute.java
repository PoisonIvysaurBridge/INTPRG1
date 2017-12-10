package intprg1;
import java.util.Scanner;

public class Ex4TaxCompute{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Taxable Income: ");
        double income = sc.nextDouble();
        double tax;
        if (income<=0){
            tax = 0;
        }
        else if (income <= 3000){
            tax = 250;
        }
        else if(income<=3000+2000){   //5000
            tax = 250 + 0.05*(income - 3000);
        }
        else if(income<=3000+2000+5000){   //10000
            tax = 250 + 0.05*2000 + 0.09*(income-5000);
        }
        else{   //Greater than 10000
            tax = 250 + 0.05*2000+ 0.09*5000 + 0.15*(income - 10000);
        }
        System.out.println("Income Tax: "+ tax);
   
    }
}