package ch3_9;

public class AICar extends Car{

	@Override
	public void drive() {

		System.out.println("���� ������ �մϴ�.");
		System.out.println("�ڵ����� ������ ������ �ٲ޴ϴ�.");
	}

	@Override
	public void stop() {

		System.out.println("��ֹ� ������ ������ ����ϴ�.");
	}

	@Override
	public void wiper() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void washCar() {
		System.out.println("�ڵ� ������ �մϴ�.");
	}
	
	
	
	
	
	
}
