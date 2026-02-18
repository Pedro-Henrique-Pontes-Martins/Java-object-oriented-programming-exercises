package entities;

public class Employee {
    private String Name;
    private double GrossSalary;
    private double Tax;

    public Employee(String name, double grossSalary, double tax){
        this.Name = name;
        this.GrossSalary = grossSalary;
        this.Tax = tax;
    }

    public String getName(){
        return this.Name;
    }

    public double NetSalary(){
        return GrossSalary - Tax;
    }

    public void IncreaseSalary(double percentage){
        this.GrossSalary = this.GrossSalary * (1 + (percentage / 100));
    }

}