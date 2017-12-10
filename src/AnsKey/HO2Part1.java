
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
public class HO2Part1 {
    
    //main – which reads the inputs n and m, and display the result of C(n, m)
    //10 PTS
    public static void main(String[] args) {
     
        HO2Part1 ho2p1 = new HO2Part1();
        Scanner sc = new Scanner(System.in);
        
        //reads the inputs n and m (3 PTS)
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        
        //display the result of combination(int n, int m)
        int result = ho2p1.combination(n, m); //4 PTS
        System.out.println("Result is: " + result); //3 PTS
    }
    
    //factorial(n) – which computes for n!.  This method is called by method combination
    //10 PTS
                 //2PTS
    int factorial(int n){
        int factorial = 1; //2 PTS
        
        
        while(n > 0){ //2 PTS
            factorial *= n; //2 PTS
            n--;
        }
        
        return factorial; //2 PTS
    }
    
    //combination (n, m) – which computes for C(n, m).  This method will call the method factorial.
    //10 PTS
                    //2PTS
    int combination(int n, int m){
        int result = 0;
        HO2Part1 ho2p1 = new HO2Part1();
        
        result = ho2p1.factorial(n) / ho2p1.factorial(m) * ho2p1.factorial((n - m)); //5PTS
        
        return result; //3 PTS
    }
    
}
