package lesson1;


//클래스 밖에서 선언한 변수나 그무엇도 실행이 되지않는다!
public class Code01 {
	
	static int num; 

	public static void main(String[] args) {
		
		int anotherNum = 5;
		
		num = 2;
		
		System.out.println(num+anotherNum);
		System.out.println("Num:"+num);
		System.out.println("AnotherNum:"+anotherNum);
//left associativity: 동일한 우선순위를 가진 연산자가 연속해서 나올때 덧셈은 왼쪽부터 계산한다
//"Sum:" + num은 먼저 문자열로 바뀌고 +anotherNum또한 문자열로 바뀌어 Sum:25가 출력된다.
		System.out.println("Sum:"+num+anotherNum); 
//	괄호안의 num+anotherNum이 우선순위로 계산되어 Sum:7이 출력된다. 
		System.out.println("Sum:"+(num+anotherNum));
	
		
	}

}
