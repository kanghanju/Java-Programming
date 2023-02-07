package lesson5;
//하나의 다항식을 표현하기 위한 클래스 
public class Polynomial2 {
	
	public char name; //다항식의 이름
	
	public Term2 [] terms; //다항식을 구성하는 항들을 저장할 배열
	
	public int nTerms = 0; //다항식을 구성하는 항의 개수, 실제로 저장되어있는 데이터의 개수
	
	public  int calcPolynomial(int x) {
		int result = 0;
		for(int i =0; i<nTerms;i++)
			result += terms[i].calcTerm(x);
		return result;
	}
	
	
	public void printPolynomial() {
		for(int i = 0; i<nTerms;i++) {
			terms[i].printTerm();
			System.out.print(" + ");
		}
		System.out.println();
	}
	
	
	
	public void addTerm(int c, int e) {//다항식 p에 c계수와 e승을 추가해라
		//다항식에 새로운 항을 추가할때 2가지 케이스를 먼저 고려해야한다. 
		//1. 내가 넣으려는 x의 e승이 이미 존재한다면 계수끼리 더해주면 끝이다 (다항식 p에 이미 e차 항이 있나?)
		//2. 내가 넣으려는 x의 e승이 존재하지 않는다면 새로운 항이 추가되야한다. 
		int index = findTerm(e);

		if(index != -1) {
			terms[index].coef += c; // -5x^3 + 5x^3이 나오면 0이여서 삭제해야하는데 그 경우는 고려하지 않는다
		}else {
			int i = nTerms-1;
			while(i>=0 && terms[i].expo < e) {//내림차순으로 정렬하고있음을 잊지말자
				terms[i+1] = terms[i];
				i--;
			}
			terms[i+1] = new Term2();//주의 매우중요!!!!!!!!
			terms[i+1].coef = c;
			terms[i+1].expo = e;
			nTerms++; //이거 안써서 실행안됨
		}
	}

	public int findTerm(int e) {//입력으로 하나의 다항식과 차수를 받아서 
		//p다항식 안에 이미 e차항이 있는지 검사하는 함수다 
		for(int i = 0 ; i<nTerms && terms[i].expo >= e ;i++) { // &&p.terms[i].expo>=e 이조건 없어도 만족한다
			if(terms[i].expo == e)
				return i;
		}
		return -1;
	}
	
}
