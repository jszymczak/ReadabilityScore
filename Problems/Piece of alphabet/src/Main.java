import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean isAlphabet = true;
        int lengthOfString = input.length();

        if (lengthOfString > 1) {
            for (int i = 0; i < lengthOfString - 1; i++) {
                isAlphabet = input.charAt(i) + 1 == input.charAt(i + 1) ? true : false;
                if (!isAlphabet) {
                    break;
                }
            }
        }
        System.out.println(isAlphabet);
    }
}