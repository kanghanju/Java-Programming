package practice.function;

import java.util.Scanner;

public class PresenceOrAbsence2021 {

	
	public static boolean isExist(int m, int d){
        
	       if(m<=12 && d<=lastDay(m))
	            return true;

	        return false;

	    
	    }

	    public static int lastDay(int m){
	        if(m==2)
	            return 28;
	        if(m==4 || m==6 || m==9 || m==11)
	            return 30;
	        return 31;
	    }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();

        if(isExist(M,D))
            System.out.print("Yes");
        else   
            System.out.print("No");
		
	}

}
