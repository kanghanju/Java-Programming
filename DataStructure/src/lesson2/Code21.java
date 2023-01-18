package lesson2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*컴퓨터는 빠르다. 뭔가 교묘한 방법을 찾으려 하지 말고 무식하지만 논리적으로 가장 명료한 
 * 방법읆 먼저 찾아라. 그런 다음 어떻게 개선할 수 있는지를 고민해라*/
/*입력으로 n*n개의 음이 아닌 한자리 정수가 주어진다. 이 정수들 중 가로,세로,대각선 8방향으로 연속된 
 * 숫자들을 합쳐서 만들 수 있는 모든 소수를 찾아서 나열하는 프로그램을 작성하라. 중복된 수를 출력해도
 * 상관없다*/
public class Code21 {

	static int n;
	static int[][]grid;

	public static void main(String[] args) {

		try {
			Scanner inFile = new Scanner(new File("data.txt"));
			n = inFile.nextInt();
			grid = new int[n][n];
			for(int i = 0; i<n;i++) {
				for(int j = 0; j<n;j++) 
					grid[i][j] = inFile.nextInt();

			}
			inFile.close();

			for(int x = 0; x<n; x++) {//출발점 정의
				for(int y = 0; y<n; y++) {//출발점 정의 
					for(int dir = 0; dir<8; dir++){//방향정의
						for(int length=1;length<=n;length++) {//길이 정의
							//프로그래밍에서 중요한 테크닉은 남한테 떠넘기기 이다
							//일단 전체적인 프로그램 골격을 완성해보자!
							//시작위치(x,y)에서 방향이dir인 길이length 수열을 정수로 환산하는 함수
							int value = computeValue(x,y,dir,length);
							//만약 그런 수열이 존재하지 않는다면 -1을 return한다
							if(value != -1 && isPrime(value))
								System.out.println(value);
						}
					}
				}
			}
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}
		
	}
		public static int computeValue(int x,int y,int dir,int len) {
			int value = 0;
			for(int i =0 ; i<len;i++) {
				//좌표(x,y)에서 dir방향으로 i칸 떨어진 자리에 있는 digit을 반환한다
				int digit = getDigit(x,y,dir,i);
				//만약 그런자리가 존재하지 않는다면 -1을 반환한다. 
				if(digit==1)
					return -1;
				value = 10*value + digit;
			}
			return value;
		}


		public static int getDigit(int x,int y,int dir,int k) {
			int newX = x, newY =y; //x,y에서 dir방향으로 k칸 떨어진 자리의 좌표

			switch(dir) {
			case 0:newY -= k; break;
			case 1:newX += k; newY -=k; break;
			case 2:newX += k; break;
			case 3:newX += k; newY += k; break;
			case 4:newY += k; break;
			case 5:newX -= k; newY += k; break;
			case 6:newX -= k; break;
			case 7:newX -= k; newY -= k; break;
			}
			if(newX<0 || newX >= n || newY < 0||newY>=n) {
				return -1;
			}
			return  grid[newX][newY];
		}

		public static boolean isPrime(int k) {
			if(k<2)
				return false;
			for(int i = 2; i<=k/2; i++) {
				if(k%i==0)
					return false;
			}
			return true;
		}
	}

