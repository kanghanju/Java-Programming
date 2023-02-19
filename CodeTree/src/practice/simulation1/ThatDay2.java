package practice.simulation1;
import java.util.Scanner;

public class ThatDay2 {
	
	public static int numOfDays(int m, int d) {
        // 계산 편의를 위해 월마다 몇 일이 있는지를 적어줍니다. 
        int[] days = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;
        
        // 1월부터 (m - 1)월 까지는 전부 꽉 채워져 있습니다.
        for(int i = 1; i < m; i++)
            totalDays += days[i];
        
        // m월의 경우에는 정확이 d일만 있습니다.
        totalDays += d;
        
        return totalDays;
    }
	
	public static int numofDay(String s) {
		if(s.equals("Mon")) return 0;
		else if(s.equals("Tue")) return 1;
		else if(s.equals("Wed")) return 2;
		else if(s.equals("Thu")) return 3;
		else if(s.equals("Fri")) return 4;
		else if(s.equals("Sat")) return 5;
		return 6;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String day = sc.next();
        int ans = 0;
        
        int startDate = numOfDays(m1,d1);
        int endDate = numOfDays(m2,d2);
        int curDay = numofDay("Mon"); //오늘의 요일 변수
        
        for(int date = startDate; date<= endDate; date++) {
        	if(numofDay(day) == curDay) ans++;
        	curDay = (curDay+1) % 7;
        		
        }
        
        System.out.print(ans);

	}

}
