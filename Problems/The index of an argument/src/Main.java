class Problem {
    public static void main(String[] args) {
        int value = -1;
        for (int i = 0; i < args.length; i++) {
            if ("test".equals(args[i])) {
                value = i;
                break;
            }
        }
        System.out.println(value);
    }
}