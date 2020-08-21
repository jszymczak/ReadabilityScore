package readability;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output;

        //TASK 1 COMPLETED BEGIN
//        int lengthOfString;
//        lengthOfString = input.length();
//        output = lengthOfString > 100 ? "HARD" : "EASY";
//        System.out.print(output);
        //TASK 1 COMPLETED END

        String[] separateStatements;
        separateStatements = input.split("[.!?]");
        int numberOfStatements = separateStatements.length;
        int sumOfWords = 0;
        double averageOfWords = 0.0;
        String[][] separateWords = new String[numberOfStatements][];

        for (int i = 0; i < numberOfStatements; i++) {
            separateWords[i] = separateStatements[i].split(" ");
        }

        for (int i = 0; i < separateWords.length; i++) {
            sumOfWords += separateWords[i].length;
        }
        averageOfWords = sumOfWords / numberOfStatements;
        output = averageOfWords > 10 ? "HARD" : "EASY";

        System.out.println(output);
    }
}
