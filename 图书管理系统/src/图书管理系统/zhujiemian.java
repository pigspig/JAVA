package ʵ��9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import ʵ��9.denglu;

public class zhujiemian {
	public static void main(String args[]) {
		denglu win=new denglu();
		win.setBounds(600,300,600,300);
		win.setTitle("�û���¼");
		Connection con=null;
		 Statement sql;
		 ResultSet rs;
	//  String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	  String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=ͼ�����ϵͳ���ݿ�";
	  String userName="sa";
	  String userPwd="1314";
		try
		{	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		System.out.println("���������ɹ���");
		}catch(Exception e){
		e.printStackTrace();
		System.out.println("��������ʧ�ܣ�");
		}
		try{
			con=DriverManager.getConnection(dbURL,userName,userPwd);
			System.out.println("�������ݿ�ɹ���");
		}catch(Exception e){
			e.printStackTrace();
		System.out.print("SQL Server����ʧ�ܣ�");}
//		windowmess win2=new windowmess();
//		win2.setBounds(600,300,600,300);
//    	win2.setTitle("��Ϣ");
}
}
