package ch3_1;

public class VIPCustomer extends Customer{
	

	double salesRatio;
	private String agentID;
	
	public VIPCustomer() {
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade ="VIP";
		
	}
	
	public String getAStringID() {
		return agentID;
		
	}

}
