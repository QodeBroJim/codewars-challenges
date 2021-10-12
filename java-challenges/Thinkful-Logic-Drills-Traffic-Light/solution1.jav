public class TrafficLights {
    public static String updateLight(String current) {
        String color = current;
        switch (color) {
            case "green":
                color = "yellow";
                break;
            case "yellow":
                color = "red";
                break;
            case "red":
                color = "green";
                break;
        }
        return color;
    }
}