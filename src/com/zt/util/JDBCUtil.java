package com.zt.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class JDBCUtil {
    //加载驱动
	//由于驱动我们只需要加载一次就行了
	//所以这里我们定义一个静态块来执行加载驱动
	/*static{
		//采用大写的类的forName()属性来获取到驱动的名字
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
	//定义一个资源包类型的变量用于获取资源包的内容
	//这个变量为私有的静态的类型
	private static ResourceBundle rb = ResourceBundle.getBundle("jdbc");
	//资源包就在src里面，所以直接写资源包的名字，不要后缀名
	//然后通过资源包来获取里面的驱动字段的内容
	//由于driver是字符串类型的所以用rb.gerstring属性来获取
	//注意这里是一个字段名要打引号，不是变量
	//加载驱动需要在一个静态块里面执行
	//所以要先定义一个static块
	static{
		try {
			Class.forName(rb.getString("driver"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//获取连接
	//获取连接采用驱动管理来获取连接
	//同样的获取连接我们也定义一个函数来执行，不过这里不再是一个静态块
	//而是要给公共函数，返回一个connection的类型参数
	public Connection getConnection(){
		//为了先不报错，先定义一个connection的变量con用于返回
		Connection con = null;
		//这里的url user password 都需要通过资源包来获取相应的字段名的内容
		try {
			//注意这里的url user pwd 都是资源包jdbc.properties里面的键值对的键的字段名，是字符串格式需要引号
			//而不是变量，相当于这里是一个map,通过键（这里的键是字符串的形式）来获取对应的值
			DriverManager.getConnection(rb.getString("url"), rb.getString("user"), rb.getString("pwd"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	//关闭连接
	//关闭连接的顺序是结果集rs   预处理ps/st   连接 con
	//由于他们都有初值null
	//再关闭之前都需要先判断是否为空，为空的话就不用关闭操作了
	//这里的关闭没有返回值
	//但是需要传入三个需要关闭的参数进来
	public void closeALL(ResultSet rs,PreparedStatement ps,Connection con){
		
			try {
				if(rs!=null){
					rs.close();
				}
				if(ps!=null){
					ps.close();
				}
				if(con!=null){
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
