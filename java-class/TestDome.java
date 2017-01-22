package everyday;

class Emp {
	private int empno;
	private String ename;
	private String job;
	private double sal;
	private double comm;

	public Emp() {
	}

	public Emp(int eno, String ena, String j, double s, double c) {
		setEmpno(eno);
		setEname(ena);
		setJob(j);
		setSal(s);
		setComm(c);
	}

	public void setEmpno(int eno) {
		empno = eno;
	}

	public void setEname(String ena) {
		ename = ena;
	}

	public void setJob(String j) {
		job = j;
	}

	public void setSal(double s) {
		sal = s;
	}

	public void setComm(double c) {
		comm = c;
	}

	public int getEmpno() {
		return empno;
	}

	public String getEname() {
		return ename;
	}

	public String getJob() {
		return job;
	}

	public double getSal() {
		return sal;
	}

	public double getComm() {
		return comm;
	}

	public String getInfo() {
		return "��Ա����" + empno + "\n" + "��Ա����" + ename + "\n" + "��Ա����" + job + "\n" + "��Ա����" + sal + "\n" + "��Ա����" + comm
				+ "\n";
	}
}

public class TestDome {
	public static void main(String arg[]) {
		Emp emp = new Emp(100, "kimi", "testor", 10000.0, 10000.0);
		System.out.println(emp.getInfo());
	}
}
