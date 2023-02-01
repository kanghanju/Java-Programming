package lesson4;

public class Code1 {

	public static void main(String[] args) {
		
		Person1 first;
		first = new Person1(); // object생성
		
		first.name = "John";
		first.number = "01029834956";
		
		System.out.println("Name: "+first.name+" , Number: "+first.number);
		
		//Person1 타입의 배열이라는 것은 그 배열에 각각의 칸이 Person1타입의 변수가 되는것 !!
		Person1 [] members = new Person1 [100];
		members[0] = first;
		members[1] = new Person1(); //Person1타입의 객체를 만든다
		members[1].name = "David";
		members[1].number = "01028461626";
		
		System.out.println("Name: "+members[1].name+" , Number: "+members[1].number);
	}

}
