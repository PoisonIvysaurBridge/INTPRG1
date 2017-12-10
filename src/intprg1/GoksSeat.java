package intprg1;

import java.util.Scanner;

public class GoksSeat 
{
    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        GoksSeat gs = new GoksSeat();
        int money, usrData, FstPrice, SndPrice, TrdPrice, reserved, purchased, prevpurchased;
        String seat, purchasesummary, moviestatus;
        
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
        FstPrice = 230;
        SndPrice = 250;
        TrdPrice = 300;
        reserved = 0;
        purchased = 0;
        prevpurchased = 0;
        purchasesummary = "";
        usrData = 1;
        moviestatus = "";
        
        while (usrData != 2) {
            System.out.print("Please select an option:\n1. Start Transaction\n2. Exit Transaction\nEnter choice: ");
            usrData = sc.nextInt();
            switch (usrData) {
                case 1:
                    while (usrData != 7) {
                        System.out.println("");
                        usrData = gs.starttransaction(usrData, money);
                        switch (usrData) {
                            case 1:
                                switch (gs.cinemanumber(usrData)) {
                                    case 1 : System.out.println(gs.moviestatus(moviestatus)); gs.displaycinema(FstCinema, "<CINEMA!", "1: Titanic"                     ); break;
                                    case 2 : System.out.println(gs.moviestatus(moviestatus)); gs.displaycinema(SndCinema, "<CINEMA!", "2: Star Wars: The Force Awakens"); break;
                                    case 3 : System.out.println(gs.moviestatus(moviestatus)); gs.displaycinema(TrdCinema, "<CINEMA!", "3: Captain America: Civil War"  ); break;
                                }                                                                                                         break;
                            case 2:
                                switch (gs.cinemanumber(usrData)) {
                                    case 1 : seat = gs.seatnumber("");
                                            if (seat.charAt(0) != 'A' && seat.charAt(0) != 'B' && seat.charAt(0) != 'C' && seat.charAt(0) != 'D' && seat.charAt(0) != 'E')
                                                gs.faces(3); 
                                            else {reserved = gs.reserveseats(FstCinema, reserved, seat); gs.displaycinema(FstCinema, "<RESERVE", "1: Titanic"); } break;
                                    case 2 : seat = gs.seatnumber("");
                                            if (seat.charAt(0) != 'A' && seat.charAt(0) != 'B' && seat.charAt(0) != 'C' && seat.charAt(0) != 'D' && seat.charAt(0) != 'E')
                                                gs.faces(3);
                                            else {reserved = gs.reserveseats(SndCinema, reserved, seat); gs.displaycinema(SndCinema, "<RESERVE", "2: Star Wars: The Force Awakens");} break;
                                    case 3 : seat = gs.seatnumber("");
                                            if (seat.charAt(0) != 'A' && seat.charAt(0) != 'B' && seat.charAt(0) != 'C' && seat.charAt(0) != 'D' && seat.charAt(0) != 'E')
                                                gs.faces(3);
                                            else {reserved = gs.reserveseats(TrdCinema, reserved, seat); gs.displaycinema(TrdCinema, "<RESERVE", "3: Captain America: Civil War"  );} break;
                                }                                                                                                         break;
                            case 3:
                                gs.displayreserved(FstCinema, 1); gs.displaycinema(FstCinema, "<DISPLAY", "1: Titanic"                     ); 
                                gs.displayreserved(SndCinema, 2); gs.displaycinema(SndCinema, "<DISPLAY", "2: Star Wars: The Force Awakens");
                                gs.displayreserved(TrdCinema, 3); gs.displaycinema(TrdCinema, "<DISPLAY", "3: Captain America: Civil War"  );
                                System.out.println("Total seats reserved: " + reserved + "\n");
                                break;
                            case 4:
                                switch (gs.cinemanumber(usrData)) {
                                    case 1: seat = gs.seatnumber("");
                                            if (seat.charAt(0) != 'A' && seat.charAt(0) != 'B' && seat.charAt(0) != 'C' && seat.charAt(0) != 'D' && seat.charAt(0) != 'E')
                                                gs.faces(3);
                                            else {reserved = gs.cancelreservation(FstCinema, reserved, seat); gs.displaycinema(FstCinema, "<CANCEL!", "1: Titanic"                     );} break;
                                    case 2: seat = gs.seatnumber("");
                                            if (seat.charAt(0) != 'A' && seat.charAt(0) != 'B' && seat.charAt(0) != 'C' && seat.charAt(0) != 'D' && seat.charAt(0) != 'E')
                                                gs.faces(3);
                                            else {reserved = gs.cancelreservation(SndCinema, reserved, seat); gs.displaycinema(SndCinema, "<CANCEL!", "2: Star Wars: The Force Awakens");} break;
                                    case 3: seat = gs.seatnumber("");
                                            if (seat.charAt(0) != 'A' && seat.charAt(0) != 'B' && seat.charAt(0) != 'C' && seat.charAt(0) != 'D' && seat.charAt(0) != 'E')
                                                gs.faces(3);
                                            else {reserved = gs.cancelreservation(TrdCinema, reserved, seat); gs.displaycinema(TrdCinema, "<CANCEL!", "3: Captain America: Civil War"  );} break;
                                }                                                                                                             break;
                            case 5:
                                switch (gs.cinemanumber(usrData)) {
                                    case 1: seat = gs.seatnumber("");
                                            if (seat.charAt(0) != 'A' && seat.charAt(0) != 'B' && seat.charAt(0) != 'C' && seat.charAt(0) != 'D' && seat.charAt(0) != 'E')
                                                gs.faces(3);
                                            else {
                                                purchased = gs.purchaseseats(FstCinema, money, FstPrice, purchased, 1, seat);
                                                gs.displaycinema(FstCinema, "PURCHASE", "1: Titanic"                     );
                                            }
                                            if (prevpurchased < purchased) {
                                                money -= FstPrice;
                                                purchasesummary += "Cinema 1 Seat " + seat + "\n";
                                                reserved --;
                                                prevpurchased = purchased;
                                            }   break;
                                    case 2: seat = gs.seatnumber("");
                                            if (seat.charAt(0) != 'A' && seat.charAt(0) != 'B' && seat.charAt(0) != 'C' && seat.charAt(0) != 'D' && seat.charAt(0) != 'E')
                                                gs.faces(3);
                                            else { 
                                                purchased = gs.purchaseseats(SndCinema, money, SndPrice, purchased, 2, seat);
                                                gs.displaycinema(SndCinema, "PURCHASE", "2: Star Wars: The Force Awakens");
                                            }
                                            if (prevpurchased < purchased) {
                                                money -= SndPrice;
                                                purchasesummary += "Cinema 2 Seat " + seat + "\n";
                                                reserved --;
                                                prevpurchased = purchased;
                                            }   break;
                                    case 3: seat = gs.seatnumber("");
                                            if (seat.charAt(0) != 'A' && seat.charAt(0) != 'B' && seat.charAt(0) != 'C' && seat.charAt(0) != 'D' && seat.charAt(0) != 'E')
                                                gs.faces(3);
                                            else { 
                                                purchased = gs.purchaseseats(TrdCinema, money, TrdPrice, purchased, 3, seat);
                                                gs.displaycinema(TrdCinema, "PURCHASE", "3: Captain America: Civil War"  );
                                            }
                                            if (prevpurchased < purchased) {
                                                money -= TrdPrice;
                                                purchasesummary += "Cinema 3 Seat " + seat + "\n";
                                                reserved --;
                                                prevpurchased = purchased;
                                            }   break;
                                }   break;
                            case 6:
                                System.out.println(purchasesummary);
                                System.out.println("Total seats purchased: " + purchased + "\n");
                                break;
                            case 7:
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
                case 2: gs.faces(2); break;
                default: gs.faces(3); break;
            }
        }
    }
    
    public int starttransaction(int usrData, int money) { 
        System.out.println("TOTAL MONEY: " + money + "\nPlease select an option:");
        System.out.print("1. Display Cinema\n2. Reserve Seat\n3. Display Reserved Seats\n4. Cancel Reservation\n5. Purchase Reservation\n6. Display Purchased Seats\n7. End Transaction\nINPUT: ");
        usrData = sc.nextInt();
        System.out.println("");
        return usrData;
    } 
    
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
                        case 1: System.out.print("   ______  ");
                        case 2: System.out.print("  / ^  ^ \\ ");
                        case 3: System.out.print(" |" + type + "|");
                        case 4: System.out.print("  \\______/");
                    } 
                } if (column < 8) 
                    System.out.print(VaryArray[row][column]);
            } System.out.println("");
        } System.out.println("");
    }
    
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
    
    public int purchaseseats(String[][] NumberCinema, int money, int cinemaprice, int purchased, int cinemanumber, String usrData) {
        int row, column;
       
        for (row = 0; row < 5; row ++) {
            for (column = 0; column < 8; column ++) {
                if (LetterToNumber(usrData) == row + 1 && Character.getNumericValue(usrData.charAt(1)) == column + 1) {
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
    
    public void endtransaction(String[][] NumberCinema) {
        int row, column;
       
        for (row = 0; row < 5; row ++) {
            for (column = 0; column < 8; column ++) {
                if ("[R]".equals(NumberCinema[row][column]))
                    NumberCinema[row][column] = "[ ]";
            }    
        } 
    }
    
    public int cinemanumber(int usrData) {
        System.out.print("Enter cinema number: ");
        return usrData = sc.nextInt();
    }
    
    public String seatnumber(String usrData) {
        System.out.print("Enter seat number: ");
        return usrData = sc.next();
    }
    
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
    
    public void faces(int type) {
        switch (type) {
            case 1: System.out.println("      \\  /     _ \\  /        ");
                    System.out.println("       \\   _  _    /         ");
                    System.out.println("     -- * _	_ * --        ");
                    System.out.println("      / |         |\\         ");
                    System.out.println("	|	  | \\        ");
                    System.out.println( "	|	  |           ");
                    System.out.println("  _______________________     ");
                    System.out.println(" /        ^     ^        \\   ");
                    System.out.println("|    _________________    |   ");
                    System.out.println("|   /                 \\   |  ");
                    System.out.println("|  |   PICK A NUMBER!  |  |   ");
                    System.out.println("|   \\_________________/   |  ");
                    System.out.println(" \\_______________________/ \n");
                    break;
            case 2: System.out.println("         __    __");
                    System.out.println("        /  \\  /  \\");
                    System.out.println("       |    \\/    |");
                    System.out.println("	\\        /");
                    System.out.println("	 \\      /");
                    System.out.println("	  \\    /  ");
                    System.out.println("  _______________________     ");
                    System.out.println(" /        ^     ^        \\   ");
                    System.out.println("|    _________________    |   ");
                    System.out.println("|   /                 \\   |  ");
                    System.out.println("|  |    LOVE YOU!!!!   |  |   ");
                    System.out.println("|   \\_________________/   |  ");
                    System.out.println(" \\_______________________/ \n");
                    break;
            case 3: System.out.println("           _____              ");
                    System.out.println("          -     -             ");
                    System.out.println("    -    /       \\   -       ");
                    System.out.println("  - -   |         |  -  -     ");
                    System.out.println("     -- |         | -- -   -  ");
                    System.out.println("         \\       /      -    ");
                    System.out.println("   --     |     |    -  -     ");
                    System.out.println("  -       |     |   -         ");
                    System.out.println("           _____              ");
                    System.out.println("             _                ");
                    System.out.println("  _______________________     ");
                    System.out.println(" /        ^     ^        \\   ");
                    System.out.println("|    _________________    |   ");
                    System.out.println("|   /                 \\   |  ");
                    System.out.println("|  | YOU ARE AN ERROR! |  |   ");
                    System.out.println("|   \\_________________/   |  ");
                    System.out.println(" \\_______________________/ \n");
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