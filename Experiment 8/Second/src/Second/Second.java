package Second;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two radius for two circles");
        double R1 = input.nextDouble();
        double R2 = input.nextDouble();
        ComparableCircle Circle1 = new ComparableCircle(R1);
        ComparableCircle Circle2 = new ComparableCircle(R2);
        int com = Circle1.compareTo(Circle2);
        switch(com){
            case 1->  System.out.println("Circle1 > Circle2");
            case -1->  System.out.println("Circle1 < Circle2");
            case 0->  System.out.println("Circle1 = Circle2");
        }
    }
}

class Circle{
    protected double R;
    final static double phe = 3.14;

    public Circle(){

    }

    public Circle(double R){
        this.R = R;
    }

    public void setR(double r){
        R = r;
    }

    public double getR(){
        return R;
    }

    public double getArea(){
        double Area = phe*R*R;
        return Area;  
    }
}

class ComparableCircle extends Circle
    implements Comparable<ComparableCircle>{
    public ComparableCircle(double R){
        super.R = R;
    }

    public int compareTo(ComparableCircle o){
        if(getArea()> o.getArea()){
            return 1;
        }else if(getArea()<o.getArea()){
            return -1;
        }else{
            return 0;
        }
    }
    }

