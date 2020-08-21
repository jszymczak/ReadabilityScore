import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputData = new ArrayList<>();
        Integer tempInt = 0;
        String tempString = "";
        String zero = "0";

        do {
            tempString = scanner.nextLine();
            inputData.add(tempString);
        } while (!zero.equals(tempString));

        for (int i = 0; i < inputData.size() - 1; i++) {
            try {
                tempInt = Integer.parseInt(inputData.get(i));
                System.out.println(tempInt * 10);
            } catch (Exception e) {
                System.out.println("Invalid user input: " + inputData.get(i));
            }
        }
    }
}