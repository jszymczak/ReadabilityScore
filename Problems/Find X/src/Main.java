import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double aValue = scanner.nextDouble();
        double bValue = scanner.nextDouble();
        double cValue = scanner.nextDouble();
        double xValue = (cValue - bValue) / aValue;
        System.out.println(xValue);
    }
}