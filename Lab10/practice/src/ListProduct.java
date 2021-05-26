import java.util.ArrayList;

public class ListProduct {
    ArrayList<Product> product;
    public ListProduct() {
        product = new ArrayList<>();
        product.add(new Product("01", "Snack", "50g", "1 nam", 3000, 5000));
        product.add(new Product("02", "but mau", "new", "2 nam", 20000, 30000));
        product.add(new Product("03", "noi inox", "new", "3 nam", 200000, 250000));
        product.add(new Product("04", "iphone", "likenew", "1 nam", 10000000, 11000000));
        product.add(new Product("05", "banh mi", "100g", "3 ngay", 1000, 5000));
    }
    
    
}
