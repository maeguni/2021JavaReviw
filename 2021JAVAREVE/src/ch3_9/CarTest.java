package ch3_9;

public class CarTest {

	public static void main(String[] args) {

		 Car aiCra = new AICar();
		 aiCra.run();
		 
		 System.out.println("===============================");
		 
		 
		 Car mCar = new ManualCar();
		 mCar.run();
	}

}
