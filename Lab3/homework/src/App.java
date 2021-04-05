import java.util.Scanner;

import jdk.dynalink.beans.StaticClass;

public class App {
    public static void main(String[] args) throws Exception {
        
        int n;
        
        System.out.println("Nhap so phan tu cua mang: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();

        int a[];
        a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + (i+1) +":");
            a[i] = sc.nextInt();
            sc.nextLine();
        }
    }
        static void MaxMin (int [] a){
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            
            if (i==0) {
                max = a[i];
                } else if(a[i] > max){
                    max = a[i];
                }
            
        }

        System.out.println("Gia tri lon nhat la: " + max);

        int min = a[0];

        for (int i = 1; i< a.length; i++)
        {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("Gia tri nho nhat la: " +  min);
    }
}
