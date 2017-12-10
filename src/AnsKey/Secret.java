
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
    
    //6PTS
    String changeVowels(String msg){ //2 PTS
        
        //4 PTS
        msg = msg.replace('a', '4');
        msg = msg.replace('A', '4');
        msg = msg.replace('e', '3');
        msg = msg.replace('E', '3');
        msg = msg.replace('i', '1');
        msg = msg.replace('I', '1');
        msg = msg.replace('o', '0');
        msg = msg.replace('O', '0');
        
        return msg;
    }
	
    //8 PTS
    String addExtra(String msg){ //2 PTS
        
        
        msg = msg.replace("p", "pf"); //2 PTS
        msg = msg.replace("P", "Pf");
        
        //2 PTS
        msg = msg.replace("o ", "ow "); //hello po -> hellow pow
                                      //tomorrow -> tomowrroww
        
                                      //String msg = "hellow po"
                                      
        //2 PTS
        if(msg.charAt(msg.length()-1) == 'o' || msg.charAt(msg.length()-1) == 'O')
            msg += "w";
                                      
        return msg;
    }
    
    //6 PTS
    String shorten(String msg){ //2PTS
        
        msg = msg.replace("ko", "q"); //2PTS
        msg = msg.replace("kO", "q");
        msg = msg.replace("k0", "q");
        msg = msg.replace("ga", "6"); //2PTS
        msg = msg.replace("g4", "q");
        
        return msg;
    }
    
    
    //10 PTS
    String alternateCase(String msg){ //2 PTS
        
        String newMsg = "";
        
        //2PTS
        for(int i = 0; i < msg.length(); i++){
          if (i % 2 == 0)
              newMsg = msg.toLowerCase(); //3 PTS
          else
              newMsg = msg.toLowerCase(); //3 PTS
        }
        
        return newMsg;
    }
}
