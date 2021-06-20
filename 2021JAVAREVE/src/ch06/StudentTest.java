package ch06;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studenLee = new Student();
		
        System.out.println(studenLee.showStudentInfo()); 	
        
        Student studentKim = new Student(123124, "kim", 3);
        System.out.println(studentKim.showStudentInfo());
        
		
	}
	
	
	
	
}
