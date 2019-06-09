package com.demo.javabean;
import java.util.*;
public class Login {
	private int id;
	private String username;
	private String password;
	
   LinkedList<String> car; //用户的购物车
   public Login() {
      car = new LinkedList<String>();
   }
   public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
   public LinkedList<String> getCar() { 
      return car;
   }
}
