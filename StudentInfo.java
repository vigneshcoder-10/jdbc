package jdbc;

public abstract class StudentInfo {
	private String SchoolName;
	private String StudentName;
	private String StudentId;
	private String Address;
//	public static String getSchoolName() {
//		return SchoolName;
//	}
	public  void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentId() {
		return StudentId;
	}
	public void setStudentId(String studentId) {
		StudentId = studentId;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}

}
