import java.util.Scanner;

import jdk.internal.vm.PostVMInitHook;

public class exc1 {

    
    public static void main(String[] args) throws Exception {
        
    float a;
    float b;
    float c;

    Scanner sc = new Scanner(System.in);

        System.out.print("Nhập hệ số  a = ");
        a = sc.nextFloat();
        System.out.print("Nhập hệ số  b = ");
        b = sc.nextFloat();
        System.out.print("Nhập c = ");
        c = sc.nextFloat();
        exc1.giaiPTBac2(a, b, c);
    }

        public static void giaiPTBac2 (float a, float b, float c) {
            
        

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;

            float delta = Math.pow(b, 2) - 4*a*c;
            float x1;
            float x2;
    
            if (delta > 0) {
                x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
                System.out.println("Phương trình có 2 nghiệm là: "
                        + "x1 = " + x1 + " và x2 = " + x2);
            } else if (delta == 0) {
                x1 = (-b / (2 * a));
                System.out.println("Phương trình có nghiệm kép: "
                        + "x1 = x2 = " + x1);
            } else {
                System.out.println("Phương trình vô nghiệm!");
            }
    }
}


    
