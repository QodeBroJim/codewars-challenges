public class Kata {
  
    public static boolean divide(int weight) {
        boolean answer;
        
        if (weight == 2) {
            answer = false; // 2 will not provide the boys with even shares but is even
        } else if (weight % 2 == 0) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
  }
}