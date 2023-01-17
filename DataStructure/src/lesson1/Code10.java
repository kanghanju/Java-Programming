package lesson1;

//1~100000 사이의 모든 소수들을 찾아서 출력하는 프로그램을 만들어라 
public class Code10 {

	public static void main(String[] args) {
		
/*		for(int n = 2;n<=100000;n++) {
			boolean isPrime = true;
//			break문이나 %%isPrime조건을 붙여 for문을 나가게 만듦
			for(int i =2;i*i <=n &&isPrime;i++)
				if(n%i ==0)
					isPrime = false;
			if(isPrime)
				System.out.println(n);
		}
		*/
		
		for(int i = 2; i<= 100000;i++) {
			boolean isPrime = true;
			for(int j = 2; j <= i/2 ; j++) {
				if(i%j==0) {
					isPrime = false;
					break;
				}
	
			}
			if(isPrime)
				System.out.print(i+" ");
		}
		
	}

}
