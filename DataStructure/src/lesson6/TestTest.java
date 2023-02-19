package lesson6;

public class TestTest {
	
	public static void main(String[] args) {
		Test test1 = new Test();
		
		test1.t = 10;
		Test.s = 100;
		test1.print2();
		
//		test1.s = 100; 에러 발생 -> s는 Test라는 클래스 안에 있지 test1이라는 객체안에 있는게 아니다!!
//		test1.print1(); 에러 발생
		
		
		
		Test test2 = new Test();
		Test.print1();
		test2.print2();
		
		
	}
}
