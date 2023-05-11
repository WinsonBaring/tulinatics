public class BankAccount{
    private String accountNumber;
    private double balance;

    public String getAccountNumber(){
        return this.accountNumber;
    }
    public double getBalance(String accNum){
        if(accNum.equals(this.accountNumber)){
            return balance;
        }
        System.out.println("Account number is incorrect, you cannot proceed.");
        return -1;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
}