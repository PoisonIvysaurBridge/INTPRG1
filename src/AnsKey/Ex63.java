
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lance
 */
public class Ex63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n = sc.nextInt();
        int temp = n; //a temporary variable containing the value of n so that we don't need to modify the original value of n
        
        //Method 1: Extracting digits one by one and printing it out (as a String)
        
        System.out.print("Reversed (String Printout): ");
        while(temp > 0)
        {
            System.out.print(temp % 10); //print right-most digit one by one
            temp /= 10; //remove the right-most digit after printing
        }
        
        temp = n; //set temp back to original value for the next method
        
        //Method 2: reversing the number as a whole number. Note for this method, the 0 at the start will not be printed-out.
        
        int rightDigit = 0;
        int mult = 1;
        int reversed = 0; //contains the reversed integer number
        
        //using the temp variable, we can calculate for the number of tens for the original number. This will be used later on.
        while (temp >= 10)
        {
            temp /= 10;
            mult *= 10;
        }
        
        //this loop will construct the reversed number digit by digit
        while (n > 0)
        {
            rightDigit = n % 10; //get the right-most digit from the original number
            
            reversed += rightDigit * mult; //multiply it to the largest tens multiplier we got from the previous loop. Add the result to the reversed variable. Note that this is the step where we are constructing the reversed variable digit-by-digit.
            
            mult /= 10; //remove a 0 for the next iteration from the multiplier
            n /= 10; //remove the right-most digit.
        }
        
        System.out.println("Reversed: " + reversed);
        
    }
}
