package readability;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

import static readability.lettersHandler.isVowel;

public class Main {
    public static void main(String[] args) {
//        String fileName = "inThree.txt";
//        String nameOfFile = "D:\\REPO\\ReadabilityScore\\Readability Score\\task\\src\\" + fileName;

        String nameOfFile = args[0];
        ArrayList<String> inputFile = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);
        String[] separateStatements = {""};
        String[] separateWords = {""};
        File file = new File(nameOfFile);
//        String file = "I am the Programmer! Die here you bastard!";
        double polysyllables = 0;
        double words;
        double sentences;
        double diphthongs = 0.0;
        double characters = 0.0;
        double ariScore;
        double fkrScore;
        double smogScore;
        double clScore;
        int roundedAriScore;
        int roundedFkrScore;
        int roundedSmogScore;
        int roundedClScore;
        String ariAge;
        String fkrAge;
        String smogAge;
        String clAge;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                inputFile.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + nameOfFile);
        }

        for (String input: inputFile) {
            input = input.toLowerCase();
            separateStatements = (input.split("[.!?]"));
            characters += input.replaceAll("[ ]", "").length();
            separateWords = (input.split(" "));
        }

        double syllables = 0;
        int tempSyllables = 0;

        for (String word: separateWords) {
            for (int i = 0; i < word.length(); i++) {
                if (isVowel(word.charAt(i))) {
                    if (i < word.length() - 1) {
                        if (isVowel(word.charAt(i + 1))) {
                            diphthongs++;
                        }
                    }
                    tempSyllables++;
                }
                if (i == word.length() - 1 && word.charAt(i) == 'e') {
                    tempSyllables--;
                }
            }
            tempSyllables -= diphthongs;
            if (tempSyllables <= 0) {
                tempSyllables = 1;
            } else if (tempSyllables > 2) {
                polysyllables++;
            }
            syllables += tempSyllables;
            diphthongs = 0;
            tempSyllables = 0;
        }

        sentences = separateStatements.length;
        words = separateWords.length;
        ariScore = 4.71 * (characters / words) + 0.5 * (words / sentences) - 21.43;
        fkrScore = (0.39 * (words / sentences)) + (11.8 * (syllables / words)) - 15.59;
        smogScore = 1.043 * Math.sqrt(polysyllables * 30 / sentences) + 3.1291;
        clScore = (0.0588 * (characters / words * 100) - (sentences / words * 100) * 0.296) - 15.8;

        String[] scoreMap = {"0","6","7","9","10","11","12",
                             "13","14","15","16",
                             "17","18","24","24+"};

        roundedAriScore = (int) Math.round(ariScore);
        roundedFkrScore = (int) Math.round(fkrScore);
        roundedSmogScore = (int) Math.round(smogScore);
        roundedClScore = (int) Math.round(clScore);

        ariAge = scoreMap[roundedAriScore];
        fkrAge = scoreMap[roundedFkrScore];
        smogAge = scoreMap[roundedSmogScore];
        clAge = scoreMap[roundedClScore];

        System.out.printf("Words: %.0f\n", words);
        System.out.printf("Sentences: %.0f\n", sentences);
        System.out.printf("Characters: %.0f\n", characters);
        System.out.printf("Syllables: %.0f\n", syllables);
        System.out.printf("Polysyllables: %.0f\n", polysyllables);
        System.out.print("Enter the score you want to calculate (ARI, FK, SMOG, CL, all): ");
        Scanner insert = new Scanner(System.in);
        String input = insert.next();
        System.out.println();

        switch (input.toUpperCase()) {
            case "ARI":
                System.out.printf("Automated Readability Index: %.2f (about " + ariAge + " years olds).", ariScore);
                break;
            case "FK":
                System.out.printf("Flesch–Kincaid readability tests: %.2f (about " + fkrAge + " years olds).", fkrScore);
                break;
            case "SMOG":
                System.out.printf("Simple Measure of Gobbledygook: %.2f (about " + smogAge + " years olds).", smogScore);
                break;
            case "CL":
                System.out.printf("Coleman–Liau index: %.2f (about " + clAge + " years olds).", clScore);
                break;
            case "ALL":
                System.out.printf("Automated Readability Index: %.2f (about " + ariAge + " year olds).%n", ariScore);
                System.out.printf("Flesch–Kincaid readability tests: %.2f (about " + fkrAge + " year olds).%n", fkrScore);
                System.out.printf("Simple Measure of Gobbledygook: %.2f (about " + smogAge + " year olds).%n", smogScore);
                System.out.printf("Coleman–Liau index: %.2f (about " + clAge + " year olds).%n", clScore);
                double avarageAge = (Integer.parseInt(ariAge.replace("+",""))
                        + Integer.parseInt(fkrAge.replace("+",""))
                        + Integer.parseInt(smogAge.replace("+",""))
                        + Integer.parseInt(clAge.replace("+","")) ) / 4.0;
                System.out.printf("This text should be understood in avarage by %.2f year olds.%n", avarageAge);
                break;
        }
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
//        String nameOfFile = args[0];
//        ArrayList<String> inputFile = new ArrayList<>();
//        DecimalFormat df = new DecimalFormat("#.##");
//        df.setRoundingMode(RoundingMode.DOWN);
//        String[] separateStatements = {""};
//        String[] separateWords = {""};
//        String[] separateSyllables = {" "};
//        File file = new File(nameOfFile);
//        final double firstNumber = 4.71;
//        final double secondNumber = 0.5;
//        final double thirdNumber = 21.43;
//        double words;
//        double sentences;
//        double characters = 0.0;
//        double score;
//        int roundedScore;
//
//        try (Scanner scanner = new Scanner(file)) {
//        while (scanner.hasNext()) {
//        inputFile.add(scanner.nextLine());
//        }
//        } catch (FileNotFoundException e) {
//        System.out.println("No file found: " + nameOfFile);
//        }
//
//        for (String input: inputFile) {
//        characters += input.replace(" ","").length();
//        separateStatements = (input.split("[.!?]"));
//        separateWords = (input.split(" "));
//        }
//
//        words = separateWords.length;
//        score = firstNumber * (characters / words) +
//        secondNumber * (words / sentences) - thirdNumber;
//        roundedScore = (int) Math.ceil(score);
//
//        String[] scoreMap = {"0","5-6","6-7","7-9","9-10","10-11","11-12",
//        "12-13","13-14","14-15","15-16",
//        "16-17","17-18","18-24","24+"};
//
//        System.out.printf("Words: %.0f\n", words);
//        System.out.printf("Sentences: %.0f\n", sentences);
//        System.out.printf("Characters: %.0f\n", characters);
//        System.out.println("The score is: " + df.format(score));
//        System.out.println("This text should be understood by " + scoreMap[roundedScore] + " year olds.");
//TASK 3 COMPLETED END