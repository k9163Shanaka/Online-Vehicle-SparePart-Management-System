package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Customerdbutill {

	
	public static List<Customer> validate(String userName,String password){
		
		ArrayList<Customer> cus =new ArrayList<>();
		
		//create database connection
		String url="jdbc:mysql://localhost:3306/management";
		String user ="root";
		String pass="Advanced8^,";
		
		//validate 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url,user,pass);
			Statement stmt=con.createStatement();
			String sql ="select*from customer where username='"+userName+"' and password ='"+password+"'";
			ResultSet rs =stmt.executeQuery(sql);
			
			if(rs.next()) {
				int id=rs.getInt(1);
				String name =rs.getString(2);
				String email =rs.getString(3);
				String userU=rs.getString(4);
				String passU=rs.getString(5);
				
				Customer c=new Customer(id,name,email,userU,passU);
				cus.add(c);
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return cus;
		
	}
	
	
	
	
	
	public static boolean insertcustomer(String name,String email,String username,String password) {
		
		boolean isSuccess = false;
		
		//create database connection
				String url="jdbc:mysql://localhost:3306/management";
				String user ="root";
				String pass="Advanced8^,";
				
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection con=DriverManager.getConnection(url,user,pass);
					Statement stmt=con.createStatement();
					String sql="insert into customer value(0,'"+name+"','"+email+"','"+username+"','"+password+"')";
					int rs =stmt.executeUpdate(sql); 
					
					if(rs > 0) {
						
						isSuccess =true;
					}else {
						isSuccess =false;
					}
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
		
		
		
		return isSuccess;
		
		
	}
	
	
	
	
	
	
	public static boolean updatecustomer(String id,String name,String email,String username,String password) {
		
		boolean isSuccess = false;
		
		//create database connection
				String url="jdbc:mysql://localhost:3306/management";
				String user ="root";
				String pass="Advanced8^,";
				
				
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection con=DriverManager.getConnection(url,user,pass);
					Statement stmt=con.createStatement();
					String sql="update customer set name='"+name+"',email='"+email+"',username='"+username+"',password='"+password+"'" 
					+ "where id='"+id+"'";
						
					int rs =stmt.executeUpdate(sql); 
					
					if(rs > 0) {
						
						isSuccess =true;
					}else {
						isSuccess =false;
					}
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
		
		
		
		return isSuccess;	
				
				
				
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static boolean deleteCustomer(String id) {
		
		int convid =Integer.parseInt(id);
		boolean isSuccess = false;
		
		//create database connection
				String url="jdbc:mysql://localhost:3306/management";
				String user ="root";
				String pass="Advanced8^,";
				
				
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection con=DriverManager.getConnection(url,user,pass);
					Statement stmt=con.createStatement();
					String sql="delete from customer where id='"+convid+"'"; 
					
						
					int rs =stmt.executeUpdate(sql); 
					
					if(rs > 0) {
						
						isSuccess =true;
					}else {
						isSuccess =false;
					}
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
		
		
		
		return isSuccess;	
				
				
				
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
