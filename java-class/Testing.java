package everyday;

class Student {
	private String ename;
	private int age;
	private String sex;

	public Student() {
	}

	public Student(String ena, int ag, String se) {
		setEname(ena);
		setAge(ag);
		setSex(se);
	}

	public void setEname(String ena) {
		ename = ena;
	}

	public void setAge(int ag) {
		age = ag;
	}

	public void setSex(String se) {
		sex = se;
	}

	public String getEname() {
		return ename;
	}

	public int getAge() {
		return age;
	}

	public String getSex() {
		return sex;
	}

	public String getInf() {
		return "姓名" + ename + "\n" + "年龄" + age + "\n" + "性别" + sex + "\n";
	}
}

public class Testing {
	public static void main(String arg[]) {
		Student stu = new Student("oppo", 10, "boy");
		System.out.println(stu.getInf());
	}
}