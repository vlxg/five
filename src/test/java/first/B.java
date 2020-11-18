package first;

public class B {
    private static final B b = new B();
    private B(){
        System.out.println("生成一个B");
    }
    public static B getB(){
        return b;
    }
}
