
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
public class PracticeMethodsAnswerKey {
    public static void main(String[] args) {
        PracticeMethodsAnswerKey p = new PracticeMethodsAnswerKey();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Select a method: ");
        int choice = sc.nextInt();
        
        if (choice == 1){
            System.out.println("Is 1 positive: " + p.isPositive(1));
            System.out.println("Is -11 positive: " + p.isPositive(-11));
        }
        else if (choice == 2){
            double tempCtoF = p.convertTemp(37.0, 'C');
            double tempFtoC = p.convertTemp(98.6, 'F');
            System.out.println("37.0C is " + tempCtoF + "F");
            System.out.println("98.6F is " + tempFtoC + "C");
        }
        else if (choice == 3){
            System.out.println("Primes between 1 to 20");
            p.displayPrimes(1, 20);
        }
        else if (choice == 4){
            System.out.println("Drawing 5x3 rectangle:");
            p.drawRectangle(5, 3);
            System.out.println("Drawing 3x6 rectangle:");
            p.drawRectangle(3, 6);
        }
        
    }
    
    boolean isPositive(float a){
        if (a >= 0)
            return true;
        else
            return false;
    }
    
    double convertTemp(double val, char type){
        
        double result = 0;
        
        if (type == 'C')
            result = val * 9.0 / 5.0 + 32.0;
        else if (type == 'F')
            result = (val - 32.0) * 5.0 / 9.0;
        
        return result;
    }
    
    void displayPrimes(int n1, int n2){
        
        boolean isPrime;
        
        while(n1 <= n2){
            
            isPrime = true;
            
            for(int i = 2; i < n1 && isPrime == true; i++){
                if (n1 % i == 0)
                    isPrime = false;
            }
            
            if (isPrime == true)
                System.out.println("Prime: " + n1);
            
            n1++;
        }
        
    }
    
    void drawRectangle(int width, int height){
        
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++)
                System.out.print("*");
            System.out.println("");
        }
        
    }
    
}
