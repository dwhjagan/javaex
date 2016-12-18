package Edu2.Module_6_Assignments.src.module6.catalogue;

public class BookCatalogue 
{
	protected String bookID = null;
	protected String author = null;
	protected String title = null;
	protected String genre = null;
	protected String price = null;
	protected String publishDate = null;
	protected String description = null;
	
	public BookCatalogue(String bookID, String author, String title, 
			String genre, String price, String publishDate, String description)
	{
		this.bookID = bookID;
		this.author = author;
		this.title = title;
		this.genre = genre;
		this.price = price;
		this.publishDate = publishDate;
		this.description = description;
	}
	
	@Override
	public String toString()
	{ return "BookID: " + bookID + " Title: " + title + " Price: " + price; }
}
