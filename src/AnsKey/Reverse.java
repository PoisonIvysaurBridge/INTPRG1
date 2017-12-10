/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Reverse {
    public static void main(String[] args) {
        
        int[] nArr = {2,6,55,18,39};
        
        for(int i = 0; i <= nArr.length / 2; i++){
            int temp = nArr[i];
            
            nArr[i] = nArr[nArr.length-1-i];
            nArr[nArr.length-1-i] = temp;
        }
        
//        for(int i = 0; i < nArr.length; i++)
//        {
//            for(int j = 0; j < nArr.length - i - 1; j++){
//                
//                int temp = nArr[j];
//                nArr[j] = nArr[j+1];
//                nArr[j+1] = temp;
//            }
//        }
        
        System.out.println("Reversed: ");
        for(int i = 0; i < nArr.length; i++)
            System.out.print(nArr[i] + " ");
        
    }
}
