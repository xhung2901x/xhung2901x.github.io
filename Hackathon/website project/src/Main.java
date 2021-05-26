import java.io.IOException;
import java.util.Scanner;

import org.graalvm.compiler.nodes.java.ExceptionObjectNode;

public class Main {

    public static void main(String[] args) throws Exception {
        ProductList sanPham = new ProductList();
        sanPham.defaultList();
        int n;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bắt đầu chương trình: ");
        
        while(true){
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Nhập vào lựa chọn để tiếp tục chương trình (Y/N): ");
            String choice;
            choice = sc.nextLine();
            
            if(choice.equalsIgnoreCase("y")){

            
        System.out.println("Nhập vào yêu cầu: ");
        System.out.println("1. Tìm theo tên");
        System.out.println("2. Tìm theo danh mục");
        System.out.println("3. Tìm theo hãng");
        System.out.println("4. thêm sản phẩm");
        System.out.println("5. xóa sản phẩm");
        System.out.println("6. search theo danh mục và giá bán");
        System.out.println("7. sửa thông tin sản phẩm theo mã");
        System.out.println("8. check số lượng còn lại của sản phẩm");
        System.out.println("9. check những sản phẩm bán chạy nhất");
        n = sc.nextInt();
        if(n != 1 && n !=2 && n!=3 && n !=4 && n !=5 && n !=6 && n !=7 && n !=8 && n !=9 ){
            System.out.println("Ban da nhap sai !");
        }
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
            case 8:
            System.out.println("Nhập tên sản phẩm muốn kiểm tra: ");
            sanPham.checkSoLuongTon();
            break;
            case 9:
            System.out.println("Những sản phẩm bán chạy nhất: ");
            sanPham.checkBestSellProduct();
            break;

            default:
            System.out.println("Bạn đã nhập sai. Nhập lại!");
            break;
        }
        }
        else if (choice.equalsIgnoreCase("n")){
            break;
        }
        
    }
    

    }
}