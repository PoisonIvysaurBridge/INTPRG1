
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lance
 */
public class Ex9AnswerKey {
    
    public static void main(String[] args) {
        
        Ex9AnswerKey m = new Ex9AnswerKey();
        Scanner sc = new Scanner(System.in);
        
        int[] nArr = new int[10]; //declare and initialize an array of size 10 (can contain 10 integers)
        
        System.out.println("Enter 10 numbers:");
        
        for(int i = 0; i < nArr.length; i++) //create a loop that asks the user for integer inputs 10 times, storing each user input one by one inside the array
            nArr[i] = sc.nextInt();
        
        System.out.print("Select a problem number: ");
        int choice = sc.nextInt();
        
        //switch that will call the respective method depending on the user's input
        switch(choice){
            case 1: int oddSum = m.computeOddSum(nArr);
                    System.out.println("ODD SUM: " + oddSum);
                    break;
            case 2: int highest = m.findHighest(nArr);
                    System.out.println("HIGHEST: " + highest);
                    break;
            case 3: boolean result = m.checkPalindrome(nArr);
                    if (result)
                        System.out.println("NUMBER IS A PALINDROME");
                    else
                        System.out.println("NUMBER IS NOT A PALINDROME");
                    break;
            default: System.out.println("INVALID CHOICE!");
        }
        
    }
    
    int computeOddSum(int[] pArr){
        
        int sum = 0; //declare the var sum for storing the sum of all odd numbers
        
        //create a loop that traverses the whole array (from index 0 up to index 9)... use pArr.length to make sure that you stop at the last index in the array
        for(int i = 0; i < pArr.length; i++){
            if (pArr[i] % 2 == 1) //if the integer value stored at the current element at index i is ODD
                sum = sum + pArr[i]; //add the value to sum
        }
        
        return sum; //return the value of sum
    }
    
    int findHighest(int[] pArr){
        int highest = pArr[0]; //assume that the first element is the highest
        
        //create a loop that traverses the array from index 1 to 9 (you already have the value from the element at index 0 stored in highest)
        for(int i = 1; i < pArr.length; i++){
            if (pArr[i] > highest) //if the integer value stored at the current element at index i is highest than the highest
                highest = pArr[i]; //set it as the new highest
        }
        
        return highest; //return the highest value
    }
    
    boolean checkPalindrome(int[] pArr){
        boolean isPalindrome = true;
        int i = 0;
        
        //while the variable isPalindrome is still true and there are still elements to compare, do the loop
        while(isPalindrome && i < pArr.length / 2){
                                                      //note: remember that an array's last index is equal to array.length - 1 (so if size 10 array, the last index is 9)
            if (pArr[i] != pArr[(pArr.length-1) - i]) //compare elements two at a time, starting from the leftmost and the rightmost
                isPalindrome = false; //if they are not equal, it is not a palindrome
            
            i++;
        }
        
        return isPalindrome; //return the status if the number is a palindrome or not
    }
    
}
