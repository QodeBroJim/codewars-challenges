public class Geometry {
    public static double squareArea(double A) {
        // find the area of a square using the arc of a circle provided
        double circumference = A * 4;
        double estLength = (circumference / Math.PI) / 2;
        double area = Math.pow(estLength, 2);
        return Math.round(area * 100.00) / 100.00;
    }
}