import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String urlAddress = scanner.nextLine();
        String[] extractProperties = urlAddress.split("\\?");
        String properties = extractProperties[1];
        ArrayList<String> propertiesExtracted = new ArrayList<>();
        String[] propertiesInArray = properties.split("=|&");
        for (String property: propertiesInArray) {
            propertiesExtracted.add(property);
        }
        for (int i = 0; i < propertiesExtracted.size() - 1; i += 2) {
            if (propertiesExtracted.get(i + 1).equals("")) {
                propertiesExtracted.set(i + 1, "not found");
            }
            System.out.println(String.format("%s : %s", propertiesExtracted.get(i), propertiesExtracted.get(i + 1)));
            if (propertiesExtracted.get(i).equals("pass")) {
                propertiesExtracted.add("password");
                propertiesExtracted.add(propertiesExtracted.get(i + 1));
            }
        }
    }
}