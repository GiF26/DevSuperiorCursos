public class Employee {
    public static String name;
    public static double grossSalary;
    public static double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        double aumento =  grossSalary * (percentage/100) ;
        grossSalary += aumento;

        /* Poderia ter feito da seguinte forma:
            grossSalary += grossSalary * percentage / 100.0;
         */
    }

    @Override
    public String toString() {
        return name + ", $ " + String.format("%.2f",netSalary());
    }
}
