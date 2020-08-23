import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) throws FileNotFoundException {
        int temp;
        int maxValue = 0;
        File file = new File("D:\\REPO\\ReadabilityScore\\Problems\\Are siblings\\src\\files\\dataset_91007.txt");

        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            temp = scanner.nextInt();
            maxValue = Math.max(temp, maxValue);
        }

        System.out.println(maxValue);
    }
}
