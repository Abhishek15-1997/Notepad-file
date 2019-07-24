import java.sql.*;
import java.io.*;
class JDBCDemo4
{
	public static void main(String args[])
	{
		try{
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader bf=new BufferedReader(isr);
			System.out.println("enter the operation you want to perform");
			System.out.println("Press 1 for sign up");
			System.out.println("Press 2 for sign in");
			System.out.println("Press 3 for delete account");	
			System.out.println("Press 4 for update account");
		
		
			int i=Integer.parseInt(bf.readLine());
			if(i==1)
			{

				System.out.println("enter your email");
				String eml=bf.readLine();

				System.out.println("enter your password");
				String pass=bf.readLine();

				System.out.println("enter your first name");
				String fname=bf.readLine();

				System.out.println("enter your last name");
				String lname=bf.readLine();
				
				PreparedStatement pst=conn.prepareStatement("insert into my_user values(sq_usrid.nextVal,?,?,?,?)");
				pst.setString(1,eml);
				pst.setString(2,pass);
				pst.setString(3,fname);
				pst.setString(4,lname);

				int p=pst.executeUpdate();
				if(p!=0)
				System.out.println(p+" row inserted");
				else
				System.out.println("0 row inserted");

	
			}
			 if(i==2)
			{
				
				System.out.println("enter your email");
				String eml=bf.readLine();

				PreparedStatement st=conn.prepareStatement("select * from my_user where email=?");
				st.setString(1,eml);

				ResultSet rst=st.executeQuery();
				int flag=0;
				while(rst.next())
				{	
				if(rst.getString(2).equals(eml))
				{
					System.out.println("correct email");
					flag=1;
				}	
				
				}
				if(flag==0)
				System.out.println("Incorrect email");

			}

				if(i==3)
				{
					System.out.println("enter your id which you want to delete");
					int id=Integer.parseInt(bf.readLine());

					PreparedStatement st=conn.prepareStatement("delete  from my_user where id=?");
					st.setInt(1,id);
					int num=st.executeUpdate();
					if(num!=0)
					System.out.println(num+" row deleted");
					else
					System.out.println("no row deleted");
						
					
				}

				if(i==4)
				{
					System.out.println("enter your id");
					int id=Integer.parseInt(bf.readLine());		
			
					PreparedStatement st=conn.prepareStatement("select * from my_user where id=?");
					st.setInt(1,id);
					ResultSet rs=st.executeQuery();

						if(rs.next())
						{
							System.out.println("enter your email to update");
							String eml=bf.readLine();

							System.out.println("enter your password to update");
							String pass=bf.readLine();
		
							System.out.println("enter your first name to update");
							String fname=bf.readLine();
		
							System.out.println("enter your last name to update");
							String lname=bf.readLine();

							PreparedStatement str=conn.prepareStatement("update my_user set email=?,password=?,first_name=?,last_name=?");
							str.setString(1,eml);
							str.setString(2,pass);
							str.setString(3,fname);
							str.setString(4,lname);
							int e=str.executeUpdate();
							if(e!=0)
							System.out.println("row updated");
							else
							System.out.println("row updated");
						

						}
						else
							System.out.println("incorrect id");
					

						
				}
				conn.close();
		}

		catch(Exception e){System.out.println(e);}
		
		
	}
}