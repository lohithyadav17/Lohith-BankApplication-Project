package bankAccountApp;

public class BankAccountApp {
	
	public static void main(String[] args) {
		//Read a csv file then create new accounts based on that data
		
		Checking check1 = new Checking("Tom Holland","123453552",1500);
		Savings save1 = new Savings("Phil Salt","6772323273",1000);
		
		save1.compound();
		
	     save1.showInfo();
	     
	     System.out.println("-------------------------");
	     
	     check1.showInfo();
	     
	     save1.deposit(5000);
	     save1.withdraw(200);
	     save1.transfer("Brokerage", 5000);
		
	}
	
}
