import java.util.Scanner;

import org.graalvm.compiler.asm.amd64.AMD64Address.Scale;

import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

public class Employee {
    
public String id, name, dateOfBirth, address, position;
public long basicSalary;
public long salary; 
public int overTime;

Scanner sc = new Scanner(System.in);

public Employee(){

}

public Employee(String id, String name, String dateOfBirth, String address, String position, long basicSalary) {
    this.id = id;
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.address = address;
    this.position = position;
    this.basicSalary = basicSalary;
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

public String getDateOfBirth() {
    return dateOfBirth;
}

public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
}

public String getAddress() {
    return address;
}

public void setAddress(String address) {
    this.address = address;
}

public String getPosition() {
    return position;
}

public void setPosition(String position) {
    this.position = position;
}

public long getBasicSalary() {
    return basicSalary;
}

public long getSalary() {
    return salary;
}

public void setSalary(long salary) {
    this.salary = salary;
}
public void setBasicSalary(long basicSalary) {
    this.basicSalary = basicSalary;
}

public int getOverTime() {
    return overTime;
}

public void setOverTime(int overTime) {
    this.overTime = overTime;
}
public void input (){
    System.out.println("Nhap ID: ");
    id = sc.nextLine();
    System.out.println("Nhap Name: ");
    name = sc.nextLine();
    System.out.println("Nhap DoB: ");
    dateOfBirth = sc.nextLine();
    System.out.println("Nhap Address: ");
    address = sc.nextLine();
    System.out.println("Nhap Position: ");
    position = sc.nextLine();
    System.out.println("Nhap Basic Salary(VND): ");
    basicSalary = sc.nextLong();

}

public void showInfo(){
    System.out.println("ID: " + getId());
    System.out.println("Name: " + getName());
    System.out.println("DoB: " + getDateOfBirth());
    System.out.println("Address: " + getAddress());
    System.out.println("Position: " + getPosition());
    System.out.println("Basic Salary: " + getBasicSalary() + " VND");
}

public void salaryCalculator(){
    System.out.println("Nhap so gio overtime thang nay(h): ");
    overTime = sc.nextInt();
    System.out.println(overTime + " h");
    salary = basicSalary + (100000*overTime);
    System.out.println("Tong tien luong thang nay la(VND): " + salary + " đ");
}









}
