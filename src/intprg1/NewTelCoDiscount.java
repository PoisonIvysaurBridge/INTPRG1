package intprg1;

import java.util.Scanner;

public class NewTelCoDiscount{
    public static void main(String[] args) {
        // user input
        Scanner sc = new Scanner (System.in);
        System.out.print("enter start time: ");
        int start = sc.nextInt();
        System.out.print("enter length of call in minutes: ");
        int duration = sc.nextInt();
        //get gross and tax
        double gross = duration*5;
        double tax = gross*0.04;
        double cost = gross;
        // 50% discount from 6pm to 8am
        if (start > 1800 && start <=800)
            cost = cost * 0.5;
        if (duration > 60)
            cost = cost *0.15;
        System.out.println("gross cost: "+gross);
        System.out.println("net cost: "+(cost+tax));
        
}
}