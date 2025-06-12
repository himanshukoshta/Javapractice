import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

class Transaction{
    String type;
    double amount;
    String timestamp;

    public Transaction(String type,double amount)
    {
        this.type=type;
        this.amount=amount;
        this.timestamp= LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
    public String toString() {
        return timestamp+" "+type + ": Rs. " + amount;
    }
}
class Account{
    private String name;
    private int accountno;
    private double balance;
    ArrayList<Transaction> transactions=new ArrayList<>();
    public Account(String name,int accountno,double balance){
        this.name=name;
        this.accountno=(int)(Math.random()*10000000);
        this.balance=balance;
        this.transactions=new ArrayList<>();
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction("Deposit",amount));
            System.out.println("Money deposited successfully");
        } else
        {
            System.out.println("Enter a vaild amount!!");
        }
    }

    public void withdraw(double amount){
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                transactions.add(new Transaction("Withdraw", amount));
                System.out.println("Money withdrawn successfully");
            } else {
                System.out.println("Insufficient funds!");
            }
        } else {
            System.out.println("Enter a valid amount!");
        }

    }
    public void checkbal()
    {
        if(balance!=0){
            System.out.println("Balance: "+balance);
        }
        else
            System.out.println("0.00");
    }
    public void transactionhistory()
    {
        if(transactions.isEmpty())
        {
            System.out.println("No History");
        }
        else {
            System.out.println("Transaction History");
            for (Transaction t:transactions){
                System.out.println(t);
            }
        }
    }
    public int getAccountno(){
        return accountno;
    }
    public String getName(){
        return name;
    }
}

public class atm {
    static Scanner sc = new Scanner(System.in);
    static Account account;

    public static void main(String[] args) {
        System.out.println("Welcome to Farzi Bank Of India");
        System.out.println();
        System.out.println("Enter account holdername: ");
        String name = sc.nextLine();
        account = new Account(name, 0, 0);
        System.out.println("Account created successfully. AccountNo: "+account.getAccountno());
        int choice;
        do {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. View Transactions\n5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double with = sc.nextDouble();
                    account.withdraw(with);
                    break;
                case 3:
                    account.checkbal();
                    break;
                case 4:
                    account.transactionhistory();
                    break;
                case 5:
                    System.out.println("Thank you for using the Bank App.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
            while (choice != 5) ;
        }

     }


