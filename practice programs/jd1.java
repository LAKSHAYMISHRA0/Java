import java.sql.*;
public class jd1
{
	public static void main(String[] args)
	{
		try
		{
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:ucanaccess://employee.accdb");
			int eno=10;
			String enm="xyz";
			String s="insert into emp values("+eno+",'"+enm+"')";
			System.out.println(s);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from emp where empno>"+eno);
			try
			{
				while(rs.next())
				{
					System.out.print(rs.getInt("empno")+":");
					System.out.print(rs.getString("ename")+"\n");
				}
			}catch(Exception e)
			{
				System.out.println(e);
			}
	

		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}