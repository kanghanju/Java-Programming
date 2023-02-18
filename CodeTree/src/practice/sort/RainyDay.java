package practice.sort;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;


class Predict{
    String date;
    String day;
    String weather;

    public Predict(String date,String day,String weather){
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}

public class RainyDay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Predict[] inf = new Predict[n];
        int cnt = 0;


        for(int i =0; i<n;i++){
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            inf[i] = new Predict(date,day,weather);
            if(inf[i].weather.equals("Rain")){
                cnt++;
            }
           

        }

        Predict[] rain = new Predict[cnt];
        int idx = 0;
        for(int i = 0; i<n;i++){
            if(inf[i].weather.equals("Rain")){
                rain[idx] = inf[i];
                idx++;
            }
        }
        

        Predict min = new Predict(rain[0].date,rain[0].day,rain[0].weather);
        for(int i = 0; i<cnt-1;i++){
            if(min.date.compareTo(rain[i+1].date) > 0){
                min.date = rain[i+1].date;
                min.day = rain[i+1].day;
                min.weather = rain[i+1].weather;
            }
            
        }

        System.out.print(min.date+" "+min.day+" "+min.weather);
	}

}
