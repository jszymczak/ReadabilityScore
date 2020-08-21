/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String action = args[0];
        int tempMax = Integer.valueOf(args[1]);
        int length = args.length;
        if (length >= 2) {
            switch (action) {
                case "MAX":
                    for (int i = 2; i < length; i++) {
                        tempMax = tempMax > Integer.valueOf(args[i]) ? tempMax : Integer.valueOf(args[i]);
                    }
                    break;
                case "MIN":
                    for (int i = 2; i < length; i++) {
                        tempMax = tempMax < Integer.valueOf(args[i]) ? tempMax : Integer.valueOf(args[i]);
                    }
                    break;
                case "SUM":
                    for (int i = 2; i < length; i++) {
                        tempMax += Integer.valueOf(args[i]);
                    }
                    break;
                default:
                    System.out.println("Bad parameters");
                    break;
            }
        }
        System.out.println(tempMax);
    }
}