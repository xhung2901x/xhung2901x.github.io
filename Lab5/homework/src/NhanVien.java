import java.util.Scanner;

public class NhanVien {
    
    public String maNhanVien, hoTen, tuoi, soDienThoai, email;
    public long luongCoBan;
    Scanner sc = new Scanner(System.in);
    
    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String hoTen, String soDienThoai, String email, String tuoi, long luongCoBan) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.tuoi = tuoi;
        this.luongCoBan = luongCoBan;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public long getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(long luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public void input(){
        System.out.println("Nhập mã nhân viên(String): ");
        maNhanVien = sc.nextLine();
        System.out.println("Nhập họ tên(String): ");
        hoTen = sc.nextLine();
        System.out.println("Nhập tuổi(String): ");
        tuoi = sc.nextLine();
        System.out.println("Nhập số ĐT(String): ");
        soDienThoai = sc.nextLine();
        System.out.println("Nhập email(String): ");
        email = sc.nextLine();
        System.out.println("Nhập lương cơ bản(long): ");
        luongCoBan = sc.nextLong();
    }

    public void display(){
        System.out.println("***Hiển thị thông tin đã nhập*** ");
        System.out.println(getMaNhanVien() + " - " + getHoTen() + " - " + getTuoi() + " - " + getSoDienThoai() + " - " + getEmail() + " - " + getLuongCoBan() +"\n");
    }
    
}
