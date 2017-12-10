package intprg1;
import java.util.Scanner;

public class SlySlickCar{
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        System.out.print("enter positive time in seconds: ");
        int time = sc.nextInt();
        // get remainder
        int sec = time % (30+55+47+38);
        String where;
        if (sec > (30+55+47) || sec == 0)
            where = "asphalt";
        else if (sec > 30+55)
            where = "sand";
        else if (sec > 30)
            where = "mud";
        else
            where = "concrete";
        System.out.println("where: "+where);
        
}
}