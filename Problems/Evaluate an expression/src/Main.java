import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double aValue = scanner.nextDouble();
        double bValue = scanner.nextDouble();
        double cValue = scanner.nextDouble();
        double dValue = scanner.nextDouble();
        double expression = aValue * 10.5 + bValue * 4.4 + (cValue + dValue) / 2.2;
        System.out.println(expression);
    }
}