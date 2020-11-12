import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstX = scanner.nextInt();
        int firstY = scanner.nextInt();
        int secondX = scanner.nextInt();
        int secondY = scanner.nextInt();

        double lengthV1 = Math.sqrt(Math.pow(firstX, 2) + Math.pow(firstY, 2));
        double lengthV2 = Math.sqrt(Math.pow(secondX, 2) + Math.pow(secondY, 2));

        double multiply = firstX * secondX + firstY * secondY;
        double cosinus = multiply / (lengthV1 * lengthV2);
        double angle = Math.acos(cosinus);
        System.out.println(Math.toDegrees(angle));

    }
}