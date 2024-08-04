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

    public double salaryTax(){

        double salaryMonth = salaryIncome / 12;

        if(salaryMonth >= 5000){
            return salaryIncome * (double) 20 /100;
        }
        if (salaryMonth >= 3000) {
           return salaryIncome* 10 /100;
        }

        return 0.00;
    }
    public double servicesTax(){
        if(servicesIncome > 0){
             return servicesIncome * 15 / 100;
        }
        return 0.00 ;
    }
    public double capitalTax(){
        if(capitalIncome > 0){
            return capitalIncome * 20 / 100;
        }
        return 0.00 ;
    }

    public double grossTax(){
        return salaryTax() + capitalTax() + servicesTax();
    }

    public double taxRebate(){

        double spending = healthSpending + educationSpending;
        double percent = grossTax() * 30/100;

        if(spending >= percent){
            return percent;
        }else {
            return spending;
        }

    }
    public double netTax(){
        return grossTax() - taxRebate();
    }

    public Contribuintes(Double salaryIncome, Double servicesIncome, Double capitalIncome, Double healthSpending, Double educationSpending) {
        this.salaryIncome = salaryIncome;
        this.servicesIncome = servicesIncome;
        this.capitalIncome = capitalIncome;
        this.healthSpending = healthSpending;
        this.educationSpending = educationSpending;
    }
}
