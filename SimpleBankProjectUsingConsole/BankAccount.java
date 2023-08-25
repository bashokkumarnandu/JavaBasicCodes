package simpleBank_ApplicationUsingConsole;

import java.util.Scanner;

public class BankAccount {

	private String AccountNumber;
	private String Name;
	private String AccountType;
	private long Balance;
	private String Address;
	Scanner obj = new Scanner(System.in);

	// Opening a new bank account for a person
	public void openAccount() {
		System.out.print("Enter Name of the Account holder : ");
		Name = obj.next();

		System.out.print("Enter Account type : ");
		AccountType = obj.next();
		System.out.println();
		
		System.out.print("Enter Account No : ");
		AccountNumber = obj.next();

		System.out.print("Enter Balance : ");
		Balance = obj.nextLong();

		System.out.print("Enter the Address : ");
		Address = obj.next();
	}

	// displaying the account details of the holder
	public void showAccountDetails() {
		System.out.println("Name of the account holder: " + Name);
		System.out.println("Account type: " + AccountType);
		System.out.println("Account no.: " + AccountNumber);
		System.out.println("Balance: " + Balance);
		System.out.println("Address: " + Address);
	}

	// method to search an account number
	public boolean search(String Account_Number) {
		if (AccountNumber.equals(Account_Number)) {
			showAccountDetails();
			System.out.println("Account Exists");
			return (true);
		}
		
		System.out.println("Account doesn't Exist!!");
		return (false);
	}

	// depositing the money to the account
	public void deposit() {
		long amount = 0;

		System.out.println("Enter the amount you want to deposit to the Account: ");
		amount = obj.nextLong();

		Balance = Balance + amount;
	}

	// for withdrawing the money
	public void withdrawal() {
		long withDrawlAmount;
		
		System.out.println("Enter the amount you wish to withdraw: ");
		
		withDrawlAmount = obj.nextLong();
		
		if (Balance >= withDrawlAmount) {
			Balance = Balance - withDrawlAmount;
			System.out.println("Balance after withdrawal: " + Balance);
		} else {
			System.out.println("Your balance is very low....! " + withDrawlAmount + "\tTransaction failed...!!");
		}
	}

}
