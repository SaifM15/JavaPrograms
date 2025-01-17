package Student;

public class StudentInfo {

	private int studentId;
	private String studentName;
	private String studentSurname;
	private int rollNumber;
	private int phoneNumber;

	public StudentInfo(int studentId, String studentName, String studentSurname, int rollNumber, int phoneNumber) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentSurname = studentSurname;
		this.rollNumber = rollNumber;
		this.phoneNumber = phoneNumber;
	}

	public StudentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentSurname() {
		return studentSurname;
	}

	public void setStudentSurname(String studentSurname) {
		this.studentSurname = studentSurname;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "StudentInfo [studentId=" + studentId + ", studentName=" + studentName + ", studentSurname="
				+ studentSurname + ", rollNumber=" + rollNumber + ", phoneNumber=" + phoneNumber + "]";
	}
}
