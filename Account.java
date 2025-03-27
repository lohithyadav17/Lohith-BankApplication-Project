package bankAccountApp;

public abstract class Account  implements IBaseRate {
	// List common for savings and checking accounts
	private String name;
	private String sSN;
	protected String accountNumber;
	private static int index = 10000;
	private double balance;
	protected double rate;
	
	// constructor to set base  properties  and initialize the account
	public Account(String name,String ssn,double indeposit) {
		this.name=name;
		this.sSN = ssn;
		balance = indeposit;
		
        // set account number
		this.accountNumber = setAccountNumber();
		setRate();
		
	}
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoDigits = sSN.substring(sSN.length()-2, sSN.length());
		int unqiueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10,3));
		return lastTwoDigits + unqiueID + randomNumber;
		
	}
	
	// list common methods
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposting $" + amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance = balance + amount;
		System.out.println("Withdrawing $" + amount);
		printBalance();
	}
	
	public void transfer(String toWhere,double amount) {
		balance = balance + amount;
		System.out.println("Transferring $" + amount + " to " + toWhere);
		printBalance();
		
	}
	
	public void compound() {
		double accruedInterest = balance + (rate/100);
		balance = balance + accruedInterest;
		System.out.println("Accrued Interest: " + accruedInterest);
	}
	
	public void printBalance() {
		System.out.println("Your balance is now: $" + balance);
	}
	
	public void showInfo() {
		System.out.println("NAME: " + name + 
				           "\nACCOUNT NUMBER: " + accountNumber + 
				           "\nBALANCE: " + balance +
				           "\nRATE: " + rate + "%");	
		}

}
