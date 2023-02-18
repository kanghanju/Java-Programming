package practice.sort;
import java.util.Scanner;
import java.util.Arrays;

class Person{
    String name;
    String add;
    String area;

    public Person(String name,String add,String area){
        this.name = name;
        this.add = add;
        this.area = area;
    }
}

public class AreaOfResidence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] people = new Person[n];
     

        for(int i = 0; i<n;i++){
            String name = sc.next();
            String add = sc.next();
            String area = sc.next();
            people[i] = new Person(name,add,area);
                     
        }

        int lastIdx = 0;
        for(int i = 1; i<n;i++){
            if(people[lastIdx].name.compareTo(people[i].name) < 0)
                lastIdx = i;
        }

        System.out.println("name " + people[lastIdx].name);
        System.out.println("addr " + people[lastIdx].add);
        System.out.println("city " + people[lastIdx].area);
	}

}
