import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ProductList sanPham = new ProductList();
        sanPham.defaultList();
        int n;
        String name;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào yêu cầu (chữ số): \n 1.search theo tên.\n 2.search theo danh mục. \n 3.search theo hãng. \n 4.add thêm sản phẩm. \n 5.xóa sản phẩm. \n 6.search theo danh mục & giá bán. \n 7.Sửa thông tin sản phẩm.");
        n = sc.nextInt();
        switch(n)
        {
            case 1:
            System.out.println("Search theo tên sản phẩm: ");
            sanPham.search();
            break;
            case 2:
            System.out.println("Search theo danh mục: ");
            sanPham.CategorySearch();
            break;
            case 3:
            System.out.println("Search theo hãng của sản phẩm: ");
            sanPham.brandSearch();
            break;
            case 4:
            System.out.println("Thêm vào một sản phẩm: ");
            sanPham.addProduct();
            break;
            case 5:
            System.out.println("Nhập tên sản phẩm muốn xóa: ");
            name = sc.nextLine();
            sc.nextLine();
            sanPham.deleteProduct(name);
            break;
            case 6:
            sanPham.searchByPriceAndCategory();
            case 7:
            sanPham.editProduct();
            break;
            default:
            System.out.println("Bạn đã nhập sai. Nhập lại!");
            break;
            
        }
        


    }
}