public class Book
{
  //Fields/Instance Data
  private String title;
  private String author;
  private int year;
  private int numPages;
  private boolean hardCover;
 
  //Constructor
  public Book(String t, String a, int y, int n, boolean h)
  {
    title = t;
    author = a;
    year = y;
    numPages = n;
    hardCover = h;
  }

  //Accessor Methods
  public String getTitle()
  {
    return title;
  }
  public String getAuthor()
  {
    return author;
  }
  public int getYear()
  {
    return year;
  }
  public int getNumPages()
  {
    return numPages;
  }
  public boolean getHardCover()
  {
    return hardCover;
  }

//Mutator Methods (Setter Methods)
public void setTitle(String str)
{
  title = str;
}
public void setAuthor(String str)
{
  author = str;
}
public void setYear(int i)
{
  year = i;
}
public void setNumPages(int i)
{
  numPages = i;
}
public void setHardCover(boolean b)
{
  hardCover = b;
}


//private - cannot access directly from outside the class (Encapsulation)
//public - can access from outside the class

//OTHER METHODS 
public boolean equals(Book b)
{
  if (this.getTitle().equals(b.getTitle()))
  {
    return true;
  }
  return false;

}

//what prints for our objects
public String toString()
{
  String str ="";
  str = "Title: " + title + "\nAuthor: " + author + "\nYear: " + year;
  str = str + "\nNumber of Pages: " + numPages + "\nHardcover: " + hardCover+ "\n";
  
  return str;
}
}