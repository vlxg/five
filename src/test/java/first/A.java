package first;

public class A {
    private static volatile A a = null;
    private A() {
        System.out.println("生成一个A");
    }
    public static synchronized A getA(){
        if (null==a) {
            a = new A();
        } else {
            System.out.println("A已存在");
        }
        return a;
    }
}
