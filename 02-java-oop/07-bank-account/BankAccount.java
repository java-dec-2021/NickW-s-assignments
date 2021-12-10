import java.util.Random;
public class BankAccount {

    public static int numAccounts = 0;
    public static double totalInAccounts = 0;
    public static String getAccounts() {
        String account = "";
        Random random = new Random();
        for(int i = 0; i < 10; i++){
        account += random.nextInt(10);
        }
        return account;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;

    public BankAccount() {
        BankAccount.numAccounts += 1;
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        this.setAccountNumber(BankAccount.getAccounts());
    }
    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    

    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    public void depositMoney(double amount, String account){
        if(account.equals("savings"))
                this.savingsBalance += amount;
        else if(account.equals("checking"))
                this.checkingBalance += amount;
        BankAccount.totalInAccounts += amount;
    }

    public void withdrawMoney(double amount, String account) {
        boolean successful = false;
        if(account.equals("savings")){
            if(this.savingsBalance - amount >= 0) {
                successful = true;
                this.savingsBalance -= amount;
            }
        }
        else if(account.equals("checking")) {
            if(this.checkingBalance - amount >= 0){
                successful = true;
                this.checkingBalance -= amount;
            }
        }
        if(successful){
            BankAccount.totalInAccounts -= amount;
        }
    }
    public void displayAccountBalance() {
        System.out.println(String.format("Savings: %.3f, Checking: %.3f", this.savingsBalance, this.checkingBalance));
    }
}