import java.util.Scanner; 
import java.util.ArrayList;

class BlueBank {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // exec variables
        boolean runProgram = true;
        String option;

        // Uuer variables
        Account account;
        String accountID;
        double startBalanceCL = 1000000;
        double startBalanceUSD = 0;
        ArrayList<String> userHistory = new ArrayList<String>();

        // welcome message
        ConsoleUI.welcomeMenu();

        // init account
        System.out.print("Account ID: ");
        accountID = scanner.nextLine();
        account = new Account(accountID, startBalanceCL, startBalanceUSD, userHistory);

        while(runProgram) {
            
            // general menu
            ConsoleUI.generalMenu();

            try {

                option = scanner.nextLine();
                String currencyAndAmount;
                boolean worngInputs = true;

                switch(option){

                    case "1":

                        while(worngInputs){
                            ConsoleUI.option1();
                            currencyAndAmount = scanner.nextLine();
                            String[] inputs1 = currencyAndAmount.split(" ");
                            String currency1 = inputs1[0];
                            String StringAmount1 = inputs1[1];    

                            try {
                                double amount1 =  Double.parseDouble(StringAmount1);
                                account.addFunds(amount1, currency1);
                                worngInputs = false;
                                
                            }
                            catch (Exception e) {
                                System.out.println(e);
                                System.out.printf("Ops! An error happened. Try again\n"+">> ");
                                continue;
                            }
                        }
                        break;

                    case "2":
                        
                        while(worngInputs){
                            ConsoleUI.option1();
                            currencyAndAmount = scanner.nextLine();
                            String[] inputs1 = currencyAndAmount.split(" ");
                            String currency1 = inputs1[0];
                            String StringAmount1 = inputs1[1];    

                            try {
                                double amount1 =  Double.parseDouble(StringAmount1);
                                account.withdrawFunds(amount1, currency1);
                                worngInputs = false;
                                
                            }
                            catch (Exception e) {
                                System.out.println(e);
                                System.out.printf("Ops! An error happened. Try again\n"+">> ");
                                continue;
                            }
                        }
                        break;

                    case "3":
                        System.out.println("\nTransaction History:");
                        account.printHistory();
                        break;

                    case "4":
                        runProgram = false;
                        break;

                    default:
                        System.out.println("[!] Not valid option.");
                        break;
                }

            } catch (Exception e) {
                System.out.println("[!] Not valid format option. Exit ...");
                continue;
            }

        }

    }

}