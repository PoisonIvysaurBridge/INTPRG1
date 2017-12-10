package intprg1;
import java.util.Scanner;
public class Ex9Arrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Ex9Arrays m = new Ex9Arrays();
        System.out.println("enter 10 numbers: ");
        int i;
        int [] inputs = new int [10];
        for (i=0; i < 10; i++){
            System.out.print("enter n: ");
            int n = sc.nextInt();
            inputs [i] = n;
        }
        System.out.print("Enter number: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1: int sumOdd = m.computeOddSum(inputs);
                    System.out.println("SUM OF ODD: "+sumOdd); break;
            case 2: int highest = m.findHighest(inputs);
                    System.out.println("HIGHEST: "+highest);  break;
            case 3: m.checkPalindrome(inputs); break;
            default: System.out.println("INVALID CHOICE");
        }
    }
    int computeOddSum (int [] array){
        int sum = 0;
        for (int i = 0; i<array.length; i++)
            if (array[i] %2!=0)
                sum+=array[i];
        return sum;
    }
    int findHighest(int [] array){
        int highest = array [0];
        for (int i = 0; i<array.length; i++)
            if (array[i] > highest)
                highest = array [i];
        return highest;
    }
    void checkPalindrome (int [] array){
        boolean cont = false;
        int last = array.length -1;
        for (int i = 0; i < array.length/2; i++){
                if (array[i]!= array[last])
                    cont = true;
                last--;
        }
        if (cont==false)
            System.out.println("PALINDROME");
        else
            System.out.println("NORMAL NUMBER");
    }
}