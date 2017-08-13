package com.zt.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class JDBCUtil {
    //��������
	//������������ֻ��Ҫ����һ�ξ�����
	//�����������Ƕ���һ����̬����ִ�м�������
	/*static{
		//���ô�д�����forName()��������ȡ������������
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
	//����һ����Դ�����͵ı������ڻ�ȡ��Դ��������
	//�������Ϊ˽�еľ�̬������
	private static ResourceBundle rb = ResourceBundle.getBundle("jdbc");
	//��Դ������src���棬����ֱ��д��Դ�������֣���Ҫ��׺��
	//Ȼ��ͨ����Դ������ȡ����������ֶε�����
	//����driver���ַ������͵�������rb.gerstring��������ȡ
	//ע��������һ���ֶ���Ҫ�����ţ����Ǳ���
	//����������Ҫ��һ����̬������ִ��
	//����Ҫ�ȶ���һ��static��
	static{
		try {
			Class.forName(rb.getString("driver"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//��ȡ����
	//��ȡ���Ӳ���������������ȡ����
	//ͬ���Ļ�ȡ��������Ҳ����һ��������ִ�У��������ﲻ����һ����̬��
	//����Ҫ����������������һ��connection�����Ͳ���
	public Connection getConnection(){
		//Ϊ���Ȳ������ȶ���һ��connection�ı���con���ڷ���
		Connection con = null;
		//�����url user password ����Ҫͨ����Դ������ȡ��Ӧ���ֶ���������
		try {
			//ע�������url user pwd ������Դ��jdbc.properties����ļ�ֵ�Եļ����ֶ��������ַ�����ʽ��Ҫ����
			//�����Ǳ������൱��������һ��map,ͨ����������ļ����ַ�������ʽ������ȡ��Ӧ��ֵ
			DriverManager.getConnection(rb.getString("url"), rb.getString("user"), rb.getString("pwd"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	//�ر�����
	//�ر����ӵ�˳���ǽ����rs   Ԥ����ps/st   ���� con
	//�������Ƕ��г�ֵnull
	//�ٹر�֮ǰ����Ҫ���ж��Ƿ�Ϊ�գ�Ϊ�յĻ��Ͳ��ùرղ�����
	//����Ĺر�û�з���ֵ
	//������Ҫ����������Ҫ�رյĲ�������
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
