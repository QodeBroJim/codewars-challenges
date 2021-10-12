public class AgeDiff {
    public static String CalculateAge(int birth, int yearTo) {
        int age = yearTo - birth;
        int age2 = Math.abs(birth - yearTo);
        
        if (age == 1) {
        return "You are " + age + " year old.";
        }
        
        if (age2 == 1) {
        return "You will be born in " + age2 + " year.";
        }

        if (birth == yearTo) {
            return "You were born this very year!";
        }

        if (birth > yearTo) {
            return "You will be born in " + Math.abs(yearTo - birth) + " years.";
        }

        return "You are " + age + " years old.";
    }
}