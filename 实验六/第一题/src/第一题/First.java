package 第一题;

import java.util.InputMismatchException;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean Whether = true;
        while (Whether) {
            try {
                System.out.println("Please enter two integers:");
                int Integer1 = input.nextInt();
                int Integer2 = input.nextInt();
                int ADD = Integer1 + Integer2;
                System.out.println(Integer1 + " + " + Integer2 + " = " + ADD);
                Whether = false;
            } catch (InputMismatchException e) {
                System.out.println("你输入的个啥啊，重输！");
                input.nextLine();
            }
        }

    }
}
