package ch3_3;


public class CustomerTest {

	public static void main(String[] args) {

		
	   Customer customerLee =new Customer(10010,"�̼���"); 
	   customerLee.bonusPoint = 1000;
	   int price = customerLee.calcPrive(1000);
	   System.out.println(customerLee.showCustomerInfo()+ price);
		 
	   
	   VIPCustomer customerKim = new VIPCustomer(10020,"������");
	   customerKim.bonusPoint = 10000;
	   price = customerLee.calcPrive(1000);
	   System.out.println(customerKim.showCustomerInfo()+price);
	   
	   Customer vc = new VIPCustomer(12345,"noname");
	   vc.calcPrive(1000);
	   System.out.println(vc.calcPrive(1000));
	   
	}

}
