package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("�¹ڻ��1", "������");
		library[1] = new Book("�¹ڻ��1", "������");
		library[2] = new Book("�¹ڻ��1", "������");
		library[3] = new Book("�¹ڻ��1", "������");
		library[4] = new Book("�¹ڻ��1", "������");
		
		//(������arry/��𼭺���/������arry/������ ������ġ/������ lenth
		
		//�ּҸ� ����
		//System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		
		//���� ����
		
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
		
		library[0].setAuthor("�ڿϼ�");
		library[0].setTitle("����");
		
		
		//����� ���� �ּҰ��� ���� ���� ����
		//���� ��ü�� ������ �ʹٸ� ������ arry �ν��Ͻ��� �������־�ߵ�
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
