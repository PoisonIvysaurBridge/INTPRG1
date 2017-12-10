
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
public class Ex62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        double x = sc.nextDouble();
        double cubeRoot = Math.cbrt(x); //use Math.cbrt() method to get the cuberoot
        int n = 0;
        
        //Note: this is the long method using loops ... you can actually do this without using loops by using the Math.round() method
        
        while (n < cubeRoot) //similar to #1, loop while n is not yet greater than or equal to cubeRoot
            n++;
            
        //the next 2 statements compute and store the difference of the last 2 integers. The integer with less difference (or closest to the cubeRoot) will be the one printed out
        double diff1 = n - cubeRoot;
        double diff2 = cubeRoot - (n-1);
        
        if (diff2 < diff1)
            n--;
        
        System.out.println("n: " + n);
        
    }
}
