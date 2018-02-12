//Matthew Fintonis
//COMP 730
//Professor Nelson
//11 February 2018

public class mainprogram {

	public static void main(String[] args) {
		System.out.println("Creating checking accounts.");
		CheckingAccount chkAccountFred = new CheckingAccount("Fred", 0, "1 Example Address", "Miami", "FL", "12121", 40);
		CheckingAccount chkAccountEthel = new CheckingAccount("Ethel", 1, "123 Some St", "Los Angelas", "CA", "12345", 4.15);
		CheckingAccount chkAccountMatt = new CheckingAccount("Matt", 2, "34 Wild Rose Ln", "Holderness", "NH", "03245", 100);
		
		System.out.println("\nDepositing $50 into each account.");
		chkAccountFred.depositAmount(50);
		chkAccountEthel.depositAmount(50);
		chkAccountMatt.depositAmount(50);
		
		System.out.println("\nGetting account totals:");
		System.out.println(chkAccountFred.getName() + " has $" + chkAccountFred.getBalance() + " in their account.");
		System.out.println(chkAccountEthel.getName() + " has $" + chkAccountEthel.getBalance() + " in their account.");
		System.out.println(chkAccountMatt.getName() + " has $" + chkAccountMatt.getBalance() + " in their account.");
		
		System.out.println("\nPaying $60 out of each account.");
		chkAccountFred.payAmount(60);
		chkAccountEthel.payAmount(60);
		chkAccountMatt.payAmount(60);
		
		System.out.println("\nGetting account totals:");
		System.out.println(chkAccountFred.getName() + " has $" + chkAccountFred.getBalance() + " in their account.");
		System.out.println(chkAccountEthel.getName() + " has $" + chkAccountEthel.getBalance() + " in their account.");
		System.out.println(chkAccountMatt.getName() + " has $" + chkAccountMatt.getBalance() + " in their account.");
	
		System.out.println("\nCreating overdraft checking account for Reddy.");
		CheckingAccountWithOverdraft chkAccountReddy = new CheckingAccountWithOverdraft("Reddy", 3, "123 test st", "Manchester", "NH", "55555", 12);
		
		System.out.println("\nGetting Reddy's Account Balance:");
		System.out.println(chkAccountReddy.getName() + " has $" + chkAccountReddy.getBalance() + " in their account.");
		
		System.out.println("\nPaying $250 out of Reddy's account.");
		chkAccountReddy.payAmount(250);
		
		System.out.println("\nGetting Reddy's Account Balance:");
		System.out.println(chkAccountReddy.getName() + " has $" + chkAccountReddy.getBalance() + " in their account.");
	}
}
