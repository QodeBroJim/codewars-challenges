import java.util.Arrays;
import java.util.stream.*;

public class Kata {

    public static int[] flattenAndSort(int[][] array) {   
        int[] flatArray = Stream.of(array).flatMapToInt(Arrays::stream).toArray();
        Arrays.sort(flatArray);
        return flatArray;   
    }

}
