import java.util.ArrayList;

class Solution {
    public static String whoLikesIt(String... names) {
        ArrayList<String> likes = new ArrayList<String>();
      
        for (String name : names) {
            likes.add(name);
        }

        int size = likes.size();

        switch(size) {
            case 0:
                return "no one likes this";
              case 1:
                  return likes.get(0) + " likes this";
              case 2:
                  return likes.get(0) + " and " + likes.get(1) + " like this";
              case 3:
                  return likes.get(0) + ", " + likes.get(1) + " and " + likes.get(2) + " like this";
              default:
                  return likes.get(0) + ", " + likes.get(1) + " and " + (size - 2) + " others like this";
        }
    }
}
