package Contribuintes.Objects;

public class Contribuintes {

    private Double salaryIncome;
    private Double servicesIncome;
    private Double capitalIncome;
    private Double healthSpending;
    private Double educationSpending;

    public Double getSalaryIncome() {
        return salaryIncome;
    }

    public void setSalaryIncome(Double salaryIncome) {
        this.salaryIncome = salaryIncome;
    }

    public Double getServicesIncome() {
        return servicesIncome;
    }

    public void setServicesIncome(Double servicesIncome) {
        this.servicesIncome = servicesIncome;
    }

    public Double getCapitalIncome() {
        return capitalIncome;
    }

    public void setCapitalIncome(Double capitalIncome) {
        this.capitalIncome = capitalIncome;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }

    public Double getEducationSpending() {
        return educationSpending;
    }

    public void setEducationSpending(Double educationSpending) {
        this.educationSpending = educationSpending;
    }

    public double salaryTax(){return 0;}
    public double servicesTax(){return 0;}
    public double capitalTax(){return 0;}
    public double grossTax(){return 0;}
    public double taxRebate(){return 0;}
    public double netTax(){return 0;}

    public Contribuintes(Double salaryIncome, Double servicesIncome, Double capitalIncome) {
        this.salaryIncome = salaryIncome;
        this.servicesIncome = servicesIncome;
        this.capitalIncome = capitalIncome;
    }
}
