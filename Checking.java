package bankAccountApp;

public class Checking extends Account {
	//list properties specific to a checking account 
	
	private int debitCardNumber;
	private int debitCardPin;
	
	// constructor to initialize checking account properties
	public Checking(String name,String ssn,double inDeposit) {
		super(name,ssn,inDeposit);
		accountNumber = "1" + accountNumber;
		setDebit();
	}
	
	private void setDebit() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));
	}
	
	//list any methods specific to checking account 
	
	public void showInfo() {
		super.showInfo();
		System.out.println(" Your Checking Account Features " +
		                   "\n Debit Card Number: " + debitCardNumber + 
		                   "\n Debit Card PIN: " + debitCardPin );
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
	}

}
