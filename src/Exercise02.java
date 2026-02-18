import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Exercise02{
    /*Make a program that data from a employee (name, gross salary, tax). Next, show the data on the screen (name, net salary).
    After that, increase the gross salary of the employee with a given percent and show it again.*/

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Type the employee's name:");
        String name =  sc.next();

        System.out.println("Type the employee's gross salary:");
        double grossSalary =  sc.nextDouble();

        System.out.println("Type the employee's tax for the salary:");
        double tax =  sc.nextDouble();

        Employee employee = new Employee(name, grossSalary, tax);
        System.out.printf("Employee: %s, R$ %.2f \n", employee.getName(), employee.NetSalary());

        System.out.println("Type the percent to increase the salary:");
        double percent =  sc.nextDouble();

        employee.IncreaseSalary(percent);
        System.out.printf("Updated data: %s, R$ %.2f", employee.getName(), employee.NetSalary());

        sc.close();
    }
}
