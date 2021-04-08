import java.util.Scanner;

public class LapTrinhVien extends NhanVien {
    
    public int gioOverTime;
    public long luongLTV;
    Scanner sc = new Scanner(System.in);

    public LapTrinhVien() {
    }
    
    public LapTrinhVien(int gioOverTime) {
        this.gioOverTime = gioOverTime;
    }
    
    public int getGioOverTime() {
        return gioOverTime;
    }

    public void setGioOverTime(int gioOverTime) {
        this.gioOverTime = gioOverTime;
    }


    @Override
    public void input() {
    super.input();
        System.out.println("Nhập vào số giờ overtime(int): ");
        gioOverTime = sc.nextInt();
        sc.nextLine();
        luongLTV = luongCoBan + (gioOverTime*200000);
        System.out.println("Lương của lập trình viên là: " + luongLTV + " Đ \n");
        System.out.println("--------------------------------------------------");
    }

   

    

  



}
