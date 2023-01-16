package classpart;

public class Student {
	//멤버변수 
	int studentID;
//	String은 jdk에서 문자열을 구현해놓은 클래스이다
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName+","+address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
