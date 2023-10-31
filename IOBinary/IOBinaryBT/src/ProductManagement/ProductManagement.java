package ProductManagement;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductManagement {
        public static void writeToFile(String path, List<Product> products) {
            try {
                FileOutputStream fos = new FileOutputStream(path);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(products);
                oos.close();
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static List<Product> readToFile(String path) {
            List<Product> products = new ArrayList<>();
            try {
                FileInputStream fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis);
                products = (List<Product>) ois.readObject();
                ois.close();
                fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return products;
        }


        public static void searchProduct(String name) {
            List<Product> productDataFromFile = ProductManagement.readToFile("D:\\codegym\\module-02\\IOBinary\\IOBinaryBT\\src\\ProductManagement\\product.txt");
            for (Product p: productDataFromFile) {
                if (Objects.equals(p.getName(), name)) {
                    System.out.println(p);
                }
            }
        }
}
