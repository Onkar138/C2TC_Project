package com.Studentapp.Model;

import java.sql.ResultSet;

public interface DAOservice {
	public void ConnectDB();
	public boolean VerifyLogin(String email,String password);
	public void saveDetails(String name, String city, String email, String mobile);
	public ResultSet listSave();
	public void Delete(String email);
	public void Update(String email, String mobile);
}
