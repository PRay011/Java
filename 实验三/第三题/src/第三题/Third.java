package 第三题;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {

        System.out.println("Please enter a,b,c:");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double whether = quadraticEquation.getDiscriminant();
        if (whether >= 0) {
            System.out.println("方程的第一个根：" + quadraticEquation.getRoot1());
            System.out.println("方程的第二个根：" + quadraticEquation.getRoot2());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}

class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double result = b * b - 4 * a * c;
        return result;
    }

    public double getRoot1() {
        double result = getDiscriminant();
        double half = Math.sqrt(result);
        double r1 = (-b + half) / (2 * a);
        NumberFormat keep = NumberFormat.getNumberInstance();
        keep.setMaximumFractionDigits(2);
        keep.setRoundingMode(RoundingMode.UP);
        String R1 = keep.format(r1);//String类型接收值
        r1 = Double.parseDouble(R1);
        return r1;
    }

    public double getRoot2() {
        double result = getDiscriminant();
        double half = Math.sqrt(result);
        double r2 = (-b - half) / (2 * a);
        NumberFormat keep = NumberFormat.getNumberInstance();
        keep.setMaximumFractionDigits(2);
        keep.setRoundingMode(RoundingMode.UP);
        String R1 = keep.format(r2);//String类型接收值
        r2 = Double.parseDouble(R1);
        return r2;
    }
}
