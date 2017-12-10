package intprg1;

import java.util.Scanner;

public class MilitaryTimeConvert{
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        System.out.print("enter time: ");
        int time = sc.nextInt();
        //separate hour and minute
        int hh = time/100;
        int mm = time%100;
        // AM
        if (hh<12){
            if (hh==0)
                hh=12;
            System.out.println(hh+":"+mm+"a.m.");
        }
        //PM
        else {
            hh = hh%12;
            if (hh==0)
                hh=12;
            System.out.println(hh+":"+mm+"p.m.");
        }
        
}
}