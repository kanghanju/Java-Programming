package lesson4;

public class Code1_2 {

	public static void main(String[] args) {
		
		Person1 first;
		first = new Person1(); // object생성
		
		first.name = "John";
		first.number = "01029834956";
		
		System.out.println("Name: "+first.name+" , Number: "+first.number);
		
		Person1 second;
		second = first;// first라는 참조변수가 갖는 값이 객체의 주소다. 따라서 second 잠조변수에 객체의 주소값이 저장된다
		//first와 second가 동일한 객체를 참조! 하고 있다
		second.name = "Tom";
		System.out.println("Name: "+first.name+" , Number: "+first.number);
		//System.out.println("Name: "+second.name+" , Number: "+second.number);
		
		
		//Person1 타입의 배열이라는 것은 그 배열에 각각의 칸이 Person1타입의 변수가 되는것 !!
		Person1 [] members = new Person1 [100];
		members[0]  = first; //first의 값을 members[0]로 복사 , first의 값은 객체의 주소
		members[1] = second;
		System.out.println(members[0].name+","+members[0].number);
		
		System.out.println(members[1].name+","+members[1].number);
		
		members[2] = new Person1(); //이 줄을빼면 에러발생한다(members[2]가 참조하지 않기 때문)
		members[2].name = "David";
		members[2].number = "01098765432";
		
		System.out.println(members[2].name+","+members[2].number);
	}

}
