package intprg1;    
import java.util.Scanner;
public class Secret {
    public static void main(String[] args) {
        Secret j = new Secret();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a message: ");
        String message = sc.nextLine();
        
        System.out.print("Enter Jeje level: ");
        int level = sc.nextInt();
        
        if (level == 1 || level == 2 || level == 3 || level == 4){
            message = message.toLowerCase();
            message = j.changeVowels(message);
        }
        if(level == 2){
            message = j.addExtra(message);
        }
        else if (level == 3){
            message = j.shorten(message);
        }
        else if (level == 4){
            message = j.addExtra(message);
            message = j.shorten(message);
            message = j.alternateCase(message);
        }
        System.out.println("Jejefied based on selected level: " + message);
    }
    String changeVowels(String msg){
        int i = 0;
        char [] strMsg = new char [msg.length()];
        for(i = 0; i<strMsg.length; i++){
            if (msg.charAt(i)=='a')
                strMsg [i]= '4';
            else if (msg.charAt(i)=='e')
                strMsg [i]= '3';
            else if (msg.charAt(i)=='i')
                strMsg [i]= '1';
            else if (msg.charAt(i)=='o')
                strMsg [i]= '0';
            else
                strMsg [i] = msg.charAt(i);
        }
        String result = String.valueOf(strMsg);
        return result;
    }
    String addExtra (String msg){
        //char [] strMsg = new char [msg.length()];
        int i=0;
        String strMsg = "";
        for (i=0; i<msg.length(); i++){
            String add="";
            if (msg.charAt(i)=='p')
                add = "f";
            //else if()
            else if ((msg.charAt(i)=='o'|| msg.charAt(i)=='0'))
                add = "w";
            strMsg+= msg.charAt(i)+add;
        }
        return strMsg;

    }
    String shorten(String msg){
        int i=0;
        String strMsg = "";
        for (i=0; i<msg.length(); i++){
            String add="";
            if (msg.charAt(i)=='k' && (msg.charAt(i+1)=='o' || msg.charAt(i+1)=='0'))
                add = "q";
            else if (msg.charAt(i)=='g' && (msg.charAt(i+1)=='a' || msg.charAt(i+1)=='4'))
                add = "6";
            if (add.equalsIgnoreCase(""))
                strMsg+= msg.charAt(i)+add;
            else{
                strMsg+=add;
                i++;
            }
        }
        return strMsg;
    }
    String alternateCase(String msg){
        int i=0;
        String strMsg = "";
        for (i=0; i<msg.length(); i++){
            if (msg.indexOf(msg.charAt(i))%2!=0){    // odd subscript
                strMsg+= Character.toUpperCase(msg.charAt(i));
            }
            else
                strMsg+= msg.charAt(i);
        }
        return strMsg;
    }
}
