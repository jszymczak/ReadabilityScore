import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MaxPopulation {
    public static void main(String[] args) throws FileNotFoundException {
        String temp;
        double tempDouble;
        double maxValue = 0.0;
        double maxYear = 0.0;
        double maxPopulation = 0.0;
        double tempIncrease;
        ArrayList<Double> populationValues = new ArrayList<>();

        File file = new File("D:\\REPO\\ReadabilityScore\\Problems\\Are siblings\\src\\files\\dataset_91069.txt");

        Scanner scanner = new Scanner(file);
        String year = scanner.next();
        String population = scanner.next();
        while (scanner.hasNext()) {
            temp = scanner.next().replace(",","");
            tempDouble = Double.parseDouble(temp);
            populationValues.add(tempDouble);
        }

        for (int i = 1; i < populationValues.size() - 2; i += 2) {
            tempIncrease = populationValues.get(i + 2) - populationValues.get(i);
            if (tempIncrease > maxValue) {
                maxYear = populationValues.get(i + 1);
                maxPopulation = populationValues.get(i + 2);
                maxValue = tempIncrease;
            }
        }
        System.out.printf("%s: %.0f, %s: %.0f", year, maxYear, population, maxPopulation);
    }
}