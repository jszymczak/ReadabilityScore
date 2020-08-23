import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) throws FileNotFoundException {
        int temp;
        int maxValue = 0;
        File file = new File("D:\\REPO\\ReadabilityScore\\Problems\\Are siblings\\src\\files\\dataset_91022.txt");

        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            temp = scanner.nextInt();
            if (temp > 9999) {
                maxValue++;
            }
        }

        System.out.println(maxValue);
    }
}