import java.util.Scanner;

public class Product {
    private String ma, ten, moTa;
    private int giaNhap, giaBan, soLuongBan, soLuongTon;
    Scanner sc = new Scanner(System.in);

    
    public Product(String ma, String ten, String moTa, int giaNhap, int giaBan, int soLuongBan, int soLuongTon) {
        this.ma = ma;
        this.ten = ten;
        this.moTa = moTa;               
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.soLuongBan = soLuongBan;
        this.soLuongTon = soLuongTon;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(int giaNhap) {
        this.giaNhap = giaNhap;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    @Override
    public String toString() {
        return "Product [giaBan=" + giaBan + ", giaNhap=" + giaNhap + ", ma=" + ma + ", moTa=" + moTa + ", soLuongBan="
                + soLuongBan + ", soLuongTon=" + soLuongTon + ", ten=" + ten + "]";
    }
    
    public void input (){
        System.out.println("nhap ma SP: ");
        ma = sc.nextLine();
        System.out.println("nhap ten SP: ");
        ten = sc.nextLine();
        System.out.println("nhap mo ta SP: ");
        moTa = sc.nextLine();
        System.out.println("nhap gia nhap SP: ");
        giaNhap = sc.nextInt();
        System.out.println("nhap gia ban SP: ");
        giaBan = sc.nextInt();
        System.out.println("nhap so luong ban: ");
        soLuongBan = sc.nextInt();
        System.out.println("nhap so luong ton SP: ");
        soLuongTon = sc.nextInt();
    }
    

}
