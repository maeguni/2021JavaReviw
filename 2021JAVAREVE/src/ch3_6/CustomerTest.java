package ch3_6;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

	   ArrayList<Customer> customerList =  new ArrayList<>();
	   
	   Customer customerT = new Customer(10010, "Tomas");
	   Customer customerJ = new Customer(10020, "James");
	   Customer customerE = new GoldCustommer(10030, "edward");
	   Customer customerP = new GoldCustommer(10040, "Percy");
	   Customer customerK = new VIPCustomer(10050, "Kim");
	
	   customerList.add(customerT);
	   customerList.add(customerJ);
	   customerList.add(customerE);
	   customerList.add(customerP);
	   customerList.add(customerK);
		
		
		for(Customer customer : customerList) {
			
			System.out.println(customer.showCustomerInfo());
			
		}
		
		int price = 10000;
		
		for(Customer customer : customerList) {
			
			int cost = customer.calcPrive(price);
			
			System.out.println(customer.getCustomerGrade()+ "����"+ cost +"�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName()+"���� ���� ���ʽ� ����Ʈ�� "+ customer.bonusPoint+"�Դϴ�"	);
			
		}
		
		

	}

}