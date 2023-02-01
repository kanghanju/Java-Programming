package basic;

import java.util.Scanner;

public class ContinueToClearString2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        
        while(true) {
        	int find = -1; //부분문자열이 등장하면 index를 저장, 등장하지 않으면 -1로 저장한다
        	int lenA = A.length();
        	int lenB = B.length();
        	
        	for(int i = 0; i<lenA-lenB+1;i++) {
        		
        		boolean isTrue = true;
        		
        		for(int j = 0; j<lenB;j++) {
        			if(A.charAt(i+j)!= B.charAt(j)) {
        				isTrue = false;
        				break;
        			}
        			
        			if(isTrue) {
        				find = j;
        				break;
        			}
        		}
        		
        	}
        	if(find == -1)
    			break;
        	
    		A = A.substring(0,find)+ A.substring(find+lenB);
    		
        }
        System.out.println(A);
	}

}
