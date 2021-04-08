import java.util.Scanner;

public class EmployeeParttime extends Employee {
    
    public int workingHour;
    public long calculatorSalary;
    public long parttimeCalculator;
    Scanner sc = new Scanner(System.in);

    public void parttimeCalculator(){
        System.out.println("nhap workingHour: ");
        workingHour = sc.nextInt();
        parttimeCalculator = workingHour*100000*30;
        System.out.println("luong cua nv part time la: " + parttimeCalculator);
    }
}
