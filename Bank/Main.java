import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Hey there, start typing your Java code here...
        Scanner sc = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        System.out.print("Enter account number: ");
        String accountNumber = sc.next();
        bankAccount.setAccountNumber(accountNumber);
        sc.nextLine();

        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();
        bankAccount.setBalance(balance);

        System.out.print("Enter account number to get balance: ");
        String accNum = sc.next();
        sc.nextLine();

        System.out.println("Account Number: "+ accountNumber);

         double result = bankAccount.getBalance(accNum);
         if(result != -1){
             System.out.println("Balance: "+ result);
         }


        Tester.test(bankAccount);
    }
}