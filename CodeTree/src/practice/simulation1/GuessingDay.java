package practice.simulation1;
import java.util.Scanner;

public class GuessingDay {

	public static int[] day = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};

	public static void whatDay(int day){
		day = Math.abs(day);
		if(day%7==0)
			System.out.print("Mon");
		else if(day%7==1)
			System.out.print("Tue");
		else if(day%7==2)
			System.out.print("Wed");
		else if(day%7==3)
			System.out.print("Thu");
		else if(day%7==4)
			System.out.print("Fri");
		else if(day%7==5)
			System.out.print("Sat");
		else
			System.out.print("Sun");
	}


	public static void whatDay2(int day){
		if(day%7==0)
			System.out.print("Mon");
		else if(day%7==6)
			System.out.print("Tue");
		else if(day%7==5)
			System.out.print("Wed");
		else if(day%7==4)
			System.out.print("Thu");
		else if(day%7==3)
			System.out.print("Fri");
		else if(day%7==2)
			System.out.print("Sat");
		else
			System.out.print("Sun");
	}

	public static void totalDay(int m1,int d1,int m2,int d2){
		int diffDay = computeDay(m1,d1)-computeDay(m2,d2);

		if( diffDay <= 0){
			whatDay(diffDay);
		}
		else{
			whatDay2(diffDay);
		}


	}


	public static int computeDay(int m1,int d1){
		int total = 0;

		for(int i = 1; i<m1;i++){
			total += day[i];
		}

		return total+d1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m1 = sc.nextInt();
		int d1 = sc.nextInt();
		int m2 = sc.nextInt();
		int d2 = sc.nextInt();

		totalDay(m1,d1,m2,d2);
	}

}
