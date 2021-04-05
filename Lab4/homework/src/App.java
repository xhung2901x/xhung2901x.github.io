import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Employee staff = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong nhan vien: ");
        int n = sc.nextInt();

        Employee employee[] = new Employee[n];
        for (int i = 0; i < employee.length; i++) {
            employee[i] = new Employee();
            System.out.println("Nhan vien thu " + (i+1) + ":");
            employee[i].input();
            System.out.println("----------------------------");
            System.out.println("Information Recorded: ");
            employee[i].showInfo();
            System.out.println("***Tinh luong:***");
            employee[i].salaryCalculator();
            System.out.println("----------------------------");
        }
        
        


    }
}
