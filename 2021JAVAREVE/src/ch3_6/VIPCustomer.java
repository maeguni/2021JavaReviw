package ch3_6;

public class VIPCustomer extends Customer{
	



	double salesRatio;
	private String agentID;
	
	
	/*
	 * public VIPCustomer() {
	 * 
	 * super(0,"no-name"); // 상위 생성자를 호출하는 super()가 자동으로 들어감 bonusRatio = 0.05;
	 * salesRatio = 0.1; customerGrade ="VIP";
	 * 
	 * System.out.println("VIPCustomer() call");
	 * 
	 * }
	 */
	 
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP"; 
		bonusRatio = 0.05; 
		salesRatio = 0.1;
	}
	
	@Override
	public int calcPrive(int price) {
		
		bonusPoint += price * bonusRatio;
		price -=(int)(price*salesRatio);
				
		return price;
	}

	public String getAStringID() {
		return agentID;
		
	}

}
