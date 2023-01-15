package first;

public class SwitchCase {

	public static void main(String[] args) {
		int rank = 1;
		char medalColor;
		
		switch(rank) {
//		case값에 문자열 사용 가능 예)case "Gold":System.out.print();
			case 1:medalColor = 'G';
			break;
			case 2:medalColor = 'S';
			break;
			case 3:medalColor = 'B';
			break;
			default:medalColor = 'A';
		}
		System.out.println(rank +"등 메달의 색은"+medalColor+"입니다.");
	}

}
