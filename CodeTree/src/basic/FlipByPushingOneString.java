package basic;

import java.util.Scanner;

public class FlipByPushingOneString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int q = sc.nextInt();
        int len = str.length();

        for(int i = 0; i<q;i++){
            int type = sc.nextInt();

            if(type==1){
                str = str.substring(1,len)+str.substring(0,1);
                System.out.println(str);
            }else if(type==2){
                str = str.substring(len-1,len) + str.substring(0,len-1);
                System.out.println(str);
            }else{// case 3을 잘 못품, 길이를 /2해서 좌우를 뒤집는 아이디어!! .reverse().toString()메서드도 있다
                char [] arr = str.toCharArray();

                for(int j = 0; j<arr.length / 2;j++){
                    char temp = arr[j];
                    arr[j] = arr[arr.length - 1 - j];
                    arr[(arr.length) - j - 1]=temp;
                }

                str = String.valueOf(arr);
                System.out.println(str);
            }

        }
	}

}
