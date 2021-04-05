import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();

        Car car[] = new Car[n];
        for (int i = 0; i < car.length; i++) {
            car[i] = new Car();
            car[i].input();
        }

        System.out.println("Thong tin vua nhap: ");
        for (int i = 0; i < car.length; i++) {
            car[i].showInfo();
        }

    }
}
