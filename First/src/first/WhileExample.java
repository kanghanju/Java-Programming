package first;

public class WhileExample {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {//do안에 있는 코드는 반드시 한 번은 실행된다
			sum += num;
			num ++;
		}while(num<=1);
		//while(true) 무한 반복
		
		
	}

}
