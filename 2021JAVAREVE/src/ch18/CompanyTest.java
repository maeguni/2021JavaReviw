package ch18;

import java.util.Calendar;

public class CompanyTest {
	
	
	public static void main(String[] args) {
		
		
		//�Ϲ� �޼ҵ�� ���������� �ν���Ʈ�� �����ؾߵ����� static���� �����߱⋚���� �ٷ� get�Ҽ�����
		//������ ��ü�� �����ҋ� ���δ�
		Company company1 = Company.getinstance();
		Company company2 = Company.getinstance();
		
		
		System.out.println(company1);
		System.out.println(company2);
		
		Calendar calendar = Calendar.getInstance();
		
		
	}

}
