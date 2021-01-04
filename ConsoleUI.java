public class ConsoleUI {
    
    public static void welcomeMenu() {

        System.out.println("=========================================================");
        System.out.println("|                       BLUE BANK                       |");
        System.out.println("|                     console system                    |");
        System.out.println("=========================================================");
        System.out.println("Please enter Account ID to login.");

    }

    public static void generalMenu() {

        System.out.printf("---------------------------------------------------------\n" +
                "Please select an option:\n" +
                "1 - Add Funds\n" +
                "2 - Withdraw Funds\n" +
                "3 - Transaction History\n" +
                "4 - Logout\n" +
                "---------------------------------------------------------\n" +
                ">> ");
    }

    public static void option1() {

        System.out.printf("---------------------------------------------------------\n" +
                "Please enter the currency and amount to be deposited\n" +
                "Expected format: <CURRENCY> <AMOUNT>\n" +
                ">> ");

    }

    public static void option2() {

        System.out.printf("-----------------------------------------------\n" +
                "Please enter the currency and amount to be withdrawn\n" +
                "Expected format: <CURRENCY> <AMOUNT>\n" +
                ">> ");

    }

}



