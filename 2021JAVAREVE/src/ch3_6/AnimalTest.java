package ch3_6;


class Animal{
	
	public void move() {
		
		System.out.println("������ �����Դϴ�.");
		
	}
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
	
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�");
	}
	
	
}


class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
	
	
}

class Eagle extends Animal{

	public void move() {
		System.out.println("�������� �ϴ��� ���� �ٴմϴ�.");
	}
	
	public void flying() {
		System.out.println("�������� �糯���� �� ��� ���ƴٴմϴ�.");
	}
	
	
}

public class AnimalTest {
	
	public static void main(String[] args) {
		
	    Animal hanimal = new Human();
	    Animal tanimal = new Tiger();
	    Animal eanimal = new Eagle();
	    
	    AnimalTest test = new AnimalTest();
	    test.moveAnimal(hanimal);
	    test.moveAnimal(tanimal);
	    test.moveAnimal(eanimal);
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
		
		
		
	}
	

}
