package discount;

public class Product {
    private String name;
    private double originalPrice;

    public Product(String name, double originalPrice) {
        this.name = name;
        this.originalPrice = originalPrice;
    }

    public double applyDiscount(DiscountStrategy discountStrategy) {
        return discountStrategy.applyDiscount(originalPrice);
    }

    public String getName() {
        return name;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }
}
