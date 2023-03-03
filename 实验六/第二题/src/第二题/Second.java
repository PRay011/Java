package 第二题;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        int[] Array = new int[100];
        for (int i = 0; i < 100; i++) {
            Array[i] = (int) (Math.random() * 100 + 1);
        }
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("请输入要访问的数组的下标:");
            int which = input.nextInt();
            System.out.println("访问的数字为:" + Array[which]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("out of bounds");
            System.exit(1);
        }
    }
}
