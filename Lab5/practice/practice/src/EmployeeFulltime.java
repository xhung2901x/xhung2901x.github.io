import java.util.Scanner;

public class EmployeeFulltime extends Employee {
    public long luongThuong;
    public long calculatorSalary;
    public long fulltimeCalculator;
    Scanner sc = new Scanner(System.in);
    
    public void fulltimeCalculator(){
        System.out.println("nhap luongThuong: ");
        luongThuong = sc.nextLong();
        fulltimeCalculator = (8*100000*30)+luongThuong;
        System.out.println("Luong cua nhan vien full time la: " + fulltimeCalculator);
    }
}
