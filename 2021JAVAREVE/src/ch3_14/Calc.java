package ch3_14;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -99999999;
	
	int add(int num1, int num2);
	int substact(int num1,int num2);
	int times(int num1,int num2);
	int divide(int num1,int num2);
	
	
	//�ڹ� 8���� ���� override ����
	default void description() {
		System.out.println("������ ��Ģ������ �����մϴ�");
		//private�޼ҵ� ȣ��
		myMethod();
	}
	
	//�ڹ� 8���� �ν��Ͻ� �������� ���
	static int total(int[] arr) {
		
		int total =0;
		for(int num :arr) {
		    total += num;
			
		}
		//private�޼ҵ� ȣ��
		myStaticMethod();
		return total;
		
	}
	
	//9���� ��� �������̽� �������� ����Ϸ��� ����
	
	private void myMethod() {
		System.out.println("myMethod");
	}
	
	private static void myStaticMethod() {
		System.out.println("myStaticMethod");
		
	}
	
	

}
