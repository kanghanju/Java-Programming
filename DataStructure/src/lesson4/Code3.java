package lesson4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code3 {
	
	static Person1 [] members = new Person1[100];
	
	static int n = 0;
	
	public static void main(String[] args) {
//		members = new Person1[100]; //배열생성
		try {
			Scanner in = new Scanner(new File("input.txt"));
			while(in.hasNext()) {
				String nm = in.next();
				String nb = in.next();
				
				members[n] = new Person1();//객체 생성
				members[n].name = nm;
				members[n].number = nb;
				n++;
			}
			
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("No data file");
		}
		
		
		bubbleSort();
		
		for(int i = 0; i<n;i++)
			System.out.println(members[i].name+" "+members[i].number);
		
	}
	
	private static void bubbleSort() {
		
		for(int i = 0; i < n-1;i++) {
			for(int j = 0; j<n-1-i;j++) {
				if( members[j].name.compareTo( members[j+1].name)>0) {//compare names of j-th and (j+1)-th person
					//swap two persons
					Person1 tmp = members[j];
					members[j] = members[j+1];
					members[j+1] = tmp;
					
				}
			}
		}
	}

}
