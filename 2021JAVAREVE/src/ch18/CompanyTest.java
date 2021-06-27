package ch18;

import java.util.Calendar;

public class CompanyTest {
	
	
	public static void main(String[] args) {
		
		
		//일반 메소드로 선언했으면 인스턴트를 선언해야되지만 static으로 진행했기떄문에 바로 get할수있음
		//유일한 객체를 제공할떄 쓰인다
		Company company1 = Company.getinstance();
		Company company2 = Company.getinstance();
		
		
		System.out.println(company1);
		System.out.println(company2);
		
		Calendar calendar = Calendar.getInstance();
		
		
	}

}
