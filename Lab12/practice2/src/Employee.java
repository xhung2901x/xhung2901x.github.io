import java.util.Scanner;

public abstract class Employee {
    public String id, name;
    public int age, basicSalary;
    Scanner sc = new Scanner(System.in);

    abstract void calculatorSalary();


    
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


    public void input(){
        System.out.println("nhap id: ");
        id = sc.nextLine();
        System.out.println("nhap name: ");
        name = sc.nextLine();
        System.out.println("nhap age: ");
        age = sc.nextInt();
        System.out.println("nhap basic salary: ");
        basicSalary = sc.nextInt();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    

}
