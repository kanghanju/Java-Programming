package practice.completeSearch3;

public class TeamTikTok2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String[] arr = new String[3];
        int[][] board = new int[3][3];

        for(int i =0; i<3;i++){
            arr[i] = sc.next();
        }

        for(int i = 0; i<3;  i++){
            for(int j = 0; j<3; j++){
                board[i][j] = arr[i].charAt(j) - '0'; //이렇게 간편하게 작성 가능하다 
            }
        }

        int ans = 0;

        for(int i = 1; i <= 9; i++){// 두수 i,j
            for(int j = i+1; j <= 9; j++){

                boolean win = false;

                int numI = 0, numJ = 0; // 각 줄에 i,j가 나오는 갯수
                
                for(int k = 0; k<3; k++){
                    numI = 0;
                    numJ = 0;
                    for(int q = 0; q<3; q++){
                        if(board[k][q] == i)numI++;
                        if(board[k][q] == j)numJ++;
                    }

                    if(numI + numJ == 3 && numI >= 1 && numJ >= 1)win = true;

                }


                for(int k = 0; k<3;k++){
                    numI = 0;
                    numJ = 0;
                    for(int q = 0; q<3; q++){
                        if(board[q][k] == i)numI++;
                        if(board[q][k] == j)numJ++;
                    }

                    if(numI+numJ == 3 && numI >= 1 && numJ >= 1)win = true;
                }

                numI = 0;
                numJ = 0;
                for(int k = 0; k<3;k++){
                    if(board[k][k]==i)numI++;
                    if(board[k][k] == j)numJ++;
                }
                if(numI+numJ == 3 && numI >= 1 && numJ >= 1)win = true;
                

                numI = 0;
                numJ = 0;
                for(int k = 0; k<3;k++){
                    if(board[k][3-k-1]==i)numI++;
                    if(board[k][3-k-1] == j)numJ++;
                }
                if(numI+numJ == 3 && numI >= 1 && numJ >= 1)win = true;


                
                if(win)ans++;



            }
        }

        System.out.print(ans);
	}

}
