import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class ProductManager {
    public static final String FILE_PATH = "src/main/resources/products.dat";

    public static void main(String[] args) {
        ArrayList<Product> products = readProducts();
        while (true) {
            System.out.println("Please choose function:");
            System.out.println("1. Show products list.");
            System.out.println("2. Add new product.");
            System.out.println("3. Find product by name.");
            System.out.println("0.Exit.");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    showList(products);
                    break;
                case 2:
                    addNewProduct(products);
                    break;
                case 3:
                    findProductByName(products);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Please select wright function.");
            }
        }
    }

    public static void showList(ArrayList<Product> list) {
        if (list.isEmpty()){
            System.out.println("Products list is empty.");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i).toString());
        }
    }

    public static void findProductByName(ArrayList<Product> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter prodcut name to search:");
        String name = scanner.nextLine();
        ArrayList<Product> result = new ArrayList<>();
        for (Product product : list) {
            if (product.getProductName().toLowerCase().equals(name.toLowerCase())|| product.getProductName().toLowerCase().contains(name.toLowerCase())) {
                result.add(product);
            }
        }
        if (result.size() > 0) {
            for (int i = 0; i < result.size(); i++) {
                System.out.println("Searching result:");
                System.out.println((i + 1) + ". " + result.get(i).toString());
            }
        } else {
            System.out.println("Can not find product.");
        }
    }

    public static void addNewProduct(ArrayList<Product> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter product ID:");
        String id = scanner.nextLine();
        System.out.println("Please enter product name:");
        String name = scanner.nextLine();
        System.out.println("Please enter product brand:");
        String brand = scanner.nextLine();
        System.out.println("Please enter product price ($):");
        int price = scanner.nextInt();
        System.out.println("Please enter product description:");
        scanner.nextLine();
        String description = scanner.nextLine();
        for (Product p : list) {
            if (p.getProductID().equals(id)) {
                System.out.println("The product ID is exist. Cannot add new product.");
                return;
            }
        }
        System.out.println("Add new product successfully: " + list.add(new Product(id, name, brand, price, description)));
        writeProducts(list);
    }


    public static ArrayList<Product> readProducts() {
        ArrayList<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(FILE_PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = null;
            while ((obj = ois.readObject()) != null) {
                products.add((Product) obj);
            }
            fis.close();
            ois.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return products;
    }

    public static void writeProducts(ArrayList<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(FILE_PATH);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Product product : products) {
                oos.writeObject(product);
            }
            fos.close();
            oos.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ;
        }
    }

}
