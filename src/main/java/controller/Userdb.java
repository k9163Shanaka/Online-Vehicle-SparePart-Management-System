package controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Userdb {
	String s1=null;
	 
	public String insertUser(Registerdb rb) {
		
		Mydb db=new Mydb();
		Connection con=db.getCon();
		try {
			Statement stmt =con.createStatement();
			stmt.executeUpdate("insert into register(name,email,password) values('"+rb.getName()+"','"+rb.getEmail()+"','"+rb.getPassword()+"')");
			s1="Data inserted";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s1;
	}

}
