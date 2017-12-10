package intprg1;
import java.util.Scanner;
public class Ex5Feb17SingleLoops{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        /*Create a program that will take as input a whole number, and then perform the following computations:
        1. Count how many digits are there in the number. 
        Input: 412473       Number of digits: 6
        Input: 15678        Number of digits: 5 
        Input: 3            Number of digits: 1*/
        System.out.print("Input: ");
        int num = sc.nextInt();
        int j =0;
        while (num>0){
            num/=10;
            j++;
        }
        System.out.println(j);
        /*2. Determine how many of the input’s digits are odd, and how many are even. 
        Input: 41247        Number of digits: 6     Number of odd digits: 3     Number of even digits: 3
        Input: 15678        Number of digits: 5     Number of odd digits: 3     Number of even digits: 2
        Input: 3            Number of digits: 1     Number of odd digits: 1     Number of even digits: 0*/
        System.out.print("Input: ");
        num = sc.nextInt();
        int even = 0, odd = 0;
        j=0;
        while (num > 0){
            int digi=num%10;
            if (digi%2==0)
               even++;
            else
               odd++;
            num/=10;
            j++;
        }
        System.out.println("Number of digits: "+j+"\nNumber of odd digits: "+odd+"\nNumber of even digits: "+even);
        /*3. Compute for the product of the even-positioned digits. Position 1 is with the right-most or 
        1’s unit. So, your program should get the product of the 10’s unit, 1000’s unit, ...).
        Input: 412473       Number of digits: 6     Number of odd digits: 3     Number of even digits: 3        Product: 56
        Input: 15678        Number of digits: 5     Number of odd digits: 3     Number of even digits: 2        Product: 35
        Input: 3            Number of digits: 1     Number of odd digits: 1     Number of even digits: 0        Product: 0
        */
        System.out.print("Input: ");
        num = sc.nextInt();
        int product = 1;
        j=0; odd = 0; even = 0;
        while (num > 0){
            int digi=num%10;
            if (digi%2==0)
               even++;
            else
               odd++;
            num/=10;
            j++;
            if (j%2 == 0)
                product*=digi;
        }
        System.out.println("Number of digits: "+j+"\nNumber of odd digits: "+odd+"\nNumber of even digits: "+even+"\nProduct: "+product);
    }
}