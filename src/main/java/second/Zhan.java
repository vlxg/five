package second;

import java.util.Stack;

public class Zhan {
    public static void main(String[] args) {
        //创建栈,空的
        Stack<Integer> objects = new Stack<>();
        //查看栈是否为空
        boolean empty = objects.empty();
        //都是针对栈顶部那个元素的操作
        //放入元素
        objects.push(12);
        objects.push(13);
        Integer push = objects.push(11);
        System.out.println(push);
        //取出元素
        Integer pop = objects.pop();
        System.out.println(pop);
        //查看元素
        Integer peek = objects.peek();
        System.out.println(peek);
        //返回对象在堆栈中的位置,以1为基数(栈顶是1)
        int search = objects.search(14);
        System.out.println(search);
        int search2 = objects.search(12);
        System.out.println(search2);
        int search3 = objects.search(11);
        System.out.println(search3);

        Stack<User> vv = new Stack<>();
        User user1 = new User("aaaa1",12);
        User user2 = new User("aaaa2",12);
        User user3 = new User("aaaa3",12);
        vv.push(user1);
        vv.push(user2);
        vv.push(user3);
        int search1 = vv.search(user2);
        System.out.println("search:"+search1);
        int search4 = vv.search(new User("aaaa2",12));
        System.out.println("search:"+search4);
    }
}
