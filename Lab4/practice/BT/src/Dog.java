import java.util.Scanner;

import jdk.internal.agent.resources.agent;

public class Dog {
    
    private String breed, size, age, color;
    Scanner sc = new Scanner(System.in);

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void showInfo(){
        System.out.println("Dog's breed: " + breed);
        System.out.println("Dog's size: " + size);
        System.out.println("Dog's age: " + age);
        System.out.println("Dog's color: " + color);
    }
    public void input(){
        System.out.println("Nhap breed: " );
        breed = sc.nextLine();
        System.out.println("Nhap size: " );
        size = sc.nextLine();
        System.out.println("Nhap age: " );
        age = sc.nextLine();
        System.out.println("Nhap color: " );
        color = sc.nextLine();
    }
    
    




}
