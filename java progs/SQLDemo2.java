import java.sql.*;
class SQLDemo2
{
	public static void main(String args[])
	{
		try{
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		Statement st=conn.createStatement();
		int i=st.executeUpdate("insert into regions values(5,'Antartica')");
		if(i!=0)
		System.out.println("row inserted");

		}
		
		catch(Exception e){System.out.println(e);}
	}
}