package UsingArrayListAndLinkedList;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product(0, "A", 10000);
        Product product1 = new Product(1, "D", 5000);
        Product product2 = new Product(2, "B", 1000);
        Product product3 = new Product(3, "E", 2000);
        Product product4 = new Product(4, "C", 20000);
        ProductManager productManager = new ProductManager();
        productManager.add(product);
        productManager.add(product1);
        productManager.add(product2);
        productManager.add(product3);
        productManager.add(product4);
        System.out.println(productManager);

        productManager.remove(1);
        System.out.println(productManager);

        System.out.println(productManager.search("B"));

        productManager.replace(2,new Product(3, "e", 2000));
        System.out.println(productManager);

        productManager.sortUpAscending();
        System.out.println(productManager);

        productManager.sortDescending();
        System.out.println(productManager);
    }
}
