package 实验9;

	import java.awt.*;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import javax.swing.JTextField;
	import java.sql.*;
	public class TushuListen implements ActionListener{
		JTextField inputnumber,inputbookname,inputauthor;
		public void setinputnumber(JTextField inputnumber){
			this.inputnumber = inputnumber;
		}
		public void setinputbookname(JTextField inputbookname){
			this.inputbookname = inputbookname;
		}
		public void setinputauthor(JTextField inputauthor){
			this.inputauthor = inputauthor;
		}
		public void actionPerformed(ActionEvent e){
			Connection con;
			Statement sql;
			ResultSet rs;
			con = DBCon.connectDB("图书管理系统数据库","sa","1314");
			if(con==null)
				return;
			String number = inputnumber.getText();
			String bookname = inputbookname.getText();
			String author = inputauthor.getText(); 
			try{
				sql=con.createStatement();
				 String charu="('"+number+"',+'"+bookname+"',+'"+author+"')";
				 String jilu="insert into book values"+charu;
				 sql.executeUpdate(jilu);
				 rs = sql.executeQuery("SELECT * FROM book");
				 while(rs.next()){
					 String number1 = rs.getString(1);
					 String bookname1 = rs.getString(2);
					 String author1 = rs.getString(3);
					 System.out.printf("%s\t", number1);
				     System.out.printf("%s\t", bookname1);
					 System.out.printf("%s\t", author1);
					
				 }
				 con.close();
				 System.out.println("添加成功");
			}
			catch(SQLException e1){
				System.out.println("插入失败"+e1);
		}
	}
}
