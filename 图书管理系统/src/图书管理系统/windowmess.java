package ʵ��9;
import java.awt.event.*;
import java.awt.Container;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.*;
import javax.swing.*;
public class windowmess implements ActionListener{
    String Username,Password;
    JTextField jtext1,jtext2;
	String regex1="[a-zZ-Z0-9]+";
    String userPwd="1314";
	 public static void main(String [] args)
	 {
		 Connection con=null;
		 Statement sql;
		 ResultSet rs;
	//  String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	  String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=ͼ�����ϵͳ���ݿ�";
	  String username="sa";
	  String userPwd="1314";
	 try
	{	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	System.out.println("���������ɹ���");
	}catch(Exception e){
	e.printStackTrace();
	System.out.println("��������ʧ�ܣ�");
	}
	try{
		con=DriverManager.getConnection(dbURL,username,userPwd);
		System.out.println("�������ݿ�ɹ���");
	}catch(Exception e){
		e.printStackTrace();
	System.out.print("SQL Server����ʧ�ܣ�");}}
	public void getUsername(JTextField a) {
		jtext1=a;
	}
	public void getPassword(JTextField a) {
		jtext2=a;
	}

	public void actionPerformed(ActionEvent arg0) {
		Username=jtext1.getText().toString().trim();
		Password=jtext2.getText().toString().trim();
		if(Username.length()==0||Password.length()==0) {
			JOptionPane.showMessageDialog(null, "�������û���������","��Ϣ�Ի���",JOptionPane.WARNING_MESSAGE);}
		else if(!Password.matches(userPwd)){
				JOptionPane.showMessageDialog(null, "����������벻��ȷ��������","��Ϣ�Ի���",JOptionPane.WARNING_MESSAGE);
		}
		else if(!(Username.matches(regex1)&&Password.matches(regex1))) {
				JOptionPane.showMessageDialog(null, "�û��������뺬�зǷ��ַ�","��Ϣ�Ի���",JOptionPane.WARNING_MESSAGE);
		}
		else {
			Mainmenu win1=new Mainmenu("���˵��Ĵ���",550,250,600,600);
			JLabel icon=new JLabel(new ImageIcon("src/ʵ��9/timg.jpg"));
			  icon.setBounds(0,0,100,100);
			  win1.add(icon); 
		}
	}
}
