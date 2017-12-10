
import java.util.Scanner;

public class ShapeCompute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Square or Circle? ");
        String shape = sc.nextLine();
        
        if (shape.equalsIgnoreCase("circle")){
            System.out.print("Enter radius: ");
            double radius = sc.nextDouble();
            
            System.out.println("Area: " + (Math.pow(radius, 2) * Math.PI));
            System.out.println("Perimeter: " + (2 * Math.PI * radius));
        }
        
        else if (shape.equalsIgnoreCase("square")){
            System.out.print("Enter side size: ");
            double side = sc.nextDouble();
            
            System.out.println("Area: " + (Math.pow(side, 2)));
            System.out.println("Perimeter: " + (4 * side));
        }
        
        else
            System.out.println("Invalid input!");
    }
    
}
