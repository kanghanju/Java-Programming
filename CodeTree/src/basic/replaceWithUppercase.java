package basic;
import java.util.Scanner;

public class replaceWithUppercase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        char [][] arr2d = new char [5][3];


        for(int i = 0; i<5;i++){
            for(int j = 0; j<3;j++){
                arr2d[i][j] = sc.next().charAt(0);
            }
        }

        for(int i = 0; i<5;i++){
            for(int j = 0; j<3;j++){
            	//'A'-'a'는 int형 이다. int형으로 바꿔 계산후(char)로 타입변환을 한다
                arr2d[i][j] = (char)(arr2d[i][j]+('A'-'a'));
                System.out.print(arr2d[i][j]+" ");
            }
            System.out.println();
        }
	}

}
