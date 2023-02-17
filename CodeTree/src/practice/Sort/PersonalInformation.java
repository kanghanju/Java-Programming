package practice.Sort;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Person2{
    String name;
    int height;
    double weight;

    public Person2(String name,int height,double weight){
        this.name =name;
        this.height = height;
        this.weight = weight;
    }
}


public class PersonalInformation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Person2[] people = new Person2[5];

        for(int i =0; i<5;i++){
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();

            people[i] = new Person2(name,height,weight);
        }

        Arrays.sort(people,new Comparator<Person2>(){
            @Override
            public int compare(Person2 a, Person2 b){
                return a.name.compareTo(b.name);
            }
        });

        

        System.out.println("name");
        for (int i = 0; i < 5; i++){
            System.out.print(people[i].name + " ");
            System.out.print(people[i].height + " ");
            System.out.printf("%.1f\n",people[i].weight);
        }

        Arrays.sort(people,new Comparator<Person2>(){
            @Override
            public int compare(Person2 a, Person2 b){
                return b.height-a.height;
            }
        });
        System.out.println();
        System.out.println("height");

        for (int i = 0; i < 5; i++){
            System.out.print(people[i].name + " ");
            System.out.print(people[i].height + " ");
            System.out.printf("%.1f\n",people[i].weight);
        }
	}

}
