package intprg1;
import java.util.Scanner;

public class Ex4SqOrCircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Square of Circle (1 or 2): ");
        int ans = sc.nextInt();
        
        if (ans==1){
            System.out.print("Side of Square: ");
            double side = sc.nextDouble();
            double sqPeri = side * 4;
            double sqArea = side * side;
            System.out.println("\nArea of Square = "+sqArea);
            System.out.println("Perimeter of Square = "+sqPeri);
        }
        else if (ans==2){
            System.out.print("Radius: ");
            double rad = sc.nextDouble();
            double circum = 2*Math.PI *rad;
            double cirArea = Math.PI * rad * rad;
            System.out.println("\nArea of CIrcle = "+cirArea);
            System.out.println("Perimeter of Circle (Crcumference) = "+circum);
        }
        else{
            System.out.println("Invalid Input!");
        }
   
    }
}