package com.database;

public class DbManeger {
	public static DataBase Data(String abc)
	{
		DataBase db=null;
		if(abc.equals("Customer"))
		{
	      db=new CustomerDb();
		}
		else if(abc.equals("Employee"))
		{
		  db=new EmployeeDb();
		}
		return db;
	}
}
