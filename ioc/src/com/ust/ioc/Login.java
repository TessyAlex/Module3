package com.ust.ioc;

public class Login {
	
	private String userName;
	private String password;
	DbConnection db;
	
public String getUserName() {
	return userName;
}	
public void setUserName(String userName) {
	this.userName=userName;

}
public String getPassword() {
	return password;
}	
public void setPassword(String password) {
	this.password=password;

}
public DbConnection getDb() {
	return db;
}	
public void setDb(DbConnection db) {
	this.db=db;

}

	public String validate(){
		
		// obtain connection and writes sql
		// to verify userName and password exist in database.
		
		// user defined objects cannot be created with new as we have beans, beans access the values which is taken with getter and setter using dependency.
		Connection con= db.getConnection();// dependency 
		return "login validated";
	}

}
