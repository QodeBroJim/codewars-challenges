public class Kata {
    public static boolean inviteMoreWomen(int[] l) {
        int women = 0, men = 0;
        for (int i : l) {
            if (i == -1)
                women++;
            else
                men++;
        }
        return (women >= men) ? false : true;
    }
}