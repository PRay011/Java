package 第四题;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入二维数组的行数和列数: ");
        int row = input.nextInt();
        int column = input.nextInt();
        double[][] Arr = new double[row][column];
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[0].length; j++) {
                Arr[i][j] = input.nextDouble();
            }
        }
        Location location = Location.locateLargetst(Arr);
        System.out.println("最大元素及其下标是: " + location.maxValue + " 在" +
                " (" + location.row + "," + location.column + ")");
    }
}

class Location {
    public int row;
    public int column;
    public double maxValue;

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static Location locateLargetst(double[][] a) {
        int row = 0;
        int column = 0;
        double maxValue = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] > maxValue) {
                    row = i;
                    column = j;
                    maxValue = a[i][j];
                }
            }
        }
        return new Location(row, column, maxValue);
    }
}