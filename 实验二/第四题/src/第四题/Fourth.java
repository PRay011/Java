package 第四题;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list1 = new int[6];
        int[] list2 = new int[6];
        for (int i = 0; i < 6; i++) {
            list1[i] = input.nextInt();
        }
        for (int i = 0; i < 6; i++) {
            list2[i] = input.nextInt();
        }
        boolean WeatherEqual = equal(list1,list2);
        if(WeatherEqual)
        {
            System.out.println("这两个数列是相同的");
        }
        else
        {
            System.out.println("这两个数列是不同的");
        }
    }

public static boolean equal(int[] list1,int[] list2)
{
    boolean Equal = true;
    swap(list1);
    swap(list2);
    for (int i = 0; i < 6; i++) {
        if(list1[i]!=list2[i])
        {
            Equal=false;
        }
    }
    return Equal;
}
public static void swap(int[] list)
{
    for (int i = 0; i <6; i++) {
        for (int j = 0; j <6-1-i ; j++) {
            if(list[j]>list[j+1])
            {
                int temp=list[j];
                list[j]=list[j+1];
                list[j+1]=temp;
            }
        }
    }
}
}
