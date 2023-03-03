package 第二题;

import java.util.Scanner;

public class Second {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       double [] Array =new double[10];
        System.out.println("Please enter 10 Numbers(Separate them with space)");
        for (int i=0; i<10; i++)
        {
            Array[i] = input.nextDouble();
        }
        int min = indexofSmallestElement(Array);
        System.out.println(min);
    }

    public static int indexofSmallestElement(double[] array)
    {
        int MinSubscript = 0;
        double MinNum =array[0];
        for (int i = 0; i < 9; i++) {
            if(MinNum > array[i+1])
            {
                MinSubscript=i+1;
                MinNum=array[i+1];
            }
        }
        return MinSubscript;
    }
}
