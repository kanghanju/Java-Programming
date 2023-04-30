package practice.completeSearch2;
import java.util.Arrays;
import java.util.Scanner;

public class TeacherGrace3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //학생 수 
        int b = sc.nextInt(); //예산
        int[] price = new int[n];
        int[] shipping = new int[n];

        for(int i = 0; i < n; i++){
            price[i] = sc.nextInt();
            shipping[i] = sc.nextInt();
        }
        
        /*for(int i = 0; i<n; i++) {
        	for(int j = i+1; j<n;j++) {
        		if((price[i]+shipping[i]) > (price[j]+shipping[j])) {
        			int tmp1 = price[i];
        			int tmp2 = shipping[i];
        			price[i]  = price[j];
        			shipping[i] = shipping[j];
        			price[j] = tmp1;
        			shipping[j] = tmp2;
        		}
        	}
        }

        int max = 0;
        for(int i = 0; i < n; i++){//i번째 선물을 반값으로한다
            int buget = b;
            int total = (price[i]/2) + shipping[i];
            int cnt = 0;
            buget = buget - total;

            if(buget>=0){
                cnt++;
            }else{
                continue;
            }
            
            for(int j = 0; j<n; j++){// 
                if(i==j)continue;
                total = price[j]+shipping[j];
                buget = buget - total;
                if(buget >= 0){
                    cnt++;
                }else{
                    break;
                }

            }
            max = Math.max(max,cnt);
            
        }
        */
        
        int max = 0;
        
        for(int i = 0; i<n; i++) {
        	
        	int[] tmp = new int[n];
        	for(int j = 0; j<n; j++) {
        		tmp[j] = price[j]+shipping[j];
        	}
        	tmp[i] = price[i]/2 + shipping[i];
        	
        	Arrays.sort(tmp);
        	
        	int total = b;
        	int cnt = 0;
        	
        	for(int j = 0; j<n; j++) {
        		if(total - tmp[j] >= 0) {
        			cnt++;
        			total -= tmp[j];
        		}else {
        			break;
        		}
        	}
        	
        	max = Math.max(max,cnt);
        }

        System.out.println(max);
	}

}
