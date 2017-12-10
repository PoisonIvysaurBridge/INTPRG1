
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
public class Ex64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int lowest = Integer.MAX_VALUE; //set it initially to max value so that all other inputs (except for itself) will be the lowest.
        Boolean flagHasOdd = false; //used as a 'flag' to specify whether or not we already have found a LOWEST ODD NUMBER
        
        //making use of a do-while since we know that we need to ask the user for input at least once
        do{
            System.out.print("Input: ");
            n = sc.nextInt();
            if (n <= lowest && n > 0 && n%2 == 1){ //check all the conditions
                lowest = n;
                flagHasOdd = true; //set our 'flag' variable to true if we have entered the condition (meaning that we have found a lowest positive odd number)
            }
        }while (n > 0);
        
        if (flagHasOdd == false) //if our 'flag' variable is set to false, it means we didn't find any LOWEST POSITIVE ODD NUMBER inputs
            System.out.println("No ODD number inputs");
        else
            System.out.println("\nLowest Odd: " + lowest);
        
    }
}
