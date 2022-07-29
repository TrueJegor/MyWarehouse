# MyWarehouse
This is test task. Unfinished project
# Sample
        Product product1 = new Product("1", "Стул", 1000,2000);
        Product product2 = new Product("2", "Занавески", 250, 1000);
        Product product3 = new Product("3", "Вино", 250, 1000);
        Stock stock1 = new Stock("Москва");
        Stock stock2 = new Stock("Нижний Новгород");
        stock1.add(product1);
        stock1.add(product2);
        stock2.add(product3);
        System.out.println(stock1.getProducts());
        System.out.println(stock2.getProducts());
        GoodsReceipt receipt = new GoodsReceipt(1, stock1.getName(), stock1.getProducts());
        Sale sale = new Sale(1, stock1.getName(), stock1.getProducts());
        sale.saleProduct(product1, stock1);
        System.out.println(stock1.getProducts());
        MoveProduct moveProduct = new MoveProduct(1);
        moveProduct.move(stock1.getProducts(),stock2.getProducts(),1);
        System.out.println(stock2.getProducts());