import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Nhap so phan tu: ");
        // int n = 0;

        // try {
        //     n = sc.nextInt();

        
        // }
        // catch(Exception e){
        //     e.printStackTrace();
        //     System.out.println("Chi nhap vao so kieu INT");
        // }
        // int arr[] = new int[n];

        // Scanner sc = new Scanner(System.in);
        // File myfile = new File ("PrimeNumber.txt");
        // myfile.createNewFile();
        // FileWriter writeFile = new FileWriter(myfile);
        // String strFile = "";    

        //     boolean check = true;

        //     while (check) {
        //         System.out.println("Nhap gia tri: ");
        //         String str = sc.nextLine();
        //         if (str.toUpperCase().equals("X") || str.toUpperCase().equals("Q")) {
        //             check = false;
        //             writeFile.close();
        //             System.exit(0);
        //         }
        //         try{
        //             int num  = Integer.valueOf(str);
        //             if (isCheck(num)) {
        //                 strFile = num+"la so nguyen to";

        //             }else{
        //                 strFile = num + "khong la so nguyen to";
        //             }
        //             }catch(Exception e){
        //                 strFile = str +"khong phai la so";
        //             }finally{
        //                 System.out.println(strFile);
        //                 writeFile.write(strFile+"\n");
        //             }
        //     }
        //     }

        //     public static boolean isCheck(int num)
        //     {
        //         if (num <2)
        //         return false;
            
        //     if(num>=2)
        //     {
        //         for (int i = 2; i <= Math.sqrt(num); i++) {
        //             if (num%i==0) {
        //                 return false;
        //             }
        //         }
        //     }
        //     return true;
            Scanner sc = new Scanner(System.in);
            Products products = new Products();
            products.input();
            ArrayList <Products> sanPham = new ArrayList<>();

            
    
    
    }
}
