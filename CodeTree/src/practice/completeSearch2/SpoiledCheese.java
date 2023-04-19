package practice.completeSearch2;

import java.util.Scanner;


class Info1{//치즈를 먹은 기록을 나타내는 클래스 
    int p,m,t;

    public Info1(int p, int m, int t){
        this.p = p;
        this.m = m;
        this.t = t;
    }
};

class Info2{//치즈를 먹어 아픈 시간을 기록한 클래스 
    int p,t;

    public Info2(int p,int t){
        this.p = p;
        this.t = t;
    }

};

public class SpoiledCheese {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //사람의 수 
        int M = sc.nextInt(); //치즈의 수
        int D = sc.nextInt(); //치즈를 먹은 기록의 수
        int S = sc.nextInt(); //아픈 기록의 수 

        Info1[] info1 = new Info1[D];
        Info2[] info2 = new Info2[S];

        for(int i = 0; i < D; i++){
            int p = sc.nextInt(); //p번째 사람
            int m = sc.nextInt(); //m번째 치즈(1<=m<=M)
            int t = sc.nextInt(); //t초에 먹었다
            info1[i] = new Info1(p,m,t); 
        }

        for(int i = 0; i < S; i++){
            int p = sc.nextInt(); //p 번째 사람
            int t= sc.nextInt(); //t초에 아팠다 
            info2[i] = new Info2(p,t);
        }

        int ans = 0; //최대 약의 갯수 

        for(int i = 1; i<M+1 ; i++){ //i번쨰 치즈가 상했다 가정 

            //**time배열을 만들어서 각 사람이 언제 치즈를 먹었는지 저장한다 
            int[] time = new int[51];

            for(int j = 0; j < D; j++){ //일단 기록된 배열에서 i번째 치즈를 먹은 사람과 그 시간을 구한다
                if(info1[j].m != i)continue; //기록된 배열에서 i번째 치즈를 안먹었으면 continue
                
                //여기서부터는 i번째 치즈를 배열 index를 찾은상태다 
                int person = info1[j].p; //i번째 치즈를 먹은 사람 
                if(time[person] == 0) //person이 i번째 치즈를 처음 먹었거나 
                    time[person] = info1[j].t;
                else if(time[person] > info1[j].t)//이전보다 더 빨리 먹게 된 경우 time 배열 갱신 
                    time[person] = info1[j].t;
                
            }

            //**possible : i번째 치즈가 상했을 수 있으면 true, 아니면 false
            boolean possible = true;

            for(int j = 0; j<S; j++){//아픈 기록 배열과 비교 
                //person이 i번째 치즈를 먹지 않았거나 i번째 치즈를 먹은 시간보다 먼저 아픈 경우 모순
                int person = info2[j].p;
                if(time[person] == 0)
                    possible = false;
                if(time[person] >= info2[j].t)
                    possible = false;
            }

            
            //만약 i 번째 치즈가 상했을 가능성이 있다면 몇 개의 약이 필요한지 확인한다 
            int pill = 0;
            if(possible){
                //한 번이라도 i번째 치즈를 먹은 적이 있다면, 약이 필요하다
                for(int j = 1; j<=N; j++){
                    if(time[j] != 0)
                        pill++;
                 }
            }
                
            ans = Math.max(ans,pill);
        }

        System.out.print(ans);
	}

}
