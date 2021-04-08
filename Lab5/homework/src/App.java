import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        NhanVien [] loaiNhanvien = new NhanVien[2];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("***Nhập vào số lượng nhân viên của công ty(int): ");
        int x = sc.nextInt();
        sc.nextLine();
        System.out.println("***Chọn loại nhân viên để thực hiện nhập thông tin (nhập '1' = LTV, nhập '2' = KCV)*** ");
        
        
        NhanVien [] slNhanvien = new NhanVien[x];

        for (int i = 0; i < x; i++) {
            
            int n = sc.nextInt();
            sc.nextLine();
            if (n==1) {
                slNhanvien[i] = new LapTrinhVien();
                System.out.println("***Nhập thông tin của lập trình viên (LTV)***");
                slNhanvien[i].input();
                slNhanvien[i].display();
                if (x>1){System.out.println("Tiếp tục nhập nhân viên tiếp theo  (nhập '1' = LTV, nhập '2' = KCV): ");}
            }
            else if (n==2) {
                slNhanvien[i] = new KiemChungVien();
                System.out.println("***Nhập thông tin của kiểm chứng viên (KCV)***");
                slNhanvien[i].input();
                slNhanvien[i].display();
                if (x>1){System.out.println("Tiếp tục nhập nhân viên tiếp theo (nhập '1' = LTV, nhập '2' = KCV): ");}
            }
            else {
                System.out.println("Bạn đã nhập sai, hãy nhập lại ! \n");
                i = 0;
            }
        }


    }
}
