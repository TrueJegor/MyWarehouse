import java.util.List;

public class GoodsReceipt {
    private int numberReceipt;
    private Product product;
    private Warehouse stock;

    public GoodsReceipt(int numberReceipt, String stockName, List<Product> productList){
        this.numberReceipt = numberReceipt;
        stockName = stockName;
        productList = productList;
    }

    public int getNumberReceipt() {
        return numberReceipt;
    }

    public Product getProduct() {
        return product;
    }

    public Warehouse getStockж() {
        return stock;
    }
}
