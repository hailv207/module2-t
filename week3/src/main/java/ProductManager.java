
import java.util.*;

public class ProductManager {
    private List<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    public void showMenu() {
        while (true) {
            System.out.println("Choose a function:");
            System.out.println("1. Show all product.");
            System.out.println("2. Add new product.");
            System.out.println("3. Edit a product by ID.");
            System.out.println("4. Delete a product by ID.");
            System.out.println("5. Find a product by name.");
            System.out.println("6. Sort the products list.");
            System.out.println("0. Exit.");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    showAllProducts();
                    break;
                case 2:
                    addNewProduct();
                    break;
                case 3:
                    editProductByID();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    findProductByName();
                    break;
                case 6:
                    sortProduct();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }

    public void addNewProduct() {
        Scanner scanner = new Scanner(System.in);
        int id;
        do {
            System.out.println("Please enter Product ID:");
            id = scanner.nextInt();
        } while (isExistID(id));
        System.out.println("Please enter Product name:");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Please enter Product price:");
        int price = scanner.nextInt();
        Product temp = new Product(id, name, price);
        if (add(temp)) {
            System.out.printf("Added new product successfully: Product ID = %d | Name = %s | Price = %d.\n", id, name, price);
        } else {
            System.out.println("Added new product unsuccessfully.");
        }
    }

    public void findProductByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of Product:");
        String str = scanner.nextLine();
        System.out.println(getProductByName(str));
    }

    public void sortProduct() {
        System.out.println("Please choose sorting type:");
        System.out.println("1. Price: low to high.");
        System.out.println("2. Price: high to low.");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                Collections.sort(products, ((o1, o2) -> (o1.getPrice() - o2.getPrice())));
                showAllProducts();
                break;
            case 2:
                Collections.sort(products, ((o2, o1) -> (o1.getPrice() - o2.getPrice())));
                showAllProducts();
                break;
        }
    }

    public void editProductByID() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the ID of the product you want to edit:");
        int editingID = scanner.nextInt();
        if (isExistID(editingID)) {
            System.out.println("You are going to edit product information of: " + getProductByID(editingID));
            System.out.println("Please enter the new Product ID:");
            int newID = scanner.nextInt();
            System.out.println("Please enter the new Product name:");
            scanner.nextLine();
            String newName = scanner.nextLine();
            System.out.println("Please enter the new Product price:");
            int newPrice = scanner.nextInt();
            if (editProduct(getProductByID(editingID), newID, newName, newPrice)) {
                System.out.println("Edited product successfully. New product information: " + getProductByID(newID));
            } else {
                System.out.println("Unsuccessful editing.");
            }
        } else {
            System.out.println("Invalid ID.");
        }
    }

    public void deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the ID of the product you want to delete:");
        int deletingID = scanner.nextInt();
        Product temp = getProductByID(deletingID);
        System.out.println("You are going to delete the Product: " + temp);
        System.out.println("Please enter Y to confirm (or N to cancel):");
        scanner.nextLine();
        String choice = scanner.nextLine();
        if (choice.equals("Y") || choice.equals("y")) {
            if (deleteProductByID(deletingID)) {
                System.out.println("Deleted product successfully.");
            } else {
                System.out.println("Unsuccessful deleting.");
            }
        } else {
            System.out.println("Canceled deleting.");
        }
    }

    private int size() {
        return products.size();
    }

    private boolean add(Product product) {
        if (isExistID(product.getProductID())) {
            return false;
        }
        return this.products.add(product);
    }

    private Product getProductByID(int productID) {
        for (int i = 0; i < this.size(); i++) {
            if (productID == products.get(i).getProductID()) {
                return products.get(i);
            }
        }
        throw new IndexOutOfBoundsException("ID was not found.");
    }

    private Product getProductByName(String productName) {
        for (int i = 0; i < this.size(); i++) {
            if (productName.equals(products.get(i).getName())) {
                return products.get(i);
            }
        }
        throw new IndexOutOfBoundsException("Product name was not found.");
    }

    private boolean editProduct(Product product, int newID, String newName, int newPrice) {
        product.setProductID(newID);
        product.setName(newName);
        product.setPrice(newPrice);
        return true;
    }

    private boolean deleteProductByID(int productID) {
        return this.products.remove(getProductByID(productID));
    }

    private boolean isExistID(int id) {
        for (Product p : products) {
            if (p.getProductID() == id) {
                return true;
            }
        }
        return false;
    }

    public void showAllProducts() {
        System.out.println("---Products list:---");
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println("---End of products list---");
    }
}
