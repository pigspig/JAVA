package ʵ��9;
import javax.swing.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.awt.BorderLayout;
import java.awt.event.*;
import static javax.swing.JFrame.*;
public class Mainmenu extends JFrame {
	JMenuBar menubar;
	JMenu menu,subMenu,menu2;
	JMenuItem item1,item2,item3,item4,item5,itemBorrower;
//	tianjia tianjia;
	public Mainmenu() {}
	public Mainmenu(String s,int x,int y,int w,int h) {
		init(s);
		setLocation(x,y);
		setSize(w,h);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	void init(String s) {
		setTitle(s);
		menubar=new JMenuBar();
		menu=new JMenu("���");
		menu2=new JMenu("��ѯ");
		subMenu=new JMenu("��������");
		menu.add(subMenu);
		item1=new JMenuItem("���ͼ��",new ImageIcon("a.gif"));
		item2=new JMenuItem("��ӽ�����",new ImageIcon("b.gif"));
		item1.setAccelerator(KeyStroke.getKeyStroke('A'));
		item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK));
		item4=(new JMenuItem("��������",new ImageIcon("c.gif")));
		item5=(new JMenuItem("���籭",new ImageIcon("d.gif")));
		item3=new JMenuItem("��ѯͼ��",new ImageIcon("c.gif"));
		item3.setAccelerator(KeyStroke.getKeyStroke('C'));
		menu.add(item1);
		menu.addSeparator();
		menu.add(item2);
		menu.add(subMenu);
		menubar.add(menu);
		menubar.add(menu2);
		menu2.add(item3);
		subMenu.add(item4);
		subMenu.add(item5);
		setJMenuBar(menubar);
		item2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				tianjia win=new tianjia();
				win.setBounds(700,300,310,260);
				win.setTitle("��ӽ�����");
			}
		});
		item1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Tushu win =new Tushu();
				win.setBounds(700,300,310,260);
				win.setTitle("���ͼ��");
			}
		});
		item3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				ChaxunTushu win =new ChaxunTushu();
				win.setBounds(700,300,310,260);
				win.setTitle("��ѯͼ��");
			}
		});
		item4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Football win =new Football();
				win.setBounds(700,300,500,400);
				win.setTitle("��������");
				JLabel icon=new JLabel(new ImageIcon("src/ʵ��9/meixi.jpg"));
				icon.setBounds(0,0,500,400);
				win.add(icon);
			}
		});
		item5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Football win =new Football();
				win.setBounds(700,300,600,600);
				win.setTitle("���籭");
				JLabel icon=new JLabel(new ImageIcon("src/ʵ��9/shijiebei.jpg"));
				icon.setBounds(0,0,600,600);
				win.add(icon);
			}
		});
	}
}