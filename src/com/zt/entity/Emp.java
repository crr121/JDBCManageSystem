package com.zt.entity;

import java.util.Date;

public class Emp {
	// int empno, String ename, String job, Emp mgr, Date hiredate,
	// double sal, double comm, Dept deptno
	// �ȶ���ʵ����Emp������ ʵ�������һ�㶨��Ϊ˽�У���������޸�
	// Ȼ��ͨ��set get �������и�ֵ�ͻ�ȡ
	private int empno;
	private String ename;
	private String job;
	// �����mgrΪ���������ΪEmp����
	private Emp mgr;
	// ����Ϊdate����
	private Date hiredate;
	private double sal;
	private double comm;
	// ����Ĳ��ű��Ҳ�����
	// ����ΪDept

	private Dept deptno;
//�вι���
	public Emp(int empno, String ename, String job, Emp mgr, Date hiredate,
			double sal, double comm, Dept deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}
//�޲ι���
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

//��дhash code����
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(comm);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((deptno == null) ? 0 : deptno.hashCode());
		result = prime * result + empno;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		result = prime * result
				+ ((hiredate == null) ? 0 : hiredate.hashCode());
		result = prime * result + ((job == null) ? 0 : job.hashCode());
		result = prime * result + ((mgr == null) ? 0 : mgr.hashCode());
		temp = Double.doubleToLongBits(sal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
//��дequal����
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (Double.doubleToLongBits(comm) != Double
				.doubleToLongBits(other.comm))
			return false;
		if (deptno == null) {
			if (other.deptno != null)
				return false;
		} else if (!deptno.equals(other.deptno))
			return false;
		if (empno != other.empno)
			return false;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		if (hiredate == null) {
			if (other.hiredate != null)
				return false;
		} else if (!hiredate.equals(other.hiredate))
			return false;
		if (job == null) {
			if (other.job != null)
				return false;
		} else if (!job.equals(other.job))
			return false;
		if (mgr == null) {
			if (other.mgr != null)
				return false;
		} else if (!mgr.equals(other.mgr))
			return false;
		if (Double.doubleToLongBits(sal) != Double.doubleToLongBits(other.sal))
			return false;
		return true;
	}
//��дtostring����
	
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job
				+ ", mgr=" + mgr + ", hiredate=" + hiredate + ", sal=" + sal
				+ ", comm=" + comm + ", deptno=" + deptno + "]";
	}
}