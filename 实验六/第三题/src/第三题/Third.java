package 第三题;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Third {
    static boolean one = true;
    static boolean one3 = true;

    public static void main(String[] args) {
        System.out.println("代码小助手温馨提示：" +
                "本实验采用输入三角形的三条边，在判断为合法后，用周长代替含20位随机数据的数组的下标进行数据的访问：");
        Scanner input = new Scanner(System.in);
        boolean Whether = true;
        boolean one2 = true;
        while (Whether) {
            try {
                if (one2)
                    System.out.println("请输入三角形的一条边（整数类型）:");
                int num = input.nextInt();
                method1(num);
                Whether = false;
            } catch (InputMismatchException e) {
                System.out.println("你输入的个啥啊，重输！");
                one2 = false;
                input.nextLine();
            }
        }
    }


    //下面是输入的类型错误的情况
    public static void method1(int num) {
        try {
            method2(num);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("我真的服了你这个老6了，计算出来的数组下标越界了啦！");
        }
    }

    public static void method2(int num) {

        int number1 = 0;
        try {
            number1 = num;
            method3(number1);
        } catch (IllegalArgumentException e2) {
            System.out.println("你传了个啥啊，是三角形咩，重传!");
            one3 = false;
            method2(number1);
        }
    }

    public static void method3(int number1) {
        Scanner input = new Scanner(System.in);
        boolean whether3 = true;
        int[] Array = new int[20];
        for (int i = 0; i < 20; i++) {
            Array[i] = (int) (Math.random() * 20 + 1);
        }
        try {
            if (one && one3)
                System.out.println("请输入第二，三条边（整数类型）:");
            int number2 = input.nextInt();
            int number3 = input.nextInt();
            if (number1 + number2 <= number3 || number1 + number3 <= number2 || number2 + number3 <= number1) {
                throw new IllegalArgumentException();
            }
            int result = number2 + number1 + number3;
            System.out.println("要展示的数字为：" + Array[result]);
            whether3 = false;
        } catch (InputMismatchException e3) {
            System.out.println("你输入的是个啥啊,重输！");
        }
        if (whether3) {
            one = false;
            method3(number1);
        }
    }
}
