/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Driver {
    
    public static void main(String[] args) {
        
        /*
        Create the main method that will ask the user to enter 10 integers. The program should store the numbers in an integer array. Afterwards ask the user for a problem choice (represented as an integer) and do the ff:

	If choice is 2, call the countUnique method, passing the integer array as parameter.
        */
        int[] nArr = new int[10];
        Scanner sc = new Scanner(System.in);
        Driver d = new Driver();
        
        for(int i = 0; i < nArr.length; i++)
            nArr[i] = sc.nextInt();
        
        int choice = sc.nextInt();
        
        if(choice == 1){
            
            //If choice is 1, ask the user for an integer number key and call the findNumber method, passing the integer array and key as parameters.
            int key = sc.nextInt();
            int position = d.findNumber(nArr, key);
            System.out.println("Index is at : " + position);
        }
        
    }
    
    /*findNumber – this method should accept 2 parameters, an 
        integer array and an integer key. 
    
    The method should then return the index of the first 
    occurrence of key in the array. 
    If not found, the method returns –1
    
    [1, 2, 3, 1, 2, 3, 1, 2, 3, 1] KEY == 3
     0  1  2
    */
    int findNumber(int[] nArr, int key){
        
        for(int i = 0; i < nArr.length; i++)
            if (nArr[i] == key)
                return i;
        
        return -1;
    }
    
    /*countUnique – this method should accept an integer array 
    parameter. The method should then count and return the 
    number of unique elements in the array
    
    [1, 2, 3, 1, 2, 3, 1, 4, 3, 1] UNIQUE == 1
    [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] UNIQUE == 10
    
    */
    
    int countUnique(int[] nArr){
     
        int unique = 0;
        
        for(int i = 0; i < nArr.length; i++) //will be for checking all the individual elements
        {
            int nCurrent = nArr[i];
            int isUnique = 1;
            
            for(int j = 0; j < nArr.length; j++){ // will be used for checking if the current element has a duplicate on the rest of array
                
                if (nCurrent == nArr[j] && j != i)
                    isUnique = 0;
                    
            }
            
            if (isUnique == 1)
                unique++; //unique += 1;
            
        }
        
        return unique;
    }
    
}
