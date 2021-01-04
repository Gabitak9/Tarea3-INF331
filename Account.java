import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Account {

    private String id;
    private double balanceCL;
    private double balanceUSD;
    private  ArrayList<String> transactionHistory;

    public Account(String accountID, double startBalanceCL, double startBalanceUSD, ArrayList<String> initHistory) {

        this.id = accountID;
        this.balanceCL = startBalanceCL;
        this.balanceUSD = startBalanceUSD;
        this.transactionHistory = initHistory;

        String log = "CLP: $" + startBalanceCL + " | USD: $" + startBalanceUSD;
        this.setLog(log);

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

    public ArrayList<String> getHistory() {
        return transactionHistory; 
    }

    public void addFunds(double amount, String currency) {


        if(currency.equals("CLP")){
            if (amount > 2000){
                this.balanceCL += amount;
                System.out.printf("\n$%.2f have been successfully added to your CLP account.\n",amount);
                System.out.println("\t- Balance CL: $"+this.balanceCL);
                System.out.println("\t- Balance USD: $"+this.balanceUSD + "\n");
                String log = "CLP: $" + this.balanceCL + " | USD: $" + this.balanceUSD;
                this.setLog(log);
            }else{
                System.out.println("[!] Insufficient Amount. Minium amount: $2.000 CLP\n");
            }

        } else if (currency.equals("USD")){
            if (amount > 10){
                this.balanceUSD += amount;
                System.out.printf("\n$%.2f have been successfully added to your USD account.\n",amount);
                System.out.println("\t- Balance CL: $"+this.balanceCL);
                System.out.println("\t- Balance USD: $"+this.balanceUSD+"\n");
                String log = "CLP: $" + this.balanceCL + " | USD: $" + this.balanceUSD;
                this.setLog(log);
            } else {
                System.out.println("[!] Insufficient Amount. Minium amount: $10 USD\n");
            }

        } else {
            System.out.println("[!] Currency invalid.");
        }
    }

    public void withdrawFunds(Double amount, String currency) {

        if(currency.equals("CLP")){
            if (amount > 200000) {
                System.out.println("[!] Amount for operation exceeded. Maxium amount: $200.000 CLP\n");
            } else {
                double newBalance = this.balanceCL - amount;
                if (newBalance < 0) {
                    System.out.printf("[!] Amount exceeded for your account. You have $%.2f CLP\n",this.balanceCL);
                } else {
                    this.balanceCL = newBalance;
                    System.out.printf("\n$%.2f have been successfully retired from your CLP account.\n",amount);
                    System.out.println("\t- Balance CL: $"+this.balanceCL);
                    System.out.println("\t- Balance USD: $"+this.balanceUSD+"\n");
                    String log = "CLP: $" + this.balanceCL + " | USD: $" + this.balanceUSD;
                    this.setLog(log);
                }
            }

        } else if (currency.equals("USD")){
            if (amount > 200) {
                System.out.println("[!] Amount for operation exceeded. Maxium amount: $200 USD\n");
            } else {
                double newBalance = this.balanceUSD - amount;
                if (newBalance < 0) {
                    System.out.printf("[!] Amount exceeded for your account. You have $%.2f USD\n",this.balanceUSD);
                } else {
                    this.balanceUSD = newBalance;
                    System.out.printf("\n$%.2f have been successfully retired from your USD account.\n",amount);
                    System.out.println("\t- Balance CL: $"+this.balanceCL);
                    System.out.println("\t- Balance USD: $"+this.balanceUSD+"\n");
                    String log = "CLP: $" + this.balanceCL + " | USD: $" + this.balanceUSD;
                    this.setLog(log);
                }
            }

        } else {
            System.out.println("[!] Currency invalid.");
        }
    }

    public void setLog(String log){

        String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        date = "["+date+"]";

        String finalLog = date + " " + log;

        this.transactionHistory.add(finalLog);

    }

    public void printHistory() {

        String stringToPrint = String.join("\n", this.transactionHistory);
        System.out.println(stringToPrint);
        System.out.println("");

    }
    
}
