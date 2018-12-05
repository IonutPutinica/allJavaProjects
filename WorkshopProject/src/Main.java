import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main
{

   public static void main(String[] args)
   {

      Connection connection = null;
      try
      {
         Class.forName("org.postgresql.Driver");
         connection = DriverManager.getConnection(
               "jdbc:postgresql://10.152.200.125:5432/postgres", "postgres",
               "12345");
         System.out.println("Database open ok");

         String sql1 = "select count(*) from enterpreneur;";
         String sql2 = "select count(*) from enterpreneur WHERE city=?";
         String sql3 = "select bus_name from business WHERE bus_name=?";

         PreparedStatement statement = connection.prepareStatement(sql1);
         PreparedStatement statment2 = connection.prepareStatement(sql2);
         PreparedStatement statment3 = connection.prepareStatement(sql3);

         statment2.setString(1, "London");
         statment3.setString(1, );
         ResultSet rs1 = statement.executeQuery();
         ResultSet rs2 = statment2.executeQuery();
         ResultSet rs3 = statment3.executeQuery();

         while (rs1.next())
         {
            int noEntrepreneurs = rs1.getInt(1);
            System.out
                  .println("There are " + noEntrepreneurs + " entrepreneurs");
         }
         while (rs2.next())
         {
            int noEntrepreneursLondon = rs2.getInt(1);
            System.out.println("There are " + noEntrepreneursLondon
                  + " entrepreneurs from London");

         }

         statement.close();
         statment2.close();
         statment3.close();
         connection.close();

      }
      catch (Exception e)
      {
         System.err.println(e.getClass().getName() + ": " + e.getMessage());
         System.exit(0);
      }
      System.out.println("Database table ok");
   }
}
