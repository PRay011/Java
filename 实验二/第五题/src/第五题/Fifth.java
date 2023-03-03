package 第五题;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long CardNum = input.nextLong();
        boolean WeatherCard =isValid(CardNum);
        if(WeatherCard)
        {
            System.out.println("数字是合法的");
        }
        else
        {
            System.out.println("数字是不合法的");
        }
    }
/*Return true if the card number is valid*/
public static boolean isValid(long number){
        int OddSum=sumOfOddPlace(number);
        int EvenSum=sumOfDoubleEvenPlace(number);
        int Sum=OddSum+EvenSum;
        int result=Sum%10;
        boolean WeatherTrue=false;
        if(result==0)
        {
            WeatherTrue=true;
            return WeatherTrue;
        }
        else
        {
            return WeatherTrue;
        }
}

/*Get the result from step 2*/
public static int sumOfDoubleEvenPlace(long number){
    long[] DoubleEvenNum = new long[8];
    int j=0;
    int SUM=0;
    int length=getSize(number);
    int i=length-1;
    while(i>0)
    {
        long temp=number;
        for (int k = 0; k < length-i; k++) {
            temp=temp/10;
        }
        temp = temp%10;
        temp=2*temp;
        int a=0;
        a+=temp;
        temp=getDigit(a);
        DoubleEvenNum[j]=2*temp;
        DoubleEvenNum[j]=temp;
        i-=2;
        j++;
    }
    for (int k = 0; k < j; k++) {
        SUM+=DoubleEvenNum[k];
    }
    return SUM;
}

/*Return this number if it is a single digit, otherwise return the sum of the two digits*/
public static int getDigit(int number){
        int temp=number%10;
        if(number==10)
        {
            return 1;
        }
        else if(temp==0)
        {
            return number;
        }
        else
        {
            int temp1=number/10;
            int temp2=number%10;
            number=temp1+temp2;
            return number;
        }
}

/*Return sum of odd place digits in number*/
public static int sumOfOddPlace(long number){
    long[] OddNum = new long[8];
    int j=0;
    int SUM=0;
    int length=getSize(number);
    int i=length;
    while(i>0)
    {
        long temp=number;
        for (int k = 0; k < length-i; k++) {
            temp=temp/10;
        }
        temp = temp%10;
        OddNum[j]=temp;
        i-=2;
        j++;
    }
    for (int k = 0; k < j; k++) {
        SUM+=OddNum[k];
    }
    return SUM;

}

/*Return true if the digit d is a prefix for number*/
//public static boolean prefixMatched(long number, int d)

/*Return the number of digits in d*/
public static int getSize(long d)
{
    int size=0;
    while(d!=0)
    {
        d=d/10;
        size++;
    }
    return size;
}

/*Return the first k number of digits from number. If the number of digits in number is less than k, return number*/
//public static long getPrefix(long number, int k)

}
