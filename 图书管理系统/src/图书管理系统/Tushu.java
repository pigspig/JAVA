package 实验9;
import java.awt.*;
import javax.swing.*;
public class Tushu extends JFrame {
	JLabel number,bookname,author;
	JTextField inputnumber,inputbookname,inputauthor;
	JButton okbutton,cancelbutton;
	TushuListen oklisten;
	public 	Tushu(){
		setLayout(null);
		init();
		setBounds(400,200,200,200);
		setTitle("addTushu");
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	void init(){
		number = new JLabel("编号：");
		add(number);
		number.setBounds(70,50,40,20);
		bookname = new JLabel("书名：");
		add(bookname);
		bookname.setBounds(70,70,40,20);
		author = new JLabel("作者：");
		add(author);
		author.setBounds(70,90,40,20);
		inputnumber = new JTextField(10);
		add(inputnumber);
		inputnumber.setBounds(110,50,110,20);
		inputbookname = new JTextField(10);
		add(inputbookname);
		inputbookname.setBounds(110,70,110,20);
		inputauthor = new JTextField(10);
		add(inputauthor);
		inputauthor.setBounds(110,90,110,20);
		okbutton = new JButton("确认");
		add(okbutton);
		okbutton.setBounds(100,130,60,30);
		cancelbutton = new JButton("取消");
		add(cancelbutton);
		cancelbutton.setBounds(170,130,60,30);
		oklisten = new TushuListen();
		oklisten.setinputnumber(inputnumber);
		oklisten.setinputbookname(inputbookname);
		oklisten.setinputauthor(inputauthor);
		okbutton.addActionListener(oklisten);
				
		
	}
}
