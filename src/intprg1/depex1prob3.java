package intprg1;
import java.util.Scanner;
public class depex1prob3
{
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter number w/ even no. of digits: ");
        int n = sc.nextInt();
        int temp = n, multiplier=1, sum = 0;
        while (temp > 10){
                multiplier*=10;
                temp /= 10;
        }
        while (n>0){
            // get right most
            int right = n%10;
            // get left most
            int left = n/multiplier;
                System.out.println(left);
            // multiply L & R and store it to sum
            System.out.println(left +" * "+right+" = "+(left*right));
            sum+= left * right;

            // remove left most
            n%=multiplier;
            // remove right most
            n/=10;
            // increment
            multiplier /= 100;
        }
        System.out.println("SUM = "+sum);
        // ####################### MY SOLUTION ########################
        /*Scanner s = new Scanner (System.in);
        // get the number of digits of n
        System.out.print("n: ");
        int n = s.nextInt();
        int nDigits = (int)(n+"").length();
        // get the product and sum
        int prod = 1, j = 0, sum = 0, limit = nDigits/2;
        while (j<=limit){
            int divisor = (int) Math.pow(10,nDigits-1);
            if (divisor>0){
                int left = n/divisor;
                int right = n%10;
                prod = left*right;
                System.out.println(left+"*"+right+"="+prod);
                n = (n%divisor)/10;
                sum+=prod;
            }
            nDigits-=2;
            j++;
        }
        System.out.println("SUM: "+sum);*/
	}
}