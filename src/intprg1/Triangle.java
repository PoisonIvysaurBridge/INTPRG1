package intprg1;
import java.util.Scanner;
public class Triangle{
    public static void main(String[] args) {
        System.out.print("n: ");
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        
        //triangle with space
        int bnd=n, k=1;
        while (k<=n){
            int j=1;
            while (j<=n){
                if (j>=bnd){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
                j+=1;
            }
            k+=1;
            bnd-=1;
            System.out.print("\n");
        }
        System.out.println();
        //upside down triangle w/ space
        bnd=1;
        k=1;
        while (k<=n){
            int j=1;
            while (j<=n){
                if (j>=bnd){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
                j+=1;
            }
            k+=1;
            bnd+=1;
            System.out.print("\n");
        }
        System.out.println();
        //triangle w/o spaces
        int bnd1=n, bnd2=n;
        k=1;
        while (k<=n){
            int j=1;
            while (j<=2*n-1){
                if (j>=bnd1 && j<=bnd2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                j+=1;
            }
            k+=1;
            bnd1-=1;
            bnd2+=1;
            System.out.print("\n");
        }
        System.out.println();
        // upside down triangle w/o spaces
        bnd1=1;
        bnd2=2*n-1;
        k=1;
        while (k<=n){
            int j=1;
            while (j<=2*n-1){
                if (j>=bnd1 && j<=bnd2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                j+=1;
            }
            k+=1;
            bnd1+=1;
            bnd2-=1;
            System.out.print("\n");
        }
        System.out.println();
        //hollow triangle 
        bnd1=n;
        bnd2=n;
        k=1;
        while (k<=n){
            int j=1;
            while (j<=2*n-1){
                if (j==bnd1 || j==bnd2 || k==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                j+=1;
            }
            k+=1;
            bnd1-=1;
            bnd2+=1;
            System.out.print("\n");
        }
        System.out.println();
        // upside down hollow triangle
        bnd1=1;
        bnd2=2*n-1;
        k=1;
        while (k<=n){
            int j=1;
            while (j<=2*n-1){
                if (j==bnd1 || j==bnd2 || k==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                j+=1;
            }
            k+=1;
            bnd1+=1;
            bnd2-=1;
            System.out.print("\n");
        }
    }
}