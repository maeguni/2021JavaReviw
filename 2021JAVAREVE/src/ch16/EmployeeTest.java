package ch16;

public class EmployeeTest {

	public static void main(String[] args) {

		//�ΰ��� �ν��Ͻ��� �ϳ��� �޸𸮸� �����Ѵ�
		
		Employee employlee = new Employee();
		employlee.setEmployeeNamel("�̼���");
		
		System.out.println(Employee.getSerialNum());
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeNamel("������");
	    
	    
	    System.out.println(employlee.getEmployeeNamel()+"���� �����"+ employlee.getEmployeeId());
	    System.out.println(employeeKim.getEmployeeNamel()+"���� �����"+ employeeKim.getEmployeeId());
		
		
		
		
	}

}
