package intprg1;
import java.util.Scanner;
public class Intprg1MP{
    static final int COL = 9, ROW =5;
    public static void main(String[] args) {
        Intprg1MP mp = new Intprg1MP(); 
        Scanner sc = new Scanner(System.in);
// ##########################  INITIALIZATIONS: Purchased seats array to retain display purchased seats ##########################
        String [] seats, status = new String [40] ;
                // ########################################################  CINEMA 1 ################################################################
                // Seats
                String [] C1seats = {"A1","A2","A3","A4","A5","A6","A7","A8",     "B1","B2","B3","B4","B5","B6","B7","B8",
                                     "C1","C2","C3","C4","C5","C6","C7","C8",     "D1","D2","D3","D4","D5","D6","D7","D8",
                                     "E1","E2","E3","E4","E5","E6","E7","E8",};
                // Status of seats
                String [] C1status = {" ", " ", " ", " ", " ", " ", " ", " ",     " ", " ", " ", " ", " ", " ", " ", " ",
                                      " ", " ", " ", " ", " ", " ", " ", " ",     " ", " ", " ", " ", " ", " ", " ", " ",
                                      " ", " ", " ", " ", " ", " ", " ", " ",};
                
                // ########################################################  CINEMA 2 ################################################################
                String [] C2seats = {"A1","A2","A3","A4","A5","A6","A7","A8",     "B1","B2","B3","B4","B5","B6","B7","B8",
                                     "C1","C2","C3","C4","C5","C6","C7","C8",     "D1","D2","D3","D4","D5","D6","D7","D8",
                                     "E1","E2","E3","E4","E5","E6","E7","E8",};
                // Status of seats
                String [] C2status = {" ", " ", " ", " ", " ", " ", " ", " ",     " ", " ", " ", " ", " ", " ", " ", " ",
                                      " ", " ", " ", " ", " ", " ", " ", " ",     " ", " ", " ", " ", " ", " ", " ", " ",
                                      " ", " ", " ", " ", " ", " ", " ", " ",};
                // ########################################################  CINEMA 3 ################################################################
                String [] C3seats = {"A1","A2","A3","A4","A5","A6","A7","A8",     "B1","B2","B3","B4","B5","B6","B7","B8",
                                     "C1","C2","C3","C4","C5","C6","C7","C8",     "D1","D2","D3","D4","D5","D6","D7","D8",
                                     "E1","E2","E3","E4","E5","E6","E7","E8",};
                // Status of seats
                String [] C3status = {" ", " ", " ", " ", " ", " ", " ", " ",     " ", " ", " ", " ", " ", " ", " ", " ",
                                      " ", " ", " ", " ", " ", " ", " ", " ",     " ", " ", " ", " ", " ", " ", " ", " ",
                                      " ", " ", " ", " ", " ", " ", " ", " ",};
 // #############################################################################################################################               
        // START SCREEN
        boolean cont = true;
        while (cont){
            // Start Screen User input 
            System.out.println("****************** WELCOME TO GOKONGSEATS!!! ******************\n");
            System.out.println("------------ START MENU ------------");
            System.out.print("Please select an option:\n1) Start\n2) Exit\n\nEnter choice (1 or 2): ");
            int strtSc = sc.nextInt();
            // 1. Start Transaction Option
            boolean endTransac = false;
            if (strtSc == 1){
                System.out.println("Starting Transaction ... ");
// ############################ INITIALIZATIONS: Reset money, reserved seats summary, purchased seats SUMMARY ##############################
                double money = 1000, price, C1price = 230, C2price = 250, C3price = 300;
                for (int i=0; i<status.length; i++){
                    // cinema 1
                    if (!(C1status [i].equals("X")))    // Cinema 1 reset all status except "X"
                        C1status[i] = " ";
                    // cinema 2
                    if (!(C2status [i].equals("X")))    // Cinema 2 reset all status except "X"
                        C2status[i] = " ";
                    // cinema 3
                    if (!(C3status [i].equals("X")))    // Cinema 3 reset all status except "X"
                        C3status[i] = " ";
                }
                // reset purchase seat summary to be used by: 1) purchase reservations 2) diplay purchased seats DONE
                String C1currentlyPurchased = "";   int C1sum = 0, C2sum = 0, C3sum = 0;
                String C2currentlyPurchased = "";
                String C3currentlyPurchased = "";
// #############################################################################################################################
                // MAIN MENU user input
                while (!endTransac){
                System.out.println("\n\n------------ MAIN MENU ------------\nTOTAL MONEY: "+money);
                System.out.println("1) Display Cinema\n2) Reserve Seat\n3) Display Reserve Seats\n4) Cancel Reservations\n5) Purchase Reservations\n6) Display Purchased Seats\n7) End Transaction");
                System.out.print("\nPlease choose an option (1-7): ");
                int mainMenu = sc.nextInt();
                    // 1.1 Display Seats
                    if (mainMenu == 1){
                        int x = 0,sub = 0;
                        // Display Now Showing
                        System.out.println("\nCINEMA # 1\n************\nMovie name: ONE PIECE FILM: GOLD\nNumber of Seats: 40\nTicket Cost: 230");
                        System.out.println("\nCINEMA # 2\n************\nMovie name: FINDING DORY\nNumber of Seats: 40\nTicket Cost: 250");
                        System.out.println("\nCINEMA # 3\n************\nMovie name: CAPTAIN AMERICA: CIVIL WAR\nNumber of Seats: 40\nTicket Cost: 300");
                        int nCinema = mp.getCinemaNo();
                        switch(nCinema){
                            case 1: mp.Option1(C1seats, C1status, nCinema ); break;
                            case 2: mp.Option1(C2seats, C2status, nCinema ); break;
                            case 3: mp.Option1(C3seats, C3status, nCinema ); break;
                            default: System.out.println("Invalid Cinema input.");
                        }
                    }
                    // 1.2 Reserve Seat
                    else if (mainMenu == 2){
                        System.out.println("\n\nRESERVE SEAT SELECTED");    String formerChar = " ", latterChar = "R";
                        mp.Option3(C1status, C1seats, C2status, C2seats, C3status, C3seats); //display reserved seats
                        int nCinema = mp.getCinemaNo(); // 1.2.1 Specify the cinema number
                        switch (nCinema){
                            case 1: mp.Option2and4(C1seats, C1status, mp.getSeatNo(), formerChar, latterChar, nCinema);break;
                            case 2: mp.Option2and4(C2seats, C2status, mp.getSeatNo(), formerChar, latterChar, nCinema);break;
                            case 3: mp.Option2and4(C3seats, C3status, mp.getSeatNo(), formerChar, latterChar, nCinema);break;
                            default: System.out.println("invalid Cinema input.");
                        }
                    }
                    // 1.3 Display Reserved Seats
                    else if (mainMenu == 3){
                        System.out.println("\n\nDIPLAYING RESERVED SEATS!");
                        mp.Option3(C1status, C1seats, C2status, C2seats, C3status, C3seats);
                    }
                    // 1.4 Cancel Reservations
                    else if (mainMenu == 4){
                        System.out.println("\n\nCANCEL RESERVATION SELECTED"); String formerChar = "R", latterChar = " ";
                        mp.Option3(C1status, C1seats, C2status, C2seats, C3status, C3seats); //display reserved seats
                        int nCinema = mp.getCinemaNo(); // 1.4.1 Specify the cinema number
                        switch (nCinema){   // if - else C1, C2, C3
                            case 1: mp.Option2and4(C1seats, C1status, mp.getSeatNo(), formerChar, latterChar, nCinema);break;
                            case 2: mp.Option2and4(C2seats, C2status, mp.getSeatNo(), formerChar, latterChar, nCinema);break;
                            case 3: mp.Option2and4(C3seats, C3status, mp.getSeatNo(), formerChar, latterChar, nCinema);break;
                            default: System.out.println("invalid Cinema input.");
                        }
                    }
                    // 1.5 Purchase Reservations
                    else if (mainMenu == 5){
                        System.out.println("\n\nPURCHASE SEAT SELECTED");    String formerChar = "R", latterChar = "X";
                        mp.Option3(C1status, C1seats, C2status, C2seats, C3status, C3seats); // display reserved seats
                        int nCinema = mp.getCinemaNo(); // 1.5.1 Specify the cinema number
                        // if - else C1, C2, C3 or swtich case
                        if (nCinema==1){
                            String seatNo = mp.getSeatNo();
                            seats = C1seats; status = C1status; price = C1price; 
                            // 1.5.3 CHECK IF BALANCE IS SUFFICIENT if-else
                            boolean purchased = mp.checkIfReserved(status, seats, seatNo, formerChar, latterChar);
                            if (money >= price && purchased==true){
                                money -= price;
                                mp.purchaseSeat(status, seats, seatNo, formerChar, latterChar);
                                mp.displayCinema (COL, ROW, status, nCinema);
                                C1currentlyPurchased+= seatNo.toUpperCase() + " ";
                                C1sum++;
                            }
                            else if (money < price)
                                System.out.println("Insufficient Balance.");
                        }
                        else if (nCinema==2){
                            String seatNo = mp.getSeatNo();
                            seats = C2seats; status = C2status; price = C2price; 
                            // 1.5.3 CHECK IF BALANCE IS SUFFICIENT if-else
                            boolean purchased = mp.checkIfReserved(status, seats, seatNo, formerChar, latterChar);
                            if (money >= price && purchased==true){
                                money -= price;
                                mp.purchaseSeat(status, seats, seatNo, formerChar, latterChar);
                                mp.displayCinema (COL, ROW, status, nCinema);
                                C2currentlyPurchased+= seatNo.toUpperCase() + " ";
                                C2sum++;
                            }
                            else if (money < price)
                                System.out.println("Insufficient Balance.");
                        }
                        else if (nCinema==3){
                            String seatNo = mp.getSeatNo();
                            seats = C3seats; status = C3status; price = C3price; 
                            // 1.5.3 CHECK IF BALANCE IS SUFFICIENT if-else
                            boolean purchased = mp.checkIfReserved(status, seats, seatNo, formerChar, latterChar);
                            if (money >= price && purchased==true){
                                money -= price;
                                mp.purchaseSeat(status, seats, seatNo, formerChar, latterChar);
                                mp.displayCinema (COL, ROW, status, nCinema);
                                C3currentlyPurchased+= seatNo.toUpperCase() + " ";
                                C3sum++;
                            }
                            else if (money < price)
                                System.out.println("\nInsufficient Balance.");
                        }
                        else
                            System.out.println("invalid Cinema input.");
                    }
                    // 1.6 Display Purchased Seats
                    else if (mainMenu == 6){
                        System.out.println("\nCINEMA # 1\n************");
                        System.out.print("\nPurchased Seats: "+C1currentlyPurchased);
                        System.out.println("\n\nCINEMA # 2\n************");
                        System.out.print("\nPurchased Seats: "+C2currentlyPurchased);
                        System.out.println("\n\nCINEMA # 3\n************");
                        System.out.print("\nPurchased Seats: "+C3currentlyPurchased);
                        System.out.println("\n\nTOTAL PURCHASED: "+(C1sum+C2sum+C3sum));
                    }
                    // 1.7 End Transaction
                    else if (mainMenu == 7)
                        endTransac = true;
                    else 
                        System.out.println("INVALID INPUT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                }
            }
            // 2. Exit Option
            else if (strtSc == 2){
                cont = false;
                System.out.println("\nTHANK YOU FOR USING GOKONGSEATS! \nGood bye and have a nice day! :)");
            }
            else
                System.out.println("INVALID INPUT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
    }
    // method for displaying the Cinema seats
    void displayCinema(int col, int row, String [] status, int nCinema){
        System.out.println("\n************* LEGEND *************:\n> Rows are marked with letters [A-E]\n> Columns are marked with numbers [1-8]");
        System.out.println("[ ] - Available Seat\n[R] - Reserved Seat\n[X] - Purchased Seat\n");
        int k,j,sub=0;
        for (k=0; k<row; k++){
            for (j=0; j<col; j++){
                if (j==col/2){
                    if (k==0){System.out.print(" A ");}
                    else if (k==1){System.out.print(" I ");}
                    else if (k==2){System.out.print(" S ");}
                    else if (k==3){System.out.print(" L ");}
                    else if (k==4){System.out.print(" E ");}
                }
                else{
                    System.out.print("["+status[sub]+"]");
                    sub++;
                }
            }
            System.out.println();
        }
        System.out.println("CINEMA "+nCinema+" SEATS");
        // Display Reserved and Purchased Seats
    }
    // method for displaying reserved seats
    int displayReservedSeats(String [] status, String []seats){
        String symbol = "R"; int sum = 0;
	String [] reserved = searchOccupiedSeats(COL, ROW,seats, status, symbol);
        System.out.print("Reserved Seats: ");
        //String resultR="---";
        for (int x=0; x< reserved.length; x++){
            if (reserved[x]!=null){
                System.out.print(reserved[x]+" ");
                sum++;}}
        return sum;
    }
    //method for displaying purchased seats
    void displayPurchasedSeats(String [] status, String []seats){
	String symbol = "X";
	String [] purchased = searchOccupiedSeats(COL,ROW, seats, status, symbol);
        System.out.print("\nPurchased Seats: ");
        for (int x=0; x< purchased.length; x++)
            if (purchased[x]!=null)
                System.out.print(purchased[x]+" ");
    }
    // method for searching the occupied seats in the seats [] and status []
    String [] searchOccupiedSeats(int col, int row, String [] seats, String [] status, String symbol){
        int sub, x=0;
        String [] array = new String[col*row-row];
        for (sub=0; sub <status.length; sub++){
            if (status[sub].equalsIgnoreCase(symbol)){
                array[sub] = seats[sub];
                x++;
            }
        }
        return array;
    } 
    // method for reserving || canceling seats that changes their array status DONE
    void changeStatus(String [] status, String [] seats, String seatNo, String formerChar, String latterChar){
        boolean check = false;
        for (int sub = 0; sub < seats.length; sub++){
            if (seats[sub].equalsIgnoreCase(seatNo)){
                check = true;
                if (status[sub].equalsIgnoreCase(formerChar)){
                    status [sub]= latterChar;
                    if (latterChar.equalsIgnoreCase("R")) System.out.println("\nSEAT RESERVED! :)\n"); 
                    else if (latterChar.equalsIgnoreCase(" ")) System.out.println("\nRESERVATION CANCELED!\n");
                }
                else if (!(status[sub].equalsIgnoreCase(formerChar))){ 
                    if (latterChar.equalsIgnoreCase("R")) System.out.println("\nSEAT IS ALREADY RESERVED!\n");
                    else if (latterChar.equalsIgnoreCase(" ")) System.out.println("\nCHOOSE A RESERVED SEAT!\n");
                }
            }
        }
        if (check==false)
                System.out.println("Invalid seat input!!!!!!!!!!!!!");
    }
    // method for Purchasing seats
    void purchaseSeat(String [] status, String [] seats, String seatNo, String formerChar, String latterChar){
        boolean check = false;  //purchased = false;
        for (int sub = 0; sub < seats.length; sub++){
            if (seats[sub].equalsIgnoreCase(seatNo)){
                check = true;
                if (status[sub].equalsIgnoreCase(formerChar)){
                    status [sub]= latterChar;
                    System.out.println("\nSEAT PURCHASED! :)\n");
                }
            }
        }
        if (check==false)
                System.out.println("Invalid seat input!!!!!!!!!!!!!");
    }
    // method to check whether a seat is reserved or is already purchased
    boolean checkIfReserved(String [] status, String [] seats, String seatNo, String formerChar, String latterChar){
        boolean result = false, check = false;
        for (int sub = 0; sub < seats.length; sub++){
            if (seats[sub].equalsIgnoreCase(seatNo)){
                check = true;
                if (status[sub].equalsIgnoreCase(formerChar))
                    result = true;
                else if (!(status[sub].equalsIgnoreCase(formerChar))){ 
                    if (status[sub].equalsIgnoreCase(" ")) System.out.println("\nCHOOSE A RESERVED SEAT!\n"); 
                    else if (status[sub].equalsIgnoreCase("X"))
                    System.out.println("\nSEAT IS ALREADY OCCUPIED!\n");
                }
            }
        }
        if (check==false)
                System.out.println("Invalid seat input!!!!!!!!!!!!!");
        return result;
    }
    // Method for getting Cinema number
    int getCinemaNo(){
        // Specify Cinema Number
        Scanner sc = new Scanner (System.in);
        System.out.print("\nEnter Cinema Number: ");
        int nCinema = sc.nextInt();
        return nCinema;                
    }
    // Method for getting Seat number
    String getSeatNo(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Seat no.(A1-E8): ");
        String seatNo = sc.next();
        return seatNo;
    }
    // Method for each cinema number in Option1 Display Cinema 
    void Option1(String [] seats, String [] status, int nCinema ){
        displayCinema(COL, ROW, status, nCinema);
        displayReservedSeats(status,seats);
        displayPurchasedSeats(status,seats);
    }
    // Method for each cinema number chosen in Option2 Reserve Seats
    void Option2and4( String [] seats, String [] status, String seatNo, String formerChar, String latterChar, int nCinema){  
        changeStatus(status, seats, seatNo, formerChar, latterChar);
        displayCinema (COL, ROW, status, nCinema);
    }
    // Method for each cinema number in Option 3 Display Reserved Seats
    void Option3(String [] C1status, String [] C1seats, String [] C2status, String [] C2seats, String [] C3status, String [] C3seats){
        System.out.println("\nCINEMA # 1\n************");   int C1sum = displayReservedSeats(C1status, C1seats);
        System.out.println("\n\nCINEMA # 2\n************"); int C2sum = displayReservedSeats(C2status, C2seats);
        System.out.println("\n\nCINEMA # 3\n************"); int C3sum = displayReservedSeats(C3status, C3seats);
        System.out.println("\n\nTOTAL RESERVED: "+(C1sum+C2sum+C3sum));
    } 
    
}