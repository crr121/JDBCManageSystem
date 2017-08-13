package com.zt.entity;

public class Dept {
//	int deptNo, String deptName, String deptLoc
	private int deptNo;
	private String deptName;
	private String deptLoc;
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptLoc() {
		return deptLoc;
	}
	public void setDeptLoc(String deptLoc) {
		this.deptLoc = deptLoc;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deptLoc == null) ? 0 : deptLoc.hashCode());
		result = prime * result
				+ ((deptName == null) ? 0 : deptName.hashCode());
		result = prime * result + deptNo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dept other = (Dept) obj;
		if (deptLoc == null) {
			if (other.deptLoc != null)
				return false;
		} else if (!deptLoc.equals(other.deptLoc))
			return false;
		if (deptName == null) {
			if (other.deptName != null)
				return false;
		} else if (!deptName.equals(other.deptName))
			return false;
		if (deptNo != other.deptNo)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Dept [deptNo=" + deptNo + ", deptName=" + deptName
				+ ", deptLoc=" + deptLoc + "]";
	}
	public Dept(int deptNo, String deptName, String deptLoc) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.deptLoc = deptLoc;
	}
	
	
	
	
}
