package simpleBank_ApplicationUsingConsole;

import java.util.Scanner;

public class BankingApplication extends BankAccount {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		// Number of customers you need to create account
		System.out.print("For how many members you need to create the account?");
		int n = obj.nextInt();
		BankAccount C[] = new BankAccount[n];
		for (int i = 0; i < C.length; i++) {
			C[i] = new BankAccount();
			C[i].openAccount();
		}

		//switching case to get the values
		int caseEnter;
		do {
			/**
			 * 1. To display all the account details 
			 * 2. To search by Account number
			 * 3. To deposit the amount 
			 * 4. To Withdraw the amount
			 * 5. To Exit
			 **/
			System.out.println("\n <-*^*-{ ABC Banking Application }-*^*->");
			caseEnter = obj.nextInt();
			switch (caseEnter) {

			case 1:
				for (int i = 0; i < C.length; i++) {
					C[i].showAccountDetails();
				}
				break;

			case 2:
				System.out.print("Enter account number you want to search: ");
				String Account_Number = obj.next();
				boolean found = false;
				for (int i = 0; i < C.length; i++) {
					found = C[i].search(Account_Number);
					if (found) {
						break;
					}
				}
				if (!found) {
					System.out.println("Account doesn't exist..!!");
				}
				break;

			case 3:
				System.out.print("Enter Account no. : ");
				Account_Number = obj.next();
				found = false;
				for (int i = 0; i < C.length; i++) {
					found = C[i].search(Account_Number);
					if (found) {
						C[i].deposit();
						break;
					}
				}
				if (!found) {
					System.out.println("Account Number doesn't exist..!!");
				}
				break;

			case 4:
				System.out.print("Enter the Account No: ");
				Account_Number = obj.next();
				found = false;
				for (int i = 0; i < C.length; i++) {
					found = C[i].search(Account_Number);
					if (found) {
						C[i].withdrawal();
						break;
					}
				}
				if (!found) {
					System.out.println("Account doesn't exist..!!");
				}
				break;
				
			case 5:
				System.out.println("Please Visit Again...!");
				break;
			}
		} while (caseEnter != 5);
	}
}
