import java.util.List;

public class MoveProduct {
    private int number;
    private Product productFrom;
    private Product productWhere;

    public MoveProduct(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Product getProductFrom() {
        return productFrom;
    }

    public Product getProductWhere() {
        return productWhere;
    }

    public void move(List<Product> source, List<Product> dest, int vendor){
        dest.add(source.remove(vendor));
    }
}
