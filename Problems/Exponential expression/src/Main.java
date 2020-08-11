import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double xValue = scanner.nextDouble();
        double output;
        output = Math.pow(xValue, 3.0) + Math.pow(xValue, 2.0) + xValue + 1;
        System.out.println(output);
    }
}