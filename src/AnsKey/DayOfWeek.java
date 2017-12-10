
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int numInput = sc.nextInt();
        
        if (numInput == 1)
            System.out.println("Monday");
        else if (numInput == 2)
            System.out.println("Tuesday");
        else if (numInput == 3)
            System.out.println("Wednesday");
        else if (numInput == 4)
            System.out.println("Thursday");
        else if (numInput == 5)
            System.out.println("Friday");
        else if (numInput == 6)
            System.out.println("Saturday");
        else if (numInput == 7)
            System.out.println("Sunday");
        else
            System.out.println("Invalid input!");
    }
}
