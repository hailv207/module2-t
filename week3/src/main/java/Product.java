public class Product {
    private int productID;
    private String name;
    private int price;
    Product(int productID, String name, int price){
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        String str = "Product ID: " + getProductID() + " | Product name: " + getName() + " | Price: " + getPrice() + "$.";
        return str;
    }
}
