package lesson5;

/*우리가 첫번째로 해야할 일은 프로그램내에서 하나의 항을 표현하기 위한 클래스를 작성한다*/
public class Term2 {
	public int coef;//계수
	public int expo;//지수
	
	public int calcTerm(int x) {

		return (int)(coef * Math.pow(x,expo));
	}
	
	public  void printTerm() {
		System.out.print(coef + "x^"+expo); //-x^2 ==> +-1x^2 로 출력되는 문제가있다
	}
}
