package 第一题;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Date;

public class First {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(1, 1.5, 1);
        triangle1.setFilled(true);
        triangle1.setColor("yellow");
        String Result = triangle1.toString();
        System.out.println(Result);
    }
}

class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor:" + color + " and filled:" + filled;
    }
}


class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    //构造方法
    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //方法
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {

        double Area = 0;
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            System.out.println("Error");
            System.exit(1);//错误标志
        } else {
            double S = (side1 + side2 + side3) / 2;
            Area = S * (S - side1) * (S - side2) * (S - side3);
            Area = Math.sqrt(Area);
        }
        return Area;
    }

    public double getPerimeter() {
        double Perimeter = side1 + side2 + side3;
        return Perimeter;
    }

    public String toString() {
        double Area = getArea();
        double Perimeter = getPerimeter();
        //下面是四舍五入的转换
        NumberFormat keep = NumberFormat.getNumberInstance();
        keep.setMaximumFractionDigits(2);
        keep.setRoundingMode(RoundingMode.UP);
        String area = keep.format(Area);//String类型接收值
        String perimeter = keep.format(Perimeter);//String类型接收值
        String color = getColor();
        boolean filled = isFilled();
        String result = "side1: " + side1 + " side2: " + side2 + " side3: " + side3 + " Perimeter: " + perimeter + " Area:" + area +
                "\ncolor:" + color + " and filled:" + filled;
        return result;
    }

}
