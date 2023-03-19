package MyJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class SqlInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner s=new Scanner(System.in);
		System.out.println("enter no");
		int no=s.nextInt();
		System.out.println("enter name");
		String name=s.next();
		System.out.println("enter cost");
		int cost=s.nextInt();
		System.out.println("enter phone");
		Long phone=s.nextLong();
		System.out.println("enter cm");
		String cm=s.next();

		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ram","root","Reddy70@");
		Statement st= con.createStatement();
		
		String query="insert into bikedetails values("+no+",'"+name+"',"+cost+","+phone+",'"+cm+"')";
		st.executeUpdate(query);
		
		
		con.close();
		}catch(Exception e) {
			System.out.println(e);
			
		}
	}

}
