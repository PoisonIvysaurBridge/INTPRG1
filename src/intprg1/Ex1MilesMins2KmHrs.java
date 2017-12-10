package intprg1;

/*PROBLEM 2: Kilometers	/Hour calculator function – create a program that will compute for
the speed of a car in km/h (kilometers/hour) based on two variables: 1.)the distance travelled	
in miles (yes, that is miles) and 2.)the time in minutes it took the car to travel the distance.	
Assume that only the value of minutes is a whole number and distance travelled is a real number 
(can	have decimal	points).The result calculated (km /h)should be printed out as a	real number.*/
import java.util.Scanner;
public class Ex1MilesMins2KmHrs{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("######### Mi/mins to km/hr converter #########");
        System.out.print("enter distance traveled in miles: ");
        float miles= sc.nextFloat();
        System.out.print("enter time in minutes: ");
        int mins=sc.nextInt();
        
        double km = miles* 1.60934;
        int hr = mins/60;
        double kmHr= km/hr;
        System.out.println(kmHr+" km/hr.");
    }
}