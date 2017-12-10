
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

public class VotersTally {
    public static void main(String[] args) {
        
        //[DONE] Ask user INPUT
        Scanner sc = new Scanner(System.in);
        
        //For AGREE
        System.out.println("Input the number of those who AGREE to have a charter change: ");
        int numAgree = sc.nextInt(); 
        
        //For DISAGREE
        System.out.println("Input the number of those who DISAGREE to have a charter change: ");
        int numDisagree = sc.nextInt();
        
        //For DO NOT care
        System.out.println("Input the number of those who DO NOT care to have a charter change: ");
        int numDonot = sc.nextInt();
        
        //[DONE] Compute and print the TOTAL number
        double totalRespondents = numAgree + numDonot + numDisagree;
        
        System.out.println("Summary of Results");
        
        System.out.println(totalRespondents + " individuals participated in the survey.");
        
        //Compute and the PERCENTAGES
        double percentAgree = numAgree / totalRespondents;
        double percentDisagree = numDisagree / totalRespondents;
        double percentDonot = numDonot / totalRespondents;
        
        //Print the percentages
        System.out.printf("%.2f percent AGREE\n", percentAgree * 100);
        System.out.println(percentDisagree * 100 + " percent DISAGREE");
        System.out.println(percentDonot * 100 + " percent DONOT");
    }
}
