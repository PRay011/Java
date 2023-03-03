package 第三题;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("Exercise9_19.txt");
        if (myFile.exists()) {
            System.out.println("Already exists");
        }
        try (PrintWriter output = new PrintWriter(myFile)) {
            for (int i = 0; i < 10; i++) {
                output.print((int) (Math.random() * 100) + " ");
            }
            output.close();
        }
        int[] Arr = new int[10];
        try (Scanner input = new Scanner(myFile)) {
            for (int i = 0; i < 10; i++) {
                Arr[i] = input.nextInt();
            }
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10 - 1 - i; j++) {
                    if (Arr[j] > Arr[j + 1]) {
                        int temp = Arr[j];
                        Arr[j] = Arr[j + 1];
                        Arr[j + 1] = temp;
                    }
                }
            }
            input.close();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(Arr[i] + " ");
        }
    }
}
