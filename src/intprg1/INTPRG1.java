/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intprg1;

import java.util.Scanner;

/**
 *
 * @author Robin
 */
public class INTPRG1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        System.out.print("String: ");
        String str= sc.nextLine();
        System.out.print("N: ");
        int n= sc.nextInt();
        String one = str.substring(0,n);
        String two = str.substring((str.length()-n),str.length());
        System.out.println(one+""+two);
    }
    
}
