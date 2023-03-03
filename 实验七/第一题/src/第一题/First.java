package 第一题;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        System.out.println("请输入一个大于等于八位数只有字母和数字且含起码两个数字的密码");
        Scanner input = new Scanner(System.in);
        String Password = input.nextLine();
        boolean NumOrChar = true;
        int Number = 0;
        int length = Password.length();
        if (length < 8) {
            System.out.println("Invalid Password");
            System.exit(0);
        }
        for (int i = 0; i < length; i++) {
            if ((Password.charAt(i) >= 48 && Password.charAt(i) <= 57)) {
                Number++;
            } else if ((Password.charAt(i) >= 65 && Password.charAt(i) <= 90) || (Password.charAt(i) >= 97 && Password.charAt(i) <= 122)) {

            } else {
                NumOrChar = false;
            }
        }
        if (Number >= 2 && NumOrChar) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

    }
}
