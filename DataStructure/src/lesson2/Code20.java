package lesson2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code20 {
	

	static String [] name = new String[100];
	static String [] number = new String[100];
	static int n = 0;
	

	public static void main(String[] args) {
		
		
		try {//중괄호 안에있는 코드를 try해보고 FileNotFoundException이 발생하면
			Scanner inFile = new Scanner(new File("input.txt"));//src와 같은 위치, 이 위치에있으면 파일이름만으로도 파일을 읽을 수 있다
			
			while(inFile.hasNext()) {//file의 끝에 도달해서 더 읽을게 없으면 false를 반환한다. 
				name[n] = inFile.next();
				number[n] = inFile.next();
				n++;
			}
			
			inFile.close();
		} catch (FileNotFoundException e) {//catch중괄호 안에있는 코드로 예외처리한다
			System.out.println("No file");
			return; //main함수 종료! = 프로그램의 종료
			//System.exit(0); 프로그램의 정상적인 종료
		}
		
		bubbleSort();
		
		for(int i = 0; i<n;i++) 
			System.out.println(name[i]+":"+number[i]);
		
		
		
	}
	
	private static void bubbleSort(){
		for(int i = n-1 ; i>0 ; i--) {
			for(int j = 0; j<i;j++) {
				if(name[j].compareTo(name[j+1]) > 0) {
					String tmp = name[j];
					name[j] = name[j+1];
					name[j+1] = tmp;
					
					tmp = number[j];
					number[j] = number[j+1];
					number[j+1] = tmp;
				}
			}
		}
		
	}

}
