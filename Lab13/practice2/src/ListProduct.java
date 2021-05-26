import java.util.ArrayList;
import java.util.Scanner;

public class ListProduct {
    private ArrayList<Product> product;
    Scanner sc = new Scanner(System.in);

    public ArrayList<Product> getProduct() {
        return product;
    }

    public void setProduct(ArrayList<Product> product) {
        this.product = product;
    }

    public ArrayList<Product> addItems(){
        product = new ArrayList<>();
        product.add(new Product(ma, ten, moTa, giaNhap, giaBan, soLuongBan, soLuongTon));
        return product;
    }

}
