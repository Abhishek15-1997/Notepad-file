import java.sql.*;
class SQLDemo1
{
	public static void main(String args[])
	{
		try
		{
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * From regions");
			while(rs.next())
			{
				System.out.println("I m here");
				int id=rs.getInt(1);
				String rg_name=rs.getString(2);
				System.out.println(id+" "+rg_name);
			}
		conn.close();
		}
		catch(Exception e){e.printStackTrace();}
	}
}