import java.util.Arrays;

class Problem {

    public static void main(String[] args) {
        String plus = "+";
        String star = "*";
        String minus = "-";
        String[] operators = {star, plus, minus};
        String signElement = args[0];
        int output = 0;
        if (Arrays.asList(operators).contains(signElement)) {
            Integer firstElement = Integer.valueOf(args[1]);
            Integer secondElement = Integer.valueOf(args[2]);
            if (plus.equals(signElement)) {
                output = firstElement + secondElement;
            } else if (star.equals(signElement)) {
                output = firstElement * secondElement;
            } else {
                output = firstElement - secondElement;
            }
            System.out.println(output);
        } else {
            System.out.println("Unknown operator");
        }
    }
}