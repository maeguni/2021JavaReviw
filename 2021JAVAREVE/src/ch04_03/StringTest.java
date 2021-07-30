package ch04_03;

public class StringTest {
	
	public static void main(String[] args) {
		String java = new String("JAVA");
		String andrid = new String("android");
		
		System.out.println(System.identityHashCode(java));
		java = java.concat(andrid);
		
		System.out.println(System.identityHashCode(java));
		
		
	}

}
