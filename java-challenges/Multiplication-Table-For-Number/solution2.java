class Kata {
    public static String multiTable(int num) {
        StringBuilder s = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            int result = i * num;
            s.append(i + " * " + num + " = " + result + "\n");
        }
        return s.toString().trim();
    }
}
