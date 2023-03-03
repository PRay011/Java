package 第二题;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) throws FileNotFoundException {
        int Lines = 0;
        int Letters = 0;
        int Words = 0;
        File myFile = new File(args[0]);
        Scanner input = new Scanner(myFile);
        try {
            while (input.hasNextLine()) {
                Lines++;
                String text = input.nextLine();
                Scanner in = new Scanner(text);
                while (in.hasNext()) {
                    Words++;
                    String newText = in.next();
                    Letters += newText.length();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Lines: " + Lines);
        System.out.println("Words: " + Words);
        System.out.println("Letters: " + Letters);
    }
}





