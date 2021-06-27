package ch18;

public class Company {
	
	//유일한 인스턴트를 만들어줌
	private static Company instance = new Company();
	
	
	private Company() {
		
	}
	public static Company getinstance() {
		
		if (instance == null) {
			instance = new Company();
		}
			
			
	   return instance;
		
		
	}
	
	
	

}
