package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태박산맥1", "조정래");
		library[1] = new Book("태박산맥1", "조정래");
		library[2] = new Book("태박산맥1", "조정래");
		library[3] = new Book("태박산맥1", "조정래");
		library[4] = new Book("태박산맥1", "조정래");
		
		//(복사할arry/어디서부터/복사할arry/복사할 시작위치/복시할 lenth
		
		//주소만 복사
		//System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		
		//깊은 복사
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		
		for(int i =0; i<library.length; i++) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
		
		
		/*
		 * System.out.println("======library"); for(Book book :library) {
		 * System.out.println(book); book.showInfo(); }
		 * 
		 * 
		 * System.out.println("======copy library"); for(Book book :copyLibrary) {
		 * System.out.println(book); book.showInfo(); }
		 */
		
		library[0].setAuthor("박완서");
		library[0].setTitle("나목");
		
		
		//복사된 것은 주소값만 복사 얆은 복사
		//따로 객체를 가지고 싶다면 복사할 arry 인스턴스를 생성해주어야됨
		for(Book book :library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("======copy library"); 
		    for(Book book :copyLibrary) {
			  System.out.println(book); book.showInfo();
			  
	    }
	}		

}
