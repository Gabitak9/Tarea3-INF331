import java.util.Scanner;
import java.io.File;  
import java.io.IOException;  

class BlueBank {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // exec variables
        boolean runProgram = true;
        int option;

        // Uuer variables
        String accountID;
        double startBalanceCL = 1000000;
        double startBalanceUSD = 0;
        Account account;
        String historyFilename;
        int numberTransaction = 0;

        // welcome message
        ConsoleUI.welcomeMenu();

        // init account
        System.out.print("Account ID: ");
        accountID = scanner.nextLine();
        historyFilename = "movementHistory/Historial - "+accountID+".txt";
        account = new Account(accountID, startBalanceCL, startBalanceUSD, historyFilename);

        while(runProgram) {
            
            // general menu
            ConsoleUI.generalMenu();

            try {

                option = scanner.nextInt();
                String currencyAndAmount;

                switch(option){
                    case 1:
                        ConsoleUI.option1();
                        currencyAndAmount = scanner.nextLine();
                        break;
                    case 2:
                        ConsoleUI.option2();
                        currencyAndAmount = scanner.nextLine();
                        break;
                    case 3:
                        break;
                    case 4:
                        runProgram = false;
                        break;
                    default:
                        System.out.println("[!] Not valid option.");
                        break;
                }

            } catch (Exception e) {
                System.out.println("[!] Not valid format option. Exit ...");
                System.exit(0);
            }

        }

    }

}