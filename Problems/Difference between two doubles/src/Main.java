import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double firstValue = scanner.nextDouble();
        double secondValue = scanner.nextDouble();
        double difference = secondValue - firstValue;
        System.out.println(difference);
    }
}