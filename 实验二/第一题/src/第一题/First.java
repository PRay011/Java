package 第一题;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] Num = new int[101];//101是为了让数组的下标满足和数字一样
        int[] NUM = new int[101];
        int j=0;
        Num[0]=input.nextInt();
        int N = 1;//这里用来记录一共有多少数字
        while(Num[j]!=0)
        {
            j++;
            Num[j] = input.nextInt();
            N++;
        }

        for (int i = 0; i < N; i++) {
            NUM[i] = 0;//为后面的几次做准备
        }
//统计次数
        for (int i = 0; i < N; i++) {
            int temp = Num[i];
            NUM[temp] += 1;
        }
        int last = 1;

        while (last < 101) {
            if (NUM[last] != 0) {
                System.out.println(last + " 出现" + NUM[last] + " 次");
            }
            last++;
        }
    }
}
