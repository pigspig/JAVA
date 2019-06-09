package com.demo.javabean;

public class SplbBean {

	public boolean valid(String name, String number) {
		boolean isValid = false;
		DBAccess db = new DBAccess();
		if(db.createConn()) {
			String sql = "select * from sp1 where name='"+name+"' and number='"+number+"'";
			db.query(sql);
			if(db.next()) {
				isValid = true;
			}
			db.closeRs();
			db.closeStm();
			db.closeConn();
		}
		return isValid;
	}
	
	public boolean isExist(String name) {
		boolean isExist = false;
		DBAccess db = new DBAccess();
		if(db.createConn()) {
			String sql = "select * from sp1 where name='"+name+"'";
			db.query(sql);
			if(db.next()) {
				isExist = true;
			}
			db.closeRs();
			db.closeStm();
			db.closeConn();
		}
		return isExist;
	}
	
	public void add(String name, String number, String value,String amount) {
		DBAccess db = new DBAccess();
		if(db.createConn()) {
			String sql = "insert into sp1(name,number,value,amount) values('"+name+"','"+number+"','"+value+"','"+amount+"')";
			db.update(sql);
			db.closeStm();
			db.closeConn();
		}
	}
}
