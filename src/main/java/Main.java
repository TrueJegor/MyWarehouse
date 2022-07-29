import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello! What do you want to do?\n" +
                "1 - Create a product\n" +
                "2 - Create a warehouse\n" +
                "3 - Make a sale\n" +
                "4 - Move products between warehouse\n");
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);


        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.print("Enter vendor value: ");
                String vendor = scanner.nextLine();
                scanner.nextLine();
                System.out.print("Enter name of product: ");
                String nameProduct = scanner.nextLine();
                //scanner.nextLine();
                System.out.print("Enter last purchase price:");
                int lastPurchasePrice = scanner.nextInt();
                System.out.print("Enter sale price: ");
                int lastSalePrice = scanner.nextInt();
                Product product = new Product(vendor, nameProduct, lastPurchasePrice, lastSalePrice);
            case 2:
                System.out.print("Enter name of warehouse: ");
                String nameWarehouse = scanner.nextLine();
            case 3:
                System.out.print("Enter number sale: ");
                int numberSale = scanner.nextInt();
                System.out.println("Enter name of warehouse: ");
                String nameWarehouseSale = scanner.nextLine();
                System.out.println("Enter product name: ");
                String nameProductSale = scanner.nextLine();
                System.out.println("Enter selling price: ");
                int sellingPrice = scanner.nextInt();
            case 4:
                System.out.println("Enter warehouse from: ");
                String warehouseFrom = scanner.nextLine();
                System.out.println("Enter warehouse to: ");
                String warehouseTo = scanner.nextLine();
                System.out.println("Enter vendor product: ");
                int vendorMove = scanner.nextInt();
        }
    }
}
