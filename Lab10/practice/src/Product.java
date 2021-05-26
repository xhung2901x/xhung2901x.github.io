

public class Product {
    private String id, ten, moTa, hanSuDung;
    private long giaNhap, giaBan;
    


    public Product(String id, String ten, String moTa, String hanSuDung, long giaNhap, long giaBan) {
        this.id = id;
        this.ten = ten;
        this.moTa = moTa;
        this.hanSuDung = hanSuDung;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(String hanSuDung) {
        this.hanSuDung = hanSuDung;
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

        public void input(){

        }

        @Override
        public String toString() {
            return "Product [giaBan=" + giaBan + ", giaNhap=" + giaNhap + ", hanSuDung=" + hanSuDung + ", id=" + id
                    + ", moTa=" + moTa + ", ten=" + ten + "]";
        }
    
        
}
