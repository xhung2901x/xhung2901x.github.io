import java.util.Scanner;

public class Employee {
    public String id, name, address, DoB;
    Scanner sc = new Scanner(System.in);

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String doB) {
        DoB = doB;
    }

    public void input(){
        System.out.println("Nhap ID: ");
        id = sc.nextLine();
        System.out.println("Nhap Name: ");
        name = sc.nextLine();
        System.out.println("Nhap Address: ");
        address = sc.nextLine();
        System.out.println("Nhap DoB: ");
        DoB = sc.nextLine();
        
    }
    
    public void showInfo(){
        System.out.println("Thong tin da nhap: ");
        System.out.println(getId() + " - " + getName() + " - " + getAddress() + " - " + getDoB());
    }

}
