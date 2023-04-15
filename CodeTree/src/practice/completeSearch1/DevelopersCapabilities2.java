package practice.completeSearch1;
import java.util.Scanner;

public class DevelopersCapabilities2 {
	
	public static int[] score;
    public static int total;

    public static int diff(int i, int j, int k, int l){
        int sum1  = score[i] + score[j];
        int sum2 = score[k] + score[l];
        //마지막 팀원의 점수합은 total에서 sum1과 sum2를 뺴면된다
        int sum3 = total - sum1 - sum2;

        //팀원들의 능력 총합이 가장 큰 팀과 가장 작은 팀의 차이를 구한다
        int  ret = Math.abs(sum1-sum2);
        ret = Math.max(ret,Math.abs(sum2-sum3));
        ret = Math.max(ret,Math.abs(sum3-sum1));

        return ret;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        score = new int[6];

        for(int i = 0; i < 6; i++){
            score[i] = sc.nextInt();
            total += score[i];
        }

        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i<6 ; i++){
            for(int j = i+1; j<6; j++){
                //팀을 2팀으로 분리한다 
                for(int k = 0; k<6; k++){
                    for(int l = k+1; l<6;l++){
                        if(i==k || j==k || l==i || l==j)continue;
                        minDiff = Math.min(minDiff,diff(i,j,k,l));
                    }
                }
            }
        }

        System.out.println(minDiff);
		
	}

}
