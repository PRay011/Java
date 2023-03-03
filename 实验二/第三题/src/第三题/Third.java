package 第三题;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] CinArray = new int[10];
        int[] CoutArray = new int[10];
        System.out.print("输入10个整数：");
        for (int i = 0; i < 10; i++) {
            CinArray[i]=input.nextInt();
        }
        CoutArray[0]=CinArray[0];//将第一个赋给CoutArray
        int j=1;//用于收集录入的数据
        for (int i = 1; i < 10; i++) {
            for (int k = 0; k < j; k++) {
                if(CinArray[i]==CoutArray[k])
                {
                    break;
                }
                else
                {
                    if(k==j-1)
                    {
                        CoutArray[j]=CinArray[i];
                        j++;
                    }
                }
            }
        }
        System.out.print("互不相同的数为：");
        for (int i = 0; i < j; i++) {
            System.out.print(CoutArray[i]+" ");
        }
    }
}
