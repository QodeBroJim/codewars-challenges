public class EvenOrOdd {
    public static String even_or_odd(int number) {
        // ternary operator for a shorthand if else
        // if divisible by 2 with no remainder then even else odd
        return number % 2 == 0 ? "Even" : "Odd";
    }
}
