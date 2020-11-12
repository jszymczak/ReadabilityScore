import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double revertedB = b * (-1);

        double delta = Math.pow(b, 2) - (4 * a * c);
        double sqrtDelta = Math.sqrt(delta);
        double x1 = (revertedB - sqrtDelta) / (2 * a);
        double x2 = (revertedB + sqrtDelta) / (2 * a);

        System.out.println(Math.min(x1, x2) + " " + Math.max(x1, x2));
    }
}