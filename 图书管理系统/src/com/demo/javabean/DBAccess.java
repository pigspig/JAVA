package com.demo.javabean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBAccess {

	private String drv = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

	private String url = "jdbc:sqlserver://localhost:1433;DatabaseName=图书管理系统数据库";

	private String usr = "sa";

	private String pwd = "1314";

	private Connection con = null;

	private Statement stm = null;

	private ResultSet rs = null;

	public boolean createConn() {
		boolean b = false;
		try {
			Class.forName(drv).newInstance();
			con = DriverManager.getConnection(url, usr, pwd);
			b = true;
		} catch (SQLException e) {
		} catch (ClassNotFoundException e) {
		} catch (InstantiationException e) {
		} catch (IllegalAccessException e) {
		}
		return b;
	}

	public boolean update(String sql) {
		boolean b = false;
		try {
			stm = con.createStatement();
			stm.execute(sql);
			b = true;
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return b;
	}

	public void query(String sql) {
		try {
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
		} catch (Exception e) {
		}
	}
	
	public boolean next() {
		boolean b = false;
		try {
			if(rs.next())b = true;
		} catch (Exception e) {
		}
		return b;		
	}
	
	public String getValue(String field) {
		String value = null;
		try {
			if(rs!=null)value = rs.getString(field);
		} catch (Exception e) {
		}
		return value;
	}

	public void closeConn() {
		try {
			if (con != null)
				con.close();
		} catch (SQLException e) {
		}
	}

	public void closeStm() {
		try {
			if (stm != null)
				stm.close();
		} catch (SQLException e) {
		}
	}

	public void closeRs() {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
		}
	}

	public Connection getConn() {
		return con;
	}

	public void setConn(Connection con) {
		this.con = con;
	}

	public String getDrv() {
		return drv;
	}

	public void setDrv(String drv) {
		this.drv = drv;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

	public Statement getStm() {
		return stm;
	}

	public void setStm(Statement stm) {
		this.stm = stm;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsr() {
		return usr;
	}

	public void setUsr(String usr) {
		this.usr = usr;
	}
}
