import java.sql.*;
import java.io.*;
class SQLDemo3
{
	public static void main(String args[])
	{
		try{
		InputStreamReader rs=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(rs);
		System.out.println("enter region id");

		int i=Integer.parseInt(br.readLine());
		System.out.println("enter region name");
		String name=br.readLine();

		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");



		PreparedStatement st=conn.prepareStatement("insert into regions values(?,?)");
		st.setInt(1,i);
		st.setString(2,name);
		int h=st.executeUpdate();
		if(h!=0)
		System.out.println("rows inserted");
		
		conn.close();
		}
		
		catch(Exception e){System.out.println(e);}
		
	}
}