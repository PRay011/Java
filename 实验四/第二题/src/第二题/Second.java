package 第二题;

public class Second {
    public static void main(String[] args) {

        Circle2D c1 = new Circle2D(2, 2, 5.5);
        boolean point = c1.contains(3, 3);
        boolean in = c1.contains(new Circle2D(4, 5, 10.5));
        boolean edge = c1.overlaps(new Circle2D(3, 5, 2.3));
        if (point) {
            System.out.println("点在圆中");
        } else {
            System.out.println("点不在圆中");
        }

        if (in) {
            System.out.println("给定的圆在圆c1中");
        } else {
            System.out.println("给定的圆不在圆c1中");
        }

        if (edge) {
            System.out.println("两圆重叠");
        } else {
            System.out.println("两圆不重叠");
        }

    }
}

class Circle2D {
    private double x = 0;
    private double y = 0;
    private double radius = 1;
    static final double phe = 3.14;

    public Circle2D() {

    }

    public Circle2D(double x, double y, double radius) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public double getArea() {
        double Area = phe * radius * radius;
        return Area;
    }

    public double getPerimeter() {
        double Perimeter = 2 * phe * radius;
        return Perimeter;
    }

    public boolean contains(double x, double y) {
        boolean Isin = true;
        double length = (x - this.x) * (x - this.x) + (y - this.y) * (y - this.y);
        length = Math.sqrt(length);
        if (length > radius) {
            Isin = false;
            return Isin;
        } else {
            return Isin;
        }
    }

    public boolean contains(Circle2D circle) {
        boolean Isin = false;
        double length = (circle.x - x) * (circle.x - x) + (circle.y - y) * (circle.y - y);
        length = Math.sqrt(length);
        if (length + circle.radius < radius) {
            Isin = true;
            return Isin;
        } else {
            return Isin;
        }
    }

    public boolean overlaps(Circle2D circle) {
        boolean Isoverlap = false;
        double length = (circle.x - x) * (circle.x - x) + (circle.y - y) * (circle.y - y);
        length = Math.sqrt(length);
        if ((length + circle.radius > radius) && (length - circle.radius < radius)) {
            Isoverlap = true;
            return Isoverlap;
        } else {
            return Isoverlap;
        }
    }
}
