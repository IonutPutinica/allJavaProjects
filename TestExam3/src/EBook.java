
public class EBook extends Book
{
   public String url;

   public EBook(String url, String title, String isbn)
   {
      super(title, isbn);
      this.url = url;
   }

   public String getUrl()
   {
      return url;
   }

   public String getBookType()
   {
      return "E-book";
   }

   public String toString()
   {
      return super.toString() + "is" + getBookType();
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof EBook))
         return false;
      else
      {
         EBook other = (EBook) obj;
         return (this.url.equals(other.getUrl()));
      }
   }
  
}
