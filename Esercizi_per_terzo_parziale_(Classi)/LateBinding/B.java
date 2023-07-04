package LateBinding;

public class B extends A {
    private int num;

    public B(int k, int n) {
        super(k);
        this.num = n;
    }

    public int getNum() {
        return this.num;
    }

    public int size(A a) {
        return super.size(a) - this.num;
    }
}
