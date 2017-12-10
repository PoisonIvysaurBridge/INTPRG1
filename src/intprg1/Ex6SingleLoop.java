package intprg1;
import java.util.Scanner;
public class Ex6SingleLoop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* #1 Write a program that takes one real value as input and computes the first integer n such
        that 2n is greater than or equal to the input value. The program should output both n and 2n.*/
        System.out.println("****************** #1 *******************");
        System.out.print("enter a number: ");
        double num = sc.nextDouble();
        int n = 1;
        while (2*n < num){
            n++;
        }
        System.out.println("2n: "+(2*n));
        System.out.println("n: "+n);
        
        /*2. Write a program to read in a real value x and output the integer n closest to the cube root 
        of x. The value of x is assumed positive.*/
        System.out.println("****************** #2 *******************");
        System.out.print("enter a number: ");
        double x = sc.nextDouble();
        double cbrt = Math.cbrt(x);
        cbrt = cbrt+0.5;
        cbrt = (int)cbrt;
        for (n=0; n<cbrt; n++){}
        System.out.println(n);  
        // another code
        System.out.println("**** another interpretation for #2: the closest integer ****");
        System.out.print("enter number: "); // Display the string.
        x = sc.nextInt();
        for (n=1; n*n*n<= x; n++){}
        n = n-1;
        int lower = n*n*n, nlower = n; //System.out.println(lower);
        for (n=1; n*n*n<=x; n++){}
        int higher = n*n*n, nhigher = n; //System.out.println(higher);
        if (x-lower < higher-x)
            System.out.println(nlower);
        else 
            System.out.println(nhigher);
        
        /*3. Write a program that asks for an input integer and displays the digits in reverse.*/
        System.out.println("****************** #3 *******************");
        System.out.print("enter a number: ");
        n = sc.nextInt();
        String rev = "";
        while (n>0){
            rev += String.valueOf(n%10);
            n/=10;
        }
        System.out.println(rev);
        /*4. The first function of the program is to determine the lowest encoded odd integer from a
        series of whole numbers entered by the user. The program should stop asking for values 
        when a value less than 1 has been entered.*/
        System.out.println("****************** #4 *******************");
        System.out.print("enter number: ");
        n = sc.nextInt();
        int lowestOdd = n;
        while (n>0){
            if (n%2!=0 && n<lowestOdd){
                lowestOdd = n;
            }
            System.out.print("enter number: ");
            n = sc.nextInt();
        }
        if (lowestOdd < 0 || lowestOdd%2==0)
            System.out.println("no odd number inputs");
        else
            System.out.println("Lowest odd number input: "+lowestOdd);
        
    }
}