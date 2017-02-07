package com.imooc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBUtil {

	//private static final String URL = "jdbc:mysql://47.88.26.246:3306/imooc?useUnicode=true&amp;characterEncoding=UTF-8";
	private static final String URL = "jdbc:mysql://192.168.31.138:3306/imooc?useUnicode=true&characterEncoding=UTF-8&useSSL=false";

	private static final String USER = "yoyo";
	private static final String PASSWORD = "123456";
	private static Connection conn;
	
	static {	
		try {
			// 1.加载驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			// 2.获得数据库的连接
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConn () {		
		return conn;
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("开始查询");		
		// 3.通过数据库的连接操作数据库，实现增删改查
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from imooc_goddess");
		while(rs.next()) {
			System.out.println(rs.getString("user_name"));
		}
	}
}
