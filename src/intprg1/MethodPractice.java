package intprg1;

import java.util.Scanner;

public class MethodPractice{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        MethodPractice mp = new MethodPractice();
        System.out.println("#1  isPositive method");
        System.out.print("enter value: ");
        int value = sc.nextInt();
        System.out.println(mp.isPositive(value));
        System.out.println("#2  F/C converter");
        System.out.print("enter temperature: ");
        double temp = sc.nextDouble();
        System.out.print("enter unit of measure: ");
        char unit = sc.next().charAt(0);
        System.out.println("converted: "+mp.FahCelConvert(temp, unit));
        System.out.println("#3  prime numbers");
        System.out.print("enter n1: ");
        int n1 = sc.nextInt();
        System.out.print("enter n2: ");
        int n2 = sc.nextInt();
        mp.primeNos(n1, n2);
        System.out.println("#4  draw rectangle");
        System.out.print("enter width: ");
        int width = sc.nextInt();
        System.out.print("enter height: ");
        int height = sc.nextInt();
        mp.drawRectangle(width, height);
    }
    boolean isPositive(int value){  // #1
        if  (value > 0)
            return true;
        else
            return false;
    }
    double FahCelConvert(double temp, char unit){   // #2
        double result=0; 
        if (unit == 'C')
            result = 9/5 * temp + 32;
        else if (unit == 'F')
            result = 5/9 * (temp - 32);
        return result;
    }
    void primeNos(int n1, int n2){  // #3
        if (n1 > n2){
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        while (n1 <= n2){
            int j = 2;
            while (j < n1 && n1 % j !=0)
                j++;
            if (j == n1)
                System.out.println(n1);
            n1++;
        }
    }
    void drawRectangle (int width, int height){ //#4
        int k = 1;
        for (k = 1; k <= height; k++){
            int j = 1;
            for (j = 1; j <= width; j++)
                System.out.print("*");
            System.out.println("");
        }
    }
}