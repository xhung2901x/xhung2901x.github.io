import java.util.Scanner;

public class Product {
    private String ma, ten, moTa, hang;
    private int giaNhap, giaBan, soLuongTon, soLuongBan;
    private Category category;
    Scanner sc = new Scanner(System.in);
    
    
    public Product() {
        
    }

    public Product(String ma, String ten, String moTa, String hang, int giaNhap, int giaBan, int soLuongTon,
            int soLuongBan, Category category) {
        this.ma = ma;
        this.ten = ten;
        this.moTa = moTa;
        this.hang = hang;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.soLuongTon = soLuongTon;
        this.soLuongBan = soLuongBan;
        this.category = category;
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


    public String getHang() {
        return hang;
    }


    public void setHang(String hang) {
        this.hang = hang;
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


    public int getSoLuongTon() {
        return soLuongTon;
    }


    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }


    public int getSoLuongBan() {
        return soLuongBan;
    }


    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }


    public Category getCategory() {
        return category;
    }


    public void setCategory(Category category) {
        this.category = category;
    }

    public void input (){
        System.out.println("Nhập mã sản phẩm: ");
        ma = sc.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        ten = sc.nextLine();
        System.out.println("Nhập mô tả sản phẩm: ");
        moTa = sc.nextLine();
        System.out.println("Nhập hãng của sản phẩm: ");
        hang = sc.nextLine();
        System.out.println("Nhập giá nhập: ");
        giaNhap = sc.nextInt();
        System.out.println("Nhập giá bán: ");
        giaBan = sc.nextInt();
        System.out.println("Nhập số lượng tồn: ");
        soLuongTon = sc.nextInt();
        System.out.println("Nhập số lượng bán: ");
        soLuongBan = sc.nextInt();
    }


    @Override
    public String toString() {
        return "Product [ten =" + ten + ", ma ="+ ma +", giaBan =" + giaBan + ", giaNhap =" + giaNhap + ", hang =" + hang  + ", moTa =" + moTa
                + ", soLuongBan =" + soLuongBan + ", soLuongTon =" + soLuongTon +  "]";
    }


    

    



}
