package LateBinding;

public class testing {
    public static void main(String[] args) {
        A a1 = new A(3);
        A a2 = new B(5, 4);
        B b1 = new B(7, 8);
        a1 = a2;
        System.out.println(a1.size(b1));
        System.out.println(a2.size(a1));
        System.out.println(b1.size(a2));
    }
}
