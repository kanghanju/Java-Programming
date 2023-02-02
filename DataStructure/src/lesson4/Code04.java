package lesson4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code04 {
	
	static MyRectangle [] rects = new MyRectangle[100]; //주의
	static int n = 0;
	
	public static void main(String[] args) {
		
		try {
			Scanner in = new Scanner(new File("mypointData.txt"));
			
			while(in.hasNext()) {
				
				rects[n] = new MyRectangle();//주의
				rects[n].lu = new Mypoint(); //주의
				rects[n].lu.x = in.nextInt();
				rects[n].lu.y = in.nextInt();
				rects[n].width = in.nextInt();
				rects[n].height  = in.nextInt();
				
				n++;
			}
			
			
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("No data file");
			System.exit(1);
		}
		
		bubbleSort();
		
		for(int i = 0; i<n;i++)
			System.out.println(rects[i].lu.x+" "+rects[i].lu.y+" "+rects[i].width+" "+rects[i].height);
	}
	
	private static void bubbleSort() {
		for(int i = 0; i<n-1;i++) {
			for(int j = 0; j<n-1-i; j++) {
				if(calcArea(rects[j]) > calcArea(rects[j+1])) {
					MyRectangle tmp = rects[j]; //주의 Myrectangle객체의 값을 바꾼게 아니라 두 객체의 자리!!!를 바꾼다
					rects[j] = rects[j+1];
					rects[j+1] = tmp;
				}
			}
		}
		
	}

	public static int calcArea(MyRectangle r) {
		return r.width * r.height;
	}

}
