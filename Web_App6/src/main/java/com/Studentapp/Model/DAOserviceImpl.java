package com.Studentapp.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAOserviceImpl implements DAOservice{

	private Connection con;
	private Statement stmnt;

	@Override
	public void ConnectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentlogin","root","test");
			stmnt=con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean VerifyLogin(String email, String password) {
		try {
			ResultSet result = stmnt.executeQuery("select * from login where email='"+email+"' and password='"+password+"' ");
			return result.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void saveDetails(String name, String city, String email, String mobile) {
		try {
		stmnt.executeUpdate("insert into registraion values('"+name+"','"+city+"','"+email+"','"+mobile+"')");
		con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public ResultSet listSave() {
		try {
			ResultSet result = stmnt.executeQuery("select * from registraion");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void Delete(String email) {
			try {
			stmnt.executeUpdate("Delete from registraion where email='"+email+"' ");
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}

	@Override
	public void Update(String email, String mobile) {
			try {
			stmnt.executeUpdate("Update registraion set mobile='"+mobile+"' where email='"+email+"' ");
			
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

}
