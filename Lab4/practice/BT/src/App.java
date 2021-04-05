import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Dog dog1 = new Dog();
        System.out.println("Nhap thong tin dog: ");
        dog1.input();
        System.out.println("Information: ");
        dog1.showInfo();
        
        
        
        

    }
}
