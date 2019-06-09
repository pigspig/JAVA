package 实验9;
import javax.swing.*;
public class ChaxunTushu extends JFrame{
	String [] tableHead;
	String [][] content;
	JTable table;
	Chaxun findRecord = new Chaxun();
	public ChaxunTushu(){
		findRecord.setDatabaseName("图书管理系统数据库");
		findRecord.setSQL("select * from book");
		content =findRecord.getRecord();
		tableHead = findRecord.getColumnName();
		table = new JTable(content,tableHead);
		add(new JScrollPane (table));
		setBounds(12,100,400,200);
		setTitle("查询图书");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
}