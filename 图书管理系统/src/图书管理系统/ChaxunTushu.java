package ʵ��9;
import javax.swing.*;
public class ChaxunTushu extends JFrame{
	String [] tableHead;
	String [][] content;
	JTable table;
	Chaxun findRecord = new Chaxun();
	public ChaxunTushu(){
		findRecord.setDatabaseName("ͼ�����ϵͳ���ݿ�");
		findRecord.setSQL("select * from book");
		content =findRecord.getRecord();
		tableHead = findRecord.getColumnName();
		table = new JTable(content,tableHead);
		add(new JScrollPane (table));
		setBounds(12,100,400,200);
		setTitle("��ѯͼ��");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
}