package practice.completeSearch2;
import java.util.Scanner;

public class MakingTriangle {
	
	public static int[] x;
    public static int[] y;

    public static boolean getPoint(int i, int j,int k){
        
        if((x[i]==x[j] || x[i]==x[k] || x[j]==x[k]) && (y[i]==y[j] || y[j]==y[k] || y[i]==y[k])){
            return true;
        }else{
            return false;
        }
    }

    public static int getVal(int i, int j, int k){
        int xMin = Math.min(x[i],Math.min(x[j],x[k]));
        int xMax = Math.max(x[i],Math.max(x[j],x[k]));
        int yMin = Math.min(y[i],Math.min(y[j],y[k]));
        int yMax = Math.max(y[i],Math.max(y[j],y[k]));

        int area = ((yMax-yMin)*(xMax-xMin));
        return area;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        x = new int[n];
        y = new int[n];

        for(int i = 0; i<n; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }


        int max = Integer.MIN_VALUE;
        int area;
        //n개의 점 중에서 3개를 뽑는다
        for(int i = 0; i<n-2; i++){
            for(int j = i+1; j<n-1; j++){
                for(int k = j+1; k<n; k++){
                    //세개의 점으로 만든 면이 x,y축에 평행한 세점을 구한다
                    if(getPoint(i,j,k)){
                        area = getVal(i,j,k);
                        max = Math.max(area,max);
                    }
                }
            }
        }

        System.out.println(max);
	}

}
