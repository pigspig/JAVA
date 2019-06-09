package 实验9;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionEvent.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.*;
public class tianjia extends JFrame {
	Box baseBox,boxV1,boxV2;
	JButton confirm,cancel;
	JTextField user3,inputbirthday;
	JTextField password3;
	JTextField inputold,inputname;
	JLabel name,password,birthday,old;
	JPasswordField inputpassword;
	tianjialistener confirmlistener;
	public tianjia() {
		setLayout(null);
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	void init() {
		name = new JLabel("姓名：");
		add(name);
		name.setBounds(70,50,40,20);
		password = new JLabel("密码：");
		add(password);
		password.setBounds(70,70,40,20);
		birthday = new JLabel("生日：");
		add(birthday);
		birthday.setBounds(70,90,40,20);
		old = new JLabel("年龄：");
		add(old);
		old.setBounds(70,110,40,20);
		inputname = new JTextField(10);
		add(inputname);
		inputname.setBounds(110,50,110,20);
		inputpassword = new JPasswordField(10);
		add(inputpassword);
		inputpassword.setBounds(110,70,110,20);
		inputbirthday = new JTextField(10);
		add(inputbirthday);
		inputbirthday.setBounds(110,90,110,20);
		inputold = new JTextField(10);
		add(inputold);
		inputold.setBounds(110,110,110,20);
		confirm = new JButton("确认");
		cancel = new JButton("取消");
		add(confirm);
		confirm.setBounds(100,150,60,30);
		add(cancel);
		cancel.setBounds(170,150,60,30);
		confirmlistener = new tianjialistener();
		confirmlistener.SetInputname(inputname);
		confirmlistener.SetInputpassword(inputpassword);
		confirmlistener.SetInputbirthday(inputbirthday);
		confirmlistener.SetInputold(inputold);
		confirm.addActionListener(confirmlistener);
		
		
        
	}
	
}
