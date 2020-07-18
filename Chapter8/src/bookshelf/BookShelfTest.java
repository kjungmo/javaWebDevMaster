package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {

		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("¹¹");
		bookQueue.enQueue("°¡");
		bookQueue.enQueue("¿ÀÁö");
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
	}

}