
/**
 * Class Book manages title and author for a book.
 * 
 * @author Kemar Golding
 * @version 9/20/2017
 */
public class Book
{
    private String title;   // Title of the book
    private String author;   // Author of the book
    private int pages;       // Number of pages in the book

    /**
     * Constructor that sets empty strings for title and author and pages to zero.
     */
    public Book()
    {
        this("", "", 0);
    }
    
    /**
     * Constructor that sets the title, author and pages of the book to the values of the three parameters.
     * 
     * @param title The title of the book
     * @param author The author of the book
     * @param pages The number of pages in the book
     */
    public Book(String title, String author, int pages)
    {
        setTitle(title);
        setAuthor(author);
        setPages(pages);
    }
    
    /**
     * Updates the title of the book to the value of the parameter.
     * 
     * @param title The title of the book
     */
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    /**
     * Updates the author of the book to the value of the parameter.
     * 
     * @param author The author of the book
     */
    public void setAuthor(String author)
    {
        this.author = author;
    }
    
    /**
     * Updates the number of pages in the book to the value of the parameter.
     * The number of pages must be positive or zero (meaning not set)
     * 
     * @param pages The number of pages in the book
     */
    public void setPages(int pages) {
        if (pages >= 0) {
            this.pages = pages;
        }
    }
    
    /**
     * Returns the title of the book as a String.
     * 
     * @return The title of the book
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Returns the author of the book as a String.
     * 
     * @return The author of the book
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * Returns the number of pages in the book.
     * 
     * @return number of pages
     */
    public int getPages() {
        return pages;
    }
    
    /**
     * Returns a String representation of the Book class with author, title
     * and number of pages
     * 
     * @param author, title and number of pages of the book
     */
    
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Title: ");
        output.append( getTitle() );
        output.append("\nAuthor: ");
        output.append( getAuthor() );
        output.append("\nPages: ");
        output.append( getPages() );
        
        return output.toString();
    }
}
