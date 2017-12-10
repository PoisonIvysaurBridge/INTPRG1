package intprg1;
import java.util.Scanner;

public class Soundex {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNextLine()){
        String input = sc.nextLine();
        input +=" ";
        input = input.toUpperCase();
        String result = "";
        char prev = ' ';
        char psx = '0';
        for (int i =0; i<input.length();i++){
            char ch = input.charAt(i);
            char soundx = '0';
            if ((ch=='B'|| ch=='F'|| ch=='P'|| ch=='V')&& ch!=prev){
                soundx = '1';
                if (soundx!=psx)
                    result+=soundx;
            }
            else if ((ch=='C'|| ch=='G' || ch=='J' || ch=='K'|| ch=='Q' || ch=='S' || ch=='X' || ch=='Z')&& ch!=prev){
                soundx = '2';
                if (soundx!=psx)
                    result+=soundx;
            }
            else if ((ch=='D'||ch=='T')&&ch!=prev){
                soundx = '3';
                if (soundx!=psx)
                    result+=soundx;
            }
            else if ((ch=='L')&&ch!=prev){
                soundx = '4';
                if (soundx!=psx)
                    result+=soundx;
            }
            else if ((ch=='M'||ch=='N')&&ch!=prev){
                soundx = '5';
                if (soundx!=psx)
                    result+=soundx;
            }
            else if ((ch=='R')&&ch!=prev){
                soundx = '6';
                if (soundx!=psx)
                    result+=soundx;
            }
            prev = ch;
            psx = soundx;
        }
        System.out.println(result);
    }
  }
}
      