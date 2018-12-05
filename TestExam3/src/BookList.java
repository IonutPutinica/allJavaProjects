import java.util.ArrayList;

public class BookList
{
   private ArrayList<Book> book;

   public BookList()
   {
   }

   public void addBook(Book book)
   {
      this.book.add(book);
   }

   public Book getBook(int index)
   {
      return this.book.get(index);
   }

   public Book getBook(String isbn)
   {
      for (int i = 0; i < this.book.size(); i++)
      {
         if (this.book.get(i).getIsbn().equals(isbn))
            return this.book.get(i);
      }
      return null;
   }

   public Book removeBook(int index)
   {
      Book other = this.book.get(index);
      this.book.remove(index);
      return other;
   }

   public int getIndexOfFirstPrintedBook()
   {
      for (int i = 0; i < this.book.size(); i++)
      {
         if (this.book.get(i) instanceof PrintedBook)
            return i;
      }
      return (Integer) null;
   }

   public int getNumberOfBooksByType(String bookType)
   {
      int k = 0;
      for (int i = 0; i < this.book.size(); i++)
      {
         if (this.book.get(i).getBookType().equals(bookType))
            k++;
      }
      return k;
   }

   public Book[] getBooksByType(String bookType)
   {
      int j = getNumberOfBooksByType(bookType), c = 0;
      Book[] book1 = new Book[j];
      for (int i = 0; i < this.book.size(); i++)
      {
         if (this.book.get(i).getBookType().equals(bookType))
            book1[j] = this.book.get(i);
         c++;
      }
      return book1;
   }

   public EBook[] getAllEBooks()
   {
      int c = 0, j = 0;
      for (int i = 0; i < this.book.size(); i++)
      {
         if (this.book.get(i) instanceof EBook)
            c++;
      }
      EBook[] ebok = new EBook[c];
      for (int i = 0; i < this.book.size(); i++)
      {
         if (this.book.get(i) instanceof EBook)
            ebok[j] = (EBook) this.book.get(i);
      }
      return ebok;
   }
   public String toString()
   {
      for(i=0;i<this.book.size();i++)
      {
         System.out.println(this.book.get(i).toString());
   }
   return null;
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof BookList))
         return false;
      else
      {
         BookList other=(BookList) obj;
         boolean equal=true;
         for(int i=0;)
      }
   }
}
