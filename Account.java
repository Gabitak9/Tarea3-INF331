import java.io.File;  

public class Account {

    private String id;
    private double balanceCL;
    private double balanceUSD;
    private String historyFilename;

    public Account(String accountID, double startBalanceCL, double startBalanceUSD, String accountHistoryFilename) {

        this.id = accountID;
        this.balanceCL = startBalanceCL;
        this.balanceUSD = startBalanceUSD;
        this.historyFilename = accountHistoryFilename;

        try {
            File historyFile = new File(this.historyFilename);
            historyFile.createNewFile();
        } catch (Exception e) {
            System.out.println("[!] An exception has occurred. Exit ...");
            System.exit(0);
        }

        System.out.println("\n[*] Account "+ this.id +" initialized. ");
        System.out.println("\t- Balance CL: $"+this.balanceCL);
        System.out.println("\t- Balance USD: $"+this.balanceUSD);

    }

    public String getID() {
        return id;
    }

    public double getBalanceCL() {
        return balanceCL;
    }

    public double getBalanceUSD() {
        return balanceUSD;
    }

    public String getHistoryFilename() {
        return historyFilename;
    }

    public void addFunds(Double amount, String currency) {

        if(currency == "CLP"){
            if (amount > 2000){
                this.balanceCL += amount;
                System.out.printf("$%.2f have been successfully added to your CLP account.",amount);
                System.out.println("\t- Balance CL: $"+this.balanceCL);
                System.out.println("\t- Balance USD: $"+this.balanceUSD);
            }else{
                System.out.println("[!] Insufficient Amount. Minium amount: $2.000 CLP");
            }

        } else if (currency == "USD"){
            if (amount > 10){
                this.balanceUSD += amount;
                System.out.printf("$%.2f have been successfully added to your USD account.",amount);
                System.out.println("\t- Balance CL: $"+this.balanceCL);
                System.out.println("\t- Balance USD: $"+this.balanceUSD);
            } else {
                System.out.println("[!] Insufficient Amount. Minium amount: $10 USD");
            }

        } else {
            System.out.println("[!] Currency invalid.");
        }

    }

    public void withdrawFunds(Double amount, String currency) {

        if(currency == "CLP"){
            if (amount > 200000) {
                System.out.println("[!] Amount for operation exceeded. Maxium amount: $200.000 CLP");
            } else {
                double newBalance = this.balanceCL - amount;
                if (newBalance < 0) {
                    System.out.printf("[!] Amount exceeded for your account. You have $%.2f CLP",this.balanceCL);
                } else {
                    this.balanceCL = newBalance;
                    System.out.printf("$%.2f have been successfully retired from your CLP account.",amount);
                    System.out.println("\t- Balance CL: $"+this.balanceCL);
                    System.out.println("\t- Balance USD: $"+this.balanceUSD);
                }
            }

        } else if (currency == "USD"){
            if (amount > 200) {
                System.out.println("[!] Amount for operation exceeded. Maxium amount: $200 USD");
            } else {
                double newBalance = this.balanceUSD - amount;
                if (newBalance < 0) {
                    System.out.printf("[!] Amount exceeded for your account. You have $%.2f USD",this.balanceUSD);
                } else {
                    this.balanceUSD = newBalance;
                    System.out.printf("$%.2f have been successfully retired from your USD account.",amount);
                    System.out.println("\t- Balance CL: $"+this.balanceCL);
                    System.out.println("\t- Balance USD: $"+this.balanceUSD);
                }
            }

        } else {
            System.out.println("[!] Currency invalid.");
        }

    }
    
}
