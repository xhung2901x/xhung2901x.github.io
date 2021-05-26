import java.util.Scanner;

public class Waiter extends Employee {
    
    public int compensate;
    Scanner sc = new Scanner(System.in);

    public Waiter() {
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getCompensate() {
        return compensate;
    }

    public void setCompensate(int compensate) {
        this.compensate = compensate;
    }

    

    public void calculatorSalary(){
        System.out.println("nhap compensate: ");
        compensate = sc.nextInt();
        int waiterSalary;
        waiterSalary = compensate + basicSalary;
        System.out.println("Luong Waiter la: " + waiterSalary);
    }
}
