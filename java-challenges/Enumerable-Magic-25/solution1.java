import java.util.Arrays;

public class ZywOo {
    public static int[] take(int[] arr, int n) {
        int[] myArray = new int[n];
        int[] blankArray = new int[0];

        if (n == 0 || arr.length == 0) {
            return blankArray;
        }

        if (arr.length < n) {
            return arr;
        }

        myArray = Arrays.copyOfRange(arr, 0, n);
        return myArray;
    }
}
