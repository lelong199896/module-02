package ProductManagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "iphone15", 1000, "apple", "abc"));
        products.add(new Product(2, "s21", 1500, "samsung", "xyz"));
        products.add(new Product(3, "iphone14", 500, "apple", "efg"));

        ProductManagement.writeToFile("D:\\codegym\\module-02\\IOBinary\\IOBinaryBT\\src\\ProductManagement\\product.txt", products);

        List<Product> productDataFromFile = ProductManagement.readToFile("D:\\codegym\\module-02\\IOBinary\\IOBinaryBT\\src\\ProductManagement\\product.txt");
        for (Product p: productDataFromFile) {
            System.out.println(p);
        }

        System.out.println();
        ProductManagement.searchProduct("iphone14");
    }
}
