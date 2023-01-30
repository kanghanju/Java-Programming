package basic;

import java.util.Scanner;

public class FindLocationOfThePartialString2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String goal = sc.next();
        
        int inputLen = input.length();
        int goalLen = goal.length();
        
        for(int i =0; i<inputLen-goalLen+1;i++) {
        	
        	boolean allMatch = true;
        	for(int j = 0 ;j<goal.length();j++) {
        		if(input.charAt(i+j) != goal.charAt(j))
        			allMatch = false;
        	}
        	
        	if(allMatch==true) { //왜 break문을 쓰면안될까?->if와 else문에 break를 쓰면 처음에 돌때 else를 만나자 마자 
        		//break를 써서 바로 -1이 출력이된다
        		System.out.print(i);
        		System.exit(0);
        	}
        }
        System.out.print(-1);
       
        
	}

}
