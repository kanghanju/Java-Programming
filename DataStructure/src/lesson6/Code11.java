package lesson6;

import java.util.Scanner;

public class Code11 {

	private Polynomial3 [] polys = new Polynomial3[100]; //여러개의 다항식을 저장하는 배열
	private int n = 0; //현재 입력되어서 저장되어 있는 다항식의 개수

	public void processCommand() {
		Scanner kb = new Scanner(System.in);
		while(true) {
			System.out.print("& ");
			String command = kb.next();
			if(command.equals("create")) {
				char name = kb.next().charAt(0); //다항항수의 이름을 입력받는다

				polys[n] = new Polynomial3(name); //새로운 Polynomial 객체 생성

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


	private int find(char name) {
		for(int i = 0; i<n;i++) {
			if(polys[i].getName() == name)
				return i;
		}
		return -1;
	}


	public static void main(String[] args) {

		Code11 app = new Code11();
		app.processCommand();

	}


}
