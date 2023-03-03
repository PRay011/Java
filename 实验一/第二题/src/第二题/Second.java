package 第二题;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter three points for a triangle: ");
        double FirstPointX=input.nextDouble();
        double FirstPointY=input.nextDouble();
        double SecondPointX=input.nextDouble();
        double SecondPointY=input.nextDouble();
        double ThirdPointX=input.nextDouble();
        double ThirdPointY=input.nextDouble();
        double S1,S2,S3,S,Area;
        NumberFormat keep = NumberFormat.getNumberInstance();
        S1=(FirstPointX-SecondPointX)*(FirstPointX-SecondPointX)+(FirstPointY-SecondPointY)*(FirstPointY-SecondPointY);
        S1=Math.sqrt(S1);
        S2=(FirstPointX-ThirdPointX)*(FirstPointX-ThirdPointX)+(FirstPointY-ThirdPointY)*(FirstPointY-ThirdPointY);
        S2=Math.sqrt(S2);
        S3=(SecondPointX-ThirdPointX)*(SecondPointX-ThirdPointX)+(SecondPointY-ThirdPointY)*(SecondPointY-ThirdPointY);
        S3=Math.sqrt(S3);
        if(S1+S2<=S3||S1+S3<=S2||S2+S3<=S1)
        {
            System.out.println("Error");
            System.exit(1);//错误标志
        }
        else
        {
            S=(S1+S2+S3)/2;
            Area=S*(S-S1)*(S-S2)*(S-S3);
            Area=Math.sqrt(Area);
            //下面是四舍五入的转换
            keep.setMaximumFractionDigits(2);
            keep.setRoundingMode(RoundingMode.UP);
            String area=keep.format(Area);//String类型接收值
            System.out.println("Enter three points for a triangle: "+area);
        }

    }
}
