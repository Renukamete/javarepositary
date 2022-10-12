package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connectivity {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String sql="INSERT INTO jdbc (ID, Name,Lastname) values(2, 'renu', 'mete'),(3,'abc','xyz'),(4,'rte','rttff')";
		Class.forName( "com.mysql.cj.jdbc.Driver");

		Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/ jdbcschema","root","root");
		

		
		Statement s=con.createStatement();
		System.out.println("data inserted");
		s.execute(sql);
		s.close();
		con.close();
	
	}

}
