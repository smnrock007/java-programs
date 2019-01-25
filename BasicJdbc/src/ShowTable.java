import java.sql.*;

public class ShowTable 
{
	public static void main(String arg[])
	{
		try
		{
			Class.forName("org.h2.Driver");
			Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "dteja", "dteja");
			Statement statement=conn.createStatement();
			ResultSet resultSet=statement.executeQuery("select * from employee");
			
			while(resultSet.next())
			{
				System.out.print(resultSet.getInt(1)+"\t");
				System.out.print(resultSet.getString(2)+"\t");
				System.out.print(resultSet.getString(3)+"\t");
				System.out.println(resultSet.getInt(4));
			}
			
			statement.close();
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
		
	}
}