package intprg1;
import java.util.Scanner;
public class Ex7{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Ex7 ex = new Ex7();
        System.out.println("#1");
        System.out.print("n: ");
        int n = sc.nextInt();
        System.out.print("m: ");
        int m = sc.nextInt();
        int sum = ex.getSum_n_to_m(n,m);
        System.out.println("Sum is "+sum);
        
        System.out.println("#2");
        System.out.print("enter 1st parameter: ");
        int p1 = sc.nextInt();
        System.out.print("enter 2nd parameter: ");
        String p2 = sc.next();
        System.out.print("enter 3rd parameter: ");
        int p3 = sc.nextInt();
        String str = ex.print3params(p1, p2, p3);
        System.out.println(str);
        
        System.out.println("#2");
        System.out.println("   1   2   3   4\nA [ ] [ ] [ ] [ ]\nB [ ] [ ] [ ] [ ]\nC [ ] [ ] [ ] [ ]\nD [ ] [ ] [ ] [ ]\n");
        System.out.println("String Position: ");
        String strPosi = sc.next();
        int nPosi = ex.returnIntPosi(strPosi);
        System.out.println("Integer Position: "+nPosi);
    }
    int getSum_n_to_m(int n, int m){
        if (n > m){
            int temp = n;
            n = m;
            m = temp;
        }
        int sum = 0;
        for (;n<=m; n++){
            sum+=n;
        }
        return sum;
    }
    String print3params(int p1, String p2, int p3){
        String str="";
        String space = " ";
        for (int i = 1; i<= p1; i++)
            str+=space;
        for (int i = 1; i<=p3; i++)
            str+=p2;
        return str;
    }
    int returnIntPosi(String strPosi){
        int nPosi=0;
        String ch = strPosi.substring(0,1);
        String numPosi = strPosi.substring(1);
        int num = Integer.parseInt(numPosi);
        if (ch.equalsIgnoreCase("A"))
            nPosi = num+0;
        else if (ch.equalsIgnoreCase("B"))
            nPosi = num+4;
        else if (ch.equalsIgnoreCase("C"))
            nPosi = num+8;
        else if (ch.equalsIgnoreCase("D"))
            nPosi = num+12;
        return nPosi;
    }
}
