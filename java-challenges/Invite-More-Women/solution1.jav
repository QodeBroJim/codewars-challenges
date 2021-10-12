public class Kata {
    public static boolean inviteMoreWomen(int[] l) {
        int ladies = 0;
        int men = 0;
      
        for (int ls : l) {
          if (ls == -1) {
            ladies++;
          } else {
            men++;
          }
        }
      
        if (ladies >= men) {
          return false;
        }
        
        return true;
    }
}