import java.util.Scanner;

public class Products {
    public String maSo, ten, moTa;
    public long giaBan, soLuong, giaNhap;
    Scanner sc = new Scanner(System.in);
    
    public Products(){

    }

    public Products(String maSo, String ten, String moTa, long giaBan, long soLuong, long giaNhap) {
        this.maSo = maSo;
        this.ten = ten;
        this.moTa = moTa;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
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

    public long getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(long giaBan) {
        this.giaBan = giaBan;
    }

    public long getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(long soLuong) {
        this.soLuong = soLuong;
    }

    public long getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(long giaNhap) {
        this.giaNhap = giaNhap;
    }
    
    public void input(){
        System.out.println("Nhap ma so: ");
        maSo = sc.nextLine();
        System.out.println("Nhap ten sp: ");
        ten  = sc.nextLine();
        System.out.println("Nhap gia nhap: ");
        giaNhap  = sc.nextInt();
        System.out.println("Nhap gia ban: ");
        giaBan  = sc.nextInt();
        System.out.println("Nhap mo ta: ");
        moTa  = sc.nextLine();
        System.out.println("Nhap so luong: ");
        soLuong  = sc.nextInt();
    }
    public void display(){
        
    }

    
}
