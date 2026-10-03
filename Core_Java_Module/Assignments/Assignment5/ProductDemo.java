class Product {

    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: Rs." + price);
    }
}

class MobilePhone extends Product {

    String operatingSystem;

    MobilePhone(int productId, String productName,
                double price, String operatingSystem) {

        super(productId, productName, price);
        this.operatingSystem = operatingSystem;
    }

    void displayMobile() {
        displayProduct();
        System.out.println("Operating System: " + operatingSystem);
    }
}

class Laptop extends Product {

    int ram;

    Laptop(int productId, String productName,
           double price, int ram) {

        super(productId, productName, price);
        this.ram = ram;
    }

    void displayLaptop() {
        displayProduct();
        System.out.println("RAM: " + ram + " GB");
    }
}

public class ProductDemo {

    public static void main(String[] args) {

        MobilePhone mobile =
                new MobilePhone(101, "Galaxy", 30000, "Android");

        Laptop laptop =
                new Laptop(102, "ThinkPad", 60000, 16);

        System.out.println("----- Mobile Phone -----");
        mobile.displayMobile();

        System.out.println("\n----- Laptop -----");
        laptop.displayLaptop();
    }
}