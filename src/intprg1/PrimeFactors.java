package intprg1;
import java.util.Scanner;
public class PrimeFactors{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        /*System.out.print("Number: ");
        int n = sc.nextInt();
        boolean bFirst = true;
        int factor = 2;
        while (factor <= n){
            if (n%factor==0){
                int j = 2;
                while (j < factor && factor%j!=0)
                    j++;
                if (j==factor){
                    if (!bFirst) System.out.print(",");
                    System.out.print(factor);
                    bFirst = false;
                }
                n/=factor;
            }
            factor++;
        }*/
        /*System.out.print("Height: ");
        int nHeight = sc.nextInt();
        System.out.print("Width: ");
        int nWidth = sc.nextInt();
        int i,j;
        for (i = 0; i < nHeight; i++){
            System.out.print("x");
            for (j = 1; j<nWidth-1; j++){
                if (i==nHeight/2) System.out.print("x");
                else System.out.print(" ");
            }
            System.out.println("x");
        }*/
        int nEnd;
        do{
            System.out.print("n= ");
            nEnd = sc.nextInt();
            if (nEnd <= 0)
                System.out.println("non-nega only");
            
        }while(nEnd <0);
        
        int nSum = 0, nProd = 1, i;
        for (i = 0; i <=nEnd; i++){
            nSum+=nProd;
            System.out.print(nProd);
            if (i != nEnd) System.out.print(" + ");
            nProd +=2;
        }
        System.out.println(" = "+nSum);
    }
}