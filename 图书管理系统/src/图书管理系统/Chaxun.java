package 实验9;
import java.sql.*;
public class Chaxun {
	String DatabaseName = "";
	String SQL;
	String [] columnName;
	String [][] record;
	public 	Chaxun(){
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		}
		catch(Exception e){}
	}
	public void setDatabaseName(String s){
		DatabaseName = s.trim();
	}
	public void setSQL(String SQL){
		this.SQL=SQL.trim();
	}
	public String[] getColumnName(){
		if(columnName == null){
			System.out.println("先查询记录");
			return null;
		}
		return columnName;
	}
	public String[][] getRecord(){
		startChaxun();
		return record;
	}
	public void startChaxun(){
		Connection con;
		Statement sql;
		ResultSet rs;
		String uri = "jdbc:sqlserver://localhost:1433;DatabaseName=图书管理系统数据库";
		try{
			con =DBCon.connectDB("图书管理系统数据库","sa","1314");
			sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs=sql.executeQuery(SQL);
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			columnName = new String[columnCount];
			for(int i=1;i<=columnCount;i++){
				columnName[i-1]=metaData.getColumnName(i);
			}
			rs.last();
			int recordAmount =rs.getRow();
			record = new String[recordAmount][columnCount];
			int i=0;
			rs.beforeFirst();
			while(rs.next()){
				for(int j=1;j<=columnCount;j++){
					record[i][j-1]=rs.getString(j);
				}
				i++;
			}
			con.close();
		}
		catch(SQLException e){
			System.out.print("请输入正确的表名"+e);
		}
	}
}