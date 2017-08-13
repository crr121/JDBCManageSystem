package com.zt.util;

public class JDBCUtil {
    //加载驱动
	//由于驱动我们只需要加载一次就行了
	//所以这里我们定义一个静态块来执行加载驱动
	static{
		//采用大写的类的forName()属性来获取到驱动的名字
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//获取连接
	//关闭连接
}
