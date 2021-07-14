package ch3_8;

public abstract class Desktop extends Computer {

	
	
	@Override
	public void display() {
		System.out.println("Desktop display");
	}

	@Override
	public void typeing() {
		System.out.println("Desktop typeing");
	}

	@Override
	void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Desktop turnOff");
	}

	
	
}
