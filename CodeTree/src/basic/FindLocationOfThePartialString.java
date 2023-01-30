package basic;

import java.util.Scanner;

public class FindLocationOfThePartialString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String goal = sc.next();

        if(str.indexOf(goal)>=0)
            System.out.print(str.indexOf(goal));
        else
            System.out.print(str.indexOf(goal));
	}

}
