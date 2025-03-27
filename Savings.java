package bankAccountApp;

public class Savings  extends Account {
	//list properties specific to a saving account 
	int safetyDepositBoxId;
	int safetyDepositBoxKey;
	
	
	// constructor to initialize saving account properties
	public Savings(String name,String ssn,double inDeposit) {
		super(name,ssn,inDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
		
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxId = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}
	
		// list any methods specific to saving account 
	public void showInfo() {
		super.showInfo();
		System.out.println(" Your Savings Account Feature " +
		                   "\n Safety Deposit BOXID: " + safetyDepositBoxId +
		                   "\n Safety Deposit BOXKey: " + safetyDepositBoxKey);
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
	}

}
