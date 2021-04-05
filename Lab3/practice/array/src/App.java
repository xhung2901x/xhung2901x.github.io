import java.util.Scanner;

public class App {
    public static void main01(String[] args) throws Exception {
        
    //     int [] a;
    //     a = new int[5];         //2 cach khai bao mang

    //     int b = new int[5];         

    //     a[0] = 2;
    //     a[1] = 3;
    //     a[2] = 6;
    //     a[3] = 1;
    //     a[4] = 9;

    //     System.out.println("Mang a: ");
    //     for (int i = 0; i < a.length; i++) {
    //         System.out.println(a[i]);
    //     }

    // String arr[] = new String[3];
    // arr[0] = "Java";
    // arr[1] = "HTML";
    // arr[2] = "PHP";

    // System.out.println("Mang arr: ");
    // for (int i = 0; i < arr.length; i++) {
    //     System.out.println(arr[i]);
    // }

    // int [] a;
    // a = new int[10];
    // int sum = 0;

    // a[0] = 1;
    // a[1] = 2;
    // a[2] = 3;
    // a[3] = 4;
    // a[4] = 5;
    // a[5] = 6;
    // a[6] = 7;
    // a[7] = 8;
    // a[8] = 9;
    // a[9] = 10;


    
    // for (int i = 0; i < a.length; i++) {
    //     System.out.println("cac phan tu trong mang: " + i);
        
    //     if(a[i]%2==0)
    //     {
            
    //         System.out.println("Cac so chan cua mang a la: " + a[i]);
    //     }
    // }
    
    // System.out.println("tong cac so chan la: " + sum);
    
    // //sap xep mang
    // for (int i = 0; i < a.length; i++) {
    //     for (int j = i+1; j < a.length; j++) {
    //         if(a[i] > a[j])
    //         {
    //             int temp = a[i];
    //                 a[i] = a[j];
    //                 a[j] = temp;
                
    //         }
    //     }
    // }
    // System.out.println("Mang sau khi sap xep: ");
    
    // ** BT mang:
    // int n;    
    
    // Scanner sc = new Scanner(System.in);
    //     System.out.println("Nhap n: ");
    //     n = sc.nextInt();
    //     sc.nextLine();

    //     String [] a;
    //     a = new String[n];
    //     for (int i = 0; i < n; i++) {
    //         System.out.println("Nhap phan tu thu "+i+":");
    //         a[i]=sc.nextLine();
           
    //     }

    //     //dem so lan java xuat hien:
    //     int count = 0;
    //     for (int i = 0; i < a.length; i++) {
    //             if(a[i].equalsIgnoreCase("Java"))
    //         {
                
    //             count++;
    //         }
    //     }
    //     System.out.println("so lan Java xuat hien : " + count);

    //     //Kiem tra chuoi do o vi tri nao
    //     System.out.println("Nhap chuoi bat ky: ");
    //     String str = sc.nextLine();

    //     for (int i = 0; i < a.length; i++) {
    //         if(a[i].equals(str))
    //         {
    //             System.out.println("Vi tri " + i );
    //         }
    //     }

        //**BT 2 :Nhap mang gom n phan tu
        //in mang do ra man hinh
        //in cac so nguyen to ra man hinh
        //tinh tong cac so nguyen to 

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Nhap so phan tu cua mang: ");
        n = sc.nextInt();
        sc.nextLine();
        
        int arr [];
        arr = new int [n];
        for (int i = 0; i < n; i++) 
        {
            System.out.println(i);
            i++;
        }


}
}
