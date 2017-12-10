package intprg1;
import java.util.Scanner;
public class Ex2UsingLibraries{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("\n#1 & 2:MINUMUM & MAXIMUM method ");
        System.out.print("enter an integer: ");
        int num1= sc.nextInt();
        System.out.print("enter another integer: ");
        int num2= sc.nextInt();
        //#1
        int smaller= Math.min(num1, num2);
        System.out.println("smaller: "+smaller);
        //#2
        int larger =  Math.max(num1,num2);
        System.out.println("larger: "+larger);
        //#3
        System.out.println("\n#3: ******** Exponent method *******");
        System.out.print("enter base: ");
        int base= sc.nextInt();
        System.out.print("enter exp: ");
        int exp = sc.nextInt();
        double baseExp= Math.pow(base, exp);
        System.out.println("base^exp: "+baseExp);
        //#4
        System.out.println("\n#4: Floor & Ceil method");
        System.out.print("enter a number: ");
        float num=sc.nextFloat();
        double floor= Math.floor(num);
        double ceil = Math.ceil(num);
        System.out.println("floor value: "+floor+"\n"+"ceiling value: "+ceil);
        
        //#5
        System.out.println("\n#5: Area of a Circle");
        System.out.print("enter radius: ");
        double rad = sc.nextDouble();
        double area= Math.PI * rad*rad;
        System.out.println("the area of the circle is: "+area);
        
        //#6
        System.out.println("\n #6");
        Scanner Sc = new Scanner (System.in);
        System.out.print("enter a sting with even length: ");
        String str= Sc.nextLine();
        char one = str.charAt(((str.length())/2)-1);
        char two = str.charAt((str.length())/2);
        System.out.println(one+""+two);
                
        //#7
        System.out.println("\n #7");
        Scanner sc7 = new Scanner (System.in);
        System.out.print("String: ");
        String str7= sc7.nextLine();
        System.out.print("N: ");
        int n= sc.nextInt();
        String one7 = str7.substring(0,n);
        String two7 = str7.substring((str7.length()-n),str7.length());
        System.out.println(one7+""+two7);
        
        //#8
        System.out.println("\n#8: Peso Currency");
        System.out.print("enter Peso amount: ");
        int amt= sc.nextInt();
	int oneK= amt/1000;
	amt= amt %1000;
	int hun5= amt/ 500;
	amt=amt%500;
	int hun2= amt/200;
	amt= amt%200;
	int hun1= amt/100;
	amt= amt%100;
	int fifty= amt/50;
	amt= amt%50;
	int twen = amt/20;
	amt=amt%20;
	int ten= amt/10;
	amt=amt%10;
	int five = amt/5;
	int ones=amt%5;

	System.out.println("\n"+" 1000-bill"+oneK+
	"\n500-bill = "+hun5+
	"\n200-bill = "+hun2+
	"\n100-bill = "+hun1+
	"\n50-bill = "+fifty+
	"\n20-bill = "+twen+
	"\n10-coin = "+ten+
	"\n5-coin = "+five+
	"\n1-coin = "+ones);
}
}