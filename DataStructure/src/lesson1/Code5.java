package lesson1;

public class Code5 {

	public static void main(String[] args) {
		//declare the array : grades라는 이름의 배열을 만들겠다!
		int [] grades;
		
		//allocate memory for 5 indices : 실제로 배열이 만들어짐!
		grades = new int[5]; //배열의 크기가 변수인 variable length array다.
		
		//assign some values to the array
		grades[0] = 100;
		grades[1] = 76;
		grades[2] = 92;
		grades[3] = 95;
		grades[4] = 14;
		
		//print out each value
		System.out.println(grades[0]);
		System.out.println(grades[1]);
		System.out.println(grades[2]);
		System.out.println(grades[3]);
		System.out.println(grades[4]);
		
		
	}

}
