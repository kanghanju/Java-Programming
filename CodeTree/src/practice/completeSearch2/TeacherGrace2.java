package practice.completeSearch2;
import java.util.Scanner;
import java.util.Arrays;

public class TeacherGrace2 {
	public static int[] price;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //학생 수 n
        int b = sc.nextInt(); //예산 수 b

        price = new int[n];

        for(int i=0; i<n; i++){
            price[i] = sc.nextInt(); //학생이 원하는 선물 가격
        }

        Arrays.sort(price);

        //완전탐색으로 한명의 선물 가격/2를 해서 예산에 맞는 학생 수를 구한다 
        int max = 0;
        for(int i = 0; i<n; i++){//i번째 선물에 쿠폰을 쓴다

            int budget = b;
            int cnt =0;

            for(int j=0; j<n; j++){
                
                if(i==j){
                    budget = budget - price[j]/2;
                }else{
                    budget = budget - price[j];
                }

                cnt++; //학생수 카운트

                if(budget < 0){
                    cnt--;
                    break;
                }
            }

            max = Math.max(cnt,max);
        }

        System.out.print(max);
	}

}
