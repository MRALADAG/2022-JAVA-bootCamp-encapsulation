public class Main {

    public static void main(String[] args) {

        Product product = new Product();
        product.name = "Laptop";
        product.id = 1;
        product.description = "Asus Laptop";
        product.price = 22000;
        product.stockAmount = 5;

        ProductManager productManager = new ProductManager();
        productManager.add(product);

        productManager.add(1, "monitör", "SAMSUNG akıllı monitör", 7, 2700);
        productManager.add(1, "monitör", "SAMSUNG akıllı monitör", 7, 2700);
        productManager.add(1, "monitör", "SAMSUNG akıllı monitör", 7, 2700);
        productManager.add(1, "monitör", "SAMSUNG akıllı monitör", 7, 2700);

    }
}
