package practice.function;

import java.util.Scanner;

public class Function369 {

	public static boolean is369(int n){
		return isHave(n) == true || isMulti(n) == true;
	}

	public static boolean isHave(int num){

		while(num>0){//이 while문 생각해내기 어려웠다. 일의 자리수가 3의배수인 조건은 찾았지만 숫자가(300,3000..)이럴 경우는 고려못했다
			if(num%10==3 || num%10==6 || num%10 ==9)
				return true;
			num /= 10; //10으로 계속 나눠주면 결국 일의 자리가 나온다
		}
		return false;

	}

	public static boolean isMulti(int num){

		if(num%3==0)
			return true;
		else   
			return false;


	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int cnt = 0;

		for(int i = a; i<=b;i++){
			if(is369(i)==true){
				cnt++;
			}
		}


		System.out.print(cnt);
	}

}
