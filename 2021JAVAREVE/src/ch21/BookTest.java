 package ch21;

public class BookTest {

	public static void main(String[] args) {
		
		
		Book[] library = new Book[5];
		
		
		/*
		 * for(int i = 0; i<library.length; i++) { System.out.println(library[i]);
		 * 
		 * 
		 * }
		 */
		library[0] = new Book("�¹ڻ��1", "������");
		library[1] = new Book("�¹ڻ��1", "������");
		library[2] = new Book("�¹ڻ��1", "������");
		library[3] = new Book("�¹ڻ��1", "������");
		library[4] = new Book("�¹ڻ��1", "������");
		
		for(Book book :library) {
			System.out.println(book);
			book.showInfo();
			
			
		}
		
	}

}
