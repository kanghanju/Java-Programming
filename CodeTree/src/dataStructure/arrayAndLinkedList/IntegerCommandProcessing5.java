package dataStructure.arrayAndLinkedList;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class IntegerCommandProcessing5 {
	static int n;

	public static void main(String[] args) {
		
		 ArrayList<Integer> v = new ArrayList<>();
	        Scanner sc = new Scanner(System.in);
	        n = sc.nextInt();
	        
	        for(int i = 0; i<n ; i++){
	            String order = sc.next();

	            if(order.equals("push_back")){
	                int val = sc.nextInt();
	                v.add(val);
	            }else if(order.equals("pop_back")){
	                v.remove(v.size()-1);
	            }else if(order.equals("size")){
	                System.out.println(v.size());
	            }else if(order.equals("get")){
	                int val = sc.nextInt();
	                System.out.println(v.get(val-1));
	            }
	        }
	        
	}

}
