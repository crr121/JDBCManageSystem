package com.zt.util;

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
	//�ر�����
}
