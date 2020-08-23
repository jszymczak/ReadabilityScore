import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountEvenNumbers {
    public static void main(String[] args) throws FileNotFoundException {
        int temp;
        int maxValue = 0;
        File file = new File("D:\\REPO\\ReadabilityScore\\Problems\\Are siblings\\src\\files\\dataset_91065.txt");

        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            temp = scanner.nextInt();
            if (temp == 0) {
                break;
            } else if (temp % 2 == 0) {
                maxValue++;
            }
        }

        System.out.println(maxValue);
    }
}