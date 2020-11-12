import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double var1 = scanner.nextDouble();
        double var2 = scanner.nextDouble();
        double output = Math.pow(var1, var2);
        System.out.println(output);
    }
}