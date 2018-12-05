
public abstract class Book
{
   private String title;
   private String isbn;

   public Book(String title, String isbn)
   {
      this.title = title;
      this.isbn = isbn;
   }

   public String getTitle()
   {
      return title;
   }

   public String getIsbn()
   {
      return isbn;
   }

   public abstract String getBookType();

   public String toString()
   {
      return "Title=" + title + " " + "ISBN=" + isbn;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Book))
         return false;
      else
      {
         Book other = (Book) obj;
         return ((this.title == other.getTitle()
               && (this.isbn == other.getIsbn())));
      }
   }
}
