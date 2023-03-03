package First;

import java.math.RoundingMode;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GeometriObject test = new Triangle();
        System.out.println("Please enter 3 sides,color and whether is filled?(filled enter 1, else enter 0) ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        String color = input.next();
        boolean fill = false;
        int whether = input.nextInt();
        if(whether == 1){
            fill = true;
        }
        String area = test.Area(side1,side2,side3);
        double perimeter = test.Perimeter(side1,side2,side3);
        System.out.println("Area of the triangle is " + area);
        System.out.println("Perimeter of the triangle is " + perimeter);
        test.WhichColor(color);
        test.Filled(fill);
    }
}

abstract class GeometriObject{
    public GeometriObject(){

    }
    //Area
    public abstract String Area(double a, double b,double c);
    //Perimeter
    public abstract double Perimeter(double a, double b,double c);
    //Color
    public abstract void WhichColor(String color);
    //Filled
    public abstract void Filled(boolean fill);
}

class Triangle extends GeometriObject{
    private double Side1;
    private double Side2;
    private double Side3;
    private String Color;
    private boolean Fill = true;

    public double getSide1() {
        return Side1;
    }

    public void setSide1(double side1) {
        Side1 = side1;
    }

    public double getSide2() {
        return Side2;
    }

    public void setSide2(double side2) {
        Side2 = side2;
    }

    public double getSide3() {
        return Side3;
    }

    public void setSide3(double side3) {
        Side3 = side3;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public boolean isFill() {
        return Fill;
    }

    public void setFill(boolean fill) {
        Fill = fill;
    }

    public String Area(double a, double b, double c){
        NumberFormat keep = NumberFormat.getNumberInstance();
        double S;
        double area;
        String Area = " ";
        if(a+b<=c||a+c<=b||b+c<=a)
        {
            System.out.println("Error");
            System.exit(1);//错误标志
        }
        else
        {
            S=(a+b+c)/2;
            area=S*(S-a)*(S-b)*(S-c);
            area=Math.sqrt(area);
            //下面是四舍五入的转换
            keep.setMaximumFractionDigits(2);
            keep.setRoundingMode(RoundingMode.UP);
            Area=keep.format(area);//String类型接收值
        }
        return Area;
    }

    public double Perimeter(double a, double b,double c){
        return a+b+c;
    }

    public void WhichColor(String color){
        System.out.println("Color of the triangle is " + color);
    }

    public void Filled(boolean fill){
        if(fill){
            System.out.println("filled? Yes" );
        }else {
            System.out.println("filled? No");
        }
    }
}
