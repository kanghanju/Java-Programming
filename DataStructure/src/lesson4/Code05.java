package lesson4;

import java.util.Scanner;

public class Code05 {

	static Polynomial [] polys = new Polynomial[100]; //여러개의 다항식을 저장하는 배열
	static int n = 0; //현재 입력되어서 저장되어 있는 다항식의 개수

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		while(true) {
			System.out.print("& ");
			String command = kb.next();
			if(command.equals("create")) {
				char name = kb.next().charAt(0); //다항항수의 이름을 입력받는다

				polys[n] = new Polynomial(); //새로운 Polynomial 객체 생성
				polys[n].name = name;
				polys[n].terms = new Term [100]; //주의 !!!!! 
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
					addTerm(polys[index],c,e);
				}

			}else if(command.equals("calc")) {
				char name = kb.next().charAt(0); //다항함수 이름을 입력받는다

				int index = find(name);
				if(index == -1) {
					System.out.println("No such polynomial exists"); //여기서 프로그램을 종료하지 않고 while(true)이므로 다시 처음으로 돌아간다
				}else {
					int x = kb.nextInt();
					int result = calcPolynomial(polys[index],x);
					System.out.println(result);
				}

			}else if(command.equals("print")) {
				char name = kb.next().charAt(0); //다항함수 이름을 입력받는다

				int index = find(name);
				if(index == -1) {
					System.out.println("No such polynomial exists"); //여기서 프로그램을 종료하지 않고 while(true)이므로 다시 처음으로 돌아간다
				}else {
					printPolynomial(polys[index]);
				}


			}else if(command.equals("exit")) {
				break;
			}
		}



		kb.close();

	}

	private static int calcPolynomial(Polynomial p, int x) {
		int result = 0;
		for(int i =0; i<p.nTerms;i++)
			result += calcTerm(p.terms[i],x);
		return result;
	}

	private static int calcTerm(Term term, int x) {

		return (int)(term.coef * Math.pow(x,term.expo));
	}

	private static void printPolynomial(Polynomial p) {
		for(int i = 0; i<p.nTerms;i++) {
			printTerm(p.terms[i]);
			System.out.print(" + ");
		}
		System.out.println();
	}

	private static void printTerm(Term term) {
		System.out.print(term.coef + "x^"+term.expo); //-x^2 ==> +-1x^2 로 출력되는 문제가있다
	}

	private static void addTerm(Polynomial p, int c, int e) {//다항식 p에 c계수와 e승을 추가해라
		//다항식에 새로운 항을 추가할때 2가지 케이스를 먼저 고려해야한다. 
		//1. 내가 넣으려는 x의 e승이 이미 존재한다면 계수끼리 더해주면 끝이다 (다항식 p에 이미 e차 항이 있나?)
		//2. 내가 넣으려는 x의 e승이 존재하지 않는다면 새로운 항이 추가되야한다. 
		int index = findTerm(p,e);

		if(index != -1) {
			p.terms[index].coef += c; // -5x^3 + 5x^3이 나오면 0이여서 삭제해야하는데 그 경우는 고려하지 않는다
		}else {
			int i = p.nTerms-1;
			while(i>=0 && p.terms[i].expo < e) {//내림차순으로 정렬하고있음을 잊지말자
				p.terms[i+1] = p.terms[i];
				i--;
			}
			p.terms[i+1] = new Term();//주의 매우중요!!!!!!!!
			p.terms[i+1].coef = c;
			p.terms[i+1].expo = e;
			p.nTerms++; //이거 안써서 실행안됨
		}
	}

	private static int findTerm(Polynomial p, int e) {//입력으로 하나의 다항식과 차수를 받아서 
		//p다항식 안에 이미 e차항이 있는지 검사하는 함수다 
		for(int i = 0 ; i<p.nTerms && p.terms[i].expo >= e ;i++) { // &&p.terms[i].expo>=e 이조건 없어도 만족한다
			if(p.terms[i].expo == e)
				return i;
		}
		return -1;
	}

	private static int find(char name) {
		for(int i = 0; i<n;i++) {
			if(polys[i].name == name)
				return i;
		}
		return -1;
	}

}
