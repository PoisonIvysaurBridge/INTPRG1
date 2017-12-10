
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
public class Ex61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        double input = sc.nextDouble();
        int n = 0;
        
        while (n * 2 < input) //loop while 2n is smaller than input ... increment n continuously by 1
            n++;
        // when the loop ends, the value of 2n should have been greater than or equal to input
        
        System.out.println("n: " + n);
        System.out.println("2n: " + (n*2));
        
    }
}
