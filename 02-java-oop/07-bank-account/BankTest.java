public class BankTest {

    public static void main(String[] args) {
        BankAccount a = new BankAccount();
        BankAccount b = new BankAccount();
        BankAccount.getAccounts();
        a.depositMoney(1000, "checking");
        b.depositMoney(2000, "savings");
        System.out.println(a.getCheckingBalance());
        System.err.println(b.getSavingsBalance());
        a.displayAccountBalance();
        b.displayAccountBalance();
        b.withdrawMoney(2000, "checking");
        System.out.println(b.getCheckingBalance());
        
    }

}