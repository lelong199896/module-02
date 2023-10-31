package UsingArrayListAndLinkedList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

public class ProductManager {
   private final List<Product> productList;

   public ProductManager() {
       productList = new ArrayList<>();
   }

    public ProductManager(List<Product> productList) {
        this.productList = productList;
    }
    public ProductManager(int capacity) {
       productList = new ArrayList<>(capacity);
    }

    public void add(Product product) {
       productList.add(product);
    }

    public void replace(int index, Product product) {
       productList.set(index, product);
    }

    public Product remove(int id) {
        for (Product product: productList) {
            if (product.getId() == id) {
                productList.remove(product);
                return product;
            }
        }
        throw new RuntimeException("Id not found");
    }

    @Override
    public String toString() {
        return "productList=" + productList
                + "\n";
    }

    public Product search(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        throw new RuntimeException("Name not found");
    }

    public void sortUpAscending() {
        productList.sort(Comparator.comparingInt((ToIntFunction<? super Product>) product -> (int) product.getPrice()));
    }

    public void sortDescending() {
       productList.sort(Comparator.comparingInt((ToIntFunction<? super Product>) product -> (int) product.getPrice()).reversed());
    }
}
