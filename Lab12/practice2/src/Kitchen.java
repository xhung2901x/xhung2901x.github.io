import java.util.Scanner;

public class Kitchen extends Employee {
    
    public int serviceCharge;
    Scanner sc = new Scanner(System.in);
    
    public Kitchen() {
        
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
    public int getServiceCharge() {
        return serviceCharge;
    }
    public void setServiceCharge(int serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public void calculatorSalary(){
        System.out.println("nhap service charge: ");
        serviceCharge = sc.nextInt();
        int kitchenSalary;
        kitchenSalary = serviceCharge + basicSalary;
        System.out.println("Luong Kitchen la: " + kitchenSalary);
    }

}
