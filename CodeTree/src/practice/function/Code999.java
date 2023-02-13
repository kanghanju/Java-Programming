package practice.function;

public class Code999 {

	public static int num = 5;

    public static void g() {
        System.out.print(num + " ");
    }

    public static void f() {
        num = 9;
        while(num < 8)
            num++;
        System.out.print(num + " ");
        g();
    }

    public static void main(String[] args) {
        f();

        System.out.print(num);
    }
}
