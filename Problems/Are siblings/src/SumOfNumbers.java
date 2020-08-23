import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) throws FileNotFoundException {
        int temp;
        int maxValue = 0;
        File file = new File("D:\\REPO\\ReadabilityScore\\Problems\\Are siblings\\src\\files\\dataset_91033.txt");

        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            temp = scanner.nextInt();
                maxValue += temp;
        }

        System.out.println(maxValue);
    }
}