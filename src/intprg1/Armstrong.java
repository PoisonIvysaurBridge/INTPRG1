package intprg1;

import java.util.Scanner;
public class Armstrong{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        Armstrong ftw = new Armstrong ();
        int n = sc.nextInt();
        int orig = n;
        int nDigits = ftw.numOfDigits(n);
        if (ftw.isNarcissistic (n))
            System.out.println("ARMSTRONG");
        else
            System.out.println("NOT");
    }
    // get no. of digits
    int numOfDigits(int n){
        int nDigits=0;
        while (n>0){
        n/=10;
        nDigits++;
        }
    return nDigits;
    }

    // pow
    int pow (int base, int exp){
        int result = 1;
        int j =1;
        while (j<=exp){
            result *= base;
            j++;
        }
        return result;
    }

    boolean isNarcissistic (int num){
        int sum = 0;
        while (num>0){
            int exp = pow(num%10, numOfDigits(num));
            num/=10;
            sum+=exp;
        }
        if (num==sum)
            return true;
        else
            return false;
    }
}