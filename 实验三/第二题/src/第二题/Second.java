package 第二题;

public class Second {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setColor("yellow");
        fan1.setRadius(10);
        fan1.setSpeed(Fan.FAST);
        String AboutFan1 = fan1.toString();
        System.out.println("fan1: " + AboutFan1);

        Fan fan2 = new Fan();
        fan2.setOn(false);
        fan2.setColor("blue");
        fan2.setRadius(5);
        fan2.setSpeed(Fan.MEDIUM);
        String AboutFan2 = fan2.toString();
        System.out.println("fan2: " + AboutFan2);
    }
}

class Fan {
    public final static int SLOW = 1;
    public final static int MEDIUM = 2;
    public final static int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on) {
            String onFan = speed + " " + color + " " + radius;
            return onFan;
        } else {
            String offFan = "fan is off " + color + " " + radius;
            return offFan;
        }
    }
}
