package ch16;

public class Employee {
	
	
	public static int serialNum = 1000;
	
	
	private int employeeId;
	private String employeeNamel;
	private String department;
	
	
	public Employee() {
		
		serialNum++;
		employeeId = serialNum;
		
	}
	
	
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeNamel() {
		return employeeNamel;
	}
	public void setEmployeeNamel(String employeeNamel) {
		this.employeeNamel = employeeNamel;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
		
	
	
	
	
	
	

}
