import java.util.Scanner;

public class KiemChungVien extends NhanVien {
    
public int loiPhatHien;
public long luongKCV;
Scanner sc = new Scanner(System.in);

public KiemChungVien() {
}

public KiemChungVien(int loiPhatHien) {
    this.loiPhatHien = loiPhatHien;
}

public int getLoiPhatHien() {
    return loiPhatHien;
}

public void setLoiPhatHien(int loiPhatHien) {
    this.loiPhatHien = loiPhatHien;
}

@Override
public void input() {
    super.input();
        System.out.println("Nhập vào số lỗi tìm được(int): ");
        loiPhatHien = sc.nextInt();
        sc.nextLine();
        luongKCV = luongCoBan + (loiPhatHien*50000);
        System.out.println("Lương của lập trình viên là: " + luongKCV + " Đ \n");
        System.out.println("--------------------------------------------------");
}






}
