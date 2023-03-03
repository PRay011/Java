package first;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        System.out.println("Please enter a number(between 0 to 1000,can't be 0 or 1000)");
        Scanner input=new Scanner(System.in);
        int Num=input.nextInt();
        int NumSum=0;
        int nuit=0;
        int decade=0;
        int hundred=0;
        if(Num<=0||Num>=1000)
        {
            System.out.println("Error!");
            System.exit(1);
        }
        else
        {
            nuit=Num%10;
            decade=Num/10%10;
            hundred=Num/100;
            NumSum=nuit+decade+hundred;
        }
        System.out.println(NumSum);
    }
}
