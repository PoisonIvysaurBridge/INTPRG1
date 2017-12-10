package intprg1;

import java.util.Scanner;

public class CaseSwitch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 3-digit number: ");
        int num = sc.nextInt();
        int n = num / 100;
        switch (n){
            default: System.out.println("INVALID"); break;
            case 1:
            case 3:
            case 5:   
            case 7:
            case 9: System.out.println("ODD"); break;
            case 2:
            case 4:
            case 6:   
            case 8: System.out.println("EVEN"); break;
            
        }
        
}
}