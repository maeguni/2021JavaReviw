package ch3_7;

import java.util.ArrayList;

class Animal{
	//다움캐스팅
	public void move() {
		
		System.out.println("동물이 움직입니다.");
		
	}
	
	//상위에서 선언하면 하위에서 이용할수있음
	public void eating() {
		
		
	}
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다");
	}
	
	
}


class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
	
}

class Eagle extends Animal{

	public void move() {
		System.out.println("독수리가 하능을 날아 다닙니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 양날개를 쭉 펴고 날아다닙니다.");
	}
	
	
}

public class AnimalTest {
	
	public static void main(String[] args) {
		
	    Animal hanimal = new Human();
	    Animal tanimal = new Tiger();
	    Animal eanimal = new Eagle();
	    
	    AnimalTest test = new AnimalTest();
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
	    
	    test.testdownCating(animalList);
	    
	}
	public void testdownCating(ArrayList<Animal>  list) {
		
		for(int i = 0; i<list.size(); i++) {
			
			Animal animal = list.get(i);
			
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.readBook();
			}else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}else  {
			 System.out.println("unsupported type");
			
			}
			
			
		}
		
		
		
		
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
		
	}
	

}
