package bankAccountApp;

public interface IBaseRate {
	// write a method to ibaserate
	
	default double getBaseRate() {
		return 2.5;
	}

}
