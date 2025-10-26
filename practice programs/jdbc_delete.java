import java.util.Scanner;
import java.sql.*;

public class jdbc_delete
{
	public static void main(String[] a)
	{
		try{
			Connection con=DriverManager.getConnection("jdbc:ucanaccess://employee.accdb");
			Statement st=con.createStatement();
			Scanner out=new Scanner(System.in);
			//int cd;
			String nm;
			System.out.print("Enter Your Name: ");
			nm=out.nextLine();
			//System.out.println("Enter Your Code: ");
			//cd=out.nextInt();
			String qst="delete from emp where ename='" + nm +"'";
			
			int i=st.executeUpdate(qst);
			System.out.println(i + " Record deleted");
			con.close();
		}catch(Exception e){}


	}

}