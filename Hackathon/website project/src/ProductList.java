import java.util.*;

public class ProductList extends Product {

    private ArrayList<Product> listProduct;
    Scanner sc = new Scanner(System.in);

    public ProductList() {

    }

    public ArrayList<Product> defaultList() {
        listProduct = new ArrayList<>();
        listProduct.add(new Product("1", "GTX 1050", "VGA", "Nvidia", 3500000, 4000000, 10, 5, Category.VGA));
        listProduct.add(new Product("2", "GTX 1660", "VGA", "Nvidia", 7000000, 7500000, 8, 4, Category.VGA));
        listProduct.add(new Product("3", "GTX 2060", "VGA", "Nvidia", 10000000, 11000000, 9, 3, Category.VGA));
        listProduct.add(new Product("4", "SSD Samsung 256GB 860 EVO", "SSD", "Samsung", 1200000, 1500000, 20, 10,Category.SSD));
        listProduct.add(new Product("5", "SSD Samsung 512GB 960 EVO", "SSD", "Samsung", 5000000, 5500000, 22, 11,Category.SSD));
        listProduct.add(new Product("6", "SSD WD 512GB", "SSD", "WesternDigital", 2300000, 2800000, 21, 11, Category.SSD));
        listProduct.add(new Product("7", "Ram Corsair 8GB DDR4", "Ram", "Corsair", 1000000, 1300000, 31, 15, Category.MEMORY));
        listProduct.add(new Product("8", "Ram Gskill 16GB DDR4", "Ram", "Gskill", 1100000, 1350000, 10, 5, Category.MEMORY));
        listProduct.add(new Product("9", "Ram Gskill 32GB DDR4", "Ram", "Gskill", 8000000, 9000000, 11, 5, Category.MEMORY));
        listProduct.add(new Product("10", "Mouse Zowie ZA11", "Mouse", "Zowie", 1200000, 1500000, 7, 5, Category.GEAR));
        listProduct.add(new Product("11", "Keyboard SS 6Gv2", "Keyboard", "Steel Series", 2000000, 2200000, 8, 6,Category.GEAR));
        listProduct.add(new Product("12", "Keyboard Razer BlackWindow V3", "Keyboard", "Steel Series", 9000000, 10000000, 15, 6,Category.GEAR));
        return listProduct;
    }

    public ArrayList<Product> getListProduct() {
        return listProduct;
    }

    public void setListProduct(ArrayList<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public void search() {

        String s;
        System.out.println("Nhap vao ten san pham: ");
        s = sc.nextLine();
        boolean check = false;
        for (Product product : listProduct) {
            if (product.getTen().contains(s)) {
                System.out.println(product.toString());
                check = true;
            }
        }
        if (!check) {
            System.out.println("Khong co san pham nay.");
        }
        System.out.println("Ban co muon tim kiem tiep khong? (Y/N)");
        String tiepTuc = sc.nextLine();
        if (tiepTuc.equalsIgnoreCase("y")) {
            this.search();
        }
    }

    public void CategorySearch() {
        int s;
        do {
            System.out.println("Nhap loai san pham can tim kiem (VGA = 1, SSD = 2, MEMORY = 3, GEAR = 4): ");
            s = sc.nextInt();
            sc.nextLine();
        } while (s != 1 && s != 2 && s != 3 && s != 4);
        for (Product product : listProduct) {
            if (product.getCategory().getValue() == s) {
                System.out.println(product.toString());
            }
        }
        System.out.println("Ban co muon tiep tuc tim kiem khong? (Y/N)");
        String tiepTuc = sc.nextLine();
        if (tiepTuc.equalsIgnoreCase("y")) {
            this.CategorySearch();
        }
    }

    public void brandSearch() {
        String s;
        boolean check = false;
        System.out.println("Nhap hang san xuat cua san pham: ");
        s = sc.nextLine();
        for (Product product : listProduct) {
            if (product.getHang().equalsIgnoreCase(s)) {
                System.out.println(product.toString());
                check = true;

            }
        }
        if (!check) {
            System.out.println("Khong co san pham nay");
        }
        System.out.println("Ban co muon tiep tuc tim kiem? (Y/N)");
        String tiepTuc = sc.nextLine();
        if (tiepTuc.equalsIgnoreCase("y")) {
            this.brandSearch();
        }
    }

    public void addProduct() {

        System.out.println("Nhap ma san pham: ");
        String ma = sc.nextLine();
        System.out.println("Nhap ten san pham: ");
        String ten = sc.nextLine();
        System.out.println("Nhap mo ta san pham: ");
        String moTa = sc.nextLine();
        System.out.println("Nhap hang cua san pham: ");
        String hang = sc.nextLine();
        System.out.println("Nhap gia nhap: ");
        int giaNhap = sc.nextInt();
        System.out.println("Nhap gia ban: ");
        int giaBan = sc.nextInt();
        System.out.println("Nhap so luong ton: ");
        int soLuongTon = sc.nextInt();
        System.out.println("Nhap so luong ban: ");
        int soLuongBan = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập kiểu loại của sản phẩm (VGA=1, SSD=2, MEMORY=3, GEAR=4): ");
        int inputCategory = sc.nextInt();
        sc.nextLine();
        if (inputCategory == 1) {
            listProduct.add(new Product(ma, ten, moTa, hang, giaNhap, giaBan, soLuongTon, soLuongBan, Category.VGA));

        }
        if (inputCategory == 2) {
            listProduct.add(new Product(ma, ten, moTa, hang, giaNhap, giaBan, soLuongTon, soLuongBan, Category.SSD));

        }
        if (inputCategory == 3) {
            listProduct.add(new Product(ma, ten, moTa, hang, giaNhap, giaBan, soLuongTon, soLuongBan, Category.MEMORY));

        }
        if (inputCategory == 4) {
            listProduct.add(new Product(ma, ten, moTa, hang, giaNhap, giaBan, soLuongTon, soLuongBan, Category.GEAR));

        }

        System.out.println("Danh sách sau khi thêm: \n");
        listProduct.forEach(System.out::println);

    }

    public void editProduct() {
        int count = 0;
        System.out.println("Nhập tên sản phẩm muốn sửa: ");
        String fixProduct = sc.nextLine();
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getTen().contains(fixProduct)) {
                System.out.println(listProduct.get(i).toString());
                System.out.print("Nhập tên mới: ");
                String name = sc.nextLine();
                listProduct.get(i).setTen(name);
                System.out.print("Nhập mô tả mới: ");
                String describe = sc.nextLine();
                listProduct.get(i).setMoTa(describe);
                System.out.print("Nhập giá nhập mới: ");
                int importPrice = sc.nextInt();
                listProduct.get(i).setGiaNhap(importPrice);
                System.out.print("Nhập giá bán mới: ");
                int salePrice = sc.nextInt();
                listProduct.get(i).setGiaBan(salePrice);
                System.out.print("Nhập số lượng mới: ");
                int amount = sc.nextInt();
                listProduct.get(i).setSoLuongTon(amount);
                System.out.print("Nhập số lượng bán mới: ");
                int amountSale = sc.nextInt();
                listProduct.get(i).setSoLuongBan(amountSale);
                sc.nextLine();
                System.out.print("Nhập nhãn hiệu mới: ");
                String brand = sc.nextLine();
                listProduct.get(i).setHang(brand);
                count++;
                System.out.println("Sản phẩm sau khi sửa là: ");
                System.out.println(listProduct.get(i).toString());
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy sản phẩm");
        }
    }

