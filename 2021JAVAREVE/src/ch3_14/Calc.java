package ch3_14;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -99999999;
	
	int add(int num1, int num2);
	int substact(int num1,int num2);
	int times(int num1,int num2);
	int divide(int num1,int num2);
	
	
	//자바 8부터 가능 override 가능
	default void description() {
		System.out.println("정수의 사칙연산을 제공합니다");
		//private메소드 호출
		myMethod();
	}
	
	//자바 8부터 인스턴스 생성없이 사용
	static int total(int[] arr) {
		
		int total =0;
		for(int num :arr) {
		    total += num;
			
		}
		//private메소드 호출
		myStaticMethod();
		return total;
		
	}
	
	//9부터 사용 인터페이스 내에서만 사용하려고 쓴다
	
	private void myMethod() {
		System.out.println("myMethod");
	}
	
	private static void myStaticMethod() {
		System.out.println("myStaticMethod");
		
	}
	
	

}
