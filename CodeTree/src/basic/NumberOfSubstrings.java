package basic;

import java.util.Scanner;

public class NumberOfSubstrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int cnt= 0;
        
        for(int i = 0; i<A.length()-1;i++){
            boolean bool  = true;
            for(int j = 0; j<B.length();j++){
                if(A.charAt(i+j)!=B.charAt(j)){
                    bool = false;
                }
                
            }
            if(bool==true)
                    cnt++;
        }
        System.out.print(cnt);
	}

}
