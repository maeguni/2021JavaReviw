package ch12;

public class Person {
	
	
	
	String name;
	int age;
	
	
	public Person() {
		
			//�ٸ� �����ڸ� ȣ���ϴ� this
		this("na name", 1);
		
		
	}
	
	
	public Person(String name, int age) {
		
		//�ּҰ��� ǥ���ϴ� this
		
		this.name = name;;
		this.age =age;
		
	}

	public void showPerson() {
		
		
		System.out.println(name+","+ age );
		
		
	}
	
	//�ڱ��ڽ��� ȣ���ϴ� this
	public Person getPerson() {
		return this;
	}
	
	
	public static void main(String[] args) {
		
		Person person = new Person();		
		person.showPerson();
		
		
		System.out.println(person);
		
		Person person2 = person.getPerson(); 
		System.out.println(person2);   
		
		
	}

}
