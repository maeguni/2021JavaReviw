package ch12;

public class Person {
	
	
	
	String name;
	int age;
	
	
	public Person() {
		
			//다른 생성자를 호출하는 this
		this("na name", 1);
		
		
	}
	
	
	public Person(String name, int age) {
		
		//주소값을 표시하는 this
		
		this.name = name;;
		this.age =age;
		
	}

	public void showPerson() {
		
		
		System.out.println(name+","+ age );
		
		
	}
	
	//자기자신을 호출하는 this
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
