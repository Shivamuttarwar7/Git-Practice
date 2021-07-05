package com.database;

public class main1 {

	public static void main(String[] args) {
		System.out.println("Program Starts...");

		DataBase db1=DbManeger.Data("Customer");
		db1.adduser();
		db1.updateuser();
		DataBase db2=DbManeger.Data("Employee");
		db2.adduser();
		db2.updateuser();
		
	}

}
