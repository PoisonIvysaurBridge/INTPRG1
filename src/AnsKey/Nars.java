
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Nars {
    
/* This method returns the number of digits of nNum. */
   int numOfDigits(int nNum)
   {
       int numDigits = 0;
       while(nNum > 0)
       {
           nNum /= 10;
           numDigits++;
           
       }
       
       return numDigits;
   }

/* This method returns nBase raised to the power of nExp. */
   int pow(int nBase, int nExp)
   {
       int result = nBase;
       for(int i = 1; i < nExp; i++)
           result *= nBase;
       
       return result;
   }

/* This method determines whether nNum is a narcissistic number or not. */
   public boolean isNarcissistic(int nNum)
   { boolean isNarc = false;
     int nSum = 0, nTemp, nDigits;
     Nars n = new Nars();
     nDigits = n.numOfDigits(nNum);
     
     nTemp = nNum;
     while(nNum > 0){
         
         nSum += n.pow(nNum % 10, nDigits);
         
         nNum /= 10;
     }
     
     if (nTemp == nSum)
         isNarc = true;
     
     return isNarc;
   }

   public static void main(String[] args)
   { int nNum1, nNum2, nTemp, nCount = 0; 
     Scanner sc = new Scanner(System.in);
     System.out.print ("Input two digits: ");
     nNum1 = sc.nextInt();
     nNum2 = sc.nextInt();
     Nars n = new Nars();

  /* Supply the needed statements/codes that count the number of narcissistic numbers 
     from nNum1 to nNum2 (inclusive). Assume first input value is always smaller than
     or equal to the second input value   */

     for(int i = nNum1; i <= nNum2; i++)
     {
         if (n.isNarcissistic(i))
             nCount++;
     }
  
    System.out.println("The number of narcissistic numbers between " + nNum1 + " and " + nNum2 + " is " + nCount);
 }
}

