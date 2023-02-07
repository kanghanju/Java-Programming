package lesson5;

import java.util.Scanner;

public class Code06 {

	static Polynomial2 [] polys = new Polynomial2[100]; //여러개의 다항식을 저장하는 배열
	static int n = 0; //현재 입력되어서 저장되어 있는 다항식의 개수

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		while(true) {
			System.out.print("& ");
			String command = kb.next();
			if(command.equals("create")) {
				char name = kb.next().charAt(0); //다항항수의 이름을 입력받는다

				polys[n] = new Polynomial2(); //새로운 Polynomial 객체 생성
				polys[n].name = name;
				polys[n].terms = new Term2 [100]; //주의 !!!!! 
				polys[n].nTerms = 0;
				n++;

			}else if(command.equals("add")) {// add f 12 3

				char name = kb.next().charAt(0); //다항함수 이름을 입력받는다

				int index = find(name);
				if(index == -1) {
					System.out.println("No such polynomial exists"); //여기서 프로그램을 종료하지 않고 while(true)이므로 다시 처음으로 돌아간다
				}else {
					int c = kb.nextInt();
					int e = kb.nextInt();
					polys[index].addTerm(c,e);
				}

			}else if(command.equals("calc")) {
				char name = kb.next().charAt(0); //다항함수 이름을 입력받는다

				int index = find(name);
				if(index == -1) {
					System.out.println("No such polynomial exists"); //여기서 프로그램을 종료하지 않고 while(true)이므로 다시 처음으로 돌아간다
				}else {
					int x = kb.nextInt();
					int result = polys[index].calcPolynomial(x);
					System.out.println(result);
				}

			}else if(command.equals("print")) {
				char name = kb.next().charAt(0); //다항함수 이름을 입력받는다

				int index = find(name);
				if(index == -1) {
					System.out.println("No such polynomial exists"); //여기서 프로그램을 종료하지 않고 while(true)이므로 다시 처음으로 돌아간다
				}else {
					polys[index].printPolynomial();
				}


			}else if(command.equals("exit")) {
				break;
			}
		}



		kb.close();

	}


	private static int find(char name) {
		for(int i = 0; i<n;i++) {
			if(polys[i].name == name)
				return i;
		}
		return -1;
	}

}
