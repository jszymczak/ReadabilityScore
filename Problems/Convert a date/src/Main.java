import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateInput;
        dateInput = scanner.nextLine();
        String[] dateInParts = dateInput.split("-");
        System.out.printf("%s/%s/%s", dateInParts[1], dateInParts[2], dateInParts[0]);
    }
}