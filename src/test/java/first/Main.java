package first;

public class Main implements Cloneable{
    public Main clone() throws CloneNotSupportedException {
        return (Main)super.clone();
    }
    public static void main(String[] args) {
        A a = A.getA();
        A a1 = A.getA();
        if (a.equals(a1)) System.out.println(true);
        B b = B.getB();
        B b1 = B.getB();
        if (b.equals(b1)) System.out.println(true);

    }
}
