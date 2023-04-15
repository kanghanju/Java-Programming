package practice.completeSearch1;
import java.util.Scanner;

public class NumberBaseball {
	
	public static int number,count1,count2;
    public static int[] numberArr;
    public static int[] count1Arr;
    public static int[] count2Arr;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //B가 A에게 물어본 질문 수 
        numberArr = new int[n];
        count1Arr = new int[n];
        count2Arr = new int[n];


        for(int i = 0; i < n; i++){
            number = sc.nextInt(); //B가 묻는 세자리 수
            count1 = sc.nextInt();
            count2 = sc.nextInt();
            numberArr[i] = number;
            count1Arr[i] = count1;
            count2Arr[i] = count2;
        }

        
        
        int answer =0;
        for(int i = 123; i<= 999; i++){
            
            
            String num = Integer.toString(i);
            if(num.charAt(0) == '0' || num.charAt(1) == '0' || num.charAt(2) == '0') continue;
            if(num.charAt(0) == num.charAt(1) || num.charAt(1) == num.charAt(2) || num.charAt(0) == num.charAt(2)) continue;

            boolean check = true;

            for(int j = 0; j < n; j++){
                String bAnswer = Integer.toString(numberArr[j]);

                int strike = 0,ball = 0;
                for(int k = 0; k<3; k++){
                    if(num.charAt(k) == bAnswer.charAt(k)) strike++;
                    if(num.charAt(k) == bAnswer.charAt((k+1)%3) || num.charAt(k) ==bAnswer.charAt((k+2)%3)) ball++;
                }

                if(strike != count1Arr[j] || ball != count2Arr[j]){
                    check = false;
                    break;
                }
            }
            if(check){
                answer++;
            }
        }

        System.out.println(answer);
	}

}
