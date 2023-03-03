package Third;


import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Square[] squares = new Square[5];
        for (int i = 1; i < 6; i++) {
            System.out.println("Square" + i + ": ");
            System.out.print("Enter side: ");
            double side = input.nextDouble();
            System.out.print("Enter color: ");
            String color = input.next();
            System.out.println("Is filled?(Enter true or false) ");
            boolean fill = input.nextBoolean();
            squares[i-1] = new Square(side,color,fill);
            squares[i-1].out();
        }

    }
}

interface Colorable{
    public void howToColor();
}

abstract class GeometricObject {
    private String color = "white";
    private boolean filled = false;
    private java.util.Date dateCreated;

    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    protected GeometricObject(String color, boolean filled) {
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

    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    public String toString(){
        return "created on " +  dateCreated +"\ncolor: " + color +
                " and filled: "+ filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

}

class Square extends GeometricObject
    implements Colorable{
    private double side;

    public Square(){
        this.side = 0;
    }

    public Square(double side){
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        super(color,filled);
        this.side = side;
    }

    public void howToColor(){
        System.out.println("Color all four sides");
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public void out(){
        if(super.isFilled()){
           howToColor();
        }
    }
}