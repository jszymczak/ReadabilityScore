package readability;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output;
        int lengthOfString;
        lengthOfString = input.length();
        output = lengthOfString > 100 ? "HARD" : "EASY";
        System.out.print(output);
    }
}
