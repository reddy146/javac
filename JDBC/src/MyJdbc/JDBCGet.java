package MyJdbc;

import java.sql.*;
public class JDBCGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub





		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ram","root","Reddy70@");
		Statement st= con.createStatement();
		ResultSet  sr=st.executeQuery("select * from bikedetails");
		
		while(sr.next()) {
			System.out.print("no ="+sr.getInt(1)+" ");
			System.out.print("name ="+sr.getString(2)+" ");
			System.out.print("cost ="+sr.getInt(3)+" ");
			System.out.print("phone ="+ sr.getLong(4)+" ");
			System.out.print("cm ="+sr.getString(5)+" ");
			System.out.println();
			System.out.println();
		}
		con.close();
		}catch(Exception e) {
			System.out.println(e);
			
		}
		
			
		
	}


	

}
