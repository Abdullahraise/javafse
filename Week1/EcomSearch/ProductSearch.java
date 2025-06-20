package DeepSkilling.EcomSearch;

import java.util.Arrays;

public class ProductSearch {

    public static Product linearSearch(Product[] products, String targetName) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(targetName)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] sortedProducts, String targetName) {
        int low = 0;
        int high = sortedProducts.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = sortedProducts[mid].productName.compareToIgnoreCase(targetName);

            if (cmp == 0) {
                return sortedProducts[mid];
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(103, "Watch", "Accessories"),
            new Product(104, "Phone", "Electronics"),
            new Product(105, "Book", "Education")
        };

        String searchName = "Phone";

        System.out.println("Linear Search Result:");
        Product linearResult = linearSearch(products, searchName);
        System.out.println(linearResult != null ? linearResult : "Product not found");

        System.out.println("\nBinary Search Result (after sorting):");
        Product[] sortedProducts = Arrays.copyOf(products, products.length);
        Arrays.sort(sortedProducts);
        Product binaryResult = binarySearch(sortedProducts, searchName);
        System.out.println(binaryResult != null ? binaryResult : "Product not found");

        System.out.println("\nTime Complexity Comparison:");
        System.out.println("Linear Search: O(n)");
        System.out.println("Binary Search: O(log n)");
    }
}


