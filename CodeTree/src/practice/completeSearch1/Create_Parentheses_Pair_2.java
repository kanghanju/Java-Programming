package practice.completeSearch1;

import java.util.Scanner;

public class Create_Parentheses_Pair_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int len = A.length();
        int cnt = 0;
    

        for(int i= 0; i<len-1;i++){
                for(int j = i+2;j<len-1;j++){
                    if(A.charAt(i)=='(' && A.charAt(i+1)=='(' && A.charAt(j)==')' &&A.charAt(j+1)==')')
                        cnt++;
                }
            
        }
        
        /*for(int i = 0; i < len-3; i++){
            if(A.charAt(i) == '(' && A.charAt(i+1) == '('){
                for(int j = i+2; j < len-1; j++){ //j<len이라고 잘못 설정해서 헤맸다
                    if(A.charAt(j) == ')' && A.charAt(j+1) == ')'){
                        cnt++;
                    }
                }
            }
        }*/
        System.out.print(cnt);
	}

}
