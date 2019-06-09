package 实验9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import 实验9.denglu;

public class zhujiemian {
	public static void main(String args[]) {
		denglu win=new denglu();
		win.setBounds(600,300,600,300);
		win.setTitle("用户登录");
		Connection con=null;
		 Statement sql;
		 ResultSet rs;
	//  String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	  String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=图书管理系统数据库";
	  String userName="sa";
	  String userPwd="1314";
		try
		{	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		System.out.println("加载驱动成功！");
		}catch(Exception e){
		e.printStackTrace();
		System.out.println("加载驱动失败！");
		}
		try{
			con=DriverManager.getConnection(dbURL,userName,userPwd);
			System.out.println("连接数据库成功！");
		}catch(Exception e){
			e.printStackTrace();
		System.out.print("SQL Server连接失败！");}
//		windowmess win2=new windowmess();
//		win2.setBounds(600,300,600,300);
//    	win2.setTitle("消息");
}
}
