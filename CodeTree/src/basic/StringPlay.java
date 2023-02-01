package basic;

import java.util.Scanner;

public class StringPlay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int q = sc.nextInt();

		char [] arr = s.toCharArray();

		for(int i = 0; i<q; i++){
			int type = sc.nextInt();
			if(type ==1){
				int a = sc.nextInt();
				int b = sc.nextInt();
				char temp = arr[a-1];

				
				arr[a-1] = arr[b-1]; //이걸 for문을 돌리고 앉아있으니 문제가 안풀리지!!! 매우 뻘짓함
				arr[b-1] = temp;
					
				
				for(int j = 0; j<arr.length;j++){
					System.out.print(arr[j]);
				}
				System.out.println();
			}else if(type ==2){
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);

                for(int j = 0; j<arr.length;j++){
                    if(arr[j]==a)
                        arr[j] = b;
                }
                for(int j = 0; j<arr.length;j++){
                    System.out.print(arr[j]);
                }
                System.out.println();

            }
			
		}
		

	}

}
