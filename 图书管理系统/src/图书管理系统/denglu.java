package 实验9;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class denglu extends JFrame{
	Box boxH;
	Box boxVOne,boxVTwo,boxVThree;
	JButton tijiao;
	JButton tuichu;
	JTextField username,userPwd;
	windowmess windowmess;
	JTextField inputNumberOne,inputNumberTwo;
	String inputUserid,inputPwd;
	JTextField inputEnglish;
	JTextArea show;
	public denglu() {
		setLayout(null);
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	void init() {
		username=new JTextField(5);
		userPwd=new JPasswordField(5);
		boxH=Box.createHorizontalBox();
		boxVOne=Box.createVerticalBox();
		boxVTwo=Box.createVerticalBox();
		boxVOne.add(new JLabel("姓名："));
		boxVOne.add(new JLabel("密码："));
		boxVTwo.add(username);
		boxVTwo.add(userPwd);
		boxH.add(boxVOne);
		boxH.add(Box.createHorizontalStrut(10));
		boxH.add(boxVTwo);
		add(boxH);
		boxH.setBounds(200,50,200,50);
		tijiao=new JButton("登录");
		tuichu=new JButton("退出");
		add(tijiao);
		tijiao.setBounds(200,150,80,50);
		add(tuichu);
		tuichu.setBounds(350,150,80,50);
		windowmess=new windowmess();
		windowmess.getUsername(username);
		windowmess.getPassword(userPwd);
		tijiao.addActionListener(windowmess);
        tuichu.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		int j=JOptionPane.showConfirmDialog(null, "确定要退出吗","退出",JOptionPane.CANCEL_OPTION);
        		if(j==JOptionPane.YES_NO_OPTION) {
        			System.exit(0);
        		}
        	}
        });
	}
}