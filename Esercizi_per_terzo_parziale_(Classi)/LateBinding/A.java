package LateBinding;

public class A {
    private int val;

    public A(int k) {
        this.val = k;
    }

    public int getVal() {
        return this.val;
    }

    public int size(A a) {
        if (this.val > a.val)
            return this.val * a.val;
        else
            return this.val + a.val;
    }
}
