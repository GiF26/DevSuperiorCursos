public class Rectangle {
    public static double width;
    public static double height;

    public double area() {
        return height * width;
    }
    public double perimetro() {
        return 2 * (height + width);
    }
    public double diagonal() {
        return (height * height) + (width * width);
    }

    @Override
    public String toString() {
        return "AREA = " + String.format("%.2f", area()) +
                "/nPERIMETRO = " + String.format("%.2f", perimetro()) +
                "/nDIAGONAL = " + String.format("%.2f", diagonal());
    }
}
