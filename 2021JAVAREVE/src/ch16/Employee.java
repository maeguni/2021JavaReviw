package ch16;

public class Employee {
	
	
	private static int serialNum = 1000;
	
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	
	public Employee() {
		
		serialNum++;
		employeeId = serialNum;
		
	}
	
	
	public static int getSerialNum() {
		
		//int i = 0;
		
		//employeeName ="Lee";
		
		return serialNum;
	}

	public int getEmployeeId() {
		serialNum =1000;
		
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeNamel() {
		return employeeName;
	}
	public void setEmployeeNamel(String employeeNamel) {
		this.employeeName = employeeNamel;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
		
	
	
	
	
	
	

}
