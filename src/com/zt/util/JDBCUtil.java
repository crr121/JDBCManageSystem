package com.zt.util;

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
	//关闭连接
}
