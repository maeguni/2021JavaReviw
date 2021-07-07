package ch3_2;

public class CustomerTest {

	public static void main(String[] args) {

		
	   Customer customerLee =new Customer(10010,"이순신"); 
	  // customerLee.setCustomerName("이순신");
	   //customerLee.setCustomerID(10010);
	   customerLee.bonusPoint = 1000;
	   System.out.println(customerLee.showCustomerInfo());
		 
	   
	   VIPCustomer customerKim = new VIPCustomer(10020,"김유신");
	   //customerKim.setCustomerName("김유신");
	   //customerKim.setCustomerID(10020);
	   customerKim.bonusPoint = 10000;
	   System.out.println(customerKim.showCustomerInfo());
	   
	   //상위의 값을 가지고있기 떄문에 캐스팅가능 업캐스팅 
	   //Customer의  변수와 메서드만 사용가능
	   Customer vc = new VIPCustomer(12345,"noname");
	   
	}

}
