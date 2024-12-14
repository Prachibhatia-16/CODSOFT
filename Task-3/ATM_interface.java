package Codsoft;
import java.util.*;

class Bank{
	private double balance;
	public Bank(double initial_balance){
		this.balance=initial_balance;
	}
	public void withdrawl(double amount_w) {
		if(amount_w>0 && amount_w<=balance) {
		balance-=amount_w;
		System.out.println("Your amount is successfully withdrawn");
	}else if(amount_w>balance){
		System.out.println("Insufficient balance!");
	}else {
		System.out.println("Invalid withdrawl amount");
	}
	}
	public void deposit(double amount_d) {
		if(amount_d>0) {
			balance+=amount_d;
			System.out.println("Your amount is successfully deposited");
		}else {
			System.out.println("Invalid deposit amount");
		}
	}
	public void checkBalance() {
		System.out.println("Your current balance is: "+balance);
	}
}
class ATM{
	public Bank account;
	public ATM(Bank bank_account) {
		this.account=bank_account;
	}
	public void user_response() {
		Scanner s=new Scanner(System.in);
		int ch;
		System.out.println("Welcome to our bank!");
		System.out.println("Select");
		System.out.println("1: To view Balance");
	System.out.println("2: To deposit");
	System.out.println("3: To withdraw");
	System.out.println("4: To exit");
		do{
			
		System.out.print("Enter your choice: ");
		ch=s.nextInt();
		switch(ch) {
		case 1:
			account.checkBalance();
			break;
		case 2:
			System.out.print("Enter amount you want to deposit: ");
			double amount=s.nextDouble();
			account.deposit(amount);
			break;
		case 3:
			System.out.print("Enter amount you want to withdraw: ");
			double amounts=s.nextDouble();
			account.withdrawl(amounts);
			break;
		case 4:
			System.out.println("Thankyou for using the ATM!");
			break;
		default:
			System.out.println("Invalid choice");
		}
		}while(ch!=4);
	}
}
public class ATM_interface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank userAccount=new Bank(500.00);
		ATM atm=new ATM(userAccount);
		atm.user_response();
	}

}
