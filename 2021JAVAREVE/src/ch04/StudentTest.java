package ch04;

public class StudentTest {
	
	public static void main(String[] args) {
		
		
		//인스턴트 (정의되어있는 클레스or 클레스 베이스 기반으로 생선된 객체)
		Student studentLee = new Student();
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();
		
		Student studenKim  = new Student();
		studentLee.studentID = 54321;
		studentLee.studentName = "Kim";
		studentLee.address = "경기도 성남시";
		
		studentLee.showStudentInfo();
		
		System.out.println(studenKim);
		System.out.println(studentLee);
		
	
	}

	
	
	
	

}
