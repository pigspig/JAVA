package com.demo.javabean;

import java.sql.*;



public class DBAccess1 {

 

public static void main(String[] args) {
      String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";//SQL���ݿ�����
     String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=ͼ�����ϵͳ���ݿ�";//����Դ  ��������ע�������ּ��ػ����������ݿ�ʧ��һ���������������
     String Name="sa";
     String Pwd="1314";
     try{
         Class.forName(driverName);
         System.out.println("���������ɹ���");
     }catch(Exception e){
         e.printStackTrace();
         System.out.println("��������ʧ�ܣ�");
     }
   try
   {
   Connection conn=DriverManager.getConnection(dbURL,Name,Pwd);
   System.out.println("�������ݿ�ɹ�");
   }catch(Exception e){
    e.printStackTrace();
      System.out.println("����ʧ��");
      }
}
   }