package ch3_9;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
		
	}

	public void trunOff() {
		System.out.println("�õ��� ���ϴ�.");
		
	}
	//hook �޼�Ʈ��� ��
	public void washCar() {}
	
	
	final public void run() {
		
		startCar();
		drive();
		wiper();
		stop();
		trunOff();
		washCar();
	}
	

}
