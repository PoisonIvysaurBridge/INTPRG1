package intprg1;
import java.util.Scanner;
public class Practice9{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Practice9 meth = new Practice9();
        int [] inputs = new int [10];
        for (int i = 0; i<inputs.length; i++){
            System.out.print("enter integer: ");
            int n = sc.nextInt();
            inputs[i] = n;
        }
        System.out.println("enter choice: ");
        int choice = sc.nextInt();
        if (choice==1){
            System.out.print("enter key: ");
            int key = sc.nextInt();
            int index = meth.findNumber(inputs, key);
            System.out.println("index: "+index);
        }
        else if (choice==2){
            int nUnique = meth.countUnique(inputs);
            System.out.println("number of unique inputs: "+nUnique);  
        }
        else
            System.out.println("invalid input!");
            }
    int findNumber(int [] array, int key){
        int index = -1;
        for (int i = 0; i<array.length; i++){
            if (array[i]==key)
                index = i;
        }
        return index;
    }
    int countUnique(int [] array){
        int nUni= 0;
        for (int i =0; i<array.length; i++){
            boolean check = true;
            for (int j = 0; j <array.length; j++){
                if (array[i]==array[j] && j!=1)
                    check = false;
            }
            if (check)
                nUni++;
        }
        return nUni;
    }
}