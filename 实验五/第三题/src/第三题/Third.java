package 第三题;

import java.util.ArrayList;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入five个字符串：");
        MyStack stack = new MyStack();
        for (int i = 0; i < 5; i++) {
            stack.push(input.next());
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + "  ");
        }
    }
}

class MyStack extends ArrayList<Object> {

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize() {
        return super.size();
    }

    //peek->栈顶元素
    public Object peek() {
        return super.get(getSize() - 1);
    }

    public Object pop() {
        Object o = super.get(getSize() - 1);
        super.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        super.add(o);
    }

    @Override
    public String toString() {
        return "stack: " + super.toString();
    }

}
