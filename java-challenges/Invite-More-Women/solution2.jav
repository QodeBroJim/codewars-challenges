import java.util.Arrays;

public class Kata {
    public static boolean inviteMoreWomen(int[] l) {
        return Arrays.stream(l).sum() > 0;
    }
}