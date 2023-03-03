package 第一题;

import java.math.RoundingMode;
import java.text.NumberFormat;

public class First {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.println("rectangle1: width is " + rectangle1.width +
                " height is " + rectangle1.height
                + " Area is " + rectangle1.getArea()
                + " Perimeter is " + rectangle1.getPerimeter());
        System.out.println("rectangle2: width is " + rectangle2.width +
                " height is " + rectangle2.height
                + " Area is " + rectangle2.getArea()
                + " Perimeter is " + rectangle2.getPerimeter());
    }
}

class Rectangle {
    public double width = 1;
    public double height = 1;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    //面积
    public double getArea() {
        double Area = height * width;
        NumberFormat keep = NumberFormat.getNumberInstance();
        keep.setMaximumFractionDigits(2);//保留两位小数
        keep.setRoundingMode(RoundingMode.UP);
        String area = keep.format(Area);//String类型接收值
        Area = Double.parseDouble(area);
        return Area;
    }

    //周长
    public double getPerimeter() {
        double Perimeter = 2 * (height + width);
        return Perimeter;
    }

}
