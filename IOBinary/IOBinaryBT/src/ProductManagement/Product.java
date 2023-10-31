package ProductManagement;

import java.io.Serializable;

public class Product implements Serializable {
    private int code;
    private String name;
    private double price;
    private String theFirm;
    private String describe;
    public Product() {
    }

    public Product(int code, String name, double price, String theFirm, String describe) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.theFirm = theFirm;
        this.describe = describe;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return theFirm;
    }

    public void setDate(String theFirm) {
        this.theFirm = theFirm;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product {" +
                "code = " + code +
                ", name = '" + name + '\'' +
                ", price = " + price +
                ", theFirm = " + theFirm +
                ", describe = '" + describe + '\'' +
                '}';
    }
}
