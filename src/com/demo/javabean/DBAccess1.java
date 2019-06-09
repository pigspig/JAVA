package com.demo.javabean;

import java.sql.*;



public class DBAccess1 {

 

public static void main(String[] args) {
      String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";//SQL数据库引擎
     String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=图书管理系统数据库";//数据源  ！！！！注意若出现加载或者连接数据库失败一般是这里出现问题
     String Name="sa";
     String Pwd="1314";
     try{
         Class.forName(driverName);
         System.out.println("加载驱动成功！");
     }catch(Exception e){
         e.printStackTrace();
         System.out.println("加载驱动失败！");
     }
   try
   {
   Connection conn=DriverManager.getConnection(dbURL,Name,Pwd);
   System.out.println("连接数据库成功");
   }catch(Exception e){
    e.printStackTrace();
      System.out.println("连接失败");
      }
}
   }