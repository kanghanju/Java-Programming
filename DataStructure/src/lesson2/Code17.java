package lesson2;

public class Code17 {
//1~100000 사이의 소수를 찾아 출력한다. 
	public static void main(String[] args) {
		
		for(int n = 1; n <= 100000; n++) {
			if(isPrime(n))
				System.out.println(n);
		}
	}
	
	//return의 역할: 값을 반환한다, 그 즉시 함수의 실행을 중단한다!
	static boolean isPrime(int num) {
		//num==1일 경우도 고려한다
		if(num<2)
			return false;
		for(int i = 2; i<=num/2; i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
}
