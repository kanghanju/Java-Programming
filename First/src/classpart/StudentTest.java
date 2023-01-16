package classpart;

public class StudentTest {

	public static void main(String[] args) {
//  클래스 생성: new키워드
//	studentLee라는 변수는 Stack에 name,id,address,grade는 heap에 저장
//	studentLee는 자신의 정보(?)가 담겨있는 힙의 주소를 가리킨다.
//	하나의 인스턴스가 생성되면 그 인스턴스에 대한 독립적인 메모리 공간이 heap에 잡힌다
		
// Student(): 생성자 -> 내가 처음 객체를 생성하면서 해야될 일들을 구현하는 것
/*	public Student(int id,String name){
 * 		나는 이 Student가 생성될 떄 id와 name을 받아서 생성하고 싶다 
 * 		studentID = id;
 * 		studentName = name;
 * }
 * 같은 이름을 가진 생성자가 존재할 수 있다(당연히 매개변수는 달라야함)
 * */
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.studentID = 100;
		studentLee.address = "서울시 영등포구 여의도동";
		
		studentLee.showStudentInfo();

//studentLee 인스턴스의 메모리 주소 = 참조 값
//메모리에 생성된 인스턴스를 가리키는 변수 = 참조 변수
		System.out.println(studentLee);
	}

}
