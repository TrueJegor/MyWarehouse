import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private Product product;
    private String name;
    private List<Product> products = new ArrayList<>();

    public String getName() {
        return name;
    }

    public Warehouse(String name){
        this.name = name;
    }

    public void add(Product product){
        products.add(product);
    }

    public void getInfoProducts(){
        System.out.println(products);
    }

    public Product getProduct() {
        return product;
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getInfo(Product product){
        return product.getInfo();
    }

    public boolean isEmpty(){
        if (products.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public void removeFromStock(Product product){
        products.remove(product);
    }
}
