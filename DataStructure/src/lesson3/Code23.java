package lesson3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Code23 {
	/*대부분의 경우 문제를 푸는 프로그램을 작성할 때 
	 * 제일 먼저 생각해야 할 일은 자료구조이다
	 * 데이터를 저장할 변수를 먼저 정의한다*/
	static String []words = new String [100000];
	static int [] count = new int [100000];
	static int cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("$ ");
			String command = sc.next();
			if(command.equals("read") ) {
				String fileName = sc.next();
				makeIndex(fileName);
			}else if(command.equals("find")) {
				String str = sc.next();
				int index = findWord(str);
				if(index > -1) {
					System.out.println("The word "+words[index]+" appears "+count[index]+" times");
				}else {
					System.out.println("The word "+str+" does not appears");
				}
			}else if(command.equals("saves")) {
				String fileName = sc.next();
				saveAs(fileName);
			}else if(command.equals("exit")) {
				break;
			}
			
		}
		sc.close();
		
		for(int i = 0; i<cnt;i++) {
			System.out.println(words[i]+" "+count[i]);
		}
		
	}
	
	static void makeIndex(String fileName){
		
		try{
			Scanner inFile = new Scanner(new File(fileName));
			while(inFile.hasNext()) {
				String str = inFile.next(); //파일에 있는 string들을 읽고 변수에 넣는다
				
				addWord(str);//단어가 목록에 없으면 추가한다. 있으면 추가 안한다
			}
			
			inFile.close();
		}catch(FileNotFoundException e) {
			System.out.println("No File");
			return; //프로그램을 종료하지 않고 그냥makeIndex함수가 아무일도 안하고 return하게 만든다
		}
	}
	
	static void addWord(String str) {
		int index = findWord(str); //returns -1 if not found
		if(index != -1) {//found word[index]==str
			count[index]++;
		}else {
			words[cnt] = str;
			count[cnt] = 1;
			cnt++;
		}
	}
	
	static int findWord(String str) {
		for(int i = 0; i<cnt;i++) {
			if(words[i].equals(str)) 
				return i;
		}
		return -1;
	}
	
	static void saveAs(String FileName) {
		//파일로 출력
		PrintWriter outFile;
		try {
			outFile = new PrintWriter(new FileWriter(FileName));
			
			for(int i = 0; i<cnt;i++) {
				outFile.println(words[i]+" "+count[i]);
				//출력을 하는 대상이 모니터면 System.out.println, 위에서 만든 printWriter면 outFile.println
			}
			
			outFile.close();
		} catch (IOException e) { //파일 생성에 실패한다면
			System.out.println("Save failed");
			return;
		}
		
			
		
	}

}
