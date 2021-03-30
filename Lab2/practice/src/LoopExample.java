import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class LoopExample
{
    public static void main(String[] args) {
       
        double a;
        double b;

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap b: ");
        double b = sc.nextDouble();

        if (a==0) {
            if (b==0)
            {
                System.out.println("pt vo so nghiem");
            }
            
        } else  {
            System.out.println("pt vo nghiem");
        } else
        {
            System.out.println("Nghiem cua phuong trinh la: " + (-b/a));
        }
       
    }
}