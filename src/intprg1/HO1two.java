package intprg1;

import java.util.Scanner;
public class HO1two{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Customer Name: ");
        String name = sc.next();
        System.out.print("Is Member: ");
        String isMember = sc.next();
        System.out.print("Has Voucher: ");
        String hasVou = sc.next();
        System.out.print("Current Date: ");
        int date = sc.nextInt();
        System.out.print("Customer Birthday: ");
        int bday = sc.nextInt();
        System.out.print("Gross Total: ");
        double gross = sc.nextDouble();
        
        // date
        boolean isBday = false;
        int cDay = date%100;
        int cMonth = date/100;
        int bDay = bday%100;
        int bMonth = bday/100;
       
        if (cMonth==bMonth){
            if (cDay==bDay || cDay-bDay == 1 || bDay-cDay==1){
                isBday = true;
            }
        }
        else if(cDay==1 && bDay==30){
            if (cMonth-bMonth==1 || cMonth==1 && bMonth==12){
                 isBday = true;
            }
        }
        else if (bDay==1 && cDay==30){
            if (bMonth-cMonth==1 || cMonth==12 && bMonth==1){
                isBday = true;
            }
        }
        
        //discounts
        double discount=0;
        if (isBday==true){
            discount = 0.25*gross;
        }
        else if (isMember.equalsIgnoreCase("Y")){
            discount = 0.2*gross;
        }
        if (hasVou.equalsIgnoreCase("Y")){
            discount = discount + 200;
        }
        double result = gross - discount;
        double net = result + result*0.1;
        System.out.println(name+"'s Net Total Bill: "+net);
    }
}