import java.util.Scanner;

public class Car {
    
    public String model;
    public String color;
    public String brand;
    Scanner sc = new Scanner(System.in);


    public void speed(String speed){

    }
    public void size(String size){

    }
    public void brand(String brand){

    }
    public Car(){
        
    }
    public Car(String model, String color, String brand) {
        this.model = model;
        this.color = color;
        this.brand = brand;
    }
    public void showInfo(){
        System.out.println("Model: " + model );
        System.out.println("Color: " + color );
        System.out.println("Brand: " + brand );
    }
    public void input(){
        System.out.println("Nhap model: ");
        model = sc.nextLine();
        System.out.println("Nhap color: ");
        color = sc.nextLine();
        System.out.println("Nhap brand: ");
        brand = sc.nextLine();
    }


    
}
