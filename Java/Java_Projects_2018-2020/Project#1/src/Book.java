public class Book 
{	
	public String Title; //fields of class Book
	public String Category;
	private String Author;
	private long ISBN_13;
	private String Publisher;
	private int Pages;
	private double Price;

	public Book(String Title,String Category,String Author,long ISBN_13,String Publisher,int Pages,double Price)
	{
	    this.setAuthor(Author);
	    this.setISBN_13(ISBN_13);
	    this.setPublisher(Publisher);
	    this.setPages(Pages);
	    this.setPrice(Price);
	    

		this.Title = Title;
		this.Category = Category;
	}

	public void setAuthor(String Author) 
	{
		this.Author = Author;
		
	}
	
	public String getAuthor()
	{
		return this.Author;
	}
	public void setISBN_13(long ISBN_13) 
	{
		this.ISBN_13 = ISBN_13;
	}
    
	public long getISBN_13()
	{
		return this.ISBN_13;
	}

	public void setPublisher(String Publisher)
	{
		this.Publisher = Publisher;
	}
	
	public String getPublisher()
	{
		return this.Publisher;
	}
	
	public void setPages(int Pages)
	{
		this.Pages = Pages;
	}

	public int getPages()
	{
		return this.Pages;
	}
	
	public void setPrice(double Price)
	{
		this.Price = Price;
	}
	
	public double getPrice()
	{
		return this.Price;
	}

	public double getPriceDifference(Book BookA,Book BookB) // method used for the subtraction of the values of the two books
	{
		double subs = 0;
		subs = BookA.getPrice() - BookB.getPrice();
		
		return subs;
	}
	
}
