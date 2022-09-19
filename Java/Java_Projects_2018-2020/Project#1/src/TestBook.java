import java.util.Scanner;
public class TestBook {
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	
	public static void main(String[] args) {

		Scanner enter = new Scanner(System.in); 
		
		System.out.print(ANSI_GREEN + "User enter the title:" + ANSI_RESET);
		String title = enter.nextLine(); // enter the title of book-b
		System.out.print(ANSI_GREEN + "User enter the category:" + ANSI_RESET);
		String category = enter.nextLine(); // enter the category of book-b
		System.out.print(ANSI_GREEN + "User enter the Author:" + ANSI_RESET);
		String author = enter.nextLine(); // enter the author of book-b
		
		System.out.print(ANSI_GREEN + "User enter the publisher:" + ANSI_RESET);
		String publisher = enter.nextLine(); // enter the publisher of book-b
		
		long isbn_13; 
		double price;
		int pages;
		
		do
		{
			System.out.print(ANSI_GREEN + "User enter the isbn_13:" + ANSI_RESET);
		    isbn_13 = enter.nextLong(); // enter the isbn_13 of book-b
		}while(isbn_13 < 0); // ensure that the isbn_13 is non-negative
		
		do
		{
			System.out.print(ANSI_GREEN + "User enter the pages:" + ANSI_RESET);
			pages = enter.nextInt(); // enter the number of pages of book-b
		}while(pages < 0); // ensure that the value pages is non-negative
		
		do
		{
			System.out.print(ANSI_GREEN + "User enter the price:" + ANSI_RESET);
			price = enter.nextDouble(); // enter the price of book-b
		}while(price < 0.0); // ensure that the value price is non-negative
		
		// the elements of the first book(book-a)
        Book BookA = new Book("The Library of Greek Mythology","Mythology","Apollodorus",1229,"Oxford University Press",336,13.95);
        
        
        System.out.println(ANSI_GREEN + "\n\n\t<<Attributes of BookA>>" + ANSI_RESET);
		System.out.printf("Title:%s",BookA.Title);
		System.out.printf("\nCategory:%s",BookA.Category);
		System.out.printf("\nAuhtor:%s",BookA.getAuthor());
		System.out.printf("\nISBN_13:%d",BookA.getISBN_13());
		System.out.printf("\nPublisher:%s",BookA.getPublisher());
		System.out.printf("\nPages:%d",BookA.getPages());
		System.out.printf("\nPrice:" + BookA.getPrice());

		// All the elements of the second book
		Book BookB = new Book(title,category,author,isbn_13,publisher,pages,price);
		
		System.out.println(ANSI_PURPLE + "\n\n\t<<Attributes of BookB>>" + ANSI_RESET);
		System.out.printf("Title:%s",BookB.Title);
		System.out.printf("\nCategory:%s",BookB.Category);
		System.out.printf("\nAuthor:%s",BookB.getAuthor());
		System.out.printf("\nISBN_13:%d",BookB.getISBN_13());
		System.out.printf("\nPublisher:%s",BookB.getPublisher());
		System.out.printf("\nPages:%d",BookB.getPages());
		System.out.printf("\nPrice:" + BookB.getPrice());
		
		double prid;
		prid = BookA.getPriceDifference(BookA,BookB); // call the method getPriceDifference
		
		if(prid > 0.0)
		{
			System.out.printf(ANSI_GREEN + "\n\nThe book <<%s>> is the most expensive one",BookA.Title);
			System.out.printf(ANSI_GREEN + "\nIt belongs to the category of %s",BookA.Category);
		}
		else if(prid < 0.0)
		{
			System.out.printf(ANSI_GREEN + "\n\nThe book <<%s>> is the most expensive one",BookB.Title);
			System.out.printf(ANSI_GREEN + "\nIt belongs to the category of %s",BookB.Category);
		}
		
		enter.close();

	}

	
}