    public void deleteProduct(String name) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getTen().contains(name)) {
                System.out.println(listProduct.get(i).toString());
                listProduct.remove(listProduct.get(i));
            }
        }
        System.out.println("Xóa thành công!!!");
        System.out.println("Danh sách sau khi xóa: ");
        listProduct.forEach(System.out::println);
    }

    public void searchByPriceAndCategory() {
        int s;
        
        boolean checkExist = false;
        do {
            System.out.println(
                    "Nhập vào danh mục sản phẩm muốn tìm kiếm (VGA=1  SSD=2  MEMORY=3  GEAR=4): ");
            s = sc.nextInt();
        } while (s != 1 && s != 2 && s != 3 && s != 4);
        System.out.println("Các khoảng giá có thể tìm kiếm: ");
        System.out.println("1: Dưới 2 triệu");
        System.out.println("2: Từ 2 - 4 triệu");
        System.out.println("3: Từ 4 - 7 triệu");
        System.out.println("4: Từ 7 - 13 triệu");
        System.out.println("5: Trên 13 triệu");
        System.out.println("Chọn mức giá (Chọn số 1-2-3-4-5): ");
        int a = sc.nextInt();
        
        sc.nextLine();
        for (Product product : listProduct) {
            
            if(product.getCategory().getValue() == s && a==1){
                if(product.getGiaBan() < 2000000){
                    System.out.println(product.toString());
                     checkExist = true;
                }   
            }
             if  (product.getCategory().getValue() == s && a==2) {
                if(product.getGiaBan() >= 2000000 && product.getGiaBan() < 4000000){
                    System.out.println(product.toString());
                     checkExist = true;
                }
            }
            if  (product.getCategory().getValue() == s && a==3) {
                if(product.getGiaBan() >= 4000000 && product.getGiaBan() < 7000000){
                        System.out.println(product.toString());
                         checkExist = true;
                    }
                }
            if  (product.getCategory().getValue() == s && a==4) {
                if(product.getGiaBan() >= 7000000 && product.getGiaBan() < 13000000){
                            System.out.println(product.toString());
                             checkExist = true;
                        }
                    }
            if  (product.getCategory().getValue() == s && a==5) {
                if(product.getGiaBan() >= 2000000 && product.getGiaBan() < 4000000){
                                System.out.println(product.toString());
                                 checkExist = true;
                            }
            }
        }
        if (!checkExist) {
            System.out.println("Khong co san pham nay!");
        }
        System.out.println("Ban co muon tiep tuc tim kiem khong? ( Y or N ): ");
        String tiepTuc = sc.nextLine();
        if (tiepTuc.equalsIgnoreCase("y")) {
            searchByPriceAndCategory();
        }

    }

}
