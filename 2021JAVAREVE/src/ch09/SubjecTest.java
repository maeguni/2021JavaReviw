package ch09;

public class SubjecTest {

	
	public static void main(String[] args) {
		
		Student studentLee =  new Student(100, "Lee");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubjec("수학", 99);

		Student studentKim =  new Student(200, "Kim");
		studentKim.setKoreaSubject("국어", 20);
		studentKim.setMathSubjec("수학", 30);
		
		studentLee.showScore();
		studentKim.showScore();
		
	}
}
