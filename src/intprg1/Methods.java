package intprg1;
import java.util.Scanner;
public class Methods
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n# 1");
        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter n2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter n3: ");
        int n3 = sc.nextInt();
        Methods m = new Methods();
        m.get3nums(n1, n2, n3);

        System.out.println("\n# 2");
        System.out.print("enter n1: ");
        int op1 = sc.nextInt();
        System.out.print("Enter n2: ");
        int op2 = sc.nextInt();
        System.out.print("Operator: ");
        char sign = sc.next().charAt(0);
        int nResult = m.calculate(op1, op2, sign);
        System.out.println("Result: "+ nResult);

        System.out.println("\n# 3");
        int n=1;
        do{
            System.out.print("Enter n: ");
            n = sc.nextInt();
            if (n==1)
                    m.printLine();
            else if (n==2)
                    m.printSquare();
            else if (n==3)
                    m.printTriangle();
            else if (n==4){
                    m.printLine();
                    m.printSquare();
                    m.printTriangle();
            }
        }while(n!=0);

        System.out.println("\n# 4");
        int pNum, copy;
        do{
            System.out.print("Enter n: ");
            pNum = sc.nextInt();
            copy = pNum;
            String pMessage = (pNum<=0) ? "GOOD EVENING":((pNum%2!=0)?"GOOD MORNING":"GOOD AFTERNOON");
            m.displayGreeting(pNum, pMessage);
        }while(copy>0);
    }
    void get3nums(int n1, int n2, int n3){
            System.out.println(n1+"-"+n2+"-"+n3);
    }
    int calculate(int op1, int op2, char sign){
            int result=0;
            if (sign == '+')
                    result = op1+op2;
            else if (sign =='-')
                    result = op1-op2;
            else if (sign == '*')
                    result = op1*op2;
            else if (sign == '/' && op2!=0)
                    result = op1/ op2;
            return result;
    }
    void printLine(){
            System.out.print("***\n\n");
    }
    void printSquare(){
            System.out.print("***\n***\n***\n\n");
    }
    void printTriangle(){
        int j = 1, copy = 3;
        for (; j <=3; ++j){
            for (int k=1; k<=3; ++k){
                if (k>= copy)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            copy--;
            System.out.println();
        }
        System.out.println();
    }
    void displayGreeting(int n, String Msg){
        for (; n>=0; n--){
            System.out.println(Msg);
        }
    }
}