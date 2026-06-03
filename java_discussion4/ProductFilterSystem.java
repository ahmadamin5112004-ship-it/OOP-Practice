package java_discussion4;


public class ProductFilterSystem {


    public void filterProducts(String category) {
        System.out.println("Searching for products in category: " + category);
    }


    public void filterProducts(double minPrice, double maxPrice) {
        System.out.println("Searching for products with price between $" 
                + minPrice + " and $" + maxPrice);
    }


    public void filterProducts(String brand, boolean isBrandSearch) {
        if (isBrandSearch) {
            System.out.println("Searching for products of brand: " + brand);
        } else {
            System.out.println("Invalid search type.");
        }
    }


    public void filterProducts(String category, double minPrice, double maxPrice) {
        System.out.println("Searching for products in category: " + category
                + " with price between $" + minPrice + " and $" + maxPrice);
    }


    public void filterProducts(String category, double minPrice, double maxPrice, String brand) {
        System.out.println("Searching for products in category: " + category
                + ", brand: " + brand
                + ", with price between $" + minPrice + " and $" + maxPrice);
    }

    public static void main(String[] args) {
        ProductFilterSystem pfs = new ProductFilterSystem();

        pfs.filterProducts("electronics");
        pfs.filterProducts(100, 500);
        pfs.filterProducts("Apple", true);
        pfs.filterProducts("fashion", 50, 300);
        pfs.filterProducts("electronics", 200, 1000, "Samsung");
    }
}