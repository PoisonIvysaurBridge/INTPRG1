package intprg1;

/*PROBLEM 3: BMI Calculator-create a program that will compute the BMI based on a given weight in pounds (lbs)
and height in inches (in).*/
import java.util.Scanner;
public class Ex1BMI_Cal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("######### BMI Calculator #########");
        System.out.print("enter weight in pounds: ");
        float lb=sc.nextFloat();
        System.out.print("enter height in inches: ");
        float in=sc.nextFloat();
        
        double kg = lb * 0.4535;
        double ft = in/12;
        double m = ft * 0.3048;
        
        double BMI = kg/(m*m);
        System.out.println("your BMI is: "+BMI);
    }
}