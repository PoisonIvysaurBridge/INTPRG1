package intprg1;

import java.util.Scanner;
public class sampleArray{
    public static void main(String[] args) {
        
        int Sum=0;
        int j=0;
        boolean cont=true;
        int [] posiNums=new int [5];
        int sub=0;
        
        while (cont==true){
            System.out.print("enter number: ");
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            
            if (num < 0){
                cont=false;
            }
            else{
                posiNums[sub]=num;
                Sum+=num;
            }
            sub+=1;
        }
        System.out.print(posiNums);
        System.out.print(Sum);
    }
}
