import java.util.List;

public class Sale {
    private int numberSale;
    private Warehouse stock;
    private Product product;
    private int sellingPrice;

    public int getSellingPrice() {
        return sellingPrice;
    }

    public Sale(int numberSale, Warehouse stock, Product product, int sellingPrice) {
        this.numberSale = numberSale;
        this.stock = stock;
        this.product = product;
        this.sellingPrice = sellingPrice;
    }

    public Sale(int numberSale, String stockName, List<Product> productList) {
        this.numberSale = numberSale;
        stockName = stockName;
        productList = productList;
    }

    public int getNumberSale() {
        return numberSale;
    }

    public Warehouse getStock() {
        return stock;
    }

    public Product getProduct() {
        return product;
    }

    public void saleProduct(Product product, Warehouse stock){
        stock.removeFromStock(product);
    }
}
