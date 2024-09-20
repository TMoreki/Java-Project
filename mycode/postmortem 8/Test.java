class Product {
    private double price;

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

public class Test {
    public void updatePrice(Product product, double price) {
        if (product == null) {
            System.out.println("Product is null");
            return;
        }
        price = price * 2;
        double updatedPrice = product.getPrice() + price;
        product.setPrice(updatedPrice);
    }

    public void updatePrice(Product product) {
        if (product == null) {
            System.out.println("Product is null");
            return;
        }
        product.setPrice(product.getPrice() * 3);
    }

    public static void main(String[] args) {
        object nullProduct = new Product(10);
        Product nullProduct = new Product(10);
        Product prt = new Product(200);
        double newPrice = 100;
        Test t = new Test();
        t.updatePrice(nullProduct, newPrice);
    }
}
