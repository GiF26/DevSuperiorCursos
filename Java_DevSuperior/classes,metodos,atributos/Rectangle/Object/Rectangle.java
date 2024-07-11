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
        /* poderia ter feito da seguinte forma:
        *  return Math.sqrt(width * width + height * height);
        * */
    }

    @Override
    public String toString() {
        return "AREA = " + String.format("%.2f", area()).replace(",",".") +
                "\nPERIMETRO = " + String.format("%.2f", perimetro()).replace(",",".") +
                "\nDIAGONAL = " + String.format("%.2f", diagonal()).replace(",",".");
    }
}
