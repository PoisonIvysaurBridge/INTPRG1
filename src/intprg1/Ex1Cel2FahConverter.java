package intprg1;

/*PROBLEM 1: Celsius to Fahrenheit	Converter – create a program that will ask the user for an 
input Celsius number (e.g. 36.6). The program should then compute and display for the	
Fahrenheit equivalent of the user’s input.*/
import java.util.Scanner;
public class Ex1Cel2FahConverter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("######### Celsius to Fahrenheit Converter #########");
        System.out.print("enter Celsius: ");
        float cel=sc.nextFloat();
        float fah= cel*9/5+32;
        System.out.println("Fahrenheit equivalent: "+fah);
        
        //Fahrenheit to Celsius °C = (°F - 32) × 5/9
        System.out.println("######### Fahrenheit to Celsius Converter #########");
        System.out.print("enter Fahrenheit: ");
        fah=sc.nextFloat();
        cel= (fah-32)*5/9;
        System.out.println("Celsius equivalent: "+cel);
        
    }
}