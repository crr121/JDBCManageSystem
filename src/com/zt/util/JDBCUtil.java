package com.zt.util;

public class JDBCUtil {
    //��������
	//������������ֻ��Ҫ����һ�ξ�����
	//�����������Ƕ���һ����̬����ִ�м�������
	static{
		//���ô�д�����forName()��������ȡ������������
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//��ȡ����
	//�ر�����
}
