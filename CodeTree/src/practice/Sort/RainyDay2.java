package practice.Sort;

import java.util.Scanner;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Predict2{
    String date;
    String day;
    String weather;

    public Predict2(String date,String day,String weather){
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}

public class RainyDay2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Predict2[] inf = new Predict2[n];
        Predict2 rain = new Predict2("2100-12-31","","");


        for(int i =0; i<n;i++){
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            
            inf[i] = new Predict2(date,day,weather);
            
            if(inf[i].weather.equals("Rain")){
                if(rain.date.compareTo(inf[i].date) > 0)
                	rain = inf[i];
            }
           

        }

       

        System.out.print(rain.date+" "+rain.day+" "+rain.weather);
	}

}
