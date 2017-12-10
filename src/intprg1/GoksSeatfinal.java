package intprg1;

//package MP;

import java.util.Scanner;

public class GoksSeatfinal 
{
    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        GoksSeatfinal gs = new GoksSeatfinal();
        int money, FstPrice, SndPrice, TrdPrice, reserved, purchased, prevpurchased;
        String seat, purchasesummary, moviestatus, usrData;
        
        // Initializing Cinemas
        String[][] FstCinema = {{"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"},
                                {"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"},
                                {"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"},
                                {"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"},
                                {"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"}
                               };
        
        String[][] SndCinema = {{"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"},
                                {"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"},
                                {"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"},
                                {"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"},
                                {"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"}
                               };
        
        String[][] TrdCinema = {{"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"},
                                {"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"},
                                {"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"},
                                {"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"},
                                {"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"}
                               };

        money = 1000;
        FstPrice = 200;
        SndPrice = 200;
        TrdPrice = 200;
        reserved = 0;
        purchased = 0;
        prevpurchased = 0;
        purchasesummary = "";
        usrData = "1";
        moviestatus = "";
        
        //Starts the main menu
        while (!usrData.equals("2")) {
            System.out.println("\033[34mWELCOME TO GOKONGSEATS!!!!!!!!!!\033[0m  \033[31m_______________________\033[0m     ");
            System.out.println("\033[34m\033[0m                                 \033[31m/        ^     ^        \\\033[0m  ");
            System.out.println("\033[34m\033[0m                                \033[31m|    _________________    |\033[0m  ");
            System.out.println("\033[34mPlease select an option:\033[0m        \033[31m|   /                 \\   |\033[0m ");
            System.out.println("\033[34m    1. Start Transaction\033[0m        \033[31m|  |Hi! I'll guide you!|  |\033[0m  ");
            System.out.println("\033[34m    2. Exit Transaction\033[0m         \033[31m|   \\_________________/   |\033[0m ");
            System.out.println("\033[34m\033[0m                                 \033[31m\\_______________________/\033[0m  ");
            System.out.print("\033[34mEnter choice: \033[0m");
            usrData = sc.next();
            switch (usrData) {
                case "1":
                    while (!usrData.equals("8")) {
                        System.out.println("");
                        usrData = gs.starttransaction(usrData, money);
                        switch (usrData) {
                            case "1":
                                switch (gs.cinemanumber(usrData)) {
                                    case "1" : System.out.println(gs.moviestatus(moviestatus)); gs.displaycinema(FstCinema, "<CINEMA!", "1: Titanic"                     ); break;
                                    case "2" : System.out.println(gs.moviestatus(moviestatus)); gs.displaycinema(SndCinema, "<CINEMA!", "2: Star Wars: The Force Awakens"); break;
                                    case "3" : System.out.println(gs.moviestatus(moviestatus)); gs.displaycinema(TrdCinema, "<CINEMA!", "3: Captain America: Civil War"  ); break;
                                    default: gs.faces(3); break;
                                } break;
                            case "2":
                                switch (gs.cinemanumber(usrData)) {
                                    case "1" : seat = gs.seatnumber("");
                                               reserved = gs.reserveseats(FstCinema, reserved, seat); gs.displaycinema(FstCinema, "<RESERVE", "1: Titanic"); break;
                                    case "2" : seat = gs.seatnumber("");
                                               reserved = gs.reserveseats(SndCinema, reserved, seat); gs.displaycinema(SndCinema, "<RESERVE", "2: Star Wars: The Force Awakens"); break;
                                    case "3" : seat = gs.seatnumber("");
                                               reserved = gs.reserveseats(TrdCinema, reserved, seat); gs.displaycinema(TrdCinema, "<RESERVE", "3: Captain America: Civil War"  ); break;
                                    default: gs.faces(3); break;        
                                } break;
                            case "3":
                                gs.displayreserved(FstCinema, 1); gs.displaycinema(FstCinema, "<DISPLAY", "1: Titanic"                     ); 
                                gs.displayreserved(SndCinema, 2); gs.displaycinema(SndCinema, "<DISPLAY", "2: Star Wars: The Force Awakens");
                                gs.displayreserved(TrdCinema, 3); gs.displaycinema(TrdCinema, "<DISPLAY", "3: Captain America: Civil War"  );
                                System.out.println("Total seats reserved: " + reserved + "\n");
                                break;
                            case "4":
                                switch (gs.cinemanumber(usrData)) {
                                    case "1": seat = gs.seatnumber("");
                                              reserved = gs.cancelreservation(FstCinema, reserved, seat); gs.displaycinema(FstCinema, "<CANCEL!", "1: Titanic"                     ); break;
                                    case "2": seat = gs.seatnumber("");
                                              reserved = gs.cancelreservation(SndCinema, reserved, seat); gs.displaycinema(SndCinema, "<CANCEL!", "2: Star Wars: The Force Awakens"); break;
                                    case "3": seat = gs.seatnumber("");
                                              reserved = gs.cancelreservation(TrdCinema, reserved, seat); gs.displaycinema(TrdCinema, "<CANCEL!", "3: Captain America: Civil War"  ); break;
                                   default: gs.faces(3); break;
                                } break;
                            case "5":
                                switch (gs.cinemanumber(usrData)) {
                                    case "1": seat = gs.seatnumber("");
                                           
                                            purchased = gs.purchaseseats(FstCinema, money, FstPrice, purchased, 1, seat);
                                            gs.displaycinema(FstCinema, "PURCHASE", "1: Titanic"                     );
                                            
                                            if (prevpurchased < purchased) {
                                                money -= FstPrice;
                                                purchasesummary += "Cinema 1 Seat " + seat + "\n";
                                                reserved --;
                                                prevpurchased = purchased;
                                            }   break;
                                    case "2": seat = gs.seatnumber("");
                                            
                                                purchased = gs.purchaseseats(SndCinema, money, SndPrice, purchased, 2, seat);
                                                gs.displaycinema(SndCinema, "PURCHASE", "2: Star Wars: The Force Awakens");
                                            
                                            if (prevpurchased < purchased) {
                                                money -= SndPrice;
                                                purchasesummary += "Cinema 2 Seat " + seat + "\n";
                                                reserved --;
                                                prevpurchased = purchased;
                                            }   break;
                                    case "3": seat = gs.seatnumber("");
                                            
                                                purchased = gs.purchaseseats(TrdCinema, money, TrdPrice, purchased, 3, seat);
                                                gs.displaycinema(TrdCinema, "PURCHASE", "3: Captain America: Civil War"  );
                                            
                                            if (prevpurchased < purchased) {
                                                money -= TrdPrice;
                                                purchasesummary += "Cinema 3 Seat " + seat + "\n";
                                                reserved --;
                                                prevpurchased = purchased;
                                            }   break;
                                    default: gs.faces(3); break;
                                }   break;
                            case "6":
                                System.out.println(purchasesummary);
                                gs.displaycinema(FstCinema, "<DISPLAY", "1: Titanic"                     ); 
                                gs.displaycinema(SndCinema, "<DISPLAY", "2: Star Wars: The Force Awakens");
                                gs.displaycinema(TrdCinema, "<DISPLAY", "3: Captain America: Civil War"  );
                                System.out.println("Total seats purchased: " + purchased + "\n");
                                break;
                            case "7":
                                gs.cancelpurchase(FstCinema);
                                gs.cancelpurchase(SndCinema);
                                gs.cancelpurchase(TrdCinema);
                                System.out.println("Puchase Cancelled!");
                                money = 1000;
                                purchased = 0;
                                prevpurchased = 0;
                                purchasesummary = "";
                                break;
                            case "8":
                                gs.endtransaction(FstCinema);
                                gs.endtransaction(SndCinema);
                                gs.endtransaction(TrdCinema);
                                money = 1000;
                                purchased = 0;
                                prevpurchased = 0;
                                purchasesummary = "";
                                break;
                            default: gs.faces(3); break;
                        }
                    }   break;
                case "2": gs.faces(2); break;
                default: gs.faces(3); break;
            }
        }
    }
    
    // Starts the transaction - the secondary menu
    public String starttransaction(String usrData, int money) { 
        System.out.println("\033[36mTOTAL MONEY: " + money);
        System.out.println("\033[36mPlease select an option:\033[0m            \033[32m_______________________\033[0m     ");
        System.out.println("\033[36m    1. Display Cinema\033[0m              \033[32m/        ^     ^        \\\033[0m ");
        System.out.println("\033[36m    2. Reserve Seat\033[0m               \033[32m|    _________________    |\033[0m ");
        System.out.println("\033[36m    3. Display Reserved Seats\033[0m     \033[32m|   /                 \\   |\033[0m");
        System.out.println("\033[36m    4. Cancel Reservation\033[0m         \033[32m|  |Pick a no. Any no.!|  |\033[0m ");
        System.out.println("\033[36m    5. Purchase Reservation\033[0m       \033[32m|   \\_________________/   |\033[0m");
        System.out.println("\033[36m    6. Display Purchased Seats\033[0m     \033[32m\\_______________________/\033[0m ");
        System.out.println("\033[36m    7. Cancel Purchased\033[0m");
        System.out.println("\033[36m    8. End Transaction\033[0m");
        System.out.print("\033[36mINPUT: \033[0m");
        usrData = sc.next();
        return usrData;
    } 
    
    // Displays the current status of the cinemas
    public void displaycinema(String[][] VaryArray, String type, String cinemanumber) {
        int row, column;
       
        System.out.println("Cinema " + cinemanumber);
        for (row = 0; row < 5; row ++) {
            for (column = 0; column <= 8; column ++) {
                if (column == 4) {
                    switch (row) {
                        case 0: System.out.print("  C  "); break;
                        case 1: System.out.print("  H  "); break;
                        case 2: System.out.print("  E  "); break;
                        case 3: System.out.print("  N  "); break;
                        case 4: System.out.print("  G  "); break;
                    } 
                } else if (column == 8) {
                    switch (row) {
                        case 1: System.out.print("   \033[35m______\033[0m  ");
                        case 2: System.out.print("  \033[35m/ ^  ^ \\\033[0m ");
                        case 3: System.out.print(" \033[35m|" + type + "|\033[0m");
                        case 4: System.out.print("  \033[35m\\______/\033[0m");
                    } 
                } if (column < 8) 
                    System.out.print(VaryArray[row][column]);
            } System.out.println("");
        } System.out.println("");
    }
    
    // Allows the user to reserve a seat
    public int reserveseats(String[][] NumberCinema, int reserved, String seat) {
        int row, column;
        
        for (row = 0; row < 5; row ++) {
            for (column = 0; column < 8; column ++) {
                if (LetterToNumber(seat) == row + 1 && Character.getNumericValue(seat.charAt(1)) == column + 1) {
                    switch (NumberCinema[row][column]) {
                        case "[R]": System.out.println("Seat is already reserved!"); break;
                        case "[X]": System.out.println("Seat is already purchased!"); break;
                        case "[ ]": NumberCinema[row][column] = "[R]";
                                    System.out.println("Seat reserved!");
                                    reserved ++;
                                    break;
                    }
                }
            } 
        } System.out.println(""); return reserved;
    }
    
    //Displays the current status of the reserved seats
    public void displayreserved(String[][] NumberCinema, int cinemanumber) {
        int row, column;
       
        for (row = 0; row < 5; row ++) {
            for (column = 0; column < 8; column ++) {
                if ("[R]".equals(NumberCinema[row][column])) {
                    System.out.println("Cinema " + cinemanumber + " Seat " + NumberToLetter(row + 1) + (column + 1));
                } 
            }
        } System.out.println(""); 
    } 
    
    // Reserves a seat in any cinema
    public int cancelreservation(String[][] NumberCinema, int reserved, String seat) {
        int row, column;
        
        for (row = 0; row < 5; row ++) {
            for (column = 0; column < 8; column ++) {
                if (LetterToNumber(seat) == row + 1 && Character.getNumericValue(seat.charAt(1)) == column + 1) {
                    switch (NumberCinema[row][column]) {
                        case "[R]": NumberCinema[row][column] = "[ ]";
                                    System.out.println("Reservation canceled!");
                                    reserved --;
                                    break;
                        default: System.out.println("Choose a reserved seat!"); break;
                    }
                }
            }
        } System.out.println(""); return reserved;
    }
    
    // Purchases a reserved seat only
    public int purchaseseats(String[][] NumberCinema, int money, int cinemaprice, int purchased, int cinemanumber, String seat) {
        int row, column;
        
        for (row = 0; row < 5; row ++) {
            for (column = 0; column < 8; column ++) {
                if (LetterToNumber(seat) == row + 1 && Character.getNumericValue(seat.charAt(1)) == column + 1) {
                    if (money < cinemaprice) {
                        System.out.println("Insufficient funds!"); 
                    } else if ("[R]".equals(NumberCinema[row][column])) {
                        NumberCinema[row][column] = "[X]";
                        System.out.println("Seat purchased!");
                        purchased ++;
                    } else {
                        System.out.println("Choose a reserved seat!"); 
                    }
                }
            }        
        } System.out.println(""); return purchased;
    }
    
    // Ends transaction and resets the money and reserved seats
    public void endtransaction(String[][] NumberCinema) {
        int row, column;
       
        for (row = 0; row < 5; row ++) {
            for (column = 0; column < 8; column ++) {
                if ("[R]".equals(NumberCinema[row][column]))
                    NumberCinema[row][column] = "[ ]";
            }    
        } System.out.println("");
    }
    
    public void cancelpurchase(String[][] NumberCinema) {
        int row, column;
        
        for (row = 0; row < 5; row ++) {
            for (column = 0; column < 8; column ++) {
                if (NumberCinema[row][column].equals("[X]")) {
                    NumberCinema[row][column] = "[ ]";
                }  
            }        
        }                           
    }
    
    // Lets the user input a cinema number
    public String cinemanumber(String usrData) {
        System.out.print("Enter cinema number: ");
        usrData = sc.next();
        System.out.println("");
        if (!usrData.equals("1") && !usrData.equals("2") && !usrData.equals("3")) {
            return "4";
        } return usrData;
    }
    
    // Lets the user input a seat row and column
    public String seatnumber(String usrData) {
        System.out.print("Enter seat number: ");
        usrData = sc.next();
        if (usrData.charAt(0) != 'A' && usrData.charAt(0) != 'B' && usrData.charAt(0) != 'C' && usrData.charAt(0) != 'D' && usrData.charAt(0) != 'E' || usrData.length() != 2 || usrData.charAt(1) == '9' || usrData.charAt(1) == '0' || (int) usrData.charAt(1) >= 65) {
            faces(3); 
            return "-1";
        } return usrData;
    }
    
    // Converts the letter of the row to an integer in order to specify row
    public int LetterToNumber(String usrData) {
        char letter;
        int row;
        
        letter = usrData.charAt(0);
        row = 0;
        
        switch (letter) {
            case 'A': row = 1; break;
            case 'B': row = 2; break;
            case 'C': row = 3; break;
            case 'D': row = 4; break;
            case 'E': row = 5; break;
        } return row;
    }
    
    // Converts the number to a letter for display
    public char NumberToLetter(int row) {
        char letter;
        letter = '^';
        switch (row) {
            case 1: letter = 'A'; break;
            case 2: letter = 'B'; break;
            case 3: letter = 'C'; break;
            case 4: letter = 'D'; break;
            case 5: letter = 'E'; break;
        } return letter;
    }
    
    // Faces :)
    public void faces(int type) {
        switch (type) {
            case 2: System.out.println("\033[31m         __    __\033[0m");
                    System.out.println("\033[31m        /  \\  /  \\\033[0m");
                    System.out.println("\033[31m       |    \\/    |\033[0m");
                    System.out.println("\033[31m	\\        /\033[0m");
                    System.out.println("\033[31m	 \\      /\033[0m");
                    System.out.println("\033[31m	  \\    /  \033[0m");
                    System.out.println("\033[31m  _______________________     \033[0m");
                    System.out.println("\033[31m /        ^     ^        \\   \033[0m");
                    System.out.println("\033[31m|    _________________    |   \033[0m");
                    System.out.println("\033[31m|   /                 \\   |  \033[0m");
                    System.out.println("\033[31m|  |    LOVE YOU!!!!   |  |   \033[0m");
                    System.out.println("\033[31m|   \\_________________/   |  \033[0m");
                    System.out.println("\033[31m \\_______________________/\033[0m \n");
                    break;
            case 3: System.out.println("\033[33m           _____              \033[0m");
                    System.out.println("\033[33m          -     -             \033[0m");
                    System.out.println("\033[33m    -    /       \\   -       \033[0m");
                    System.out.println("\033[33m  - -   |         |  -  -     \033[0m");
                    System.out.println("\033[33m     -- |         | -- -   -  \033[0m");
                    System.out.println("\033[33m         \\       /      -    \033[0m");
                    System.out.println("\033[33m   --     |     |    -  -     \033[0m");
                    System.out.println("\033[33m  -       |     |   -         \033[0m");
                    System.out.println("\033[33m           _____              \033[0m");
                    System.out.println("\033[33m             _                \033[0m");
                    System.out.println("\033[33m  _______________________     \033[0m");
                    System.out.println("\033[33m /        ^     ^        \\   \033[0m");
                    System.out.println("\033[33m|    _________________    |   \033[0m");
                    System.out.println("\033[33m|   /                 \\   |  \033[0m");
                    System.out.println("\033[33m|  | YOU ARE AN ERROR! |  |   \033[0m");
                    System.out.println("\033[33m|   \\_________________/   |  \033[0m");
                    System.out.println("\033[33m \\_______________________/ \033[0m\n");
                    break;
                 
        }
    }
    
    public String moviestatus(String moviestatus) {
        moviestatus = "     Cinema 1:                         Cinema 2:                                  Cinema 3:                  \n"               
                      + "Movie Name: Titanic     Movie Name: Star Wars: The Force Awakens    Movie Name: Captain America: Civil War \n" 
                      + "Number of Seats: 40              Number of Seats: 40                        Number of Seats: 40            \n"  
                      + " Ticket Cost: P230                Ticket Cost: P250                          Ticket Cost: P300             \n";
        return moviestatus;
    }
}