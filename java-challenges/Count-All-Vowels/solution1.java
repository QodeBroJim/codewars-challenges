public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
        for (char ch: str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowelsCount++;
        }
        return vowelsCount;
    }
}
