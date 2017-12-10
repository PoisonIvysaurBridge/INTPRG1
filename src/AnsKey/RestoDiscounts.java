
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class RestoDiscounts {
    
    public static void main(String[] args) {
        
        //1. User input
        Scanner sc = new Scanner(System.in);
        //name
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        //membership
        System.out.print("Is member: ");
        String isMember = sc.nextLine();
        //voucher
        System.out.print("Has voucher: ");
        String hasVoucher = sc.nextLine();
        //curDate
        System.out.print("Enter current Date (MMDD): ");
        int curDate = sc.nextInt();
        //birDate
        System.out.print("Enter Birth Date (MMDD): ");
        int birDate = sc.nextInt();
        //grossTotal
        System.out.print("Enter Gross Total: ");
        double grossTotal = sc.nextDouble();
        
        //2. Compute Discounts
        double netTotal = grossTotal;
        
        //2.1 bday discount
        Boolean hasBdayDisc = false;
        //today
        if (curDate == birDate)
        {
            netTotal -= netTotal * .25;
            hasBdayDisc = true;
        }
        //tomorrow (same month, next month (non-special), month is dec. (restart))
        else if (curDate+1 == birDate || 
                 curDate+71 == birDate ||
                 (curDate == 1230 && birDate == 101))
        {
            netTotal -= netTotal * .25;
            hasBdayDisc = true;
        }
        //yesterday
        else if (curDate-1 == birDate || 
                 curDate-71 == birDate ||
                 (curDate == 101 && birDate == 1230))
        {
            netTotal -= netTotal * .25;
            hasBdayDisc = true;
        }
        
        //2.2 membership discount
        if (isMember.equalsIgnoreCase("Y") && hasBdayDisc == false)
            netTotal -= netTotal * .2;
        
        //2.3 voucher discount
        if (hasVoucher.equalsIgnoreCase("Y"))
            netTotal -= 200;
        
        //3. Service Charge (10%) of net total
        netTotal += netTotal * .1;
        
        //4. Print
        System.out.println(name + "'s Net Total: " + netTotal);
    }
    
}
