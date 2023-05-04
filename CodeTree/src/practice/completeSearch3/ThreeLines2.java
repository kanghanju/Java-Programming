package practice.completeSearch3;
import java.util.Scanner;

public class ThreeLines2 {
	public static int[] x;
    public static int[] y;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        x = new int[n];
        y = new int[n];

        for(int i  =0; i<n; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int ans = 0;

        for(int i = 0; i<=10; i++){
            for(int j = 0; j<=10; j++){
                for(int k = 0; k<=10; k++){

                    boolean success = true;

                    //직선 3개가 모두 x축에 평행한 경우
                    for(int q = 0; q<n; q++){
                        if(x[q]==i || x[q]==j || x[q]==k)continue;

                        success = false; //한점이라도 직선과 안만나면 직선 3개는 모두 x축에 평행하지 않는다
                    }

                    if(success) ans = 1;

                    //직선 3개중 x축에 평행한 직선2개와 y축에 평행한 직선 1개
                    success = true;
                    for(int q = 0; q<n; q++){
                        if(x[q] == i || x[q] == j || y[q] == k)continue;

                        success = false;
                    }

                    if(success) ans = 1;

                    //직선 3개중 x축에 평행한 직선 1개와 y축에 평행한 직선2개
                    success = true;
                    for(int q = 0; q<n; q++){
                        if(x[q] == i || y[q] == j || y[q] == k)continue;

                        success = false;
                    }

                    if(success)ans = 1;


                     //직선 3개중 y축에 평행한 직선3개
                    success = true;
                    for(int q = 0; q<n; q++){
                        if(y[q] == i || y[q] == j || y[q] == k)continue;

                        success = false;
                    }

                    if(success)ans = 1;

                }
            }
        }

        System.out.print(ans);Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        x = new int[n];
        y = new int[n];

        for(int i  =0; i<n; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int ans = 0;

        for(int i = 0; i<=10; i++){
            for(int j = 0; j<=10; j++){
                for(int k = 0; k<=10; k++){

                    boolean success = true;

                    //직선 3개가 모두 x축에 평행한 경우
                    for(int q = 0; q<n; q++){
                        if(x[q]==i || x[q]==j || x[q]==k)continue;

                        success = false; //한점이라도 직선과 안만나면 직선 3개는 모두 x축에 평행하지 않는다
                    }

                    if(success) ans = 1;

                    //직선 3개중 x축에 평행한 직선2개와 y축에 평행한 직선 1개
                    success = true;
                    for(int q = 0; q<n; q++){
                        if(x[q] == i || x[q] == j || y[q] == k)continue;

                        success = false;
                    }

                    if(success) ans = 1;

                    //직선 3개중 x축에 평행한 직선 1개와 y축에 평행한 직선2개
                    success = true;
                    for(int q = 0; q<n; q++){
                        if(x[q] == i || y[q] == j || y[q] == k)continue;

                        success = false;
                    }

                    if(success)ans = 1;


                     //직선 3개중 y축에 평행한 직선3개
                    success = true;
                    for(int q = 0; q<n; q++){
                        if(y[q] == i || y[q] == j || y[q] == k)continue;

                        success = false;
                    }

                    if(success)ans = 1;

                }
            }
        }

        System.out.print(ans);
	}

}
