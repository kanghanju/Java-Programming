package lesson1;

public class Code6 {

	public static void main(String[] args) {
		int [] grades = new int[5];
		
		grades[0] = 100;
		grades[1] = 76;
		grades[2] = 92;
		grades[3] = 95;
		grades[4] = 14;
		
		for(int i = 0; i<grades.length;i++) { //배열의 크기를 일일히 기억할 필요가 없다
			System.out.println("Grade"+(i+1)+":"+grades[i]);
		}
	}

}
