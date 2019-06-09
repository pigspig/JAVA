package 实验9;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.*;
public class tianjialistener  implements ActionListener{
	JTextField inputname,inputbirthday,inputold;
	JPasswordField inputpassword;
	public void SetInputname(JTextField inputname){
		this.inputname = inputname;
	}
	public void SetInputpassword(JPasswordField inputpassword){
		this.inputpassword =inputpassword;
	}
	public void SetInputbirthday(JTextField inputbirthday){
		this.inputbirthday = inputbirthday;
	}
	public void SetInputold(JTextField inputold){
		this.inputold = inputold;
	}
	public void actionPerformed(ActionEvent e) {
		Connection con;
		Statement sql;
		ResultSet rs;
		con =DBCon.connectDB("图书管理系统数据库","sa","1314");
		if(con==null) return;
		String name=inputname.getText();
	    String password=String.valueOf(inputpassword.getPassword());
	    String birthday=inputbirthday.getText();
	    String old=inputold.getText();
	    
		
		try{
			sql = con.createStatement();
			String charu="('"+name+"',+'"+password+"',+'"+birthday+"',+'"+old+"')";
			String jilu="insert into reader1 values"+charu;
			sql.executeUpdate(jilu);
			rs = sql.executeQuery("SELECT * FROM reader1");
			while (rs.next()){
				String name1 = rs.getString(1);
				String mima = rs.getString(2);
				Date date = rs.getDate(3);
				int old1 = rs.getInt(4);
				System.out.printf("%s\t", name1);
				System.out.printf("%s\t", mima);
				System.out.printf("%s\t", date);
				System.out.printf("%d\n", old1);
			}
			con.close();
			System.out.println("添加成功");
		}
		catch(SQLException e1){
			System.out.println("插入失败"+e1);
		}
	}
			
}
