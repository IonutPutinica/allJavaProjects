
import java.sql.Connection;
import java.sql.DriverManager;

public class Database 
{
	private Connection connection;
	
	public Database(String userName, String password)
	{
		try
		{
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(
					"jdbc:postgressql://10.152.200.125/postgres", "postgres", "12345");
			
		}
	}
	
	
	
}
