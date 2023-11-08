import java.util.*;

class Account {
    double bal;

    Account(double bal) {
        this.bal = bal;
    }

    synchronized void Deposit(double amm) {
        bal += amm;
    }

    synchronized void Withdraw(double amm) {
        if (bal >= amm) {
            bal -= amm;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    synchronized double getBal() {
        return bal;
    }
}

class DepositThread extends Thread {
    Account acc;
    double amm;
    DepositThread(Account acc) {
        this.acc = acc;
    }
    Scanner sc = new Scanner(System.in);
    public void run(){
        for(int i=0; i<5; i++){
            amm=sc.nextDouble();
            // System.out.println("Enter the amount you want to Deposit: ");
            
            acc.Deposit(amm);
            System.out.println("Deposited: "+amm);
        }
    }
}

class WithdrawThread extends Thread {
    Account acc;
    Scanner sc = new Scanner(System.in);
    double amm;

    WithdrawThread(Account acc) {
        this.acc = acc;
    }

    public void run() {
        for (int i=0; i<5; i++) {
            // System.out.print("Enter the amount you want to Withdrawal: ");
            amm = sc.nextDouble();
            acc.Withdraw(amm);
            System.out.println("Withdrawal: " + amm);
        }
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Account account = new Account(2000);
        DepositThread DT = new DepositThread(account);
        WithdrawThread WT = new WithdrawThread(account);
        DT.start();
        WT.start();
        try{
            DT.join();
            WT.join();
        } catch (Exception e){
            System.out.println("Exception found!!");
        }
        System.out.println("Balance Left: "+account.bal);
    }
}