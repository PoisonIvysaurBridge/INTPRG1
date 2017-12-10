package intprg1;
import java.util.Scanner;
public class ArrayExercise{
    public static void main(String[] args) {
        ArrayExercise m = new ArrayExercise();
    /*Write a program that has 6 methods, main included. The 2nd method should initialize the array of 10 with inputs. 
    The third method should display the array inputs. The fourth method should compute for the average of the inputs. 
    The fifth method should compute for the minimum input and the sixth should find the maximum.*/
        int [] inputs = m.initArray();
        m.displayArray(inputs);
        double ave = m.getAverage(inputs, 10);
        System.out.println("Average of the inputs: "+ave);
        int min = m.getMin(inputs);
        System.out.println("Minimum input: "+min);
        int max = m.getMax(inputs);
        System.out.println("Maximum input: "+max);
        m.searchKey(inputs);
    }
    int [] initArray(){ // 2nd method
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 10 inputs :)");
        int j = 10, sub = 0;
        int [] inputs = new int [10];
        do{
            System.out.print("n: ");
            int n = sc.nextInt();
            inputs [sub]=n;
            sub++;
            j--;
        }while (j>0);
        return inputs;
    }
    void displayArray(int [] array){    // 3rd method
        for (int i=0; i<array.length; i++)
            System.out.print(array[i]+" ");
        
    }
    double getAverage(int [] array, int j){ //4th method 
        int sum = 0;
        for (int i = 0; i<array.length; i++)
            sum+=array[i];
        double average = sum/j;
        return average;
    }
    int getMin(int [] array){   // 5th method
        int min = array[0];
        for (int i = 0; i<array.length; i++)
            if (array[i] < min)
                min = array[i];
        return min;
    }
    int getMax(int [] array){
        int max = array[0];
        for (int i = 0; i<array.length; i++)
            if (array[i] > max)
                max = array [i];
        return max;
    }
    /*Write a program that takes the input of a user(variable: key) and searches the variable in the array[10]. 
    The program should return the index of the value. There should also be a method for search(public ___ search(___)). 
    Assume that the user will not input the same integer twice.
    array values: 10, -5, 2, 7, 5, 0, 15, 12, 11, 9
    e.g. key = 7
      print(3) 
      key = 13
      print(ERROR) or print a invalid index*/
    void searchKey(int [] array){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Key: ");
        int key = sc.nextInt();
        int sub = -1;
        for (int i = 0; i<array.length; i++)
            if (array[i]== key)
                sub = i;
        if (sub!=-1)
            System.out.println("index: "+sub);
        else
            System.out.println("ERROR: invalid index");
    }
    /*Based on the given array, reverse the digits from first and last, second and second to the last, etc. 
    There should also be a separate method for reverse(public ___ reverse(___)).
    e.g. array values: 10, -5, 2, 7, 5, 0, 15, 12, 11, 9
       output: 9, 11, 12, 15, 0, 5, 7, 2, -5, 10
    for example:
        10 ----------------|
        -5  ------------|  |
         2  -------  |  |  |
         7  ------|  |  |  |
         5 --- |  |  |  |  |
         0 --- |  |  |  |  | 
         15 ------|  |  |  |         
         12 -------- |  |  | 
         11 ------------|  |
         9   --------------|
    */
    void reverseArray(int [] array){
        int i = 0;
        for(i=0; i<array.length/2; i++){
            int temp = array [i];
            array [i] = array [array.length-1-i];
            array [array.length-1-i] = temp;
        }
    }
}