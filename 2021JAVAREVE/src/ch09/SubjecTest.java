package ch09;

public class SubjecTest {

	
	public static void main(String[] args) {
		
		Student studentLee =  new Student(100, "Lee");
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubjec("����", 99);

		Student studentKim =  new Student(200, "Kim");
		studentKim.setKoreaSubject("����", 20);
		studentKim.setMathSubjec("����", 30);
		
		studentLee.showScore();
		studentKim.showScore();
		
	}
}
