package java8;

public class Emp {
	int eid;
	String ename;
	String department;
	int salary;
	Emp(int eid,String ename,String department,int salary)
	{
		this.eid=eid;
		this.ename=ename;
		this.department=department;
		this.salary=salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", department=" + department + ", salary=" + salary + "]";
	}

	

}
