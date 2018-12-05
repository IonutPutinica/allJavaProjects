
public class PrintedBook extends Book
{
   private boolean isPaperback;

   public PrintedBook(String title, String isbn, boolean paperback)
   {
      super(title, isbn);
      this.isPaperback = paperback;
   }

   public boolean isPaperback()
   {
      if (this.isPaperback == true)
         return true;
      else
         return false;
   }

   public String getBookType()
   {
      if (isPaperback())
         return "Paperback";
      else
         return "Hardcover";
   }

   public String toString()
   {
      return super.toString() + "is" + getBookType();
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof PrintedBook))
         return false;
      else
      {
         PrintedBook other = (PrintedBook) obj;
         return (this.isPaperback == other.isPaperback());
      }
   }
}
