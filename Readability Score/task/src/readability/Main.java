package readability;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nameOfFile = args[0];
        ArrayList<String> inputFile = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);
        String[] separateStatements = {""};
        String[] separateWords = {""};
        File file = new File(nameOfFile);
        final double firstNumber = 4.71;
        final double secondNumber = 0.5;
        final double thirdNumber = 21.43;
        double words;
        double sentences;
        double characters = 0.0;
        double score;
        int roundedScore;
        String yearOld = "";

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                inputFile.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + nameOfFile);
        }

        for (String input: inputFile) {
            characters += input.replace(" ","").length();
            separateStatements = (input.split("[.!?]"));
            separateWords = (input.split(" "));
        }

        sentences = separateStatements.length;
        words = separateWords.length;
        score = firstNumber * (characters / words) +
                secondNumber * (words / sentences) - thirdNumber;
        roundedScore = (int) Math.ceil(score);

        String[] scoreMap = {"0","5-6","6-7","7-9","9-10","10-11","11-12",
                             "12-13","13-14","14-15","15-16",
                             "16-17","17-18","18-24","24+"};

        System.out.printf("Words: %.0f\n", words);
        System.out.printf("Sentences: %.0f\n", sentences);
        System.out.printf("Characters: %.0f\n", characters);
        System.out.println("The score is: " + df.format(score));
        System.out.println("This text should be understood by " + scoreMap[roundedScore] + " year olds.");

    }
}

//TASK 1 COMPLETED BEGIN
//        int lengthOfString;
//        lengthOfString = input.length();
//        output = lengthOfString > 100 ? "HARD" : "EASY";
//        System.out.print(output);
//TASK 1 COMPLETED END

//TASK 2 COMPLETED BEGIN
//    Scanner scanner = new Scanner(System.in);
//    String input = scanner.nextLine();
//    String output;
//
//    String[] separateStatements;
//        separateStatements = input.split("[.!?]");
//                int numberOfStatements = separateStatements.length;
//                int sumOfWords = 0;
//                double averageOfWords = 0.0;
//                String[][] separateWords = new String[numberOfStatements][];
//
//                for (int i = 0; i < numberOfStatements; i++) {
//        separateWords[i] = separateStatements[i].split(" ");
//        }
//
//        for (int i = 0; i < separateWords.length; i++) {
//        sumOfWords += separateWords[i].length;
//        }
//        averageOfWords = sumOfWords / numberOfStatements;
//        output = averageOfWords > 10 ? "HARD" : "EASY";
//
//        System.out.println(output);
//TASK 2 COMPLETED END

//TASK 3 COMPLETED BEGIN
//        String fileName = "in.txt";
//        String nameOfFile = "D:\\REPO\\ReadabilityScore\\Readability Score\\task\\src\\" + fileName;
//TASK 3 COMPLETED END