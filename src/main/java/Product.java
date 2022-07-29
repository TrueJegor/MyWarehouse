import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.parser.TokenType.values;

public class Product {
    private List<Product> products;
    private String vendor;
    private String name;
    private int lastPurchasePrice;
    private int lastSalePrice;

    public List<Product> getProducts() {
        return products;
    }

    public Product(String vendor, String name, int lastPurchasePrice, int lastSalePrice) {
        this.vendor = vendor;
        this.name = name;
        this.lastPurchasePrice = lastPurchasePrice;
        this.lastSalePrice = lastSalePrice;
    }

    @Override
    public String toString(){
        return "\nVendor: " + getVendor() + " \n" +
                "Name: " + getName() + " \n" +
                "Last purchase price: " + getLastPurchasePrice() + " \n" +
                "Last pale price: " + getLastSalePrice() + " \n";
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public int getLastPurchasePrice() {
        return lastPurchasePrice;
    }

    public int getLastSalePrice() {
        return lastSalePrice;
    }

    public String getInfo(){
        return "Vendor: " + getVendor() + " \n" +
                "Name: " + getName() + " \n" +
                "Last purchase price: " + getLastPurchasePrice() + " \n" +
                "Last pale price: " + getLastSalePrice() + " \n";
    }
}
