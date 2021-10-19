class Kata {
    public static String multiTable(int num) {
        int[] numbers = new int[] { 1,2,3,4,5,6,7,8,9,10 };
        int end = numbers[numbers.length - 1];
        String resp = "";
        
        for (int n : numbers) {
            int x = n * num;
            
            if (n == end) {
                resp += n + " * " + num + " = " + x;
            }
            else {
                resp += n + " * " + num + " = " + x + "\n";
            }
        }
        return resp;
    }
}
