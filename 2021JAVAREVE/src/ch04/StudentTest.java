package ch04;

public class StudentTest {
	
	public static void main(String[] args) {
		
		
		//�ν���Ʈ (���ǵǾ��ִ� Ŭ����or Ŭ���� ���̽� ������� ������ ��ü)
		Student studentLee = new Student();
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "���� ������";
		
		studentLee.showStudentInfo();
		
		Student studenKim  = new Student();
		studentLee.studentID = 54321;
		studentLee.studentName = "Kim";
		studentLee.address = "��⵵ ������";
		
		studentLee.showStudentInfo();
		
		System.out.println(studenKim);
		System.out.println(studentLee);
		
	
	}

	
	
	
	

}
