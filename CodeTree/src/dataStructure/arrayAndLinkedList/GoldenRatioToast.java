package dataStructure.arrayAndLinkedList;
import java.util.ListIterator;
import java.util.LinkedList;
import java.util.Scanner;

public class GoldenRatioToast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String str = sc.next();

        LinkedList<Character> l = new LinkedList<>();
        for(int i = 0; i<n; i++){
            char c = str.charAt(i);
            l.add(c);
        }

        ListIterator<Character> it = l.listIterator(l.size());

        for(int i = 0; i<m; i++){
            char order = sc.next().charAt(0);

            if(order == 'L'){
                if(it.hasPrevious()){
                    it.previous();
                }
            }else if(order == 'R'){
                if(it.hasNext()){
                    it.next();
                }
                
            }else if(order == 'D'){
            	if(it.hasNext()){
                    it.next();
                    it.remove();
                }
            }else if(order == 'P'){
                char a = sc.next().charAt(0);
                it.add(a);
            }
        }
        
        System.out.print(it.hasNext());

        it = l.listIterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
        
	}

}
