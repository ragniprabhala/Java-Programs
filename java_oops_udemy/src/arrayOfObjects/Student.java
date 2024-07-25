package arrayOfObjects;

public class Student 
{
	private String name;
	private int rollNo;
	private String deptName;
    private Subject subject;
    
	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	public Student(String deptName, Subject subject) {
		super();
		this.deptName = deptName;
		this.subject = subject;
	}

	public Student(String name, int rollNo, String deptName, Subject subject) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.deptName = deptName;
		this.subject = subject;
	}

	public String getName() {
		return name;
	}


	public int getRollNo() {
		return rollNo;
	}
	
	public String getDeptName() {
		return deptName;
	}

	
	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
    
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", deptName=" + deptName + ", subject=" + subject + "]";
	}
	

}
