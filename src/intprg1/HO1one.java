package intprg1;

import java.util.Scanner;
public class HO1one{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Input the number of those who AGREE to have a charter change: ");
        int agree = sc.nextInt();
        System.out.print("Input the number of those who DISAGREE to have a charter change: ");
        int dis = sc.nextInt();
        System.out.print("Input the number of those who DO NOT have an opinion:  ");
        int doNot = sc.nextInt();
        
        double total = agree + dis + doNot;
        double Pagree= agree/total*100;
        double Pdis = dis/total*100;
        double PdoNot = doNot/total*100;
        
        System.out.printf(total+" individuals participated in the survey.");
        System.out.printf("\n%.2f percent AGREE.",Pagree);
        System.out.printf("\n%.2f percent DISAGREE.",Pdis);
        System.out.printf("\n%.2f percent DO NOT have an opinion.",PdoNot);
    }
}