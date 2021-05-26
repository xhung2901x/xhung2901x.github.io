import java.util.Scanner;

public class Products {
    public String maSP, tenSP, moTa, hang;
    public long giaNhap, giaBan, soLuongTon, soLuongBan;
    Scanner sc = new Scanner(System.in);

    DanhMuc danhmuc;

    public Products(){

    }
    
    public Products(String maSP, String tenSP, String moTa, String hang, long giaNhap, long giaBan, long soLuongTon,
            long soLuongBan, DanhMuc danhmuc) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.moTa = moTa;
        this.hang = hang;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.soLuongTon = soLuongTon;
        this.soLuongBan = soLuongBan;
        this.danhmuc = danhmuc;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public long getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(long giaNhap) {
        this.giaNhap = giaNhap;
    }

    public long getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(long giaBan) {
        this.giaBan = giaBan;
    }

    public long getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(long soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public long getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(long soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    public DanhMuc getDanhmuc() {
        return danhmuc;
    }

    public void setDanhmuc(DanhMuc danhmuc) {
        this.danhmuc = danhmuc;
    }

    
    public void input(){
        System.out.println("");
        maSP = sc.nextLine();
        System.out.println("");
        tenSP = sc.nextLine();
        System.out.println("");
        moTa = sc.nextLine();
        System.out.println("");
        hang = sc.nextLine();
        System.out.println("");
        System.out.println("");
    }

    public void searh(){
        
    }


    
}
