package practice.simulation1;
import java.util.Scanner;


public class ThatDay {

	public static String[] dayOfWeek = new String[]{"Mon","Tue","Wed","The","Fri","Sat","Sun"};
	public static int[] dayOfWeekCnt = new int[]{0,0,0,0,0,0,0};

	public static int getTotalDays(int month,int day){
		int[] days = new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};
		int totalDays = 0;

		for(int i = 1; i<month;i++)
			totalDays += days[i];

		totalDays = totalDays + day;
		return totalDays;
	}

	public static void getDaysCnt(int diff){

		while(diff != 0){
			if(diff%7==0){
				dayOfWeekCnt[0]+=1;
				diff-=1;
			}
			else if(diff%7==1){
				dayOfWeekCnt[1] += 1;
				diff -= 1;
			}
			else if(diff%7==2){
				dayOfWeekCnt[2] += 1;
				diff -= 1;
			}
			else if(diff%7==3){
				dayOfWeekCnt[3] += 1;
				diff -= 1;
			}
			else if(diff%7==4){
				dayOfWeekCnt[4] += 1;
				diff -= 1;
			}
			else if(diff%7==5){
				dayOfWeekCnt[5] += 1;
				diff -= 1;
			}
			else{
				dayOfWeekCnt[6] += 1;
				diff -= 1;
			}
		} 


	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m1 = sc.nextInt();
		int d1 = sc.nextInt();
		int m2 = sc.nextInt();
		int d2 = sc.nextInt();
		String day = sc.next();

		int diffDays = (getTotalDays(m2,d2)-getTotalDays(m1,d1));

		getDaysCnt(diffDays);
		int answer=0;

		for(int i = 0; i<7;i++){
			if(day.equals(dayOfWeek[i])){
				answer = dayOfWeekCnt[i];
				break;
			}
		}

		System.out.println(answer);
	}

}
