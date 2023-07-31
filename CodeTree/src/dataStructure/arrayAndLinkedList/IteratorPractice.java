package dataStructure.arrayAndLinkedList;
import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorPractice {

	public static void main(String[] args) {
		
		LinkedList<Character> l = new LinkedList<>(); // 문자를 관리할 list를 선언합니다. => 빈 이중 연결 리스트
        // 이중 연결 리스트에 'a', 'b', 'c'를 순서대로 추가합니다.
        l.add('a');
        l.add('b');
        l.add('c');

        // iterator를 list의 맨 앞에 위치시킵니다.
        ListIterator<Character> it;

        // iterator를 list의 맨 앞에 위치시킵니다.
        it = l.listIterator();
        System.out.println(it.next());      // 원소 값을 출력하며 한 칸 뒤로 이동합니다.  ('a')
        System.out.println(it.next());      // 원소 값을 출력하며 한 칸 뒤로 이동합니다.  ('b')
        System.out.println(it.previous());  // 원소 값을 출력하며 한 칸 앞으로 이동합니다. ('b')
        System.out.println(it.previous());  // 원소 값을 출력하며 한 칸 앞으로 이동합니다. ('a')

        it.remove();                        // 원소 'a'를 제거합니다.
        it.add('d');                        // 원소 'd'를 추가합니다.

        // list에 들어있는 원소 값을 순서대로 출력합니다.
        it = l.listIterator();
        while(it.hasNext()) {               // 'd' 'b' 'c'
            System.out.print(it.next()); 
        }// 원소 값을 출력하며 한 칸 뒤로 이동합니다.
	}

}
