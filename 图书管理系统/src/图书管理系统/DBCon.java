package 实验9;

import java.sql.*;
public class DBCon {
	public static Connection connectDB(String DBName,String id,String p){
		Connection con=null;

	//  String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	  String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=图书管理系统数据库";
	  String username=id;
	  String password=p;
	 try{
		 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	System.out.println("加载驱动成功！");
	}
	 catch(Exception e){
	e.printStackTrace();
	System.out.println("加载驱动失败！");
	}
	try{
		con=DriverManager.getConnection(dbURL,username,password);
		System.out.println("连接数据库成功！");
	}
	catch(Exception e){
		e.printStackTrace();
	System.out.print("SQL Server连接失败！");}
	return con;
	}
}
