package ʵ��9;

import java.sql.*;
public class DBCon {
	public static Connection connectDB(String DBName,String id,String p){
		Connection con=null;

	//  String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	  String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=ͼ�����ϵͳ���ݿ�";
	  String username=id;
	  String password=p;
	 try{
		 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	System.out.println("���������ɹ���");
	}
	 catch(Exception e){
	e.printStackTrace();
	System.out.println("��������ʧ�ܣ�");
	}
	try{
		con=DriverManager.getConnection(dbURL,username,password);
		System.out.println("�������ݿ�ɹ���");
	}
	catch(Exception e){
		e.printStackTrace();
	System.out.print("SQL Server����ʧ�ܣ�");}
	return con;
	}
}
