import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ticketNumber = scanner.next();
        String[] myList = ticketNumber.split("");
        int firstPart = 0;
        int secondPart = 0;
        String output;

        for (int i = 0; i < 3; i++) {
            firstPart += Integer.parseInt(myList[i]);
            secondPart += Integer.parseInt(myList[i + 3]);
        }

        output = firstPart == secondPart ? "Lucky" : "Regular";
        System.out.println(output);

    }
}