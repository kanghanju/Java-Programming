package basic;
import java.util.Scanner;

public class TheSecondIsFirst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
	
		char A = str.charAt(0);
		char B = str.charAt(1);
		
		/*나는 arr[1] == arr[i] 면 arr[i]=arr[0] 라고 풀었음
		 * 하지만 이러면 bbnbnb가 아닌 bbnana가 출력됨. 
		 * 이유는 두번째 문자인 a와 비교를 해야하지만 a가 b로 바뀜으로써 b로 계속 비교를 하기 때문이다
		 * 따라서 두번째 문자와 첫번째 문자의 값을 미리 저장해놔야한다!!
		 * */
		for(int i =0; i<str.length();i++) {
			if(str.charAt(i) == B)
				str = str.substring(0,i)+A+str.substring(i+1);
		}
		
		System.out.println(str);
	}

}
