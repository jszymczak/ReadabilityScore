import java.util.Scanner;

public class Main {

    public static String prepareFullName(String firstName, String lastName) {
        boolean isFirstNameEmpty = firstName == null;
        boolean isLastNameEmpty = lastName == null;
        String output;
        output = isFirstNameEmpty && isLastNameEmpty
                ? "" : isFirstNameEmpty
                ? lastName : isLastNameEmpty
                ? firstName : firstName + " " + lastName;
        return output;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        firstName = "null".equals(firstName) ? null : firstName;

        String lastName = scanner.nextLine();
        lastName = "null".equals(lastName) ? null : lastName;

        System.out.println(prepareFullName(firstName, lastName));
    }
}