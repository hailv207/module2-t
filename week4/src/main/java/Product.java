import java.io.Serializable;

public class Product implements Serializable {
    private String productID;
    private String productName;
    private String productBrand;
    private int productPrice;
    private String productDescription;

    public Product(String productID, String productName, String productBrand, int productPrice, String productDescription) {
        this.productID = productID;
        this.productName = productName;
        this.productBrand = productBrand;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
    }

    public String getProductID() {
        return productID;
    }


    public String getProductName() {
        return productName;
    }


    public String getProductBrand() {
        return productBrand;
    }

    public int getProductPrice() {
        return productPrice;
    }


    public String getProductDescription() {
        return productDescription;
    }


    @Override
    public String toString() {
        String result = "Product ID: " + getProductID() + " | Product name: " + getProductName()
                + " | Brand name: " + getProductBrand() + " | Product price: " +  getProductPrice()
                + "$ | Product description: " +  getProductDescription() + ".";
        return result;
    }
}
