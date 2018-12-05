
import java.sql.*;

public class ConnectToDB {
	public static void main(String[] args) {
		
		try {
			
			String username = "postgres";
			String password = "12345";
			String url = "jdbc:postgresql://10.152.212.116/postgres"; // to connect to different computer change localhost to IP address of that computer
			
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection(url, username, password);
			
			String sql1 = "select * from students where name = 'Angelica' and subject_id = '34386' and average = '8.10';";
			
			PreparedStatement statement = connection.prepareStatement(sql1);
			ResultSet rs1 = statement.executeQuery();
			
			while(rs1.next()) 
			{
				int studentNo = rs1.getInt(1);
				System.out.println("Student Number: " + studentNo );
			}
			
			statement.close();
			connection.close();
			
		} catch (Exception ex) {ex.printStackTrace();}
		
	}
}
