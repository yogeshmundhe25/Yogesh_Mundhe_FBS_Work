class Product
{
    int productId;
    String productName;
    double price;
    int quantity;

    // Default Constructor
    Product()
    {
        productId = 22;
        productName = "Iphone";
        price = 90000;
        quantity = 1;
    }

    // Parameterized Constructor
    Product(int productId, String productName, double price, int quantity)
    {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Setters
    void setProductId(int productId)
    {
        this.productId = productId;
    }

    void setProductName(String productName)
    {
        this.productName = productName;
    }

    void setPrice(double price)
    {
        this.price = price;
    }

    void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    // Getters
    int getProductId()
    {
        return productId;
    }

    String getProductName()
    {
        return productName;
    }

    double getPrice()
    {
        return price;
    }

    int getQuantity()
    {
        return quantity;
    }

    // Display
    void display()
    {
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quantity);
    }
}
class TestProduct
{
    public static void main(String args[])
    {
       
        // Product object
        Product p1 = new Product(201, "Laptop", 55000, 2);

        System.out.println("----- PRODUCT DETAILS -----");
        p1.display();

        // Setter
        p1.setPrice(60000);

        // Getter
        System.out.println("Updated Price : " + p1.getPrice());
    }
}