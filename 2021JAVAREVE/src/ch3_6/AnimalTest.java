package ch3_6;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		
		System.out.println("������ �����Դϴ�.");
		
	}
	
	//�������� �����ϸ� �������� �̿��Ҽ�����
	public void eating() {
		
		
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
	    
	    //AnimalTest test = new AnimalTest();
	    //test.moveAnimal(hanimal);
	    //test.moveAnimal(tanimal);
	    //test.moveAnimal(eanimal);
	    
	    ArrayList<Animal> animalList = new ArrayList<>();
	    
	    animalList.add(hanimal);
	    animalList.add(tanimal);
	    animalList.add(eanimal);
	    
	    for(Animal animal : animalList) {
	    	animal.move();
	    }
	    
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
		
	}
	

}