package ch16;

public class EmployeeTest {

	public static void main(String[] args) {

		//두개의 인스턴스가 하나으 메모리를 공유한다
		
		Employee employlee = new Employee();
		employlee.setEmployeeNamel("이순신");
		
		System.out.println(Employee.getSerialNum());
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeNamel("김유신");
	    
	    
	    System.out.println(employlee.getEmployeeNamel()+"님의 사번은"+ employlee.getEmployeeId());
	    System.out.println(employeeKim.getEmployeeNamel()+"님의 사번은"+ employeeKim.getEmployeeId());
		
		
		
		
	}

}
